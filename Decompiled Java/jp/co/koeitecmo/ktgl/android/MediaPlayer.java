package jp.co.koeitecmo.ktgl.android;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.Button;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import jp.co.koeitecmo.ktgl.android.expansion.zipfile.ZipRoot;
import jp.co.koeitecmo.ktgl.android.util.Log;

public class MediaPlayer {
    private static ViewGroup layout_;
    private AssetFileDescriptor asset_fd_ = null;
    /* access modifiers changed from: private */
    public boolean attached_ = false;
    /* access modifiers changed from: private */
    public boolean autoPlay_ = true;
    private Button button_;
    private Context context_ = null;
    /* access modifiers changed from: private */
    public android.media.MediaPlayer mediaPlayer_;
    /* access modifiers changed from: private */
    public SurfaceView movieView_;
    /* access modifiers changed from: private */
    public int originalVideoHeight_ = 0;
    /* access modifiers changed from: private */
    public int originalVideoWidth_ = 0;
    /* access modifiers changed from: private */
    public boolean prepared_ = false;
    /* access modifiers changed from: private */
    public boolean repeat_ = true;
    /* access modifiers changed from: private */
    public FileInputStream stream_ = null;
    /* access modifiers changed from: private */
    public int videoHeight_ = 1;
    private int videoLeft_ = -1;
    private int videoTop_ = -1;
    /* access modifiers changed from: private */
    public int videoWidth_ = 1;
    private boolean visible_ = false;

    /* access modifiers changed from: private */
    public native void onBufferingUpdate(int i);

    /* access modifiers changed from: private */
    public native void onCompletion();

    /* access modifiers changed from: private */
    public native void onError(String str);

    /* access modifiers changed from: private */
    public native void onInfo();

    /* access modifiers changed from: private */
    public native void onPrepared();

    /* access modifiers changed from: private */
    public native void onSeekComplete();

    /* access modifiers changed from: private */
    public native void onSurfaceChanged();

    /* access modifiers changed from: private */
    public native void onSurfaceCreated();

    /* access modifiers changed from: private */
    public native void onSurfaceDestroyed();

    /* access modifiers changed from: private */
    public native void onVideoSizeChanged(int i, int i2);

    public static final void setLayout(ViewGroup viewGroup) {
        layout_ = viewGroup;
    }

    public static final ViewGroup getLayout() {
        return layout_;
    }

    public MediaPlayer(Context context, String str, String str2) {
        this.context_ = context;
        loadFromResource(context, str, str2);
    }

    public MediaPlayer(Context context) {
        this.context_ = context;
    }

    public final boolean loadFromInternal(final Context context, String str) {
        close();
        final long length = new File(context.getFilesDir() + "/" + str).length();
        try {
            this.stream_ = context.openFileInput(str);
            createHandler().post(new Runnable() {
                public final void run() {
                    try {
                        MediaPlayer.this.load(context, MediaPlayer.this.stream_.getFD(), length);
                    } catch (IOException e) {
                        Log.e((Throwable) e);
                        MediaPlayer.this.onError(e.getMessage());
                    }
                }
            });
            return true;
        } catch (FileNotFoundException e) {
            Log.e((Throwable) e);
            onError(e.getMessage());
            return false;
        }
    }

    public final boolean loadFromExternal(final Context context, String str) {
        close();
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            final Uri fromFile = Uri.fromFile(new File(context.getExternalFilesDir((String) null), str));
            createHandler().post(new Runnable() {
                public final void run() {
                    MediaPlayer.this.load(context, fromFile);
                }
            });
            return true;
        }
        Log.e("external storage is invalid: " + externalStorageState);
        return false;
    }

    public final boolean loadFromResource(final Context context, String str, String str2) {
        close();
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        final Uri parse = Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier);
        createHandler().post(new Runnable() {
            public final void run() {
                MediaPlayer.this.load(context, parse);
            }
        });
        return true;
    }

    public final boolean loadFromZipRoot(final Context context, ZipRoot zipRoot, String str) {
        close();
        this.asset_fd_ = zipRoot.openAsFD(str);
        final AssetFileDescriptor assetFileDescriptor = this.asset_fd_;
        if (assetFileDescriptor == null) {
            Log.e(str + " is not found in the expansion file.");
            return false;
        }
        createHandler().post(new Runnable() {
            public final void run() {
                MediaPlayer.this.load(context, assetFileDescriptor);
            }
        });
        return true;
    }

    public final void attach() {
        if (!this.attached_) {
            createHandler().post(new Runnable() {
                public final void run() {
                    if (MediaPlayer.this.movieView_ != null) {
                        Log.d("attachRaw() was called");
                        MediaPlayer.getLayout().addView(MediaPlayer.this.movieView_, new ViewGroup.MarginLayoutParams(MediaPlayer.this.videoWidth_, MediaPlayer.this.videoHeight_));
                        MediaPlayer.this.createHandler().post(new Runnable() {
                            public final void run() {
                                MediaPlayer.this.applyLayout();
                            }
                        });
                        boolean unused = MediaPlayer.this.attached_ = true;
                    }
                }
            });
        }
    }

    public final void detach() {
        if (this.attached_) {
            createHandler().post(new Runnable() {
                public final void run() {
                    if (MediaPlayer.this.movieView_ != null) {
                        MediaPlayer.getLayout().removeView(MediaPlayer.this.movieView_);
                        boolean unused = MediaPlayer.this.attached_ = false;
                    }
                }
            });
        }
    }

    public final void pause() {
        Log.d("pause() was called");
        this.mediaPlayer_.pause();
    }

    public final void stop() {
        Log.d("stop() was called");
        this.prepared_ = false;
        this.mediaPlayer_.stop();
    }

    private final void close() {
        FileInputStream fileInputStream = this.stream_;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                Log.e((Throwable) e);
                onError(e.getMessage());
            }
            this.stream_ = null;
        }
        AssetFileDescriptor assetFileDescriptor = this.asset_fd_;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e2) {
                Log.e((Throwable) e2);
                onError(e2.getMessage());
            }
            this.asset_fd_ = null;
        }
    }

    public final void clear() {
        Log.i("clear() was called");
        stop();
        close();
        final SurfaceView surfaceView = this.movieView_;
        if (surfaceView != null) {
            final ViewGroup layout = getLayout();
            createHandler().post(new Runnable() {
                public final void run() {
                    layout.removeView(surfaceView);
                }
            });
            this.movieView_ = null;
        }
        android.media.MediaPlayer mediaPlayer = this.mediaPlayer_;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.mediaPlayer_.release();
            this.mediaPlayer_ = null;
        }
        this.attached_ = false;
    }

    public final void play() {
        if (this.prepared_) {
            createHandler().post(new Runnable() {
                public final void run() {
                    MediaPlayer.this.applyLayout();
                    MediaPlayer.this.mediaPlayer_.setLooping(MediaPlayer.this.repeat_);
                    MediaPlayer.this.mediaPlayer_.start();
                }
            });
        }
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay_ = z;
    }

    public final void setRepeat(boolean z) {
        this.repeat_ = z;
        android.media.MediaPlayer mediaPlayer = this.mediaPlayer_;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(this.repeat_);
        }
    }

    public final void layout(int i, int i2, int i3, int i4) {
        this.videoLeft_ = i;
        this.videoTop_ = i2;
        this.videoWidth_ = i3 - i;
        this.videoHeight_ = i4 - i2;
        if (this.movieView_ != null) {
            createHandler().post(new Runnable() {
                public final void run() {
                    MediaPlayer.this.applyLayout();
                }
            });
        }
    }

    public final boolean isPlaying() {
        android.media.MediaPlayer mediaPlayer = this.mediaPlayer_;
        if (mediaPlayer == null) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    private final void createView(Context context, final Runnable runnable) {
        createMovieView(context);
        this.movieView_.getHolder().addCallback(new SurfaceHolder.Callback() {
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Log.d("surfaceDestroyed");
                MediaPlayer.this.onSurfaceDestroyed();
            }

            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                Log.d("surfaceCreated");
                MediaPlayer.this.createMediaPlayer();
                MediaPlayer.this.onSurfaceCreated();
                runnable.run();
                MediaPlayer.this.prepareMediaPlayer();
            }

            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Log.d("surfaceChanged:{format:" + i + ",width:" + i2 + ",height:" + i3 + "}");
                MediaPlayer.this.onSurfaceChanged();
            }
        });
        attach();
    }

    /* access modifiers changed from: private */
    public final void prepareMediaPlayer() {
        createHandler().post(new Runnable() {
            public final void run() {
                try {
                    MediaPlayer.this.mediaPlayer_.prepare();
                } catch (IllegalStateException e) {
                    Log.e((Throwable) e);
                    MediaPlayer.this.onError(e.getMessage());
                } catch (IOException e2) {
                    Log.e((Throwable) e2);
                    MediaPlayer.this.onError(e2.getMessage());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public final void load(final Context context, final Uri uri) {
        createView(context, new Runnable() {
            public final void run() {
                MediaPlayer.this.setDataSource(context, uri);
            }
        });
    }

    /* access modifiers changed from: private */
    public final void load(Context context, FileDescriptor fileDescriptor, long j) {
        final FileDescriptor fileDescriptor2 = fileDescriptor;
        final long j2 = j;
        createView(context, new Runnable() {
            public final void run() {
                this.setDataSource(fileDescriptor2, 0, j2);
            }
        });
    }

    /* access modifiers changed from: private */
    public final void load(Context context, final AssetFileDescriptor assetFileDescriptor) {
        createView(context, new Runnable() {
            public final void run() {
                this.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            }
        });
    }

    private final void createMovieView(Context context) {
        this.movieView_ = new SurfaceView(context);
        this.movieView_.setZOrderMediaOverlay(true);
        this.movieView_.setZOrderOnTop(true);
        this.movieView_.getHolder().setType(3);
    }

    /* access modifiers changed from: private */
    public final void applyLayout() {
        SurfaceView surfaceView = this.movieView_;
        if (surfaceView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) surfaceView.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.width = this.videoWidth_;
                marginLayoutParams.height = this.videoHeight_;
                marginLayoutParams.leftMargin = this.videoLeft_;
                marginLayoutParams.topMargin = this.videoTop_;
                this.movieView_.setLayoutParams(marginLayoutParams);
            }
            this.movieView_.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    public final Handler createHandler() {
        return new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: private */
    public final void setDataSource(Context context, Uri uri) {
        try {
            this.mediaPlayer_.setDataSource(context, uri);
        } catch (IllegalArgumentException e) {
            Log.e("failed to load " + uri.toString());
            Log.e((Throwable) e);
            onError(e.getMessage());
        } catch (SecurityException e2) {
            Log.e("failed to load " + uri.toString());
            Log.e((Throwable) e2);
            onError(e2.getMessage());
        } catch (IllegalStateException e3) {
            Log.e("failed to load " + uri.toString());
            Log.e((Throwable) e3);
            onError(e3.getMessage());
        } catch (IOException e4) {
            Log.e("failed to load " + uri.toString());
            Log.e((Throwable) e4);
            onError(e4.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public final void setDataSource(FileDescriptor fileDescriptor, long j, long j2) {
        try {
            this.mediaPlayer_.setDataSource(fileDescriptor, j, j2);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
            onError(e.getMessage());
        } catch (SecurityException e2) {
            Log.e((Throwable) e2);
            onError(e2.getMessage());
        } catch (IllegalStateException e3) {
            Log.e((Throwable) e3);
            onError(e3.getMessage());
        } catch (IOException e4) {
            Log.e((Throwable) e4);
            onError(e4.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public final void createMediaPlayer() {
        this.mediaPlayer_ = new android.media.MediaPlayer();
        this.mediaPlayer_.setDisplay(this.movieView_.getHolder());
        this.mediaPlayer_.setAudioStreamType(3);
        assignCallback();
    }

    private final void assignCallback() {
        this.mediaPlayer_.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                if (i == 1) {
                    Log.e("media error UNKNOWN");
                    return false;
                } else if (i != 100) {
                    Log.w("media error unexpected");
                    return false;
                } else {
                    Log.e("media error SERVER_DIED");
                    return false;
                }
            }
        });
        this.mediaPlayer_.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
            public final void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i) {
                Log.d("onBufferingUpdate:{percent:" + i + "}");
                this.onBufferingUpdate(i);
            }
        });
        this.mediaPlayer_.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
                Log.d("onCompletion");
                this.onCompletion();
                if (this.repeat_) {
                    this.play();
                }
            }
        });
        this.mediaPlayer_.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                Log.d("onInfo:{what:" + i + ",extra:" + i2 + "}");
                this.onInfo();
                return false;
            }
        });
        this.mediaPlayer_.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
                Log.d("onPrepared");
                boolean unused = this.prepared_ = true;
                this.onPrepared();
                if (this.autoPlay_) {
                    this.play();
                }
            }
        });
        this.mediaPlayer_.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
            public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
                Log.d("onSeekComplete");
                this.onSeekComplete();
            }
        });
        this.mediaPlayer_.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                Log.d("onVideoSizeChanged:{width:" + i + ",height:" + i2 + "}");
                int unused = this.originalVideoWidth_ = i;
                int unused2 = this.originalVideoHeight_ = i2;
                this.onVideoSizeChanged(i, i2);
            }
        });
    }
}

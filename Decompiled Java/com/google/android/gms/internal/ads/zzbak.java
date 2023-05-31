package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.android.vending.billing.util.IabHelper;
import com.google.android.gms.ads.internal.zzq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbak extends zzbat implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzdyd = new HashMap();
    private final zzbbl zzdye;
    private final boolean zzdyf;
    private int zzdyg = 0;
    private int zzdyh = 0;
    private MediaPlayer zzdyi;
    private Uri zzdyj;
    private int zzdyk;
    private int zzdyl;
    private int zzdym;
    private int zzdyn;
    private int zzdyo;
    private zzbbk zzdyp;
    private boolean zzdyq;
    private int zzdyr;
    /* access modifiers changed from: private */
    public zzbau zzdys;

    public zzbak(Context context, boolean z, boolean z2, zzbbj zzbbj, zzbbl zzbbl) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzdye = zzbbl;
        this.zzdyq = z;
        this.zzdyf = z2;
        this.zzdye.zzb(this);
    }

    public final String zzxt() {
        String str = this.zzdyq ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    public final void zza(zzbau zzbau) {
        this.zzdys = zzbau;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzrz zzd = zzrz.zzd(parse);
        if (zzd == null || zzd.url != null) {
            if (zzd != null) {
                parse = Uri.parse(zzd.url);
            }
            this.zzdyj = parse;
            this.zzdyr = 0;
            zzxu();
            requestLayout();
            invalidate();
        }
    }

    public final void stop() {
        zzawf.zzee("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzdyi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzdyi.release();
            this.zzdyi = null;
            zzct(0);
            this.zzdyh = 0;
        }
        this.zzdye.onStop();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzawf.zzee(sb.toString());
        this.zzdyk = mediaPlayer.getVideoWidth();
        this.zzdyl = mediaPlayer.getVideoHeight();
        if (this.zzdyk != 0 && this.zzdyl != 0) {
            requestLayout();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzawf.zzee("AdMediaPlayerView prepared");
        zzct(2);
        this.zzdye.zzew();
        zzawo.zzdtx.post(new zzbam(this));
        this.zzdyk = mediaPlayer.getVideoWidth();
        this.zzdyl = mediaPlayer.getVideoHeight();
        int i = this.zzdyr;
        if (i != 0) {
            seekTo(i);
        }
        zzxv();
        int i2 = this.zzdyk;
        int i3 = this.zzdyl;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzawf.zzez(sb.toString());
        if (this.zzdyh == 3) {
            play();
        }
        zzxx();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzawf.zzee("AdMediaPlayerView completion");
        zzct(5);
        this.zzdyh = 5;
        zzawo.zzdtx.post(new zzbal(this));
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzdyd.get(Integer.valueOf(i));
        String str2 = zzdyd.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawf.zzee(sb.toString());
        return true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzdyd.get(Integer.valueOf(i));
        String str2 = zzdyd.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawf.zzfa(sb.toString());
        zzct(-1);
        this.zzdyh = -1;
        zzawo.zzdtx.post(new zzbao(this, str, str2));
        return true;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzdym = i;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzawf.zzee("AdMediaPlayerView surface created");
        zzxu();
        zzawo.zzdtx.post(new zzban(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzawf.zzee("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.zzdyh == 3;
        if (!(this.zzdyk == i && this.zzdyl == i2)) {
            z = false;
        }
        if (this.zzdyi != null && z2 && z) {
            int i3 = this.zzdyr;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzm(i, i2);
        }
        zzawo.zzdtx.post(new zzbaq(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawf.zzee("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzdyi;
        if (mediaPlayer != null && this.zzdyr == 0) {
            this.zzdyr = mediaPlayer.getCurrentPosition();
        }
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzyk();
        }
        zzawo.zzdtx.post(new zzbap(this));
        zzat(true);
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzdye.zzc(this);
        this.zzdyy.zza(surfaceTexture, this.zzdys);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzawf.zzee(sb.toString());
        zzawo.zzdtx.post(new zzbaj(this, i));
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzdyk
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.zzdyl
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.zzdyk
            if (r2 <= 0) goto L_0x0088
            int r2 = r5.zzdyl
            if (r2 <= 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzbbk r2 = r5.zzdyp
            if (r2 != 0) goto L_0x0088
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0048
            if (r1 != r2) goto L_0x0048
            int r0 = r5.zzdyk
            int r1 = r0 * r7
            int r2 = r5.zzdyl
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x003d
            int r0 = r0 * r7
            int r0 = r0 / r2
            r1 = r7
            goto L_0x0088
        L_0x003d:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L_0x0069
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L_0x0089
        L_0x0048:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x005a
            int r0 = r5.zzdyl
            int r0 = r0 * r6
            int r2 = r5.zzdyk
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0058
            if (r0 <= r7) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            r1 = r0
            goto L_0x0089
        L_0x005a:
            if (r1 != r2) goto L_0x006b
            int r1 = r5.zzdyk
            int r1 = r1 * r7
            int r2 = r5.zzdyl
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0068
            if (r1 <= r6) goto L_0x0068
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            r6 = r1
        L_0x0069:
            r1 = r7
            goto L_0x0089
        L_0x006b:
            int r2 = r5.zzdyk
            int r4 = r5.zzdyl
            if (r1 != r3) goto L_0x0078
            if (r4 <= r7) goto L_0x0078
            int r2 = r2 * r7
            int r2 = r2 / r4
            r1 = r7
            goto L_0x0079
        L_0x0078:
            r1 = r4
        L_0x0079:
            if (r0 != r3) goto L_0x0086
            if (r2 <= r6) goto L_0x0086
            int r7 = r5.zzdyl
            int r7 = r7 * r6
            int r0 = r5.zzdyk
            int r1 = r7 / r0
            goto L_0x0089
        L_0x0086:
            r6 = r2
            goto L_0x0089
        L_0x0088:
            r6 = r0
        L_0x0089:
            r5.setMeasuredDimension(r6, r1)
            com.google.android.gms.internal.ads.zzbbk r7 = r5.zzdyp
            if (r7 == 0) goto L_0x0093
            r7.zzm(r6, r1)
        L_0x0093:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            if (r7 != r0) goto L_0x00ac
            int r7 = r5.zzdyn
            if (r7 <= 0) goto L_0x009f
            if (r7 != r6) goto L_0x00a5
        L_0x009f:
            int r7 = r5.zzdyo
            if (r7 <= 0) goto L_0x00a8
            if (r7 == r1) goto L_0x00a8
        L_0x00a5:
            r5.zzxv()
        L_0x00a8:
            r5.zzdyn = r6
            r5.zzdyo = r1
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbak.onMeasure(int, int):void");
    }

    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    private final void zzxu() {
        zzawf.zzee("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzdyj != null && surfaceTexture != null) {
            zzat(false);
            try {
                zzq.zzll();
                this.zzdyi = new MediaPlayer();
                this.zzdyi.setOnBufferingUpdateListener(this);
                this.zzdyi.setOnCompletionListener(this);
                this.zzdyi.setOnErrorListener(this);
                this.zzdyi.setOnInfoListener(this);
                this.zzdyi.setOnPreparedListener(this);
                this.zzdyi.setOnVideoSizeChangedListener(this);
                this.zzdym = 0;
                if (this.zzdyq) {
                    this.zzdyp = new zzbbk(getContext());
                    this.zzdyp.zza(surfaceTexture, getWidth(), getHeight());
                    this.zzdyp.start();
                    SurfaceTexture zzyl = this.zzdyp.zzyl();
                    if (zzyl != null) {
                        surfaceTexture = zzyl;
                    } else {
                        this.zzdyp.zzyk();
                        this.zzdyp = null;
                    }
                }
                this.zzdyi.setDataSource(getContext(), this.zzdyj);
                zzq.zzlm();
                this.zzdyi.setSurface(new Surface(surfaceTexture));
                this.zzdyi.setAudioStreamType(3);
                this.zzdyi.setScreenOnWhilePlaying(true);
                this.zzdyi.prepareAsync();
                zzct(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.zzdyj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Failed to initialize MediaPlayer at ");
                sb.append(valueOf);
                zzawf.zzd(sb.toString(), e);
                onError(this.zzdyi, 1, 0);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:10:0x0034->B:15:0x004f, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzxv() {
        /*
            r8 = this;
            boolean r0 = r8.zzdyf
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.zzxw()
            if (r0 == 0) goto L_0x0059
            android.media.MediaPlayer r0 = r8.zzdyi
            int r0 = r0.getCurrentPosition()
            if (r0 <= 0) goto L_0x0059
            int r0 = r8.zzdyh
            r1 = 3
            if (r0 == r1) goto L_0x0059
            java.lang.String r0 = "AdMediaPlayerView nudging MediaPlayer"
            com.google.android.gms.internal.ads.zzawf.zzee(r0)
            r0 = 0
            r8.zzd(r0)
            android.media.MediaPlayer r0 = r8.zzdyi
            r0.start()
            android.media.MediaPlayer r0 = r8.zzdyi
            int r0 = r0.getCurrentPosition()
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r1 = r1.currentTimeMillis()
        L_0x0034:
            boolean r3 = r8.zzxw()
            if (r3 == 0) goto L_0x0051
            android.media.MediaPlayer r3 = r8.zzdyi
            int r3 = r3.getCurrentPosition()
            if (r3 != r0) goto L_0x0051
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzlc()
            long r3 = r3.currentTimeMillis()
            long r3 = r3 - r1
            r5 = 250(0xfa, double:1.235E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0034
        L_0x0051:
            android.media.MediaPlayer r0 = r8.zzdyi
            r0.pause()
            r8.zzxx()
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbak.zzxv():void");
    }

    private final void zzat(boolean z) {
        zzawf.zzee("AdMediaPlayerView release");
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzyk();
            this.zzdyp = null;
        }
        MediaPlayer mediaPlayer = this.zzdyi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzdyi.release();
            this.zzdyi = null;
            zzct(0);
            if (z) {
                this.zzdyh = 0;
                this.zzdyh = 0;
            }
        }
    }

    public final void play() {
        zzawf.zzee("AdMediaPlayerView play");
        if (zzxw()) {
            this.zzdyi.start();
            zzct(3);
            this.zzdyy.zzxz();
            zzawo.zzdtx.post(new zzbas(this));
        }
        this.zzdyh = 3;
    }

    public final void pause() {
        zzawf.zzee("AdMediaPlayerView pause");
        if (zzxw() && this.zzdyi.isPlaying()) {
            this.zzdyi.pause();
            zzct(4);
            zzawo.zzdtx.post(new zzbar(this));
        }
        this.zzdyh = 4;
    }

    public final int getDuration() {
        if (zzxw()) {
            return this.zzdyi.getDuration();
        }
        return -1;
    }

    public final int getCurrentPosition() {
        if (zzxw()) {
            return this.zzdyi.getCurrentPosition();
        }
        return 0;
    }

    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzawf.zzee(sb.toString());
        if (zzxw()) {
            this.zzdyi.seekTo(i);
            this.zzdyr = 0;
            return;
        }
        this.zzdyr = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.zzdyg;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzxw() {
        /*
            r2 = this;
            android.media.MediaPlayer r0 = r2.zzdyi
            if (r0 == 0) goto L_0x000f
            int r0 = r2.zzdyg
            r1 = -1
            if (r0 == r1) goto L_0x000f
            if (r0 == 0) goto L_0x000f
            r1 = 1
            if (r0 == r1) goto L_0x000f
            return r1
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbak.zzxw():boolean");
    }

    public final void zza(float f, float f2) {
        zzbbk zzbbk = this.zzdyp;
        if (zzbbk != null) {
            zzbbk.zzb(f, f2);
        }
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzdyi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzdyi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public final void zzxx() {
        zzd(this.zzdyz.getVolume());
    }

    private final void zzd(float f) {
        MediaPlayer mediaPlayer = this.zzdyi;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzawf.zzfa("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzct(int i) {
        if (i == 3) {
            this.zzdye.zzyn();
            this.zzdyz.zzyn();
        } else if (this.zzdyg == 3) {
            this.zzdye.zzyo();
            this.zzdyz.zzyo();
        }
        this.zzdyg = i;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzcu(int i) {
        zzbau zzbau = this.zzdys;
        if (zzbau != null) {
            zzbau.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzdyd.put(Integer.valueOf(IabHelper.IABHELPER_SEND_INTENT_FAILED), "MEDIA_ERROR_IO");
            zzdyd.put(Integer.valueOf(IabHelper.IABHELPER_MISSING_TOKEN), "MEDIA_ERROR_MALFORMED");
            zzdyd.put(Integer.valueOf(IabHelper.IABHELPER_INVALID_CONSUMPTION), "MEDIA_ERROR_UNSUPPORTED");
            zzdyd.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzdyd.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzdyd.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzdyd.put(1, "MEDIA_ERROR_UNKNOWN");
        zzdyd.put(1, "MEDIA_INFO_UNKNOWN");
        zzdyd.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzdyd.put(701, "MEDIA_INFO_BUFFERING_START");
        zzdyd.put(702, "MEDIA_INFO_BUFFERING_END");
        zzdyd.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzdyd.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzdyd.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzdyd.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzdyd.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.LruCache;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class ImageManager {
    /* access modifiers changed from: private */
    public static final Object zamm = new Object();
    /* access modifiers changed from: private */
    public static HashSet<Uri> zamn = new HashSet<>();
    private static ImageManager zamo;
    /* access modifiers changed from: private */
    public final Context mContext;
    /* access modifiers changed from: private */
    public final Handler mHandler = new zap(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final ExecutorService zamp = zal.zact().zaa(4, zaq.zasj);
    /* access modifiers changed from: private */
    public final zaa zamq = null;
    /* access modifiers changed from: private */
    public final zak zamr = new zak();
    /* access modifiers changed from: private */
    public final Map<zaa, ImageReceiver> zams = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Uri, ImageReceiver> zamt = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Uri, Long> zamu = new HashMap();

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface OnImageLoadedListener {
        void onImageLoaded(Uri uri, Drawable drawable, boolean z);
    }

    public static ImageManager create(Context context) {
        if (zamo == null) {
            zamo = new ImageManager(context, false);
        }
        return zamo;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private static final class zaa extends LruCache<zac, Bitmap> {
        /* access modifiers changed from: protected */
        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
            zac zac = (zac) obj;
            Bitmap bitmap = (Bitmap) obj2;
            return bitmap.getHeight() * bitmap.getRowBytes();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
            super.entryRemoved(z, (zac) obj, (Bitmap) obj2, (Bitmap) obj3);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private final class zad implements Runnable {
        private final zaa zana;

        public zad(zaa zaa) {
            this.zana = zaa;
        }

        public final void run() {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zams.get(this.zana);
            if (imageReceiver != null) {
                ImageManager.this.zams.remove(this.zana);
                imageReceiver.zac(this.zana);
            }
            zac zac = this.zana.zanb;
            if (zac.uri == null) {
                this.zana.zaa(ImageManager.this.mContext, ImageManager.this.zamr, true);
                return;
            }
            Bitmap zaa = ImageManager.this.zaa(zac);
            if (zaa != null) {
                this.zana.zaa(ImageManager.this.mContext, zaa, true);
                return;
            }
            Long l = (Long) ImageManager.this.zamu.get(zac.uri);
            if (l != null) {
                if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                    this.zana.zaa(ImageManager.this.mContext, ImageManager.this.zamr, true);
                    return;
                }
                ImageManager.this.zamu.remove(zac.uri);
            }
            this.zana.zaa(ImageManager.this.mContext, ImageManager.this.zamr);
            ImageReceiver imageReceiver2 = (ImageReceiver) ImageManager.this.zamt.get(zac.uri);
            if (imageReceiver2 == null) {
                imageReceiver2 = new ImageReceiver(zac.uri);
                ImageManager.this.zamt.put(zac.uri, imageReceiver2);
            }
            imageReceiver2.zab(this.zana);
            if (!(this.zana instanceof zad)) {
                ImageManager.this.zams.put(this.zana, imageReceiver2);
            }
            synchronized (ImageManager.zamm) {
                if (!ImageManager.zamn.contains(zac.uri)) {
                    ImageManager.zamn.add(zac.uri);
                    imageReceiver2.zacc();
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private final class zab implements Runnable {
        private final Uri zamv;
        private final ParcelFileDescriptor zamw;

        public zab(Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
            this.zamv = uri;
            this.zamw = parcelFileDescriptor;
        }

        public final void run() {
            boolean z;
            Bitmap bitmap;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
            ParcelFileDescriptor parcelFileDescriptor = this.zamw;
            boolean z2 = false;
            Bitmap bitmap2 = null;
            if (parcelFileDescriptor != null) {
                try {
                    bitmap2 = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
                } catch (OutOfMemoryError e) {
                    String valueOf = String.valueOf(this.zamv);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("OOM while loading bitmap for uri: ");
                    sb.append(valueOf);
                    Log.e("ImageManager", sb.toString(), e);
                    z2 = true;
                }
                try {
                    this.zamw.close();
                } catch (IOException e2) {
                    Log.e("ImageManager", "closed failed", e2);
                }
                z = z2;
                bitmap = bitmap2;
            } else {
                bitmap = null;
                z = false;
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ImageManager.this.mHandler.post(new zac(this.zamv, bitmap, z, countDownLatch));
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                String valueOf2 = String.valueOf(this.zamv);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Latch interrupted while posting ");
                sb2.append(valueOf2);
                Log.w("ImageManager", sb2.toString());
            }
        }
    }

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private final class ImageReceiver extends ResultReceiver {
        private final Uri zamv;
        /* access modifiers changed from: private */
        public final ArrayList<zaa> zamy = new ArrayList<>();

        ImageReceiver(Uri uri) {
            super(new zap(Looper.getMainLooper()));
            this.zamv = uri;
        }

        public final void zab(zaa zaa) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zamy.add(zaa);
        }

        public final void zac(zaa zaa) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zamy.remove(zaa);
        }

        public final void zacc() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zamv);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            ImageManager.this.mContext.sendBroadcast(intent);
        }

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager.this.zamp.execute(new zab(this.zamv, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private final class zac implements Runnable {
        private final Bitmap mBitmap;
        private final CountDownLatch zadv;
        private final Uri zamv;
        private boolean zamz;

        public zac(Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
            this.zamv = uri;
            this.mBitmap = bitmap;
            this.zamz = z;
            this.zadv = countDownLatch;
        }

        public final void run() {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            boolean z = this.mBitmap != null;
            if (ImageManager.this.zamq != null) {
                if (this.zamz) {
                    ImageManager.this.zamq.evictAll();
                    System.gc();
                    this.zamz = false;
                    ImageManager.this.mHandler.post(this);
                    return;
                } else if (z) {
                    ImageManager.this.zamq.put(new zac(this.zamv), this.mBitmap);
                }
            }
            ImageReceiver imageReceiver = (ImageReceiver) ImageManager.this.zamt.remove(this.zamv);
            if (imageReceiver != null) {
                ArrayList zaa = imageReceiver.zamy;
                int size = zaa.size();
                for (int i = 0; i < size; i++) {
                    zaa zaa2 = (zaa) zaa.get(i);
                    if (z) {
                        zaa2.zaa(ImageManager.this.mContext, this.mBitmap, false);
                    } else {
                        ImageManager.this.zamu.put(this.zamv, Long.valueOf(SystemClock.elapsedRealtime()));
                        zaa2.zaa(ImageManager.this.mContext, ImageManager.this.zamr, false);
                    }
                    if (!(zaa2 instanceof zad)) {
                        ImageManager.this.zams.remove(zaa2);
                    }
                }
            }
            this.zadv.countDown();
            synchronized (ImageManager.zamm) {
                ImageManager.zamn.remove(this.zamv);
            }
        }
    }

    private ImageManager(Context context, boolean z) {
        this.mContext = context.getApplicationContext();
    }

    public final void loadImage(ImageView imageView, Uri uri) {
        zaa((zaa) new zab(imageView, uri));
    }

    public final void loadImage(ImageView imageView, int i) {
        zaa((zaa) new zab(imageView, i));
    }

    public final void loadImage(ImageView imageView, Uri uri, int i) {
        zab zab2 = new zab(imageView, uri);
        zab2.zand = i;
        zaa((zaa) zab2);
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri) {
        zaa((zaa) new zad(onImageLoadedListener, uri));
    }

    public final void loadImage(OnImageLoadedListener onImageLoadedListener, Uri uri, int i) {
        zad zad2 = new zad(onImageLoadedListener, uri);
        zad2.zand = i;
        zaa((zaa) zad2);
    }

    private final void zaa(zaa zaa2) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zad(zaa2).run();
    }

    /* access modifiers changed from: private */
    public final Bitmap zaa(zac zac2) {
        zaa zaa2 = this.zamq;
        if (zaa2 == null) {
            return null;
        }
        return (Bitmap) zaa2.get(zac2);
    }
}

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zad extends zaa {
    private WeakReference<ImageManager.OnImageLoadedListener> zanl;

    public zad(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.zanl = new WeakReference<>(onImageLoadedListener);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zanb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zad zad = (zad) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.zanl.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zad.zanl.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zad.zanb, this.zanb);
    }

    /* access modifiers changed from: protected */
    public final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (!z2 && (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.zanl.get()) != null) {
            onImageLoadedListener.onImageLoaded(this.zanb.uri, drawable, z3);
        }
    }
}

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zai;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zab extends zaa {
    private WeakReference<ImageView> zani;

    public zab(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zani = new WeakReference<>(imageView);
    }

    public final int hashCode() {
        return 0;
    }

    public zab(ImageView imageView, int i) {
        super((Uri) null, i);
        Asserts.checkNotNull(imageView);
        this.zani = new WeakReference<>(imageView);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zab)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = (ImageView) this.zani.get();
        ImageView imageView2 = (ImageView) ((zab) obj).zani.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = (ImageView) this.zani.get();
        if (imageView != null) {
            int i = 0;
            boolean z4 = !z2 && !z3;
            if (z4 && (imageView instanceof zai)) {
                zai zai = (zai) imageView;
                int zacf = zai.zacf();
                if (this.zand != 0 && zacf == this.zand) {
                    return;
                }
            }
            boolean zaa = zaa(z, z2);
            Uri uri = null;
            if (zaa) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zaf) {
                    drawable2 = ((zaf) drawable2).zacd();
                }
                drawable = new zaf(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zai) {
                zai zai2 = (zai) imageView;
                if (z3) {
                    uri = this.zanb.uri;
                }
                zai.zaa(uri);
                if (z4) {
                    i = this.zand;
                }
                zai.zai(i);
            }
            if (zaa) {
                ((zaf) drawable).startTransition(250);
            }
        }
    }
}

package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class zaa {
    final zac zanb;
    private int zanc = 0;
    protected int zand = 0;
    private boolean zane = false;
    private boolean zanf = true;
    private boolean zang = false;
    private boolean zanh = true;

    public zaa(Uri uri, int i) {
        this.zanb = new zac(uri);
        this.zand = i;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: package-private */
    public final void zaa(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context, zak zak) {
        if (this.zanh) {
            zaa((Drawable) null, false, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa(Context context, zak zak, boolean z) {
        int i = this.zand;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    /* access modifiers changed from: protected */
    public final boolean zaa(boolean z, boolean z2) {
        return this.zanf && !z2 && !z;
    }
}

package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbe implements zzdku {
    private final String zzczz;
    private final int zzdum;
    private final int zzdun;
    private final double zzfsn;

    zzcbe(String str, double d, int i, int i2) {
        this.zzczz = str;
        this.zzfsn = d;
        this.zzdum = i;
        this.zzdun = i2;
    }

    public final Object apply(Object obj) {
        String str = this.zzczz;
        return new zzacd(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzfsn, this.zzdum, this.zzdun);
    }
}

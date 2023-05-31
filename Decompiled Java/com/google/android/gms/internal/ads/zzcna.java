package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcna implements zzdng {
    private final zzcnb zzgbr;
    private final Uri zzgbs;
    private final zzdeq zzgbt;
    private final zzdei zzgbu;

    zzcna(zzcnb zzcnb, Uri uri, zzdeq zzdeq, zzdei zzdei) {
        this.zzgbr = zzcnb;
        this.zzgbs = uri;
        this.zzgbt = zzdeq;
        this.zzgbu = zzdei;
    }

    public final zzdof zzf(Object obj) {
        return this.zzgbr.zza(this.zzgbs, this.zzgbt, this.zzgbu, obj);
    }
}

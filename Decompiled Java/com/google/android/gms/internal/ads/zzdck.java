package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdck implements zzdku<zzcjv, zzdcm> {
    private final /* synthetic */ zzdci zzgog;

    zzdck(zzdci zzdci) {
        this.zzgog = zzdci;
    }

    @NullableDecl
    public final /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzazh.zzc("", (zzcjv) obj);
        zzawf.zzee("Failed to get a cache key, reverting to legacy flow.");
        zzdci zzdci = this.zzgog;
        zzdcm unused = zzdci.zzgof = new zzdcm((zzaqx) null, zzdci.zzaqp(), (zzdck) null);
        return this.zzgog.zzgof;
    }
}

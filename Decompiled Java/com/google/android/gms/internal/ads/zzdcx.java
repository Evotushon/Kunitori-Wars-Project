package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzdcx implements zzdcd {
    private final String zzczs;
    private final String zzdcq;
    private final zzarr zzfkm;

    zzdcx(zzarr zzarr, String str, String str2) {
        this.zzfkm = zzarr;
        this.zzczs = str;
        this.zzdcq = str2;
    }

    public final void zzr(Object obj) {
        zzarr zzarr = this.zzfkm;
        ((zzatg) obj).zza(new zzatp(zzarr.getType(), zzarr.getAmount()), this.zzczs, this.zzdcq);
    }
}

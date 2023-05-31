package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcqh implements zzbvi {
    private final /* synthetic */ zzdeq zzgdt;
    private final /* synthetic */ zzdei zzgdu;
    private final /* synthetic */ zzcmd zzgdv;
    final /* synthetic */ zzcqf zzgdw;

    zzcqh(zzcqf zzcqf, zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) {
        this.zzgdw = zzcqf;
        this.zzgdt = zzdeq;
        this.zzgdu = zzdei;
        this.zzgdv = zzcmd;
    }

    public final void onInitializationSucceeded() {
        this.zzgdw.zzfeo.execute(new zzcqg(this, this.zzgdt, this.zzgdu, this.zzgdv));
    }

    public final void zzdh(int i) {
        String valueOf = String.valueOf(this.zzgdv.zzfik);
        zzawf.zzfa(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcmg implements zzbqu {
    private final zzbdv zzeiw;

    zzcmg(zzbdv zzbdv) {
        this.zzeiw = zzbdv;
    }

    public final void onAdImpression() {
        zzbdv zzbdv = this.zzeiw;
        if (zzbdv.zzaaf() != null) {
            zzbdv.zzaaf().zzabe();
        }
    }
}

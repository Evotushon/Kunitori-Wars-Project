package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzxs extends zzvg {
    private final /* synthetic */ zzxt zzcfc;

    zzxs(zzxt zzxt) {
        this.zzcfc = zzxt;
    }

    public final void onAdLoaded() {
        this.zzcfc.zzcfe.zza(this.zzcfc.zzdq());
        super.onAdLoaded();
    }

    public final void onAdFailedToLoad(int i) {
        this.zzcfc.zzcfe.zza(this.zzcfc.zzdq());
        super.onAdFailedToLoad(i);
    }
}

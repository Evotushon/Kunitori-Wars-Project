package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaoi implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel zzdgb;
    private final /* synthetic */ zzaog zzdgc;

    zzaoi(zzaog zzaog, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdgc = zzaog;
        this.zzdgb = adOverlayInfoParcel;
    }

    public final void run() {
        zzq.zzku();
        zzl.zza(this.zzdgc.zzdfz, this.zzdgb, true);
    }
}

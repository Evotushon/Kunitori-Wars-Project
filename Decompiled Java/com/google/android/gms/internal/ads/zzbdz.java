package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdz implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzaub zzegb;
    private final /* synthetic */ int zzegc;
    private final /* synthetic */ zzbdy zzegd;

    zzbdz(zzbdy zzbdy, View view, zzaub zzaub, int i) {
        this.zzegd = zzbdy;
        this.val$view = view;
        this.zzegb = zzaub;
        this.zzegc = i;
    }

    public final void run() {
        this.zzegd.zza(this.val$view, this.zzegb, this.zzegc - 1);
    }
}

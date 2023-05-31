package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbfq implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzaub zzegb;
    private final /* synthetic */ int zzegc;
    private final /* synthetic */ zzbfo zzejc;

    zzbfq(zzbfo zzbfo, View view, zzaub zzaub, int i) {
        this.zzejc = zzbfo;
        this.val$view = view;
        this.zzegb = zzaub;
        this.zzegc = i;
    }

    public final void run() {
        this.zzejc.zza(this.val$view, this.zzegb, this.zzegc - 1);
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzqm implements Runnable {
    private final /* synthetic */ zzqj zzbqi;
    private final /* synthetic */ View zzbqj;

    zzqm(zzqj zzqj, View view) {
        this.zzbqi = zzqj;
        this.zzbqj = view;
    }

    public final void run() {
        this.zzbqi.zzi(this.zzbqj);
    }
}

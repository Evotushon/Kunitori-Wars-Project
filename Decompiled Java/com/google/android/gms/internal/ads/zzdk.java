package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdk implements Runnable {
    private final /* synthetic */ Context zzwj;

    zzdk(zzdi zzdi, Context context) {
        this.zzwj = context;
    }

    public final void run() {
        try {
            zzdi.zzvf.zzb(this.zzwj);
        } catch (Exception e) {
            zzdi.zzvh.zza(2019, -1, e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzawq implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzawo zzduc;

    zzawq(zzawo zzawo, Context context) {
        this.zzduc = zzawo;
        this.val$context = context;
    }

    public final void run() {
        synchronized (this.zzduc.zzdty) {
            String unused = this.zzduc.zzbfa = zzawo.zzas(this.val$context);
            this.zzduc.zzdty.notifyAll();
        }
    }
}

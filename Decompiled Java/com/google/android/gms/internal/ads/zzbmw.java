package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmw implements zzbrn, zzpt {
    private final zzdei zzfdq;
    private final zzbqp zzfhj;
    private final zzbrr zzfhk;
    private final AtomicBoolean zzfhl = new AtomicBoolean();
    private final AtomicBoolean zzfhm = new AtomicBoolean();

    public zzbmw(zzdei zzdei, zzbqp zzbqp, zzbrr zzbrr) {
        this.zzfdq = zzdei;
        this.zzfhj = zzbqp;
        this.zzfhk = zzbrr;
    }

    public final synchronized void onAdLoaded() {
        if (this.zzfdq.zzgpl != 1) {
            zzahf();
        }
    }

    public final void zza(zzpu zzpu) {
        if (this.zzfdq.zzgpl == 1 && zzpu.zzbnz) {
            zzahf();
        }
        if (zzpu.zzbnz && this.zzfhm.compareAndSet(false, true)) {
            this.zzfhk.zzaia();
        }
    }

    private final void zzahf() {
        if (this.zzfhl.compareAndSet(false, true)) {
            this.zzfhj.onAdImpression();
        }
    }
}

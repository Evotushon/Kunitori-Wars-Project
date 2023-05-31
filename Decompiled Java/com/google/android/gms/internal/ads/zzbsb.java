package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbsb extends zzbtk<zzbsg> implements zzbqu, zzbrw {
    private final zzdei zzfdq;
    private AtomicBoolean zzfko = new AtomicBoolean();

    public zzbsb(Set<zzbuv<zzbsg>> set, zzdei zzdei) {
        super(set);
        this.zzfdq = zzdei;
    }

    public final void onAdImpression() {
        if (this.zzfdq.zzfmh == 2 || this.zzfdq.zzfmh == 5 || this.zzfdq.zzfmh == 4) {
            zzaib();
        }
    }

    public final void zzaia() {
        if (this.zzfdq.zzfmh == 1) {
            zzaib();
        }
    }

    private final void zzaib() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcsi)).booleanValue() && this.zzfko.compareAndSet(false, true) && this.zzfdq.zzgqe != null && this.zzfdq.zzgqe.type == 3) {
            zza(new zzbse(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbsg zzbsg) throws Exception {
        zzbsg.zzb(this.zzfdq.zzgqe);
    }
}

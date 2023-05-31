package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnm {
    private final Executor executor;
    private volatile boolean zzadk = true;
    private final ScheduledExecutorService zzfib;
    private final zzdof<zzbnl> zzfic;

    public zzbnm(Executor executor2, ScheduledExecutorService scheduledExecutorService, zzdof<zzbnl> zzdof) {
        this.executor = executor2;
        this.zzfib = scheduledExecutorService;
        this.zzfic = zzdof;
    }

    public final void zza(zzdnu<zzbnf> zzdnu) {
        zzdnt.zza(this.zzfic, new zzbnt(this, zzdnu), this.executor);
    }

    /* access modifiers changed from: private */
    public final void zza(List<? extends zzdof<? extends zzbnf>> list, zzdnu<zzbnf> zzdnu) {
        if (list == null || list.isEmpty()) {
            this.executor.execute(new zzbnp(zzdnu));
            return;
        }
        zzdof<O> zzaj = zzdnt.zzaj(null);
        for (zzdof zzbnr : list) {
            zzaj = zzdnt.zzb(zzdnt.zzb(zzaj, Throwable.class, new zzbno(zzdnu), this.executor), new zzbnr(this, zzdnu, zzbnr), this.executor);
        }
        zzdnt.zza(zzaj, new zzbns(this, zzdnu), this.executor);
    }

    public final boolean isLoading() {
        return this.zzadk;
    }

    /* access modifiers changed from: private */
    public final void zzahk() {
        zzazq.zzdxo.execute(new zzbnq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzahl() {
        this.zzadk = false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdnu zzdnu, zzdof zzdof, zzbnf zzbnf) throws Exception {
        if (zzbnf != null) {
            zzdnu.onSuccess(zzbnf);
        }
        return zzdnt.zza(zzdof, zzabs.zzcvv.get().longValue(), TimeUnit.MILLISECONDS, this.zzfib);
    }
}

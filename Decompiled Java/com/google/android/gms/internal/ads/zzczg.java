package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczg implements zzcye<zzczd> {
    private final Executor executor;
    private final zzavr zzbmv;
    private final ScheduledExecutorService zzfib;
    private final zzavn zzglb;
    private final int zzgll;
    private final Context zzur;

    public zzczg(zzavn zzavn, int i, Context context, zzavr zzavr, ScheduledExecutorService scheduledExecutorService, Executor executor2) {
        this.zzglb = zzavn;
        this.zzgll = i;
        this.zzur = context;
        this.zzbmv = zzavr;
        this.zzfib = scheduledExecutorService;
        this.executor = executor2;
    }

    public final zzdof<zzczd> zzapb() {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcqo)).booleanValue()) {
            return zzdnt.zzaj(null);
        }
        return zzdno.zzg(zzdnt.zza(new zzczf(this), this.executor)).zza(zzczi.zzdpv, this.executor).zza(((Long) zzvh.zzpd().zzd(zzzx.zzcjx)).longValue(), TimeUnit.MILLISECONDS, this.zzfib).zza(Exception.class, new zzczh(this), zzdoh.zzauv());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzczd zza(Exception exc) {
        this.zzbmv.zza(exc, "ATTESTATION_TOKEN_FETCH");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzapu() throws Exception {
        return this.zzglb.zza(this.zzur, this.zzgll);
    }
}

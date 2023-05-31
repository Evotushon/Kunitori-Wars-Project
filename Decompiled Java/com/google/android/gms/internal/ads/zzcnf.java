package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcnf implements zzcly<zzblg> {
    private final ScheduledExecutorService zzfib;
    /* access modifiers changed from: private */
    public final zzbqk zzflh;
    private final zzdoe zzfrv;
    private final zzbmc zzgby;
    private final zzcml zzgbz;

    public zzcnf(zzbmc zzbmc, zzcml zzcml, zzbqk zzbqk, ScheduledExecutorService scheduledExecutorService, zzdoe zzdoe) {
        this.zzgby = zzbmc;
        this.zzgbz = zzcml;
        this.zzflh = zzbqk;
        this.zzfib = scheduledExecutorService;
        this.zzfrv = zzdoe;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return zzdeq.zzgql.zzfir.zzaqx() != null && this.zzgbz.zza(zzdeq, zzdei);
    }

    public final zzdof<zzblg> zzb(zzdeq zzdeq, zzdei zzdei) {
        return this.zzfrv.zzd(new zzcne(this, zzdeq, zzdei));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzblg zzc(zzdeq zzdeq, zzdei zzdei) throws Exception {
        return this.zzgby.zza(new zzbnv(zzdeq, zzdei, (String) null), new zzbmq(zzdeq.zzgql.zzfir.zzaqx(), new zzcnh(this, zzdeq, zzdei))).zzaeu();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdeq zzdeq, zzdei zzdei) {
        zzdnt.zza(zzdnt.zza(this.zzgbz.zzb(zzdeq, zzdei), (long) zzdei.zzgpz, TimeUnit.SECONDS, this.zzfib), new zzcng(this), this.zzfrv);
    }
}

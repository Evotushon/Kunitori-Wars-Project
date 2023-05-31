package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcti implements zzdng<zzaqx, zzctj> {
    private Executor executor;
    private zzcjk zzghl;

    public zzcti(Executor executor2, zzcjk zzcjk) {
        this.executor = executor2;
        this.zzghl = zzcjk;
    }

    public final /* synthetic */ zzdof zzf(Object obj) throws Exception {
        zzaqx zzaqx = (zzaqx) obj;
        return zzdnt.zzb(this.zzghl.zzh(zzaqx), new zzcth(zzaqx), this.executor);
    }
}

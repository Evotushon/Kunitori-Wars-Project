package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcmb<DelegateT, AdapterT> implements zzcly<AdapterT> {
    @VisibleForTesting
    private final zzcly<DelegateT> zzgbb;
    private final zzdku<DelegateT, AdapterT> zzgbc;

    public zzcmb(zzcly<DelegateT> zzcly, zzdku<DelegateT, AdapterT> zzdku) {
        this.zzgbb = zzcly;
        this.zzgbc = zzdku;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return this.zzgbb.zza(zzdeq, zzdei);
    }

    public final zzdof<AdapterT> zzb(zzdeq zzdeq, zzdei zzdei) {
        return zzdnt.zzb(this.zzgbb.zzb(zzdeq, zzdei), this.zzgbc, (Executor) zzazq.zzdxk);
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdbv<R> implements zzdgy {
    public final Executor executor;
    public final String zzbri;
    public final zzuh zzdjt;
    public final zzur zzgif;
    public final zzdcq<R> zzgnu;
    public final zzdcp zzgnv;
    @Nullable
    private final zzdgj zzgnw;

    public zzdbv(zzdcq<R> zzdcq, zzdcp zzdcp, zzuh zzuh, String str, Executor executor2, zzur zzur, @Nullable zzdgj zzdgj) {
        this.zzgnu = zzdcq;
        this.zzgnv = zzdcp;
        this.zzdjt = zzuh;
        this.zzbri = str;
        this.executor = executor2;
        this.zzgif = zzur;
        this.zzgnw = zzdgj;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public final zzdgj zzaql() {
        return this.zzgnw;
    }

    public final zzdgy zzaqm() {
        return new zzdbv(this.zzgnu, this.zzgnv, this.zzdjt, this.zzbri, this.executor, this.zzgif, this.zzgnw);
    }
}

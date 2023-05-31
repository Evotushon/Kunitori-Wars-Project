package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctr implements zzcye<Object> {
    private final Executor executor;
    private final zzdof<String> zzghv;

    public zzctr(zzdof<String> zzdof, Executor executor2) {
        this.zzghv = zzdof;
        this.executor = executor2;
    }

    public final zzdof<Object> zzapb() {
        return zzdnt.zzb(this.zzghv, zzctu.zzblf, this.executor);
    }
}

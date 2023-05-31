package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccf implements zzeej<zzcby> {
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzbkk> zzfrk;
    private final zzeew<zzbuu> zzftb;

    public zzccf(zzeew<Executor> zzeew, zzeew<zzbkk> zzeew2, zzeew<zzbuu> zzeew3) {
        this.zzfgm = zzeew;
        this.zzfrk = zzeew2;
        this.zzftb = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return new zzcby(this.zzfgm.get(), this.zzfrk.get(), this.zzftb.get());
    }
}

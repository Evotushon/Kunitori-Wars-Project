package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcpk implements zzeej<zzcpi> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzcdq> zzgbg;

    public zzcpk(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzcdq> zzeew3) {
        this.zzelc = zzeew;
        this.zzfgm = zzeew2;
        this.zzgbg = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return new zzcpi(this.zzelc.get(), this.zzfgm.get(), this.zzgbg.get());
    }
}

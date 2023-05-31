package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmv implements zzeej<zzbmm> {
    private final zzeew<zzbne> zzepn;
    private final zzeew<Runnable> zzfah;
    private final zzeew<zzael> zzffc;
    private final zzeew<Executor> zzfgm;

    public zzbmv(zzeew<zzbne> zzeew, zzeew<zzael> zzeew2, zzeew<Runnable> zzeew3, zzeew<Executor> zzeew4) {
        this.zzepn = zzeew;
        this.zzffc = zzeew2;
        this.zzfah = zzeew3;
        this.zzfgm = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzbmm(this.zzepn.get(), this.zzffc.get(), this.zzfah.get(), this.zzfgm.get());
    }
}

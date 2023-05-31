package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcmv implements zzeej<zzcmt> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzffi;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzbmc> zzgbg;

    public zzcmv(zzeew<Context> zzeew, zzeew<zzazo> zzeew2, zzeew<zzbmc> zzeew3, zzeew<Executor> zzeew4) {
        this.zzelc = zzeew;
        this.zzffi = zzeew2;
        this.zzgbg = zzeew3;
        this.zzfgm = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzcmt(this.zzelc.get(), this.zzffi.get(), this.zzgbg.get(), this.zzfgm.get());
    }
}

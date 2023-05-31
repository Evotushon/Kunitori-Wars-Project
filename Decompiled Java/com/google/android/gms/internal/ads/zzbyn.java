package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyn implements zzeej<zzbkk> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfev;
    private final zzeew<Clock> zzfex;
    private final zzeew<zzpo> zzfoc;

    public zzbyn(zzeew<zzpo> zzeew, zzeew<Executor> zzeew2, zzeew<Context> zzeew3, zzeew<Clock> zzeew4) {
        this.zzfoc = zzeew;
        this.zzfev = zzeew2;
        this.zzelc = zzeew3;
        this.zzfex = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return (zzbkk) zzeep.zza(new zzbkk(this.zzfev.get(), new zzbjz(this.zzelc.get(), this.zzfoc.get()), this.zzfex.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

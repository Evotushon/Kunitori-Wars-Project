package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcuu implements zzeej<zzcuq> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfev;
    private final zzeew<ScheduledExecutorService> zzfst;

    private zzcuu(zzeew<Context> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<Executor> zzeew3) {
        this.zzelc = zzeew;
        this.zzfst = zzeew2;
        this.zzfev = zzeew3;
    }

    public static zzcuu zzo(zzeew<Context> zzeew, zzeew<ScheduledExecutorService> zzeew2, zzeew<Executor> zzeew3) {
        return new zzcuu(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzcuq(this.zzelc.get(), this.zzfst.get(), this.zzfev.get());
    }
}

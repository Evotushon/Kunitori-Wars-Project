package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcaz implements zzeej<zzcax> {
    private final zzeew<zzaxx> zzeus;
    private final zzeew<Executor> zzfev;
    private final zzeew<Clock> zzfex;

    public zzcaz(zzeew<zzaxx> zzeew, zzeew<Clock> zzeew2, zzeew<Executor> zzeew3) {
        this.zzeus = zzeew;
        this.zzfex = zzeew2;
        this.zzfev = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return new zzcax(this.zzeus.get(), this.zzfex.get(), this.zzfev.get());
    }
}

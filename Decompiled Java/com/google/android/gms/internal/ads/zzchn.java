package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchn implements zzeej<Set<zzbuv<zzdil>>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzchm> zzfve;
    private final zzchc zzfwl;

    private zzchn(zzchc zzchc, zzeew<zzchm> zzeew, zzeew<Executor> zzeew2) {
        this.zzfwl = zzchc;
        this.zzfve = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzchn zzh(zzchc zzchc, zzeew<zzchm> zzeew, zzeew<Executor> zzeew2) {
        return new zzchn(zzchc, zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(zzchc.zzh(this.zzfve.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

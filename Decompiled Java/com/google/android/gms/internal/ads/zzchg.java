package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchg implements zzeej<Set<zzbuv<zzbrn>>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzchm> zzfve;
    private final zzchc zzfwl;

    private zzchg(zzchc zzchc, zzeew<zzchm> zzeew, zzeew<Executor> zzeew2) {
        this.zzfwl = zzchc;
        this.zzfve = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzchg zzc(zzchc zzchc, zzeew<zzchm> zzeew, zzeew<Executor> zzeew2) {
        return new zzchg(zzchc, zzeew, zzeew2);
    }

    public static Set<zzbuv<zzbrn>> zza(zzchc zzchc, zzchm zzchm, Executor executor) {
        return (Set) zzeep.zza(zzchc.zzc(zzchm, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfwl, this.zzfve.get(), this.zzfev.get());
    }
}

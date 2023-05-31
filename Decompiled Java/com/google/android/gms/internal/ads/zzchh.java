package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzchh implements zzeej<Set<zzbuv<zzbqt>>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzchm> zzfve;
    private final zzchc zzfwl;

    private zzchh(zzchc zzchc, zzeew<zzchm> zzeew, zzeew<Executor> zzeew2) {
        this.zzfwl = zzchc;
        this.zzfve = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzchh zzd(zzchc zzchc, zzeew<zzchm> zzeew, zzeew<Executor> zzeew2) {
        return new zzchh(zzchc, zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(zzchc.zza(this.zzfve.get(), this.zzfev.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

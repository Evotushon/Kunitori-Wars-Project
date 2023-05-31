package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcfm implements zzeej<Set<zzbuv<zzdil>>> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzcgc> zzffc;

    private zzcfm(zzeew<Executor> zzeew, zzeew<zzcgc> zzeew2) {
        this.zzfev = zzeew;
        this.zzffc = zzeew2;
    }

    public static zzcfm zzy(zzeew<Executor> zzeew, zzeew<zzcgc> zzeew2) {
        return new zzcfm(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        Set set;
        Executor executor = this.zzfev.get();
        zzcgc zzcgc = this.zzffc.get();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcot)).booleanValue()) {
            set = Collections.singleton(new zzbuv(zzcgc, executor));
        } else {
            set = Collections.emptySet();
        }
        return (Set) zzeep.zza(set, "Cannot return null from a non-@Nullable @Provides method");
    }
}

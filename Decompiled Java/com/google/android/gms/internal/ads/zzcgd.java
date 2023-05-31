package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgd implements zzeej<Set<zzbuv<zzdil>>> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfev;
    private final zzeew<String> zzfvk;
    private final zzeew<Map<zzdig, zzcge>> zzfvl;

    public zzcgd(zzeew<String> zzeew, zzeew<Context> zzeew2, zzeew<Executor> zzeew3, zzeew<Map<zzdig, zzcge>> zzeew4) {
        this.zzfvk = zzeew;
        this.zzelc = zzeew2;
        this.zzfev = zzeew3;
        this.zzfvl = zzeew4;
    }

    public final /* synthetic */ Object get() {
        Set set;
        String str = this.zzfvk.get();
        Context context = this.zzelc.get();
        Executor executor = this.zzfev.get();
        Map map = this.zzfvl.get();
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcot)).booleanValue()) {
            zzsn zzsn = new zzsn(new zzss(context));
            zzsn.zza((zzsq) new zzcgf(str));
            set = Collections.singleton(new zzbuv(new zzcgc(zzsn, map), executor));
        } else {
            set = Collections.emptySet();
        }
        return (Set) zzeep.zza(set, "Cannot return null from a non-@Nullable @Provides method");
    }
}

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzbtk<ListenerT> {
    @GuardedBy("this")
    private final Map<ListenerT, Executor> zzfkw = new HashMap();

    protected zzbtk(Set<zzbuv<ListenerT>> set) {
        zzb(set);
    }

    public final synchronized void zza(zzbuv<ListenerT> zzbuv) {
        zza(zzbuv.zzflp, zzbuv.executor);
    }

    public final synchronized void zza(ListenerT listenert, Executor executor) {
        this.zzfkw.put(listenert, executor);
    }

    private final synchronized void zzb(Set<zzbuv<ListenerT>> set) {
        for (zzbuv<ListenerT> zza : set) {
            zza(zza);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zza(zzbtm<ListenerT> zzbtm) {
        for (Map.Entry next : this.zzfkw.entrySet()) {
            ((Executor) next.getValue()).execute(new zzbtj(zzbtm, next.getKey()));
        }
    }
}

package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.0.1 */
final class zzdwy {
    private final ConcurrentHashMap<zzdxb, List<Throwable>> zzhnk = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzhnl = new ReferenceQueue<>();

    zzdwy() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzhnl.poll();
        while (poll != null) {
            this.zzhnk.remove(poll);
            poll = this.zzhnl.poll();
        }
        List<Throwable> list = this.zzhnk.get(new zzdxb(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zzhnk.putIfAbsent(new zzdxb(th, this.zzhnl), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}

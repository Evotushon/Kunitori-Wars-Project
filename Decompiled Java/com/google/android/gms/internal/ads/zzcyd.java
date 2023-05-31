package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyd<T> {
    private final Executor executor;
    private final Set<zzcye<? extends zzcyb<T>>> zzgkp;

    public zzcyd(Executor executor2, Set<zzcye<? extends zzcyb<T>>> set) {
        this.executor = executor2;
        this.zzgkp = set;
    }

    public final zzdof<T> zzt(T t) {
        ArrayList arrayList = new ArrayList(this.zzgkp.size());
        for (zzcye next : this.zzgkp) {
            zzdof zzapb = next.zzapb();
            if (zzabi.zzcuw.get().booleanValue()) {
                zzapb.addListener(new zzcyg(next, zzq.zzlc().elapsedRealtime()), zzazq.zzdxp);
            }
            arrayList.add(zzapb);
        }
        return zzdnt.zzi(arrayList).zza(new zzcyf(arrayList, t), this.executor);
    }
}

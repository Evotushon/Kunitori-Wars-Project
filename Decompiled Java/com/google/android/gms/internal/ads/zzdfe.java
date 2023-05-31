package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfe<T> {
    private final zzdoe zzfrv;
    @GuardedBy("this")
    private final Deque<zzdof<T>> zzgra = new LinkedBlockingDeque();
    private final Callable<T> zzgrb;

    public zzdfe(Callable<T> callable, zzdoe zzdoe) {
        this.zzgrb = callable;
        this.zzfrv = zzdoe;
    }

    public final synchronized void zzdm(int i) {
        int size = i - this.zzgra.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zzgra.add(this.zzfrv.zzd(this.zzgrb));
        }
    }

    public final synchronized zzdof<T> zzard() {
        zzdm(1);
        return this.zzgra.poll();
    }

    public final synchronized void zzd(zzdof<T> zzdof) {
        this.zzgra.addFirst(zzdof);
    }
}

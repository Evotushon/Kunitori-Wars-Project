package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdnv<V> implements Runnable {
    private final Future<V> zzhcx;
    private final zzdnu<? super V> zzhcy;

    zzdnv(Future<V> future, zzdnu<? super V> zzdnu) {
        this.zzhcx = future;
        this.zzhcy = zzdnu;
    }

    public final void run() {
        Throwable zza;
        Future<V> future = this.zzhcx;
        if (!(future instanceof zzdow) || (zza = zzdoz.zza((zzdow) future)) == null) {
            try {
                this.zzhcy.onSuccess(zzdnt.zza(this.zzhcx));
            } catch (ExecutionException e) {
                this.zzhcy.zzb(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.zzhcy.zzb(e2);
            }
        } else {
            this.zzhcy.zzb(zza);
        }
    }

    public final String toString() {
        return zzdkx.zzaa(this).zzab(this.zzhcy).toString();
    }
}

package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdr;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzm implements Callable<zzdq> {
    private final /* synthetic */ zzl zzblt;

    zzm(zzl zzl) {
        this.zzblt = zzl;
    }

    public final /* synthetic */ Object call() throws Exception {
        return new zzdq(zzdr.zza(this.zzblt.zzblu.zzbmj, this.zzblt.zzur, false));
    }
}

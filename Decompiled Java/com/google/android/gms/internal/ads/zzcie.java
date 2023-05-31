package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcie implements zzdng {
    static final zzdng zzblf = new zzcie();

    private zzcie() {
    }

    public final zzdof zzf(Object obj) {
        return zzdnt.immediateFailedFuture(((ExecutionException) obj).getCause());
    }
}

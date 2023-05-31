package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcjb implements zzdng {
    static final zzdng zzblf = new zzcjb();

    private zzcjb() {
    }

    public final zzdof zzf(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzdnt.immediateFailedFuture(new zzcke("Timed out waiting for ad response.", 2));
    }
}

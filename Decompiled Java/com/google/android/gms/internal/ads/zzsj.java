package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzsj implements Runnable {
    private final zzazy zzbsd;
    private final Future zzbse;

    zzsj(zzazy zzazy, Future future) {
        this.zzbsd = zzazy;
        this.zzbse = future;
    }

    public final void run() {
        zzazy zzazy = this.zzbsd;
        Future future = this.zzbse;
        if (zzazy.isCancelled()) {
            future.cancel(true);
        }
    }
}

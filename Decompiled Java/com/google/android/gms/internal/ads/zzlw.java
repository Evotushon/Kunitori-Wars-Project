package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzlw implements Runnable {
    private final /* synthetic */ zzls zzbab;
    private final /* synthetic */ IOException zzbbh;

    zzlw(zzls zzls, IOException iOException) {
        this.zzbab = zzls;
        this.zzbbh = iOException;
    }

    public final void run() {
        this.zzbab.zzbad.zzb(this.zzbbh);
    }
}

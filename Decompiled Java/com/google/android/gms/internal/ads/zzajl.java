package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzajl implements Runnable {
    private final /* synthetic */ zzair zzdax;
    private final /* synthetic */ zzaja zzdaz;
    private final /* synthetic */ zzajv zzdba;

    zzajl(zzaja zzaja, zzajv zzajv, zzair zzair) {
        this.zzdaz = zzaja;
        this.zzdba = zzajv;
        this.zzdax = zzair;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzaja r0 = r3.zzdaz
            java.lang.Object r0 = r0.lock
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzajv r1 = r3.zzdba     // Catch:{ all -> 0x0036 }
            int r1 = r1.getStatus()     // Catch:{ all -> 0x0036 }
            r2 = -1
            if (r1 == r2) goto L_0x0034
            com.google.android.gms.internal.ads.zzajv r1 = r3.zzdba     // Catch:{ all -> 0x0036 }
            int r1 = r1.getStatus()     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r1 != r2) goto L_0x001a
            goto L_0x0034
        L_0x001a:
            com.google.android.gms.internal.ads.zzajv r1 = r3.zzdba     // Catch:{ all -> 0x0036 }
            r1.reject()     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.zzdoe r1 = com.google.android.gms.internal.ads.zzazq.zzdxo     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.zzair r2 = r3.zzdax     // Catch:{ all -> 0x0036 }
            r2.getClass()     // Catch:{ all -> 0x0036 }
            java.lang.Runnable r2 = com.google.android.gms.internal.ads.zzajk.zzb(r2)     // Catch:{ all -> 0x0036 }
            r1.execute(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.zzawf.zzee(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajl.run():void");
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdh implements Runnable {
    private final /* synthetic */ zzde zzve;

    zzdh(zzde zzde) {
        this.zzve = zzde;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|(2:16|17)|18|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzde r0 = r7.zzve
            java.lang.Boolean r0 = r0.zzvb
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            android.os.ConditionVariable r0 = com.google.android.gms.internal.ads.zzde.zzuz
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzde r1 = r7.zzve     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = r1.zzvb     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0014:
            r1 = 0
            com.google.android.gms.internal.ads.zzaax<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzzx.zzclr     // Catch:{ IllegalStateException -> 0x0022 }
            java.lang.Object r2 = r2.get()     // Catch:{ IllegalStateException -> 0x0022 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ IllegalStateException -> 0x0022 }
            boolean r2 = r2.booleanValue()     // Catch:{ IllegalStateException -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzss r3 = new com.google.android.gms.internal.ads.zzss     // Catch:{ Throwable -> 0x0038 }
            com.google.android.gms.internal.ads.zzde r4 = r7.zzve     // Catch:{ Throwable -> 0x0038 }
            com.google.android.gms.internal.ads.zzei r4 = r4.zzuy     // Catch:{ Throwable -> 0x0038 }
            android.content.Context r4 = r4.zzur     // Catch:{ Throwable -> 0x0038 }
            java.lang.String r5 = "ADSHIELD"
            r6 = 0
            r3.<init>(r4, r5, r6)     // Catch:{ Throwable -> 0x0038 }
            com.google.android.gms.internal.ads.zzde.zzva = r3     // Catch:{ Throwable -> 0x0038 }
        L_0x0037:
            r1 = r2
        L_0x0038:
            com.google.android.gms.internal.ads.zzde r2 = r7.zzve     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0049 }
            r2.zzvb = r1     // Catch:{ all -> 0x0049 }
            android.os.ConditionVariable r1 = com.google.android.gms.internal.ads.zzde.zzuz     // Catch:{ all -> 0x0049 }
            r1.open()     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdh.run():void");
    }
}

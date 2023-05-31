package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgy {
    @GuardedBy("this")
    private List<Map<String, String>> zzfwe = new ArrayList();
    @GuardedBy("this")
    private boolean zzfwf = false;
    @GuardedBy("this")
    private boolean zzfwg = false;
    private String zzfwh;
    private zzcgx zzfwi;

    public zzcgy(String str, zzcgx zzcgx) {
        this.zzfwh = str;
        this.zzfwi = zzcgx;
    }

    public final synchronized void zzge(String str) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclo)).booleanValue()) {
            Map<String, String> zzane = zzane();
            zzane.put("action", "adapter_init_started");
            zzane.put("ancn", str);
            this.zzfwe.add(zzane);
        }
    }

    public final synchronized void zzgf(String str) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclo)).booleanValue()) {
            Map<String, String> zzane = zzane();
            zzane.put("action", "adapter_init_finished");
            zzane.put("ancn", str);
            this.zzfwe.add(zzane);
        }
    }

    public final synchronized void zzq(String str, String str2) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclo)).booleanValue()) {
            Map<String, String> zzane = zzane();
            zzane.put("action", "adapter_init_finished");
            zzane.put("ancn", str);
            zzane.put("rqe", str2);
            this.zzfwe.add(zzane);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzanc() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzclo     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x002e }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x002e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.zzfwf     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            java.util.Map r0 = r3.zzane()     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x002e }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.zzfwe     // Catch:{ all -> 0x002e }
            r1.add(r0)     // Catch:{ all -> 0x002e }
            r0 = 1
            r3.zzfwf = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r3)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgy.zzanc():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzand() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzzx.zzclo     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r1.zzd(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)
            return
        L_0x0015:
            boolean r0 = r3.zzfwg     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0044
            java.util.Map r0 = r3.zzane()     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0046 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.zzfwe     // Catch:{ all -> 0x0046 }
            r1.add(r0)     // Catch:{ all -> 0x0046 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.zzfwe     // Catch:{ all -> 0x0046 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0046 }
        L_0x002f:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0046 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzcgx r2 = r3.zzfwi     // Catch:{ all -> 0x0046 }
            r2.zzm(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x002f
        L_0x0041:
            r0 = 1
            r3.zzfwg = r0     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r3)
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x004a
        L_0x0049:
            throw r0
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgy.zzand():void");
    }

    private final Map<String, String> zzane() {
        Map<String, String> zzana = this.zzfwi.zzana();
        zzana.put("tms", Long.toString(zzq.zzlc().elapsedRealtime(), 10));
        zzana.put("tid", this.zzfwh);
        return zzana;
    }
}

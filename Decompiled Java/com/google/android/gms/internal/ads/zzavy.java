package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzavy {
    private final Object lock = new Object();
    @VisibleForTesting
    private long zzdsk = -1;
    @VisibleForTesting
    private long zzdsl = -1;
    @GuardedBy("lock")
    @VisibleForTesting
    private int zzdsm = -1;
    @VisibleForTesting
    int zzdsn = -1;
    @VisibleForTesting
    private long zzdso = 0;
    @VisibleForTesting
    private final String zzdsp;
    private final zzawh zzdsq;
    @GuardedBy("lock")
    @VisibleForTesting
    private int zzdsr = 0;
    @GuardedBy("lock")
    @VisibleForTesting
    private int zzdss = 0;

    public zzavy(String str, zzawh zzawh) {
        this.zzdsp = str;
        this.zzdsq = zzawh;
    }

    public final void zzvb() {
        synchronized (this.lock) {
            this.zzdsr++;
        }
    }

    public final void zzva() {
        synchronized (this.lock) {
            this.zzdss++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzuh r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.lock
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzawh r1 = r10.zzdsq     // Catch:{ all -> 0x007b }
            long r1 = r1.zzwg()     // Catch:{ all -> 0x007b }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzq.zzlc()     // Catch:{ all -> 0x007b }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x007b }
            long r5 = r10.zzdsl     // Catch:{ all -> 0x007b }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0042
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzzi<java.lang.Long> r5 = com.google.android.gms.internal.ads.zzzx.zzcjv     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.ads.zzzt r6 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ all -> 0x007b }
            java.lang.Object r5 = r6.zzd(r5)     // Catch:{ all -> 0x007b }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007b }
            long r5 = r5.longValue()     // Catch:{ all -> 0x007b }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.zzdsn = r1     // Catch:{ all -> 0x007b }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.zzawh r1 = r10.zzdsq     // Catch:{ all -> 0x007b }
            int r1 = r1.zzwh()     // Catch:{ all -> 0x007b }
            r10.zzdsn = r1     // Catch:{ all -> 0x007b }
        L_0x003b:
            r10.zzdsl = r12     // Catch:{ all -> 0x007b }
            long r12 = r10.zzdsl     // Catch:{ all -> 0x007b }
            r10.zzdsk = r12     // Catch:{ all -> 0x007b }
            goto L_0x0044
        L_0x0042:
            r10.zzdsk = r12     // Catch:{ all -> 0x007b }
        L_0x0044:
            r12 = 1
            if (r11 == 0) goto L_0x0058
            android.os.Bundle r13 = r11.extras     // Catch:{ all -> 0x007b }
            if (r13 == 0) goto L_0x0058
            android.os.Bundle r11 = r11.extras     // Catch:{ all -> 0x007b }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x007b }
            if (r11 != r12) goto L_0x0058
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return
        L_0x0058:
            int r11 = r10.zzdsm     // Catch:{ all -> 0x007b }
            int r11 = r11 + r12
            r10.zzdsm = r11     // Catch:{ all -> 0x007b }
            int r11 = r10.zzdsn     // Catch:{ all -> 0x007b }
            int r11 = r11 + r12
            r10.zzdsn = r11     // Catch:{ all -> 0x007b }
            int r11 = r10.zzdsn     // Catch:{ all -> 0x007b }
            if (r11 != 0) goto L_0x0070
            r11 = 0
            r10.zzdso = r11     // Catch:{ all -> 0x007b }
            com.google.android.gms.internal.ads.zzawh r11 = r10.zzdsq     // Catch:{ all -> 0x007b }
            r11.zzfa(r3)     // Catch:{ all -> 0x007b }
            goto L_0x0079
        L_0x0070:
            com.google.android.gms.internal.ads.zzawh r11 = r10.zzdsq     // Catch:{ all -> 0x007b }
            long r11 = r11.zzwi()     // Catch:{ all -> 0x007b }
            long r3 = r3 - r11
            r10.zzdso = r3     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return
        L_0x007b:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavy.zza(com.google.android.gms.internal.ads.zzuh, long):void");
    }

    public final Bundle zzo(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzdsp);
            bundle.putLong("basets", this.zzdsl);
            bundle.putLong("currts", this.zzdsk);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdsm);
            bundle.putInt("preqs_in_session", this.zzdsn);
            bundle.putLong("time_in_session", this.zzdso);
            bundle.putInt("pclick", this.zzdsr);
            bundle.putInt("pimp", this.zzdss);
            bundle.putBoolean("support_transparent_background", zzao(context));
        }
        return bundle;
    }

    private static boolean zzao(Context context) {
        Context zzac = zzars.zzac(context);
        int identifier = zzac.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzawf.zzez("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzac.getPackageManager().getActivityInfo(new ComponentName(zzac.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzawf.zzez("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzawf.zzfa("Fail to fetch AdActivity theme");
            zzawf.zzez("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}

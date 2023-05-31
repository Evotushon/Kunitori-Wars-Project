package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdd implements Runnable {
    private final /* synthetic */ String zzdvm;
    private final /* synthetic */ String zzeeh;
    private final /* synthetic */ zzbda zzeel;
    private final /* synthetic */ long zzeeo;

    zzbdd(zzbda zzbda, String str, String str2, long j) {
        this.zzeel = zzbda;
        this.zzdvm = str;
        this.zzeeh = str2;
        this.zzeeo = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zzdvm);
        hashMap.put("cachedSrc", this.zzeeh);
        hashMap.put("totalDuration", Long.toString(this.zzeeo));
        this.zzeel.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

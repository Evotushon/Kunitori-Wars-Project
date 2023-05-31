package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdc implements Runnable {
    private final /* synthetic */ String zzdvm;
    private final /* synthetic */ String zzeeh;
    private final /* synthetic */ boolean zzeek;
    private final /* synthetic */ zzbda zzeel;
    private final /* synthetic */ long zzeen;
    private final /* synthetic */ long zzeeo;
    private final /* synthetic */ int zzeep;
    private final /* synthetic */ int zzeeq;

    zzbdc(zzbda zzbda, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.zzeel = zzbda;
        this.zzdvm = str;
        this.zzeeh = str2;
        this.zzeen = j;
        this.zzeeo = j2;
        this.zzeek = z;
        this.zzeep = i;
        this.zzeeq = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zzdvm);
        hashMap.put("cachedSrc", this.zzeeh);
        hashMap.put("bufferedDuration", Long.toString(this.zzeen));
        hashMap.put("totalDuration", Long.toString(this.zzeeo));
        hashMap.put("cacheReady", this.zzeek ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.zzeep));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzeeq));
        this.zzeel.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

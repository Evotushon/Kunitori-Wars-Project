package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbcz implements Runnable {
    private final /* synthetic */ String zzdvm;
    private final /* synthetic */ String zzeeh;
    private final /* synthetic */ int zzeei;
    private final /* synthetic */ int zzeej;
    private final /* synthetic */ boolean zzeek = false;
    private final /* synthetic */ zzbda zzeel;

    zzbcz(zzbda zzbda, String str, String str2, int i, int i2, boolean z) {
        this.zzeel = zzbda;
        this.zzdvm = str;
        this.zzeeh = str2;
        this.zzeei = i;
        this.zzeej = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zzdvm);
        hashMap.put("cachedSrc", this.zzeeh);
        hashMap.put("bytesLoaded", Integer.toString(this.zzeei));
        hashMap.put("totalBytes", Integer.toString(this.zzeej));
        hashMap.put("cacheReady", this.zzeek ? "1" : "0");
        this.zzeel.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

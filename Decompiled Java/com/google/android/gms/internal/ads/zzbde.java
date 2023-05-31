package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbde implements Runnable {
    private final /* synthetic */ String zzdvm;
    private final /* synthetic */ String zzeeh;
    private final /* synthetic */ int zzeej;
    private final /* synthetic */ zzbda zzeel;

    zzbde(zzbda zzbda, String str, String str2, int i) {
        this.zzeel = zzbda;
        this.zzdvm = str;
        this.zzeeh = str2;
        this.zzeej = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zzdvm);
        hashMap.put("cachedSrc", this.zzeeh);
        hashMap.put("totalBytes", Integer.toString(this.zzeej));
        this.zzeel.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

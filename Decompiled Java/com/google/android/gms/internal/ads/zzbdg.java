package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdg implements Runnable {
    private final /* synthetic */ String val$message;
    private final /* synthetic */ String zzdvm;
    private final /* synthetic */ String zzeeh;
    private final /* synthetic */ zzbda zzeel;
    private final /* synthetic */ String zzeer;

    zzbdg(zzbda zzbda, String str, String str2, String str3, String str4) {
        this.zzeel = zzbda;
        this.zzdvm = str;
        this.zzeeh = str2;
        this.zzeer = str3;
        this.val$message = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.zzdvm);
        if (!TextUtils.isEmpty(this.zzeeh)) {
            hashMap.put("cachedSrc", this.zzeeh);
        }
        hashMap.put("type", zzbda.zzfl(this.zzeer));
        hashMap.put("reason", this.zzeer);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzeel.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}

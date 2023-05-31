package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcjf implements zzdng {
    private final zzcjc zzfyf;
    private final zzub zzfyg;

    zzcjf(zzcjc zzcjc, zzub zzub) {
        this.zzfyf = zzcjc;
        this.zzfyg = zzub;
    }

    public final zzdof zzf(Object obj) {
        zzub zzub = this.zzfyg;
        String str = (String) obj;
        String str2 = zzub.zzcci;
        String str3 = zzub.zzccj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", "");
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return zzdnt.zzaj(jSONObject);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcku implements zzakh<zzckv> {
    zzcku() {
    }

    public final /* synthetic */ JSONObject zzj(Object obj) throws JSONException {
        zzckv zzckv = (zzckv) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzckv.zzfzh.zzug());
        jSONObject2.put("signals", zzckv.zzfzi);
        jSONObject3.put("body", zzckv.zzfzk.zzdln);
        jSONObject3.put("headers", zzq.zzkv().zzi((Map<String, ?>) zzckv.zzfzk.zzab));
        jSONObject3.put("response_code", zzckv.zzfzk.zzfzr);
        jSONObject3.put("latency", zzckv.zzfzk.zzfzs);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzckv.zzfzh.zzuj());
        return jSONObject;
    }
}

package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcoi implements zzdng {
    static final zzdng zzblf = new zzcoi();

    private zzcoi() {
    }

    public final zzdof zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            return zzdnt.zzaj(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzakd("process json failed");
    }
}

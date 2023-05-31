package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzckk implements zzdhq {
    static final zzdhq zzfxq = new zzckk();

    private zzckk() {
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zzawf.zzee("Ad request signals:");
        zzawf.zzee(jSONObject.toString(2));
        return jSONObject;
    }
}

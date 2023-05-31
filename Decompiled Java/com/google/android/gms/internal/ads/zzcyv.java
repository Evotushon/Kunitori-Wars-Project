package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyv implements zzcyb<JSONObject> {
    private final String zzgld;

    public zzcyv(String str) {
        this.zzgld = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zzgld);
        } catch (JSONException e) {
            zzawf.zza("Failed putting Ad ID.", e);
        }
    }
}

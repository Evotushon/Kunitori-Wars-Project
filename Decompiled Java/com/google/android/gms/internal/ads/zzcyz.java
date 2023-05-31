package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyz implements zzcyb<JSONObject> {
    private final JSONObject zzglf;

    public zzcyz(JSONObject jSONObject) {
        this.zzglf = jSONObject;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzayf.zzb((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.zzglf;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzb.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            zzawf.zzee("Failed putting app indexing json.");
        }
    }
}

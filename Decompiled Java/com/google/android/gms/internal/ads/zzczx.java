package com.google.android.gms.internal.ads;

import android.location.Location;
import com.adjust.sdk.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczx implements zzcyb<JSONObject> {
    private final Location zzmk;

    public zzczx(Location location) {
        this.zzmk = location;
    }

    public final /* synthetic */ void zzs(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (this.zzmk != null) {
                JSONObject jSONObject2 = new JSONObject();
                Float valueOf = Float.valueOf(this.zzmk.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.zzmk.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.zzmk.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.zzmk.getLongitude() * 1.0E7d));
                jSONObject2.put("radius", valueOf);
                jSONObject2.put("lat", valueOf3);
                jSONObject2.put(Constants.LONG, valueOf4);
                jSONObject2.put("time", valueOf2);
                jSONObject.put("uule", jSONObject2);
            }
        } catch (JSONException e) {
            zzawf.zza("Failed adding location to the request JSON.", e);
        }
    }
}

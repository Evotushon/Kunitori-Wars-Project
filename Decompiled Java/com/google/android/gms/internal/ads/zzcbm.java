package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcbm {
    private final Executor executor;
    private final zzcbc zzfrw;

    public zzcbm(Executor executor2, zzcbc zzcbc) {
        this.executor = executor2;
        this.zzfrw = zzcbc;
    }

    public final zzdof<List<zzcbr>> zzg(JSONObject jSONObject, String str) {
        zzdof<O> zzdof;
        String optString;
        char c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzdnt.zzaj(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME)) == null)) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c = 1;
                } else {
                    c = "image".equals(optString2) ? (char) 2 : 0;
                }
                if (c == 1) {
                    zzdof = zzdnt.zzaj(new zzcbr(optString, optJSONObject.optString("string_value")));
                } else if (c == 2) {
                    zzdof = zzdnt.zzb(this.zzfrw.zzc(optJSONObject, "image_value"), new zzcbo(optString), this.executor);
                }
                arrayList.add(zzdof);
            }
            zzdof = zzdnt.zzaj(null);
            arrayList.add(zzdof);
        }
        return zzdnt.zzb(zzdnt.zzg(arrayList), zzcbp.zzdpv, this.executor);
    }
}

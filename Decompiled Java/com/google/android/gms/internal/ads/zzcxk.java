package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcxk implements Callable {
    private final List zzgjw;

    zzcxk(List list) {
        this.zzgjw = list;
    }

    public final Object call() {
        List<zzdof> list = this.zzgjw;
        JSONArray jSONArray = new JSONArray();
        for (zzdof zzdof : list) {
            if (((JSONObject) zzdof.get()) != null) {
                jSONArray.put(zzdof.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzcxd(jSONArray.toString());
    }
}

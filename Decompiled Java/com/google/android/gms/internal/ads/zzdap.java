package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdap implements zzcyb<JSONObject> {
    private final Map<String, Object> zzgmd;

    public zzdap(Map<String, Object> map) {
        this.zzgmd = map;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzq.zzkv().zzi((Map<String, ?>) this.zzgmd));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawf.zzee(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}

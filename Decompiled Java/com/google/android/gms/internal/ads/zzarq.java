package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzarq implements zzarb {
    private zzakc<JSONObject, JSONObject> zzdop;
    private zzakc<JSONObject, JSONObject> zzdou;

    public zzarq(Context context) {
        this.zzdou = zzq.zzli().zza(context, zzazo.zzxr()).zza("google.afma.request.getAdDictionary", zzakj.zzdbu, zzakj.zzdbu);
        this.zzdop = zzq.zzli().zza(context, zzazo.zzxr()).zza("google.afma.sdkConstants.getSdkConstants", zzakj.zzdbu, zzakj.zzdbu);
    }

    public final zzakc<JSONObject, JSONObject> zzue() {
        return this.zzdop;
    }
}

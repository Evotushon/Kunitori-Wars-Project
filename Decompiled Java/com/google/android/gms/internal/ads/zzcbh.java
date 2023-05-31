package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbh implements zzdku {
    private final JSONObject zzfej;
    private final zzcbc zzfso;

    zzcbh(zzcbc zzcbc, JSONObject jSONObject) {
        this.zzfso = zzcbc;
        this.zzfej = jSONObject;
    }

    public final Object apply(Object obj) {
        return this.zzfso.zza(this.zzfej, (List) obj);
    }
}

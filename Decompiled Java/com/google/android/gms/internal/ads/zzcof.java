package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcof implements zzcmc<zzdfb, zzcni> {
    private final zzcnk zzfws;

    public zzcof(zzcnk zzcnk) {
        this.zzfws = zzcnk;
    }

    public final zzcmd<zzdfb, zzcni> zzd(String str, JSONObject jSONObject) throws zzdfa {
        zzdfb zze = this.zzfws.zze(str, jSONObject);
        if (zze == null) {
            return null;
        }
        return new zzcmd<>(zze, new zzcni(), str);
    }
}

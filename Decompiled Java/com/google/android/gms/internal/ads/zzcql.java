package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcql implements zzcmc<zzanq, zzcni> {
    private final zzcro zzgec;

    public zzcql(zzcro zzcro) {
        this.zzgec = zzcro;
    }

    public final zzcmd<zzanq, zzcni> zzd(String str, JSONObject jSONObject) throws zzdfa {
        zzanq zzgk = this.zzgec.zzgk(str);
        if (zzgk == null) {
            return null;
        }
        return new zzcmd<>(zzgk, new zzcni(), str);
    }
}

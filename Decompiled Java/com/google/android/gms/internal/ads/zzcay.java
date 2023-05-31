package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcay {
    private final zzdoe zzfrv;
    private final zzcbc zzfrw;
    private final zzcbm zzfrx;

    public zzcay(zzdoe zzdoe, zzcbc zzcbc, zzcbm zzcbm) {
        this.zzfrv = zzdoe;
        this.zzfrw = zzcbc;
        this.zzfrx = zzcbm;
    }

    public final zzdof<zzbyz> zza(zzdeq zzdeq, zzdei zzdei, JSONObject jSONObject) {
        zzdof zzb;
        JSONObject jSONObject2 = jSONObject;
        zzdeq zzdeq2 = zzdeq;
        zzdof zzd = this.zzfrv.zzd(new zzcbb(this, zzdeq, zzdei, jSONObject2));
        zzdof<List<zzacd>> zzd2 = this.zzfrw.zzd(jSONObject2, "images");
        zzdof<zzacd> zzc = this.zzfrw.zzc(jSONObject2, "secondary_image");
        zzdof<zzacd> zzc2 = this.zzfrw.zzc(jSONObject2, "app_icon");
        zzdof<zzaby> zze = this.zzfrw.zze(jSONObject2, "attribution");
        zzdof<zzbdv> zzm = this.zzfrw.zzm(jSONObject2);
        zzcbc zzcbc = this.zzfrw;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzb = zzdnt.zzaj(null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzb = zzdnt.zzaj(null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzb = zzdnt.zzaj(null);
                } else {
                    zzb = zzdnt.zzb(zzdnt.zzaj(null), new zzcbg(zzcbc, optString), (Executor) zzazq.zzdxo);
                }
            }
        }
        zzdof zzdof = zzb;
        zzdof<List<zzcbr>> zzg = this.zzfrx.zzg(jSONObject2, "custom_assets");
        return zzdnt.zza((zzdof<? extends V>[]) new zzdof[]{zzd, zzd2, zzc, zzc2, zze, zzm, zzdof, zzg}).zza(new zzcba(this, zzd, zzd2, zzc2, zzc, zze, jSONObject, zzm, zzdof, zzg), this.zzfrv);
    }
}

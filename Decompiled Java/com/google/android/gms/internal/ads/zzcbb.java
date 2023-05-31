package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcbb implements Callable {
    private final zzdei zzfgp;
    private final zzcay zzfry;
    private final zzdeq zzfsg;
    private final JSONObject zzfsh;

    zzcbb(zzcay zzcay, zzdeq zzdeq, zzdei zzdei, JSONObject jSONObject) {
        this.zzfry = zzcay;
        this.zzfsg = zzdeq;
        this.zzfgp = zzdei;
        this.zzfsh = jSONObject;
    }

    public final Object call() {
        zzcay zzcay = this.zzfry;
        zzdeq zzdeq = this.zzfsg;
        zzdei zzdei = this.zzfgp;
        JSONObject jSONObject = this.zzfsh;
        zzbyz zzbyz = new zzbyz();
        zzbyz.zzdj(jSONObject.optInt("template_id", -1));
        zzbyz.zzfx(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzbyz.zzfy(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzdeu zzdeu = zzdeq.zzgql.zzfir;
        if (zzdeu.zzgqs.contains(Integer.toString(zzbyz.zzake()))) {
            if (zzbyz.zzake() == 3) {
                if (zzbyz.getCustomTemplateId() == null) {
                    throw new zzcpe("No custom template id for custom template ad response.", 0);
                } else if (!zzdeu.zzgqt.contains(zzbyz.getCustomTemplateId())) {
                    throw new zzcpe("Unexpected custom template id in the response.", 0);
                }
            }
            zzbyz.setStarRating(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzdei.zzdnk) {
                zzq.zzkv();
                String zzws = zzawo.zzws();
                StringBuilder sb = new StringBuilder(String.valueOf(zzws).length() + 3 + String.valueOf(optString).length());
                sb.append(zzws);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            zzbyz.zzn("headline", optString);
            zzbyz.zzn("body", jSONObject.optString("body", (String) null));
            zzbyz.zzn("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzbyz.zzn("store", jSONObject.optString("store", (String) null));
            zzbyz.zzn(FirebaseAnalytics.Param.PRICE, jSONObject.optString(FirebaseAnalytics.Param.PRICE, (String) null));
            zzbyz.zzn("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzbyz;
        }
        int zzake = zzbyz.zzake();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(zzake);
        throw new zzcpe(sb2.toString(), 0);
    }
}

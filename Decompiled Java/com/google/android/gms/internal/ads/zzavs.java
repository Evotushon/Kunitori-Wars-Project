package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzavs {
    private String zzdkq;
    private final long zzdrv;
    private final List<String> zzdrw = new ArrayList();
    private final List<String> zzdrx = new ArrayList();
    private final Map<String, zzalj> zzdry = new HashMap();
    private String zzdrz;
    private JSONObject zzdsa;
    private boolean zzdsb;

    public zzavs(String str, long j) {
        JSONObject optJSONObject;
        this.zzdsb = false;
        this.zzdkq = str;
        this.zzdrv = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.zzdsa = new JSONObject(str);
                if (this.zzdsa.optInt(NotificationCompat.CATEGORY_STATUS, -1) != 1) {
                    this.zzdsb = false;
                    zzawf.zzfa("App settings could not be fetched successfully.");
                    return;
                }
                this.zzdsb = true;
                this.zzdrz = this.zzdsa.optString("app_id");
                JSONArray optJSONArray = this.zzdsa.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("format");
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.zzdrx.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject.optJSONObject("mediation_config")) != null) {
                                    this.zzdry.put(optString2, new zzalj(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.zzdsa.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.zzdrw.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                zzawf.zzd("Exception occurred while processing app setting json", e);
                zzq.zzkz().zza(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long zzvo() {
        return this.zzdrv;
    }

    public final boolean zzvp() {
        return this.zzdsb;
    }

    public final String zzvq() {
        return this.zzdkq;
    }

    public final String zzvr() {
        return this.zzdrz;
    }

    public final Map<String, zzalj> zzvs() {
        return this.zzdry;
    }

    public final JSONObject zzvt() {
        return this.zzdsa;
    }
}

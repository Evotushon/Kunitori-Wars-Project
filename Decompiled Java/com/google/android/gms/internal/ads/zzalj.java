package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzalj {
    private final long zzddn;
    public final List<zzalg> zzddo;
    private final List<String> zzddp;
    private final List<String> zzddq;
    private final List<String> zzddr;
    private final List<String> zzdds;
    private final List<String> zzddt;
    private final boolean zzddu;
    private final String zzddv;
    private final long zzddw;
    private final String zzddx;
    private final int zzddy;
    private final int zzddz;
    private final long zzdea;
    private final boolean zzdeb;
    private final boolean zzdec;
    private final boolean zzded;
    private final boolean zzdee;
    private int zzdef;
    private int zzdeg;
    private boolean zzdeh;

    public zzalj(JSONObject jSONObject) throws JSONException {
        if (zzawf.isLoggable(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzawf.zzee(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzalg zzalg = new zzalg(jSONArray.getJSONObject(i2));
                boolean z = true;
                if ("banner".equalsIgnoreCase(zzalg.zzddm)) {
                    this.zzdeh = true;
                }
                arrayList.add(zzalg);
                if (i < 0) {
                    Iterator<String> it = zzalg.zzdct.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.zzdef = i;
        this.zzdeg = jSONArray.length();
        this.zzddo = Collections.unmodifiableList(arrayList);
        this.zzddv = jSONObject.optString("qdata");
        this.zzddz = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.zzdea = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.zzddn = optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzq.zzln();
            this.zzddp = zzali.zza(optJSONObject, "click_urls");
            zzq.zzln();
            this.zzddq = zzali.zza(optJSONObject, "imp_urls");
            zzq.zzln();
            this.zzddr = zzali.zza(optJSONObject, "downloaded_imp_urls");
            zzq.zzln();
            this.zzdds = zzali.zza(optJSONObject, "nofill_urls");
            zzq.zzln();
            this.zzddt = zzali.zza(optJSONObject, "remote_ping_urls");
            this.zzddu = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            this.zzddw = optLong > 0 ? 1000 * optLong : j;
            zzasq zza = zzasq.zza(optJSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzddx = null;
                this.zzddy = 0;
            } else {
                this.zzddx = zza.type;
                this.zzddy = zza.zzdot;
            }
            this.zzdeb = optJSONObject.optBoolean("use_displayed_impression", false);
            this.zzdec = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.zzded = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.zzdee = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzddn = -1;
        this.zzddp = null;
        this.zzddq = null;
        this.zzddr = null;
        this.zzdds = null;
        this.zzddt = null;
        this.zzddw = -1;
        this.zzddx = null;
        this.zzddy = 0;
        this.zzdeb = false;
        this.zzddu = false;
        this.zzdec = false;
        this.zzded = false;
        this.zzdee = false;
    }
}

package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzc extends zzbzd {
    private final boolean zzdec;
    private final boolean zzded;
    private final boolean zzdmn;
    private final JSONObject zzfpp;
    private final boolean zzfpq;

    public zzbzc(zzdei zzdei, JSONObject jSONObject) {
        super(zzdei);
        this.zzfpp = zzayf.zza(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.zzded = zzayf.zza(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzdec = zzayf.zza(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zzdmn = zzayf.zza(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.zzfpq = z;
    }

    public final JSONObject zzakp() {
        JSONObject jSONObject = this.zzfpp;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zzfpr.zzdlx);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean zzakq() {
        return this.zzfpq;
    }

    public final boolean zzakr() {
        return this.zzded;
    }

    public final boolean zzaka() {
        return this.zzdmn;
    }

    public final boolean zzaks() {
        return this.zzdec;
    }
}

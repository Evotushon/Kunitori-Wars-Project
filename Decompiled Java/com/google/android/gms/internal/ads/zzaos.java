package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaos {
    private final boolean zzdhc;
    private final boolean zzdhd;
    private final boolean zzdhe;
    private final boolean zzdhf;
    private final boolean zzdhg;

    private zzaos(zzaou zzaou) {
        this.zzdhc = zzaou.zzdhc;
        this.zzdhd = zzaou.zzdhd;
        this.zzdhe = zzaou.zzdhe;
        this.zzdhf = zzaou.zzdhf;
        this.zzdhg = zzaou.zzdhg;
    }

    public final JSONObject zztm() {
        try {
            return new JSONObject().put("sms", this.zzdhc).put("tel", this.zzdhd).put("calendar", this.zzdhe).put("storePicture", this.zzdhf).put("inlineVideo", this.zzdhg);
        } catch (JSONException e) {
            zzawf.zzc("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}

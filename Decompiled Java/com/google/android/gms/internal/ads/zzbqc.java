package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqc extends zzxh {
    private final String zzfke;
    private final String zzfkf;

    public zzbqc(zzdei zzdei, String str) {
        String str2;
        if (zzdei == null) {
            str2 = null;
        } else {
            str2 = zzdei.zzfkf;
        }
        this.zzfkf = str2;
        String zzb = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? zzb(zzdei) : null;
        this.zzfke = zzb == null ? str : zzb;
    }

    public final String getMediationAdapterClassName() {
        return this.zzfke;
    }

    public final String getResponseId() {
        return this.zzfkf;
    }

    private static String zzb(zzdei zzdei) {
        try {
            return zzdei.zzgpt.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}

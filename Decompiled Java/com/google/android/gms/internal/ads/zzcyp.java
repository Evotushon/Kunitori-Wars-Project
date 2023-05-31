package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyp implements zzcyb<JSONObject> {
    private final AdvertisingIdClient.Info zzgkz;
    private final String zzgla;

    public zzcyp(AdvertisingIdClient.Info info, String str) {
        this.zzgkz = info;
        this.zzgla = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        try {
            JSONObject zzb = zzayf.zzb((JSONObject) obj, "pii");
            if (this.zzgkz == null || TextUtils.isEmpty(this.zzgkz.getId())) {
                zzb.put("pdid", this.zzgla);
                zzb.put("pdidtype", "ssaid");
                return;
            }
            zzb.put("rdid", this.zzgkz.getId());
            zzb.put("is_lat", this.zzgkz.isLimitAdTrackingEnabled());
            zzb.put("idtype", "adid");
        } catch (JSONException e) {
            zzawf.zza("Failed putting Ad ID.", e);
        }
    }
}

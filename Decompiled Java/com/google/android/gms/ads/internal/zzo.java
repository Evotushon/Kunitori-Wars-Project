package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzcxv;
import com.google.android.gms.internal.ads.zzuh;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzo {
    private final String zzbmc;
    private final Map<String, String> zzbmd = new TreeMap();
    private String zzbme;
    private String zzbmf;
    private final Context zzur;

    public zzo(Context context, String str) {
        this.zzur = context.getApplicationContext();
        this.zzbmc = str;
    }

    public final String zzkl() {
        return this.zzbmf;
    }

    public final String getQuery() {
        return this.zzbme;
    }

    public final String zzkm() {
        return this.zzbmc;
    }

    public final Map<String, String> zzkn() {
        return this.zzbmd;
    }

    public final void zza(zzuh zzuh, zzazo zzazo) {
        this.zzbme = zzuh.zzccr.zzbme;
        Bundle bundle = zzuh.zzcct != null ? zzuh.zzcct.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = zzabb.zzctr.get();
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.zzbmf = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.zzbmd.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.zzbmd.put("SDKVersion", zzazo.zzbmj);
            if (zzabb.zzctp.get().booleanValue()) {
                try {
                    Bundle zza = zzcxv.zza(this.zzur, new JSONArray(zzabb.zzctq.get()));
                    for (String str3 : zza.keySet()) {
                        this.zzbmd.put(str3, zza.get(str3).toString());
                    }
                } catch (JSONException e) {
                    zzawf.zzc("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
    }
}

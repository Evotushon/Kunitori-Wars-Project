package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final /* synthetic */ class zzail {
    public static void zza(zzaii zzaii, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzaii.zzj(str, jSONObject.toString());
    }

    public static void zza(zzaii zzaii, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaii.zzcz(sb.toString());
    }

    public static void zzb(zzaii zzaii, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzawf.zzeb(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzaii.zzcz(sb.toString());
    }

    public static void zza(zzaii zzaii, String str, Map map) {
        try {
            zzaii.zza(str, zzq.zzkv().zzi((Map<String, ?>) map));
        } catch (JSONException unused) {
            zzawf.zzfa("Could not convert parameters to JSON.");
        }
    }
}

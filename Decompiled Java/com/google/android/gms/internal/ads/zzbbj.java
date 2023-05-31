package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbj {
    public final boolean zzeak;
    public final int zzeal;
    public final int zzeam;
    public final int zzean;
    private final String zzeao;
    public final int zzeap;
    public final int zzeaq;
    public final int zzear;
    public final int zzeas;
    public final boolean zzeat;
    public final int zzeau;

    public zzbbj(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zzeak = zza(jSONObject, "aggressive_media_codec_release", zzzx.zzcia);
        this.zzeal = zzb(jSONObject, "byte_buffer_precache_limit", zzzx.zzchj);
        this.zzeam = zzb(jSONObject, "exo_cache_buffer_size", zzzx.zzchp);
        this.zzean = zzb(jSONObject, "exo_connect_timeout_millis", zzzx.zzchf);
        this.zzeao = zzc(jSONObject, "exo_player_version", zzzx.zzche);
        this.zzeap = zzb(jSONObject, "exo_read_timeout_millis", zzzx.zzchg);
        this.zzeaq = zzb(jSONObject, "load_check_interval_bytes", zzzx.zzchh);
        this.zzear = zzb(jSONObject, "player_precache_limit", zzzx.zzchi);
        this.zzeas = zzb(jSONObject, "socket_receive_buffer_size", zzzx.zzchk);
        this.zzeat = zza(jSONObject, "use_cache_data_source", zzzx.zzcnz);
        this.zzeau = zzb(jSONObject, "min_retry_count", zzzx.zzchm);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzzi, com.google.android.gms.internal.ads.zzzi<java.lang.Boolean>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zza(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.zzzt r0 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r3 = r0.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = zza((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbj.zza(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzzi):boolean");
    }

    private static boolean zza(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzzi<java.lang.Integer>, com.google.android.gms.internal.ads.zzzi] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzzi<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzzt r0 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r0 = r0.zzd(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbj.zzb(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzzi):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzzi, com.google.android.gms.internal.ads.zzzi<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzc(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzzi<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzzt r0 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r0 = r0.zzd(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbj.zzc(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzzi):java.lang.String");
    }
}

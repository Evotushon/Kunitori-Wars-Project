package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbdf implements zzafz<zzbbm> {
    private static Integer zzb(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            zzawf.zzfa(sb.toString());
            return null;
        }
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbda zzbda;
        zzbbm zzbbm = (zzbbm) obj;
        if (zzawf.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzawf.zzeb(sb.toString());
        }
        zzq.zzlr();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        String valueOf2 = String.valueOf(str2);
                        zzawf.zzfa(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (zzbcx.zzd(zzbbm) != null) {
                    zzawf.zzfa("Precache task is already running.");
                    return;
                } else if (zzbbm.zzyt() == null) {
                    zzawf.zzfa("Precache requires a dependency provider.");
                    return;
                } else {
                    zzbbj zzbbj = new zzbbj((String) map.get("flags"));
                    Integer zzb = zzb(map, "player");
                    if (zzb == null) {
                        zzb = 0;
                    }
                    zzbda = zzbbm.zzyt().zzbkw.zza(zzbbm, zzb.intValue(), (String) null, zzbbj);
                    new zzbcv(zzbbm, zzbda, str, strArr).zzvw();
                }
            } else {
                zzbcv zzd = zzbcx.zzd(zzbbm);
                if (zzd != null) {
                    zzbda = zzd.zzeee;
                } else {
                    zzawf.zzfa("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb2 = zzb(map, "minBufferMs");
            if (zzb2 != null) {
                zzbda.zzcv(zzb2.intValue());
            }
            Integer zzb3 = zzb(map, "maxBufferMs");
            if (zzb3 != null) {
                zzbda.zzcw(zzb3.intValue());
            }
            Integer zzb4 = zzb(map, "bufferForPlaybackMs");
            if (zzb4 != null) {
                zzbda.zzcx(zzb4.intValue());
            }
            Integer zzb5 = zzb(map, "bufferForPlaybackAfterRebufferMs");
            if (zzb5 != null) {
                zzbda.zzcy(zzb5.intValue());
            }
        } else if (!zzbcx.zzc(zzbbm)) {
            zzawf.zzfa("Precache abort but no precache task running.");
        }
    }
}

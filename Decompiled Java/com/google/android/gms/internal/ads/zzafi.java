package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzafi {
    public static final zzafz<zzbdv> zzcxw = zzafl.zzcyo;
    public static final zzafz<zzbdv> zzcxx = zzafk.zzcyo;
    public static final zzafz<zzbdv> zzcxy = zzafn.zzcyo;
    public static final zzafz<zzbdv> zzcxz = new zzafo();
    public static final zzafz<zzbdv> zzcya = new zzafr();
    public static final zzafz<zzbdv> zzcyb = zzafm.zzcyo;
    public static final zzafz<Object> zzcyc = new zzafq();
    public static final zzafz<zzbdv> zzcyd = new zzaft();
    public static final zzafz<zzbdv> zzcye = zzafp.zzcyo;
    public static final zzafz<zzbdv> zzcyf = new zzafs();
    public static final zzafz<zzbdv> zzcyg = new zzafv();
    public static final zzafz<zzbbm> zzcyh = new zzbct();
    public static final zzafz<zzbbm> zzcyi = new zzbcw();
    public static final zzafz<zzbdv> zzcyj = new zzafj();
    public static final zzagf zzcyk = new zzagf();
    public static final zzafz<zzbdv> zzcyl = new zzafu();
    public static final zzafz<zzbdv> zzcym = new zzafx();
    public static final zzafz<zzbdv> zzcyn = new zzafw();

    static final /* synthetic */ void zza(zzbfd zzbfd, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzdq zzaai = zzbfd.zzaai();
            if (zzaai != null) {
                zzaai.zzcb().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzawf.zzfa("Could not parse touch parameters from gmsg.");
        }
    }

    static final /* synthetic */ void zza(zzbev zzbev, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzawf.zzfa("URL missing from httpTrack GMSG.");
        } else {
            new zzayo(zzbev.getContext(), ((zzbfg) zzbev).zzyw().zzbmj, str).zzvw();
        }
    }

    static final /* synthetic */ void zza(zzaia zzaia, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzawf.zzfa("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzdq zzaai = ((zzbfd) zzaia).zzaai();
            if (zzaai != null && zzaai.zzb(parse)) {
                parse = zzaai.zza(parse, ((zzbev) zzaia).getContext(), ((zzbff) zzaia).getView(), ((zzbev) zzaia).zzys());
            }
        } catch (zzdt unused) {
            String valueOf = String.valueOf(str);
            zzawf.zzfa(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzbev zzbev = (zzbev) zzaia;
        new zzayo(zzbev.getContext(), ((zzbfg) zzaia).zzyw().zzbmj, zzaux.zzb(parse, zzbev.getContext())).zzvw();
    }

    static final /* synthetic */ void zzb(zzbev zzbev, Map map) {
        PackageManager packageManager = zzbev.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                zzawf.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            zzawf.zzc("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        zzawf.zzc("Error parsing the intent data.", e3);
                    }
                }
                ((zzaia) zzbev).zza("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzaia) zzbev).zza("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzaia) zzbev).zza("openableIntents", new JSONObject());
        }
    }

    static final /* synthetic */ void zzc(zzbev zzbev, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzawf.zzfa("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbev.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzaia) zzbev).zza("openableURLs", (Map<String, ?>) hashMap);
    }
}

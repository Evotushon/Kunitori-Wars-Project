package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzceu {
    private final Executor executor;
    private final Map<String, Map<String, JSONObject>> zzfus = new ConcurrentHashMap();
    private JSONObject zzfut;
    private boolean zzvk;

    public zzceu(Executor executor2) {
        this.executor = executor2;
    }

    public final void zzamh() {
        zzq.zzkz().zzvk().zzb(new zzcex(this));
        this.executor.execute(new zzcew(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: zzami */
    public final synchronized void zzaml() {
        Map map;
        this.zzvk = true;
        zzavs zzwf = zzq.zzkz().zzvk().zzwf();
        if (zzwf != null) {
            JSONObject zzvt = zzwf.zzvt();
            if (zzvt != null) {
                this.zzfut = zzvt.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzvt.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.zzfus.containsKey(optString2)) {
                                    map = this.zzfus.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zzfus.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzamk() {
        this.executor.execute(new zzcez(this));
    }
}

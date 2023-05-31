package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagf implements zzafz<Object> {
    private final Object lock = new Object();
    @GuardedBy("lock")
    private final Map<String, zzagh> zzcyw = new HashMap();

    public final void zza(String str, zzagh zzagh) {
        synchronized (this.lock) {
            this.zzcyw.put(str, zzagh);
        }
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get("id");
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.lock) {
            zzagh remove = this.zzcyw.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                zzawf.zzfa(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.onFailure(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.zzc((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zzawf.zzvx()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzawf.zzee(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.zzc(jSONObject);
                } catch (JSONException e) {
                    remove.onFailure(e.getMessage());
                }
            }
        }
    }

    public final <EngineT extends zzajb> zzdof<JSONObject> zza(EngineT enginet, String str, JSONObject jSONObject) {
        zzazy zzazy = new zzazy();
        zzq.zzkv();
        String zzwp = zzawo.zzwp();
        zza(zzwp, (zzagh) new zzage(this, zzazy));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", zzwp);
            jSONObject2.put("args", jSONObject);
            enginet.zzb(str, jSONObject2);
        } catch (Exception e) {
            zzazy.setException(e);
        }
        return zzazy;
    }
}

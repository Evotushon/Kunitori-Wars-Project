package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzarj extends zzarl {
    private final Object lock = new Object();
    @Nullable
    private SharedPreferences zzdoo;
    private final zzakc<JSONObject, JSONObject> zzdop;
    private final Context zzyz;

    public zzarj(Context context, zzakc<JSONObject, JSONObject> zzakc) {
        this.zzyz = context.getApplicationContext();
        this.zzdop = zzakc;
    }

    public final zzdof<Void> zzum() {
        synchronized (this.lock) {
            if (this.zzdoo == null) {
                this.zzdoo = this.zzyz.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzq.zzlc().currentTimeMillis() - this.zzdoo.getLong("js_last_update", 0) < zzabj.zzcuy.get().longValue()) {
            return zzdnt.zzaj(null);
        }
        return zzdnt.zzb(this.zzdop.zzi(zzaa(this.zzyz)), new zzarm(this), (Executor) zzazq.zzdxp);
    }

    public static JSONObject zzaa(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzazo.zzxr().zzbmj);
            jSONObject.put("mf", zzabj.zzcux.get());
            jSONObject.put("cl", "300152424");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zzf(JSONObject jSONObject) {
        zzzx.zza(this.zzyz, 1, jSONObject);
        this.zzdoo.edit().putLong("js_last_update", zzq.zzlc().currentTimeMillis()).apply();
        return null;
    }
}

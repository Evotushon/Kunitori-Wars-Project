package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzakc;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzavs;
import com.google.android.gms.internal.ads.zzawf;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzazu;
import com.google.android.gms.internal.ads.zzdnt;
import com.google.android.gms.internal.ads.zzdof;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzzx;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzd {
    private long zzble = 0;
    private Context zzur;

    public final void zza(Context context, zzazo zzazo, String str, @Nullable Runnable runnable) {
        zza(context, zzazo, true, (zzavs) null, str, (String) null, runnable);
    }

    public final void zza(Context context, zzazo zzazo, String str, zzavs zzavs) {
        zza(context, zzazo, false, zzavs, zzavs != null ? zzavs.zzvr() : null, str, (Runnable) null);
    }

    @VisibleForTesting
    private final void zza(Context context, zzazo zzazo, boolean z, @Nullable zzavs zzavs, String str, @Nullable String str2, @Nullable Runnable runnable) {
        if (zzq.zzlc().elapsedRealtime() - this.zzble < 5000) {
            zzawf.zzfa("Not retrying to fetch app settings");
            return;
        }
        this.zzble = zzq.zzlc().elapsedRealtime();
        boolean z2 = true;
        if (zzavs != null) {
            if (!(zzq.zzlc().currentTimeMillis() - zzavs.zzvo() > ((Long) zzvh.zzpd().zzd(zzzx.zzcnq)).longValue()) && zzavs.zzvp()) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                zzawf.zzfa("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.zzur = applicationContext;
                zzakc<I, O> zza = zzq.zzli().zzb(this.zzur, zzazo).zza("google.afma.config.fetchAppSettings", zzakj.zzdbu, zzakj.zzdbu);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    zzdof<O> zzi = zza.zzi(jSONObject);
                    zzdof<O> zzb = zzdnt.zzb(zzi, zzf.zzblf, (Executor) zzazq.zzdxp);
                    if (runnable != null) {
                        zzi.addListener(runnable, zzazq.zzdxp);
                    }
                    zzazu.zza(zzb, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    zzawf.zzc("Error requesting application settings", e);
                }
            } else {
                zzawf.zzfa("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}

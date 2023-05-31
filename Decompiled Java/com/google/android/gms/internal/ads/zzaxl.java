package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxl {
    private final Object lock = new Object();
    @GuardedBy("lock")
    private String zzdup = "";
    @GuardedBy("lock")
    private String zzduq = "";
    @GuardedBy("lock")
    private boolean zzdur = false;
    @VisibleForTesting
    private String zzdus = "";

    public final void zze(Context context, String str, String str2) {
        if (!zzf(context, str, str2)) {
            zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.zzdus)) {
            zzawf.zzeb("Creative is not pushed for this device.");
            zza(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.zzdus)) {
            zzawf.zzeb("The app is not linked for creative preview.");
            zzi(context, str, str2);
        } else if ("0".equals(this.zzdus)) {
            zzawf.zzeb("Device is linked for in app preview.");
            zza(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zza(Context context, String str, String str2, @Nullable String str3) {
        boolean zzxd = zzxd();
        if (zzg(context, str, str2)) {
            if (!zzxd && !TextUtils.isEmpty(str3)) {
                zzc(context, str2, str3, str);
            }
            zzawf.zzeb("Device is linked for debug signals.");
            zza(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzi(context, str, str2);
    }

    @VisibleForTesting
    private final boolean zzf(Context context, String str, String str2) {
        String zzh = zzh(context, zzd(context, (String) zzvh.zzpd().zzd(zzzx.zzcok), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzh)) {
            zzawf.zzeb("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzh.trim());
            String optString = jSONObject.optString("gct");
            this.zzdus = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            synchronized (this.lock) {
                this.zzduq = optString;
            }
            return true;
        } catch (JSONException e) {
            zzawf.zzd("Fail to get in app preview response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    private final boolean zzg(Context context, String str, String str2) {
        String zzh = zzh(context, zzd(context, (String) zzvh.zzpd().zzd(zzzx.zzcol), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzh)) {
            zzawf.zzeb("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzh.trim()).optString("debug_mode"));
            synchronized (this.lock) {
                this.zzdur = equals;
            }
            return equals;
        } catch (JSONException e) {
            zzawf.zzd("Fail to get debug mode response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    private static String zzh(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzq.zzkv().zzr(context, str2));
        zzdof<String> zzc = new zzaxx(context).zzc(str, hashMap);
        try {
            return (String) zzc.get((long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcon)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            zzawf.zzc(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), e);
            zzc.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            zzawf.zzc(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), e2);
            zzc.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            zzawf.zzc(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    private final void zzi(Context context, String str, String str2) {
        zzq.zzkv();
        zzawo.zza(context, zzd(context, (String) zzvh.zzpd().zzd(zzzx.zzcoj), str, str2));
    }

    public final boolean zzb(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzq.zzlf().zzxd()) {
            return false;
        }
        zzawf.zzeb("Sending troubleshooting signals to the server.");
        zzc(context, str, str2, str3);
        return true;
    }

    private final void zzc(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzd(context, (String) zzvh.zzpd().zzd(zzzx.zzcom), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzq.zzkv();
        zzawo.zzb(context, str, buildUpon.build().toString());
    }

    private final Uri zzd(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", zzbi(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private final String zzbi(Context context) {
        String str;
        synchronized (this.lock) {
            if (TextUtils.isEmpty(this.zzdup)) {
                zzq.zzkv();
                this.zzdup = zzawo.zzs(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.zzdup)) {
                    zzq.zzkv();
                    this.zzdup = zzawo.zzwp();
                    zzq.zzkv();
                    zzawo.zzc(context, "debug_signals_id.txt", this.zzdup);
                }
            }
            str = this.zzdup;
        }
        return str;
    }

    public final String zzxc() {
        String str;
        synchronized (this.lock) {
            str = this.zzduq;
        }
        return str;
    }

    public final boolean zzxd() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdur;
        }
        return z;
    }

    @VisibleForTesting
    private final void zza(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zzawf.zzez("Can not create dialog without Activity Context");
        } else {
            zzawo.zzdtx.post(new zzaxo(this, context, str, z, z2));
        }
    }
}

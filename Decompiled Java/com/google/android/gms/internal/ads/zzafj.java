package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzafj implements zzafz<zzbdv> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get(Constants.ScionAnalytics.PARAM_LABEL);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzawf.zzfa("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzawf.zzfa("No timestamp given for CSI tick.");
            } else {
                try {
                    long elapsedRealtime = zzq.zzlc().elapsedRealtime() + (Long.parseLong(str4) - zzq.zzlc().currentTimeMillis());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzbdv.zzyv().zza(str2, str3, elapsedRealtime);
                } catch (NumberFormatException e) {
                    zzawf.zzd("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzawf.zzfa("No value given for CSI experiment.");
                return;
            }
            zzaak zzqw = zzbdv.zzyv().zzqw();
            if (zzqw == null) {
                zzawf.zzfa("No ticker for WebView, dropping experiment ID.");
            } else {
                zzqw.zzh("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzawf.zzfa("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzawf.zzfa("No name given for CSI extra.");
            } else {
                zzaak zzqw2 = zzbdv.zzyv().zzqw();
                if (zzqw2 == null) {
                    zzawf.zzfa("No ticker for WebView, dropping extra parameter.");
                } else {
                    zzqw2.zzh(str6, str7);
                }
            }
        }
    }
}

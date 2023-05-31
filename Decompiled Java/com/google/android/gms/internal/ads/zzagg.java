package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagg implements zzafz<Object> {
    private final zzagj zzcyx;

    public static void zza(zzbdv zzbdv, zzagj zzagj) {
        zzbdv.zza("/reward", (zzafz<? super zzbdv>) new zzagg(zzagj));
    }

    private zzagg(zzagj zzagj) {
        this.zzcyx = zzagj;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzasq zzasq = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzasq = new zzasq(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzawf.zzd("Unable to parse reward amount.", e);
            }
            this.zzcyx.zza(zzasq);
        } else if ("video_start".equals(str)) {
            this.zzcyx.zzrx();
        } else if ("video_complete".equals(str)) {
            this.zzcyx.zzry();
        }
    }
}

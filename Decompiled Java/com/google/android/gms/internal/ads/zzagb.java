package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzagb implements zzafz<Object> {
    private final Context zzur;

    public zzagb(Context context) {
        this.zzur = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (zzq.zzlt().zzad(this.zzur)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c = 1;
                    }
                } else if (str.equals("_ac")) {
                    c = 0;
                }
            } else if (str.equals("_aa")) {
                c = 2;
            }
            if (c == 0) {
                zzq.zzlt().zzh(this.zzur, str2);
            } else if (c == 1) {
                zzq.zzlt().zzi(this.zzur, str2);
            } else if (c != 2) {
                zzawf.zzey("logScionEvent gmsg contained unsupported eventName");
            } else {
                zzq.zzlt().zzk(this.zzur, str2);
            }
        }
    }
}

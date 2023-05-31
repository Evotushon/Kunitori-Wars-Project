package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbeo implements zzafz<zzbdv> {
    private final /* synthetic */ zzbem zzeij;

    zzbeo(zzbem zzbem) {
        this.zzeij = zzbem;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbdv zzbdv = (zzbdv) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zzeij) {
                        if (this.zzeij.zzeia != parseInt) {
                            int unused = this.zzeij.zzeia = parseInt;
                            this.zzeij.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzawf.zzd("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}

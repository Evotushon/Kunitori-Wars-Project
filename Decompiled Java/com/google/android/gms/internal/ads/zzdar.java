package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzdar implements Callable {
    static final Callable zzgjg = new zzdar();

    private zzdar() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzvh.zzpd().zzd(zzzx.zzcic);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzvh.zzpd().zzd(zzzx.zzcid)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzayv.zzes(str2));
                }
            }
        }
        return new zzdap(hashMap);
    }
}

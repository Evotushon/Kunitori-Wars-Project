package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcyf implements Callable {
    private final Object zzdcl;
    private final List zzgjw;

    zzcyf(List list, Object obj) {
        this.zzgjw = list;
        this.zzdcl = obj;
    }

    public final Object call() {
        List<zzdof> list = this.zzgjw;
        Object obj = this.zzdcl;
        for (zzdof zzdof : list) {
            zzcyb zzcyb = (zzcyb) zzdof.get();
            if (zzcyb != null) {
                zzcyb.zzs(obj);
            }
        }
        return obj;
    }
}

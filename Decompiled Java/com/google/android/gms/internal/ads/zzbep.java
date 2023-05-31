package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbep implements Runnable {
    private final Map zzdxc;
    private final zzbeq zzeik;

    zzbep(zzbeq zzbeq, Map map) {
        this.zzeik = zzbeq;
        this.zzdxc = map;
    }

    public final void run() {
        this.zzeik.zzj(this.zzdxc);
    }
}

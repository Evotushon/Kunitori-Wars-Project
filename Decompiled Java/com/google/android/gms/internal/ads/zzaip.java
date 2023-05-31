package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaip implements Runnable {
    private final zzaim zzdaa;
    private final zzafz zzdab;
    private final Map zzdac;

    zzaip(zzaim zzaim, zzafz zzafz, Map map) {
        this.zzdaa = zzaim;
        this.zzdab = zzafz;
        this.zzdac = map;
    }

    public final void run() {
        this.zzdaa.zza(this.zzdab, this.zzdac);
    }
}

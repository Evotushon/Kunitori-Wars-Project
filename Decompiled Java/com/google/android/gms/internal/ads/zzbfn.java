package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zze;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbfn implements Runnable {
    private final zzbfo zzeja;

    zzbfn(zzbfo zzbfo) {
        this.zzeja = zzbfo;
    }

    public final void run() {
        zzbfo zzbfo = this.zzeja;
        zzbfo.zzefl.zzaao();
        zze zzaab = zzbfo.zzefl.zzaab();
        if (zzaab != null) {
            zzaab.zzts();
        }
    }
}

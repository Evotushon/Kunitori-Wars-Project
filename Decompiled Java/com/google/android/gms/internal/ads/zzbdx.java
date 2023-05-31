package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zze;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbdx implements Runnable {
    private final zzbdy zzefk;

    zzbdx(zzbdy zzbdy) {
        this.zzefk = zzbdy;
    }

    public final void run() {
        zzbdy zzbdy = this.zzefk;
        zzbdy.zzefl.zzaao();
        zze zzaab = zzbdy.zzefl.zzaab();
        if (zzaab != null) {
            zzaab.zzts();
        }
    }
}

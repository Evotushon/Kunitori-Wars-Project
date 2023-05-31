package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzpl implements Runnable {
    private final /* synthetic */ zzpf zzbjp;
    private final /* synthetic */ Surface zzbjs;

    zzpl(zzpf zzpf, Surface surface) {
        this.zzbjp = zzpf;
        this.zzbjs = surface;
    }

    public final void run() {
        this.zzbjp.zzbjo.zzb(this.zzbjs);
    }
}

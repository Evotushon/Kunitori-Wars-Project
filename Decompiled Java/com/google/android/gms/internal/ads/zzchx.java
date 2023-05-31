package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzchx implements Runnable {
    private final String zzegh;
    private final zzcho zzfwv;
    private final zzdfb zzfxa;
    private final zzahb zzfxb;
    private final List zzfxc;

    zzchx(zzcho zzcho, zzdfb zzdfb, zzahb zzahb, List list, String str) {
        this.zzfwv = zzcho;
        this.zzfxa = zzdfb;
        this.zzfxb = zzahb;
        this.zzfxc = list;
        this.zzegh = str;
    }

    public final void run() {
        this.zzfwv.zza(this.zzfxa, this.zzfxb, this.zzfxc, this.zzegh);
    }
}

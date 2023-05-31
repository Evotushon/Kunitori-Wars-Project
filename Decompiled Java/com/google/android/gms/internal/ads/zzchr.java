package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzchr implements Runnable {
    private final zzcho zzfwv;
    private final zzahc zzfww;

    zzchr(zzcho zzcho, zzahc zzahc) {
        this.zzfwv = zzcho;
        this.zzfww = zzahc;
    }

    public final void run() {
        this.zzfwv.zzc(this.zzfww);
    }
}

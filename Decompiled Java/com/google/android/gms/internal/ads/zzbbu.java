package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbbu implements Runnable {
    private final String zzczs;
    private final zzbbp zzecs;

    zzbbu(zzbbp zzbbp, String str) {
        this.zzecs = zzbbp;
        this.zzczs = str;
    }

    public final void run() {
        this.zzecs.zzfg(this.zzczs);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcgw implements Runnable {
    private final String zzczs;
    private final zzcgx zzfwc;

    zzcgw(zzcgx zzcgx, String str) {
        this.zzfwc = zzcgx;
        this.zzczs = str;
    }

    public final void run() {
        this.zzfwc.zzgd(this.zzczs);
    }
}

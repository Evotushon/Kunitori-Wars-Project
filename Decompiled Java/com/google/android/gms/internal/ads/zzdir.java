package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzdir implements Runnable {
    private final String zzczs;
    private final zzdis zzgwf;

    zzdir(zzdis zzdis, String str) {
        this.zzgwf = zzdis;
        this.zzczs = str;
    }

    public final void run() {
        this.zzgwf.zzgs(this.zzczs);
    }
}

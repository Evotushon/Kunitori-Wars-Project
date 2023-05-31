package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbaj implements Runnable {
    private final int zzdul;
    private final zzbak zzdyc;

    zzbaj(zzbak zzbak, int i) {
        this.zzdyc = zzbak;
        this.zzdul = i;
    }

    public final void run() {
        this.zzdyc.zzcu(this.zzdul);
    }
}

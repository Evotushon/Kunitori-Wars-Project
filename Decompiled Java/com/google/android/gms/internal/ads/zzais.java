package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzais implements Runnable {
    private final String zzczs;
    private final zzait zzdad;

    zzais(zzait zzait, String str) {
        this.zzdad = zzait;
        this.zzczs = str;
    }

    public final void run() {
        this.zzdad.zzde(this.zzczs);
    }
}

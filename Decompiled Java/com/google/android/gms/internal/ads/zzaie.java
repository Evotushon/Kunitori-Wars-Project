package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaie implements Runnable {
    private final zzaid zzczr;
    private final String zzczs;

    zzaie(zzaid zzaid, String str) {
        this.zzczr = zzaid;
        this.zzczs = str;
    }

    public final void run() {
        this.zzczr.zzda(this.zzczs);
    }
}

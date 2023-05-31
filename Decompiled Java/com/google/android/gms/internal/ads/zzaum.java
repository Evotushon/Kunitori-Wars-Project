package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaum implements Runnable {
    private final String zzdcq;
    private final zzaui zzdqx;
    private final zzauy zzdqy;

    zzaum(zzaui zzaui, zzauy zzauy, String str) {
        this.zzdqx = zzaui;
        this.zzdqy = zzauy;
        this.zzdcq = str;
    }

    public final void run() {
        this.zzdqx.zza(this.zzdqy, this.zzdcq);
    }
}

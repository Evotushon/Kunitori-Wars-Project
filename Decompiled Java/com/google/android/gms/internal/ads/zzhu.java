package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzhu implements Runnable {
    private final /* synthetic */ zzhq zzahq;
    private final /* synthetic */ int zzahs;
    private final /* synthetic */ long zzaht;
    private final /* synthetic */ long zzahu;

    zzhu(zzhq zzhq, int i, long j, long j2) {
        this.zzahq = zzhq;
        this.zzahs = i;
        this.zzaht = j;
        this.zzahu = j2;
    }

    public final void run() {
        this.zzahq.zzahm.zzb(this.zzahs, this.zzaht, this.zzahu);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzph implements Runnable {
    private final /* synthetic */ String zzahn;
    private final /* synthetic */ long zzaho;
    private final /* synthetic */ long zzahp;
    private final /* synthetic */ zzpf zzbjp;

    zzph(zzpf zzpf, String str, long j, long j2) {
        this.zzbjp = zzpf;
        this.zzahn = str;
        this.zzaho = j;
        this.zzahp = j2;
    }

    public final void run() {
        this.zzbjp.zzbjo.zzd(this.zzahn, this.zzaho, this.zzahp);
    }
}

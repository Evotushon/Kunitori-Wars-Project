package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzhs implements Runnable {
    private final /* synthetic */ String zzahn;
    private final /* synthetic */ long zzaho;
    private final /* synthetic */ long zzahp;
    private final /* synthetic */ zzhq zzahq;

    zzhs(zzhq zzhq, String str, long j, long j2) {
        this.zzahq = zzhq;
        this.zzahn = str;
        this.zzaho = j;
        this.zzahp = j2;
    }

    public final void run() {
        this.zzahq.zzahm.zzb(this.zzahn, this.zzaho, this.zzahp);
    }
}

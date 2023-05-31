package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzajm implements zzbaa {
    private final /* synthetic */ zzaja zzdaz;
    private final /* synthetic */ zzajv zzdbb;

    zzajm(zzaja zzaja, zzajv zzajv) {
        this.zzdaz = zzaja;
        this.zzdbb = zzajv;
    }

    public final void run() {
        synchronized (this.zzdaz.lock) {
            int unused = this.zzdaz.status = 1;
            zzawf.zzee("Failed loading new engine. Marking new engine destroyable.");
            this.zzdbb.zzsj();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdoj implements Runnable {
    private final /* synthetic */ Runnable zzhdi;
    private final /* synthetic */ zzdog zzhdj;

    zzdoj(zzdog zzdog, Runnable runnable) {
        this.zzhdj = zzdog;
        this.zzhdi = runnable;
    }

    public final void run() {
        this.zzhdj.zzhde = false;
        this.zzhdi.run();
    }
}

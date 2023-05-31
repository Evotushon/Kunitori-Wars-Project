package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzqh implements Runnable {
    private final /* synthetic */ zzqi zzbpm;

    zzqh(zzqi zzqi) {
        this.zzbpm = zzqi;
    }

    public final void run() {
        synchronized (this.zzbpm.lock) {
            if (!this.zzbpm.foreground || !this.zzbpm.zzbpn) {
                zzawf.zzeb("App is still foreground");
            } else {
                boolean unused = this.zzbpm.foreground = false;
                zzawf.zzeb("App went background");
                for (zzqk zzp : this.zzbpm.zzbpo) {
                    try {
                        zzp.zzp(false);
                    } catch (Exception e) {
                        zzazh.zzc("", e);
                    }
                }
            }
        }
    }
}

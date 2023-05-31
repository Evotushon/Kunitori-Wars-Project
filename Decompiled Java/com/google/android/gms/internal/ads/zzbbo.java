package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbbo implements Runnable {
    private boolean zzbpn = false;
    private zzbav zzdzw;

    zzbbo(zzbav zzbav) {
        this.zzdzw = zzbav;
    }

    public final void run() {
        if (!this.zzbpn) {
            this.zzdzw.zzyg();
            zzzb();
        }
    }

    public final void pause() {
        this.zzbpn = true;
        this.zzdzw.zzyg();
    }

    public final void resume() {
        this.zzbpn = false;
        zzzb();
    }

    private final void zzzb() {
        zzawo.zzdtx.removeCallbacks(this);
        zzawo.zzdtx.postDelayed(this, 250);
    }
}

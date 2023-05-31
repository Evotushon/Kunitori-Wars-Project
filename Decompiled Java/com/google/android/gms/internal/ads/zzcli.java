package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcli implements zzbqm, zzbrn {
    private static final Object zzfzx = new Object();
    private static int zzfzy = 0;
    private final zzclr zzfzz;

    public zzcli(zzclr zzclr) {
        this.zzfzz = zzclr;
    }

    public final void onAdLoaded() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue() && zzanv()) {
            this.zzfzz.zzbl(true);
            zzanu();
        }
    }

    public final void onAdFailedToLoad(int i) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcre)).booleanValue() && zzanv()) {
            this.zzfzz.zzbl(false);
            zzanu();
        }
    }

    private static void zzanu() {
        synchronized (zzfzx) {
            zzfzy++;
        }
    }

    private static boolean zzanv() {
        boolean z;
        synchronized (zzfzx) {
            z = zzfzy < ((Integer) zzvh.zzpd().zzd(zzzx.zzcrf)).intValue();
        }
        return z;
    }
}

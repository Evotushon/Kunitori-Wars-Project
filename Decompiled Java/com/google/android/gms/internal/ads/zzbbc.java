package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbbc implements Runnable {
    private final /* synthetic */ zzbav zzdzu;
    private final /* synthetic */ boolean zzdzx;

    zzbbc(zzbav zzbav, boolean z) {
        this.zzdzu = zzbav;
        this.zzdzx = z;
    }

    public final void run() {
        this.zzdzu.zzd("windowVisibilityChanged", "isVisible", String.valueOf(this.zzdzx));
    }
}

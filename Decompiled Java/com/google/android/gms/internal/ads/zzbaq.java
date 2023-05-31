package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbaq implements Runnable {
    private final /* synthetic */ zzbak zzdyt;
    private final /* synthetic */ int zzdyw;
    private final /* synthetic */ int zzdyx;

    zzbaq(zzbak zzbak, int i, int i2) {
        this.zzdyt = zzbak;
        this.zzdyw = i;
        this.zzdyx = i2;
    }

    public final void run() {
        if (this.zzdyt.zzdys != null) {
            this.zzdyt.zzdys.zzk(this.zzdyw, this.zzdyx);
        }
    }
}

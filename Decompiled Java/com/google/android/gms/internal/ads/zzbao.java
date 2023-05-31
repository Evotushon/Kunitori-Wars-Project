package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbao implements Runnable {
    private final /* synthetic */ zzbak zzdyt;
    private final /* synthetic */ String zzdyu;
    private final /* synthetic */ String zzdyv;

    zzbao(zzbak zzbak, String str, String str2) {
        this.zzdyt = zzbak;
        this.zzdyu = str;
        this.zzdyv = str2;
    }

    public final void run() {
        if (this.zzdyt.zzdys != null) {
            this.zzdyt.zzdys.zzm(this.zzdyu, this.zzdyv);
        }
    }
}

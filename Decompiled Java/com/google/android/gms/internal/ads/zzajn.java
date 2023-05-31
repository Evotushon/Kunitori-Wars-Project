package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzajn implements zzbac<zzair> {
    private final /* synthetic */ zzaja zzdaz;
    private final /* synthetic */ zzajv zzdbb;

    zzajn(zzaja zzaja, zzajv zzajv) {
        this.zzdaz = zzaja;
        this.zzdbb = zzajv;
    }

    public final /* synthetic */ void zzh(Object obj) {
        zzair zzair = (zzair) obj;
        synchronized (this.zzdaz.lock) {
            int unused = this.zzdaz.status = 0;
            if (!(this.zzdaz.zzdao == null || this.zzdbb == this.zzdaz.zzdao)) {
                zzawf.zzee("New JS engine is loaded, marking previous one as destroyable.");
                this.zzdaz.zzdao.zzsj();
            }
            zzajv unused2 = this.zzdaz.zzdao = this.zzdbb;
        }
    }
}

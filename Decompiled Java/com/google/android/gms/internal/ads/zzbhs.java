package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbhs implements zzdbf {
    private final /* synthetic */ zzbhf zzene;
    private zzeew<Context> zzeyl;
    private zzeew<String> zzeym;
    private zzeew<zzdco<zzbku, zzbla>> zzeyn;
    private zzeew<zzdbh> zzeyo;
    private zzeew<zzdat> zzeyp;
    private zzeew<zzdaz> zzeyq;

    private zzbhs(zzbhf zzbhf, Context context, String str) {
        this.zzene = zzbhf;
        this.zzeyl = zzeem.zzbe(context);
        this.zzeym = zzeem.zzbe(str);
        this.zzeyn = new zzdcs(this.zzeyl, this.zzene.zzemv, this.zzene.zzemw);
        this.zzeyo = zzeek.zzaq(new zzdbo(this.zzene.zzemv));
        this.zzeyp = zzeek.zzaq(new zzdba(this.zzeyl, this.zzene.zzelg, this.zzene.zzela, this.zzeyn, this.zzeyo, zzdev.zzaqy()));
        this.zzeyq = zzeek.zzaq(new zzdbg(this.zzene.zzela, this.zzeyl, this.zzeym, this.zzeyp, this.zzeyo, this.zzene.zzeln));
    }

    public final zzdaz zzaem() {
        return this.zzeyq.get();
    }
}

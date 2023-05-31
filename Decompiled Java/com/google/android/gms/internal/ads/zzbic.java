package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbic implements zzdea {
    private final /* synthetic */ zzbhf zzene;
    private zzeew<Context> zzeyl;
    private zzeew<String> zzeym;
    private zzeew<zzdco<zzcdq, zzcdn>> zzfbk;
    private zzeew<zzdct> zzfbl;
    private zzeew<zzdep> zzfbm;
    private zzeew<zzddq> zzfbn;
    private zzeew<zzdec> zzfbo;
    private zzeew<zzddw> zzfbp;

    private zzbic(zzbhf zzbhf, Context context, String str) {
        this.zzene = zzbhf;
        this.zzeyl = zzeem.zzbe(context);
        this.zzfbk = new zzdcr(this.zzeyl, this.zzene.zzemv, this.zzene.zzemw);
        this.zzfbl = zzeek.zzaq(new zzddo(this.zzene.zzemv));
        this.zzfbm = zzeek.zzaq(zzdes.zzaqw());
        this.zzfbn = zzeek.zzaq(new zzddt(this.zzeyl, this.zzene.zzelg, this.zzene.zzela, this.zzfbk, this.zzfbl, zzdev.zzaqy(), this.zzfbm));
        this.zzfbo = zzeek.zzaq(new zzded(this.zzfbn, this.zzfbl, this.zzfbm));
        this.zzeym = zzeem.zzbf(str);
        this.zzfbp = zzeek.zzaq(new zzddx(this.zzeym, this.zzfbn, this.zzfbl, this.zzfbm));
    }

    public final zzdec zzafb() {
        return this.zzfbo.get();
    }

    public final zzddw zzafc() {
        return this.zzfbp.get();
    }
}

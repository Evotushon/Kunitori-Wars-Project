package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxl implements zzcye<zzcxm> {
    private final zzaui zzbnp;
    private final zzdoe zzfrv;
    private final Context zzur;

    public zzcxl(zzaui zzaui, zzdoe zzdoe, Context context) {
        this.zzbnp = zzaui;
        this.zzfrv = zzdoe;
        this.zzur = context;
    }

    public final zzdof<zzcxm> zzapb() {
        return this.zzfrv.zzd(new zzcxo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcxm zzapn() throws Exception {
        String str;
        String str2;
        String str3;
        if (!this.zzbnp.zzad(this.zzur)) {
            return new zzcxm((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String zzag = this.zzbnp.zzag(this.zzur);
        String str4 = zzag == null ? "" : zzag;
        String zzah = this.zzbnp.zzah(this.zzur);
        if (zzah == null) {
            str = "";
        } else {
            str = zzah;
        }
        String zzai = this.zzbnp.zzai(this.zzur);
        if (zzai == null) {
            str2 = "";
        } else {
            str2 = zzai;
        }
        String zzaj = this.zzbnp.zzaj(this.zzur);
        if (zzaj == null) {
            str3 = "";
        } else {
            str3 = zzaj;
        }
        return new zzcxm(str4, str, str2, str3, "TIME_OUT".equals(str) ? (Long) zzvh.zzpd().zzd(zzzx.zzcix) : null);
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcba implements Callable {
    private final zzdof zzfig;
    private final zzdof zzfjy;
    private final zzcay zzfry;
    private final zzdof zzfrz;
    private final zzdof zzfsa;
    private final zzdof zzfsb;
    private final JSONObject zzfsc;
    private final zzdof zzfsd;
    private final zzdof zzfse;
    private final zzdof zzfsf;

    zzcba(zzcay zzcay, zzdof zzdof, zzdof zzdof2, zzdof zzdof3, zzdof zzdof4, zzdof zzdof5, JSONObject jSONObject, zzdof zzdof6, zzdof zzdof7, zzdof zzdof8) {
        this.zzfry = zzcay;
        this.zzfjy = zzdof;
        this.zzfig = zzdof2;
        this.zzfrz = zzdof3;
        this.zzfsa = zzdof4;
        this.zzfsb = zzdof5;
        this.zzfsc = jSONObject;
        this.zzfsd = zzdof6;
        this.zzfse = zzdof7;
        this.zzfsf = zzdof8;
    }

    public final Object call() {
        zzcay zzcay = this.zzfry;
        zzdof zzdof = this.zzfjy;
        zzdof zzdof2 = this.zzfig;
        zzdof zzdof3 = this.zzfrz;
        zzdof zzdof4 = this.zzfsa;
        zzdof zzdof5 = this.zzfsb;
        JSONObject jSONObject = this.zzfsc;
        zzdof zzdof6 = this.zzfsd;
        zzdof zzdof7 = this.zzfse;
        zzdof zzdof8 = this.zzfsf;
        zzbyz zzbyz = (zzbyz) zzdof.get();
        zzbyz.setImages((List) zzdof2.get());
        zzbyz.zza((zzacr) zzdof3.get());
        zzbyz.zzb((zzacr) zzdof4.get());
        zzbyz.zza((zzacj) zzdof5.get());
        zzbyz.zzg(zzcbc.zzj(jSONObject));
        zzbyz.zza(zzcbc.zzk(jSONObject));
        zzbdv zzbdv = (zzbdv) zzdof6.get();
        if (zzbdv != null) {
            zzbyz.zzi(zzbdv);
            zzbyz.zzab(zzbdv.getView());
            zzbyz.zzb((zzxj) zzbdv.zzyq());
        }
        zzbdv zzbdv2 = (zzbdv) zzdof7.get();
        if (zzbdv2 != null) {
            zzbyz.zzj(zzbdv2);
        }
        for (zzcbr zzcbr : (List) zzdof8.get()) {
            int i = zzcbr.type;
            if (i == 1) {
                zzbyz.zzn(zzcbr.zzcc, zzcbr.zzfsu);
            } else if (i == 2) {
                zzbyz.zza(zzcbr.zzcc, zzcbr.zzfsv);
            }
        }
        return zzbyz;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcoh implements zzcoe<zzbyo> {
    private final zzdoe zzfrv;
    private final zzbxo zzgcr;
    private final zzcay zzgcs;

    public zzcoh(zzbxo zzbxo, zzdoe zzdoe, zzcay zzcay) {
        this.zzgcr = zzbxo;
        this.zzfrv = zzdoe;
        this.zzgcs = zzcay;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return (zzdei.zzgpq == null || zzdei.zzgpq.zzfnc == null) ? false : true;
    }

    public final zzdof<List<zzdof<zzbyo>>> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzdof<zzccv> zzard = this.zzgcr.zzadz().zzard();
        this.zzgcr.zzadz().zzd(zzard);
        return zzdnt.zzb(zzdnt.zzb(zzard, new zzcog(this, zzdei), (Executor) this.zzfrv), new zzcoj(this, zzdeq, zzdei), (Executor) this.zzfrv);
    }

    private final zzdof<zzbyo> zzb(zzdeq zzdeq, zzdei zzdei, JSONObject jSONObject) {
        zzdof<zzccv> zzard = this.zzgcr.zzadz().zzard();
        zzdof<zzbyz> zza = this.zzgcs.zza(zzdeq, zzdei, jSONObject);
        return zzdnt.zzb((zzdof<? extends V>[]) new zzdof[]{zzard, zza}).zza(new zzcok(this, zza, zzard, zzdeq, zzdei, jSONObject), this.zzfrv);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbyo zza(zzdof zzdof, zzdof zzdof2, zzdeq zzdeq, zzdei zzdei, JSONObject jSONObject) throws Exception {
        zzbyz zzbyz = (zzbyz) zzdof.get();
        zzccv zzccv = (zzccv) zzdof2.get();
        zzbzb zza = this.zzgcr.zza(new zzbnv(zzdeq, zzdei, (String) null), new zzbzl(zzbyz), new zzbyc(jSONObject, zzccv));
        zza.zzadr().zzalw();
        zza.zzads().zzb(zzccv);
        zza.zzadt().zzl(zzbyz.zzakj());
        return zza.zzadq();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdeq zzdeq, zzdei zzdei, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdnt.immediateFailedFuture(new zzcid(3));
        }
        if (zzdeq.zzgql.zzfir.zzggu <= 1) {
            return zzdnt.zzb(zzb(zzdeq, zzdei, jSONArray.getJSONObject(0)), zzcol.zzdpv, (Executor) this.zzfrv);
        }
        int length = jSONArray.length();
        this.zzgcr.zzadz().zzdm(Math.min(length, zzdeq.zzgql.zzfir.zzggu));
        ArrayList arrayList = new ArrayList(zzdeq.zzgql.zzfir.zzggu);
        for (int i = 0; i < zzdeq.zzgql.zzfir.zzggu; i++) {
            if (i < length) {
                arrayList.add(zzb(zzdeq, zzdei, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzdnt.immediateFailedFuture(new zzcid(3)));
            }
        }
        return zzdnt.zzaj(arrayList);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdei zzdei, zzccv zzccv) throws Exception {
        JSONObject zza = zzayf.zza("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzdei.zzgpq.zzfnc);
        jSONObject.put("sdk_params", zza);
        return zzdnt.zzb(zzccv.zzc("google.afma.nativeAds.preProcessJson", jSONObject), zzcoi.zzblf, (Executor) this.zzfrv);
    }
}

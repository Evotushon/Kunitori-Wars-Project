package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzakw<I, O> implements zzdng<I, O> {
    /* access modifiers changed from: private */
    public final zzake<O> zzdcc;
    private final zzakh<I> zzdcd;
    private final String zzdce;
    private final zzdof<zzajy> zzdci;

    zzakw(zzdof<zzajy> zzdof, String str, zzakh<I> zzakh, zzake<O> zzake) {
        this.zzdci = zzdof;
        this.zzdce = str;
        this.zzdcd = zzakh;
        this.zzdcc = zzake;
    }

    public final zzdof<O> zzf(I i) throws Exception {
        return zzdnt.zzb(this.zzdci, new zzakz(this, i), (Executor) zzazq.zzdxp);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(Object obj, zzajy zzajy) throws Exception {
        zzazy zzazy = new zzazy();
        zzq.zzkv();
        String zzwp = zzawo.zzwp();
        zzafi.zzcyk.zza(zzwp, (zzagh) new zzaky(this, zzazy));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", zzwp);
        jSONObject.put("args", this.zzdcd.zzj(obj));
        zzajy.zzb(this.zzdce, jSONObject);
        return zzazy;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcjc {
    private final Executor executor;
    private final zzdeu zzfir;
    private final zzazo zzfyd;
    private final Context zzur;

    public zzcjc(Context context, zzazo zzazo, zzdeu zzdeu, Executor executor2) {
        this.zzur = context;
        this.zzfyd = zzazo;
        this.zzfir = zzdeu;
        this.executor = executor2;
    }

    public final zzdof<zzdeq> zzanr() {
        zzakc<I, O> zza = zzq.zzli().zzb(this.zzur, this.zzfyd).zza("google.afma.response.normalize", zzakj.zzdbu, zzakj.zzdbu);
        return zzdnt.zzb(zzdnt.zzb(zzdnt.zzb(zzdnt.zzaj(""), new zzcjf(this, this.zzfir.zzgqq.zzcda), this.executor), new zzcje(zza), this.executor), new zzcjh(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzo(JSONObject jSONObject) throws Exception {
        return zzdnt.zzaj(new zzdeq(new zzdel(this.zzfir), zzdeo.zza(new StringReader(jSONObject.toString()))));
    }
}

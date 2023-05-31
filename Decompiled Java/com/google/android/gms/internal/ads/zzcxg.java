package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxg implements zzcye<zzcxd> {
    private final ScheduledExecutorService zzfib;
    private final zzdeu zzfir;
    private final zzdoe zzfrv;
    private final zzcro zzgec;
    private String zzghg;
    private final zzcrq zzgjt;
    private final Context zzur;

    public zzcxg(zzdoe zzdoe, ScheduledExecutorService scheduledExecutorService, String str, zzcrq zzcrq, Context context, zzdeu zzdeu, zzcro zzcro) {
        this.zzfrv = zzdoe;
        this.zzfib = scheduledExecutorService;
        this.zzghg = str;
        this.zzgjt = zzcrq;
        this.zzur = context;
        this.zzfir = zzdeu;
        this.zzgec = zzcro;
    }

    public final zzdof<zzcxd> zzapb() {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclg)).booleanValue()) {
            return zzdnt.zza(new zzcxf(this), this.zzfrv);
        }
        return zzdnt.zzaj(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(String str, List list, Bundle bundle) throws Exception {
        zzazy zzazy = new zzazy();
        this.zzgec.zzgj(str);
        zzanq zzgk = this.zzgec.zzgk(str);
        if (zzgk != null) {
            Bundle bundle2 = bundle;
            zzgk.zza(ObjectWrapper.wrap(this.zzur), this.zzghg, bundle2, (Bundle) list.get(0), this.zzfir.zzblv, (zzanv) new zzcrw(str, zzgk, zzazy));
            return zzazy;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzapm() {
        Map<String, List<Bundle>> zzr = this.zzgjt.zzr(this.zzghg, this.zzfir.zzgqr);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : zzr.entrySet()) {
            String str = (String) next.getKey();
            arrayList.add(zzdno.zzg(zzdnt.zza(new zzcxi(this, str, (List) next.getValue(), this.zzfir.zzgqq.zzcct != null ? this.zzfir.zzgqq.zzcct.getBundle(str) : null), this.zzfrv)).zza(((Long) zzvh.zzpd().zzd(zzzx.zzclf)).longValue(), TimeUnit.MILLISECONDS, this.zzfib).zza(Throwable.class, new zzcxh(str), (Executor) this.zzfrv));
        }
        return zzdnt.zzi(arrayList).zza(new zzcxk(arrayList), this.zzfrv);
    }
}

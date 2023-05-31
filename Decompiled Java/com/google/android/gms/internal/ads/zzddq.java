package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbtl;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzddq implements zzcso<zzcdn> {
    private final Executor zzfeo;
    private final zzdep zzfkb;
    @GuardedBy("this")
    private final zzdew zzgfq;
    private final zzbgk zzghf;
    private final Context zzgme;
    /* access modifiers changed from: private */
    public final zzdco<zzcdq, zzcdn> zzgmg;
    /* access modifiers changed from: private */
    public final zzdct zzgot;
    @GuardedBy("this")
    private zzdof<zzcdn> zzgou;

    public zzddq(Context context, Executor executor, zzbgk zzbgk, zzdco<zzcdq, zzcdn> zzdco, zzdct zzdct, zzdew zzdew, zzdep zzdep) {
        this.zzgme = context;
        this.zzfeo = executor;
        this.zzghf = zzbgk;
        this.zzgmg = zzdco;
        this.zzgot = zzdct;
        this.zzgfq = zzdew;
        this.zzfkb = zzdep;
    }

    public final boolean isLoading() {
        zzdof<zzcdn> zzdof = this.zzgou;
        return zzdof != null && !zzdof.isDone();
    }

    public final boolean zza(zzuh zzuh, String str, zzcsr zzcsr, zzcsq<? super zzcdn> zzcsq) throws RemoteException {
        zzash zzash = new zzash(zzuh, str);
        String str2 = zzcsr instanceof zzddn ? ((zzddn) zzcsr).zzgor : null;
        if (zzash.zzbri == null) {
            zzawf.zzey("Ad unit ID should not be null for rewarded video ad.");
            this.zzfeo.execute(new zzddp(this));
            return false;
        }
        zzdof<zzcdn> zzdof = this.zzgou;
        if (zzdof != null && !zzdof.isDone()) {
            return false;
        }
        zzdfc.zze(this.zzgme, zzash.zzdjt.zzccp);
        zzdeu zzarb = this.zzgfq.zzgn(zzash.zzbri).zzd(zzuk.zzoq()).zzg(zzash.zzdjt).zzarb();
        zzddu zzddu = new zzddu((zzddr) null);
        zzddu.zzfir = zzarb;
        zzddu.zzgor = str2;
        this.zzgou = this.zzgmg.zza(new zzdcp(zzddu), new zzdds(this));
        zzdnt.zza(this.zzgou, new zzddr(this, zzcsq, zzddu), this.zzfeo);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zzaqq() {
        this.zzgfq.zzgqx.add("new_rewarded");
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzcdt zze(zzdcn zzdcn) {
        zzddu zzddu = (zzddu) zzdcn;
        zzdct zza = zzdct.zza(this.zzgot);
        return this.zzghf.zzacr().zze(new zzbpt.zza().zzcc(this.zzgme).zza(zzddu.zzfir).zzft(zzddu.zzgor).zza(this.zzfkb).zzahz()).zze(new zzbtl.zza().zza((zzbqh) zza, this.zzfeo).zza((zzbrn) zza, this.zzfeo).zza((zzbqm) zza, this.zzfeo).zza((AdMetadataListener) zza, this.zzfeo).zza((zzbqq) zza, this.zzfeo).zza((zzbsg) zza, this.zzfeo).zza((zzdcl) zza).zzais());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqr() {
        this.zzgot.onAdFailedToLoad(1);
    }
}

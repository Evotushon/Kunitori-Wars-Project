package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbtl;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdat implements zzcso<zzbla> {
    private final Executor zzfeo;
    private final ViewGroup zzfgb;
    @GuardedBy("this")
    private final zzdew zzgfq;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    @Nullable
    public zzdof<zzbla> zzgga;
    private final zzbgk zzghf;
    private final Context zzgme;
    private final zzdbh zzgmf;
    /* access modifiers changed from: private */
    public final zzdco<zzbku, zzbla> zzgmg;

    public zzdat(Context context, Executor executor, zzbgk zzbgk, zzdco<zzbku, zzbla> zzdco, zzdbh zzdbh, zzdew zzdew) {
        this.zzgme = context;
        this.zzfeo = executor;
        this.zzghf = zzbgk;
        this.zzgmg = zzdco;
        this.zzgmf = zzdbh;
        this.zzgfq = zzdew;
        this.zzfgb = new FrameLayout(context);
    }

    public final boolean isLoading() {
        zzdof<zzbla> zzdof = this.zzgga;
        return zzdof != null && !zzdof.isDone();
    }

    public final synchronized boolean zza(zzuh zzuh, String str, zzcsr zzcsr, zzcsq<? super zzbla> zzcsq) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            zzawf.zzey("Ad unit ID should not be null for app open ad.");
            this.zzfeo.execute(new zzdaw(this));
            return false;
        } else if (this.zzgga != null) {
            return false;
        } else {
            zzdfc.zze(this.zzgme, zzuh.zzccp);
            zzdeu zzarb = this.zzgfq.zzgn(str).zzd(zzuk.zzor()).zzg(zzuh).zzarb();
            zzdax zzdax = new zzdax((zzday) null);
            zzdax.zzfir = zzarb;
            this.zzgga = this.zzgmg.zza(new zzdcp(zzdax), new zzdav(this));
            zzdnt.zza(this.zzgga, new zzday(this, zzcsq, zzdax), this.zzfeo);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final synchronized zzbkx zzb(zzdcn zzdcn) {
        zzbtl.zza zza;
        zzdbh zza2 = zzdbh.zza(this.zzgmf);
        zza = new zzbtl.zza();
        zza.zza((zzbqm) zza2, this.zzfeo);
        zza.zza((zzbrw) zza2, this.zzfeo);
        zza.zza((zzdcl) zza2);
        return this.zzghf.zzacn().zza(new zzblf(this.zzfgb)).zzb(new zzbpt.zza().zzcc(this.zzgme).zza(((zzdax) zzdcn).zzfir).zzahz()).zzb(zza.zzais());
    }

    public final void zza(zzur zzur) {
        this.zzgfq.zzb(zzur);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaqe() {
        this.zzgmf.onAdFailedToLoad(1);
    }
}

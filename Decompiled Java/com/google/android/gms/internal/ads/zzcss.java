package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbtl;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcss implements zzcso<zzbnf> {
    private final zzbgk zzgcx;
    private final Context zzgfp;
    @GuardedBy("this")
    private final zzdew zzgfq;
    private final zzcsm zzggs;
    @GuardedBy("this")
    @Nullable
    private zzbnm zzggt;

    public zzcss(zzbgk zzbgk, Context context, zzcsm zzcsm, zzdew zzdew) {
        this.zzgcx = zzbgk;
        this.zzgfp = context;
        this.zzggs = zzcsm;
        this.zzgfq = zzdew;
    }

    public final boolean isLoading() {
        zzbnm zzbnm = this.zzggt;
        return zzbnm != null && zzbnm.isLoading();
    }

    public final boolean zza(zzuh zzuh, String str, zzcsr zzcsr, zzcsq<? super zzbnf> zzcsq) throws RemoteException {
        if (str == null) {
            zzawf.zzey("Ad unit ID should not be null for NativeAdLoader.");
            this.zzgcx.zzacf().execute(new zzcsv(this));
            return false;
        }
        zzdfc.zze(this.zzgfp, zzuh.zzccp);
        zzdeu zzarb = this.zzgfq.zzg(zzuh).zzdl(zzcsr instanceof zzcst ? ((zzcst) zzcsr).zzggu : 1).zzarb();
        zzbxo zzadh = this.zzgcx.zzacq().zza(new zzbpt.zza().zzcc(this.zzgfp).zza(zzarb).zzahz()).zza(new zzbtl.zza().zza(this.zzggs.zzaos(), this.zzgcx.zzacf()).zza(this.zzggs.zzaot(), this.zzgcx.zzacf()).zza(this.zzggs.zzaou(), this.zzgcx.zzacf()).zza(this.zzggs.zzaov(), this.zzgcx.zzacf()).zza(this.zzggs.zzaor(), this.zzgcx.zzacf()).zza(zzarb.zzgqw, this.zzgcx.zzacf()).zzais()).zza(this.zzggs.zzaoq()).zzadh();
        zzadh.zzadz().zzdm(1);
        this.zzggt = new zzbnm(this.zzgcx.zzach(), this.zzgcx.zzacg(), zzadh.zzadx().zzahq());
        this.zzggt.zza((zzdnu<zzbnf>) new zzcsu(this, zzcsq, zzadh));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzaox() {
        this.zzggs.zzaot().onAdFailedToLoad(1);
    }
}

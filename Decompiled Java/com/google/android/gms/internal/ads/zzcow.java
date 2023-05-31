package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbpt;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcow extends zzcox<zzblg> {
    private final zzbtl zzemy;
    private final zzbxk zzena;
    private final zzcrh zzeyi;
    private final ViewGroup zzfgb;
    private final zzbsf zzfho;
    private final zzbgk zzgcx;
    private final zzbpt.zza zzgcy;

    public zzcow(zzbgk zzbgk, zzbpt.zza zza, zzcrh zzcrh, zzbtl zzbtl, zzbxk zzbxk, zzbsf zzbsf, @Nullable ViewGroup viewGroup) {
        this.zzgcx = zzbgk;
        this.zzgcy = zza;
        this.zzeyi = zzcrh;
        this.zzemy = zzbtl;
        this.zzena = zzbxk;
        this.zzfho = zzbsf;
        this.zzfgb = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final zzdof<zzblg> zza(zzdeu zzdeu, Bundle bundle) {
        return this.zzgcx.zzacm().zzc(this.zzgcy.zza(zzdeu).zze(bundle).zzahz()).zzc(this.zzemy).zza(this.zzeyi).zzb(this.zzena).zza(new zzbmy(this.zzfho)).zzb(new zzblf(this.zzfgb)).zzael().zzadx().zzahq();
    }
}

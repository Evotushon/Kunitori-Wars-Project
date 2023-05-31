package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbpt;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcoy extends zzcox<zzbvu> {
    private final zzbtl zzemy;
    private final zzcrh zzeyi;
    private final zzbgk zzgcx;
    private final zzbpt.zza zzgcy;

    public zzcoy(zzbgk zzbgk, zzbpt.zza zza, zzcrh zzcrh, zzbtl zzbtl) {
        this.zzgcx = zzbgk;
        this.zzgcy = zza;
        this.zzeyi = zzcrh;
        this.zzemy = zzbtl;
    }

    /* access modifiers changed from: protected */
    public final zzdof<zzbvu> zza(zzdeu zzdeu, Bundle bundle) {
        return this.zzgcx.zzacp().zzd(this.zzgcy.zza(zzdeu).zze(bundle).zzahz()).zzd(this.zzemy).zzb(this.zzeyi).zzaev().zzadx().zzahq();
    }
}

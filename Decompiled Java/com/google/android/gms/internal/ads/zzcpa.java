package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbpt;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcpa extends zzcox<zzcdn> {
    private final zzbtl zzemy;
    private final zzbgk zzgcx;
    private final zzbpt.zza zzgcy;

    public zzcpa(zzbgk zzbgk, zzbpt.zza zza, zzbtl zzbtl) {
        this.zzgcx = zzbgk;
        this.zzgcy = zza;
        this.zzemy = zzbtl;
    }

    /* access modifiers changed from: protected */
    public final zzdof<zzcdn> zza(zzdeu zzdeu, Bundle bundle) {
        return this.zzgcx.zzacr().zze(this.zzgcy.zza(zzdeu).zze(bundle).zzahz()).zze(this.zzemy).zzafa().zzadx().zzahq();
    }
}

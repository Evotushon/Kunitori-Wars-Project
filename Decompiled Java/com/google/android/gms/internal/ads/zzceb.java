package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzceb {
    private final zzazo zzblu;
    private final zzbee zzbms;
    private final zzsn zzefm;
    private final zzdq zzehb;
    private final zza zzehd;
    private final zzrp zzehf;
    private final zzdeu zzfir;
    /* access modifiers changed from: private */
    public final zzbsf zzfuh;
    private final Context zzur;

    public zzceb(zzbee zzbee, Context context, zzdeu zzdeu, zzdq zzdq, zzazo zzazo, zza zza, zzsn zzsn, zzbsf zzbsf, zzbvt zzbvt) {
        this.zzbms = zzbee;
        this.zzur = context;
        this.zzfir = zzdeu;
        this.zzehb = zzdq;
        this.zzblu = zzazo;
        this.zzehd = zza;
        this.zzefm = zzsn;
        this.zzfuh = zzbsf;
        this.zzehf = zzbvt;
    }

    public final zzbdv zzc(zzuk zzuk) throws zzbei {
        return zza(zzuk, false);
    }

    public final zzbdv zza(zzuk zzuk, boolean z) throws zzbei {
        return zzbee.zza(this.zzur, zzbfl.zzb(zzuk), zzuk.zzabk, false, false, this.zzehb, this.zzblu, (zzaak) null, new zzcea(this), this.zzehd, this.zzefm, this.zzehf, z);
    }
}

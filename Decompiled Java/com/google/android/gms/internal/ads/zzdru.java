package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdru extends zzdpi<zzdty, zzdtx> {
    zzdru(zzdrs zzdrs, Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        zzdty zzdty = (zzdty) zzeah;
        return (zzdtx) ((zzdyz) zzdtx.zzaxz().zzen(0).zzd(zzdty.zzaxy()).zzad(zzdxn.zzt(zzdwq.zzey(zzdty.getKeySize()))).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdty.zzr(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdty zzdty = (zzdty) zzeah;
        if (zzdty.getKeySize() >= 16) {
            zzdrs.zza(zzdty.zzaxy());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}

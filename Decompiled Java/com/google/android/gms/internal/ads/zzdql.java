package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdql extends zzdpi<zzdst, zzdsq> {
    private final /* synthetic */ zzdqj zzhfk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdql(zzdqj zzdqj, Class cls) {
        super(cls);
        this.zzhfk = zzdqj;
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        zzdst zzdst = (zzdst) zzeah;
        return (zzdsq) ((zzdyz) zzdsq.zzawq().zzv(zzdxn.zzt(zzdwq.zzey(zzdst.getKeySize()))).zzb(zzdst.zzawp()).zzef(0).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdst.zzi(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdst zzdst = (zzdst) zzeah;
        zzdwv.zzez(zzdst.getKeySize());
        if (zzdst.zzawp().zzawm() != 12 && zzdst.zzawp().zzawm() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}

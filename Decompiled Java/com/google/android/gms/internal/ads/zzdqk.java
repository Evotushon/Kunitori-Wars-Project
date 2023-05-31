package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdqk extends zzdpi<zzdsm, zzdsl> {
    private final /* synthetic */ zzdqi zzhfj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdqk(zzdqi zzdqi, Class cls) {
        super(cls);
        this.zzhfj = zzdqi;
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        zzdsm zzdsm = (zzdsm) zzeah;
        return (zzdsl) ((zzdyz) zzdsl.zzawh().zzc(zzdsm.zzawg()).zzu(zzdxn.zzt(zzdwq.zzey(zzdsm.getKeySize()))).zzee(0).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdsm.zzg(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdsm zzdsm = (zzdsm) zzeah;
        zzdwv.zzez(zzdsm.getKeySize());
        zzdqi.zza(zzdsm.zzawg());
    }
}

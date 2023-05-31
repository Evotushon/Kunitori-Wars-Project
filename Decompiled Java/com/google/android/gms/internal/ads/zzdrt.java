package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrt extends zzdpi<zzdsd, zzdsa> {
    zzdrt(zzdrr zzdrr, Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        zzdsd zzdsd = (zzdsd) zzeah;
        return (zzdsa) ((zzdyz) zzdsa.zzavt().zzec(0).zzt(zzdxn.zzt(zzdwq.zzey(zzdsd.getKeySize()))).zzd(zzdsd.zzavs()).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdsd.zzc(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdsd zzdsd = (zzdsd) zzeah;
        zzdrr.zza(zzdsd.zzavs());
        zzdrr.zzea(zzdsd.getKeySize());
    }
}

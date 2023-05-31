package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrg extends zzdpi<zzdti, zzdtm> {
    private final /* synthetic */ zzdre zzhft;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdrg(zzdre zzdre, Class cls) {
        super(cls);
        this.zzhft = zzdre;
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        zzdti zzdti = (zzdti) zzeah;
        KeyPair zza = zzdvy.zza(zzdvy.zza(zzdrm.zza(zzdti.zzaxe().zzaxg().zzaxt())));
        ECPoint w = ((ECPublicKey) zza.getPublic()).getW();
        return (zzdtm) ((zzdyz) zzdtm.zzaxm().zzej(0).zzb((zzdtp) ((zzdyz) zzdtp.zzaxq().zzek(0).zzc(zzdti.zzaxe()).zzab(zzdxn.zzt(w.getAffineX().toByteArray())).zzac(zzdxn.zzt(w.getAffineY().toByteArray())).zzbcx())).zzy(zzdxn.zzt(((ECPrivateKey) zza.getPrivate()).getS().toByteArray())).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdti.zzn(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdrm.zza(((zzdti) zzeah).zzaxe());
    }
}

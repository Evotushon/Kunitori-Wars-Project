package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdre extends zzdpv<zzdtm, zzdtp> {
    zzdre() {
        super(zzdtm.class, zzdtp.class, new zzdrd(zzdpc.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.ASYMMETRIC_PRIVATE;
    }

    public final zzdpi<zzdti, zzdtm> zzavf() {
        return new zzdrg(this, zzdti.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdtm zzdtm = (zzdtm) zzeah;
        if (!zzdtm.zzavr().isEmpty()) {
            zzdwv.zzy(zzdtm.getVersion(), 0);
            zzdrm.zza(zzdtm.zzaxl().zzaxe());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdtm.zzo(zzdxn, zzdym.zzbcg());
    }
}

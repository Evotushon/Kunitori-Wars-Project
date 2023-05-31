package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrf extends zzdpj<zzdtp> {
    public zzdrf() {
        super(zzdtp.class, new zzdri(zzdpf.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdtp zzdtp = (zzdtp) zzeah;
        zzdwv.zzy(zzdtp.getVersion(), 0);
        zzdrm.zza(zzdtp.zzaxe());
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdtp.zzp(zzdxn, zzdym.zzbcg());
    }
}

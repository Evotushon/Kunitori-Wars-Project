package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrd extends zzdpl<zzdpc, zzdtm> {
    zzdrd(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzak(Object obj) throws GeneralSecurityException {
        zzdtm zzdtm = (zzdtm) obj;
        zzdtl zzaxe = zzdtm.zzaxl().zzaxe();
        zzdtq zzaxg = zzaxe.zzaxg();
        zzdwa zza = zzdrm.zza(zzaxg.zzaxt());
        byte[] byteArray = zzdtm.zzavr().toByteArray();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, byteArray), zzdvy.zza(zza));
        return new zzdvv((ECPrivateKey) zzdwf.zzhmx.zzhg("EC").generatePrivate(eCPrivateKeySpec), zzaxg.zzaxv().toByteArray(), zzdrm.zza(zzaxg.zzaxu()), zzdrm.zza(zzaxe.zzaxi()), new zzdro(zzaxe.zzaxh().zzaxb()));
    }
}

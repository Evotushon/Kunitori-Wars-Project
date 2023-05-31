package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdrr extends zzdpj<zzdsa> {
    zzdrr() {
        super(zzdsa.class, new zzdrq(zzdpp.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    /* access modifiers changed from: private */
    public static void zza(zzdse zzdse) throws GeneralSecurityException {
        if (zzdse.zzavw() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzdse.zzavw() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzea(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    public final zzdpi<zzdsd, zzdsa> zzavf() {
        return new zzdrt(this, zzdsd.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdsa zzdsa = (zzdsa) zzeah;
        zzdwv.zzy(zzdsa.getVersion(), 0);
        zzea(zzdsa.zzavr().size());
        zza(zzdsa.zzavs());
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdsa.zzb(zzdxn, zzdym.zzbcg());
    }
}

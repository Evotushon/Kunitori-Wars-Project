package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqi extends zzdpj<zzdsl> {
    zzdqi() {
        super(zzdsl.class, new zzdqh(zzdwp.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    public final zzdpi<zzdsm, zzdsl> zzavf() {
        return new zzdqk(this, zzdsm.class);
    }

    /* access modifiers changed from: private */
    public static void zza(zzdsp zzdsp) throws GeneralSecurityException {
        if (zzdsp.zzawm() < 12 || zzdsp.zzawm() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdsl zzdsl = (zzdsl) zzeah;
        zzdwv.zzy(zzdsl.getVersion(), 0);
        zzdwv.zzez(zzdsl.zzavr().size());
        zza(zzdsl.zzawg());
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdsl.zzf(zzdxn, zzdym.zzbcg());
    }
}

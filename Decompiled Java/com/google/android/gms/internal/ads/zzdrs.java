package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdrs extends zzdpj<zzdtx> {
    public zzdrs() {
        super(zzdtx.class, new zzdrv(zzdpp.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    /* access modifiers changed from: private */
    public static void zza(zzdub zzdub) throws GeneralSecurityException {
        if (zzdub.zzavw() >= 10) {
            int i = zzdrx.zzhgc[zzdub.zzaye().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (zzdub.zzavw() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzdub.zzavw() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzdub.zzavw() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzdpi<zzdty, zzdtx> zzavf() {
        return new zzdru(this, zzdty.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdtx zzdtx = (zzdtx) zzeah;
        zzdwv.zzy(zzdtx.getVersion(), 0);
        if (zzdtx.zzavr().size() >= 16) {
            zza(zzdtx.zzaxy());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdtx.zzq(zzdxn, zzdym.zzbcg());
    }
}

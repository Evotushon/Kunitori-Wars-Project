package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqp extends zzdpj<zzdtb> {
    zzdqp() {
        super(zzdtb.class, new zzdqs(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    public final zzdpi<zzdtc, zzdtb> zzavf() {
        return new zzdqr(this, zzdtc.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdtb zzdtb = (zzdtb) zzeah;
        zzdwv.zzy(zzdtb.getVersion(), 0);
        if (zzdtb.zzavr().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdtb.zzl(zzdxn, zzdym.zzbcg());
    }
}

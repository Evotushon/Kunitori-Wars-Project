package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqz extends zzdpj<zzdvb> {
    zzdqz() {
        super(zzdvb.class, new zzdrc(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    public final zzdpi<zzdve, zzdvb> zzavf() {
        return new zzdrb(this, zzdve.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdvb zzdvb = (zzdvb) zzeah;
        zzdwv.zzy(zzdvb.getVersion(), 0);
        if (zzdvb.zzavr().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdvb.zzw(zzdxn, zzdym.zzbcg());
    }
}

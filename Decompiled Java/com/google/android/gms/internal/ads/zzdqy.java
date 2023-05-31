package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqy extends zzdpj<zzduu> {
    zzdqy() {
        super(zzduu.class, new zzdqx(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.REMOTE;
    }

    public final zzdpi<zzduv, zzduu> zzavf() {
        return new zzdra(this, zzduv.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdwv.zzy(((zzduu) zzeah).getVersion(), 0);
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzduu.zzu(zzdxn, zzdym.zzbcg());
    }
}

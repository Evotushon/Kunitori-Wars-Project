package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqe extends zzdpj<zzdsh> {
    zzdqe() {
        super(zzdsh.class, new zzdqg(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    public final zzdpi<zzdsi, zzdsh> zzavf() {
        return new zzdqf(this, zzdsi.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdwv.zzy(((zzdsh) zzeah).getVersion(), 0);
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdsh.zzd(zzdxn, zzdym.zzbcg());
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqj extends zzdpj<zzdsq> {
    zzdqj() {
        super(zzdsq.class, new zzdqm(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    public final zzdpi<zzdst, zzdsq> zzavf() {
        return new zzdql(this, zzdst.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdsq zzdsq = (zzdsq) zzeah;
        zzdwv.zzy(zzdsq.getVersion(), 0);
        zzdwv.zzez(zzdsq.zzavr().size());
        if (zzdsq.zzawp().zzawm() != 12 && zzdsq.zzawp().zzawm() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdsq.zzh(zzdxn, zzdym.zzbcg());
    }
}

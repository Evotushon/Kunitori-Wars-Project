package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqo extends zzdpj<zzdsx> {
    zzdqo() {
        super(zzdsx.class, new zzdqn(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.SYMMETRIC;
    }

    public final zzdpi<zzdsy, zzdsx> zzavf() {
        return new zzdqq(this, zzdsy.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdsx zzdsx = (zzdsx) zzeah;
        zzdwv.zzy(zzdsx.getVersion(), 0);
        zzdwv.zzez(zzdsx.zzavr().size());
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzdsx.zzj(zzdxn, zzdym.zzbcg());
    }
}

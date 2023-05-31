package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqu extends zzdpj<zzduq> {
    zzdqu() {
        super(zzduq.class, new zzdqt(zzdoy.class));
    }

    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final zzduc.zzb zzavc() {
        return zzduc.zzb.REMOTE;
    }

    public final zzdpi<zzdur, zzduq> zzavf() {
        return new zzdqw(this, zzdur.class);
    }

    public final /* synthetic */ void zze(zzeah zzeah) throws GeneralSecurityException {
        zzdwv.zzy(((zzduq) zzeah).getVersion(), 0);
    }

    public final /* synthetic */ zzeah zzr(zzdxn zzdxn) throws zzdzh {
        return zzduq.zzs(zzdxn, zzdym.zzbcg());
    }
}

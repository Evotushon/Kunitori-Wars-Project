package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdqq extends zzdpi<zzdsy, zzdsx> {
    private final /* synthetic */ zzdqo zzhfl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdqq(zzdqo zzdqo, Class cls) {
        super(cls);
        this.zzhfl = zzdqo;
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        return (zzdsx) ((zzdyz) zzdsx.zzawv().zzw(zzdxn.zzt(zzdwq.zzey(((zzdsy) zzeah).getKeySize()))).zzeg(0).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdsy.zzk(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdwv.zzez(((zzdsy) zzeah).getKeySize());
    }
}

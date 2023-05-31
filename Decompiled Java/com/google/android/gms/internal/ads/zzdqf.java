package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdqf extends zzdpi<zzdsi, zzdsh> {
    private final /* synthetic */ zzdqe zzhfi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdqf(zzdqe zzdqe, Class cls) {
        super(cls);
        this.zzhfi = zzdqe;
    }

    public final /* synthetic */ Object zzd(zzeah zzeah) throws GeneralSecurityException {
        zzdsi zzdsi = (zzdsi) zzeah;
        return (zzdsh) ((zzdyz) zzdsh.zzawb().zzb((zzdsl) new zzdqi().zzavf().zzd(zzdsi.zzawd())).zzb((zzdtx) new zzdrs().zzavf().zzd(zzdsi.zzawe())).zzed(0).zzbcx());
    }

    public final /* synthetic */ zzeah zzq(zzdxn zzdxn) throws zzdzh {
        return zzdsi.zze(zzdxn, zzdym.zzbcg());
    }

    public final /* synthetic */ void zzc(zzeah zzeah) throws GeneralSecurityException {
        zzdsi zzdsi = (zzdsi) zzeah;
        new zzdqi().zzavf().zzc(zzdsi.zzawd());
        new zzdrs().zzavf().zzc(zzdsi.zzawe());
        zzdwv.zzez(zzdsi.zzawd().getKeySize());
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsx;
import com.google.android.gms.internal.ads.zzdtx;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdro implements zzdvs {
    private final String zzhfx;
    private final int zzhfy;
    private zzdsx zzhfz;
    private zzdsh zzhga;
    private int zzhgb;

    zzdro(zzdui zzdui) throws GeneralSecurityException {
        this.zzhfx = zzdui.zzayh();
        if (this.zzhfx.equals(zzdqa.zzhey)) {
            try {
                zzdsy zzk = zzdsy.zzk(zzdui.zzayi(), zzdym.zzbcg());
                this.zzhfz = (zzdsx) zzdpu.zzb(zzdui);
                this.zzhfy = zzk.getKeySize();
            } catch (zzdzh e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.zzhfx.equals(zzdqa.zzhex)) {
            try {
                zzdsi zze = zzdsi.zze(zzdui.zzayi(), zzdym.zzbcg());
                this.zzhga = (zzdsh) zzdpu.zzb(zzdui);
                this.zzhgb = zze.zzawd().getKeySize();
                this.zzhfy = this.zzhgb + zze.zzawe().getKeySize();
            } catch (zzdzh e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String valueOf = String.valueOf(this.zzhfx);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
    }

    public final int zzavq() {
        return this.zzhfy;
    }

    public final zzdoy zzm(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzhfy) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zzhfx.equals(zzdqa.zzhey)) {
            return (zzdoy) zzdpu.zza(this.zzhfx, (zzeah) (zzdsx) ((zzdyz) ((zzdsx.zza) zzdsx.zzawv().zza(this.zzhfz)).zzw(zzdxn.zzh(bArr, 0, this.zzhfy)).zzbcx()), zzdoy.class);
        } else if (this.zzhfx.equals(zzdqa.zzhex)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzhgb);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzhgb, this.zzhfy);
            zzdsh.zza zzb = zzdsh.zzawb().zzed(this.zzhga.getVersion()).zzb((zzdsl) ((zzdyz) ((zzdsl.zza) zzdsl.zzawh().zza(this.zzhga.zzavz())).zzu(zzdxn.zzt(copyOfRange)).zzbcx()));
            return (zzdoy) zzdpu.zza(this.zzhfx, (zzeah) (zzdsh) ((zzdyz) zzb.zzb((zzdtx) ((zzdyz) ((zzdtx.zza) zzdtx.zzaxz().zza(this.zzhga.zzawa())).zzad(zzdxn.zzt(copyOfRange2)).zzbcx())).zzbcx()), zzdoy.class);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}

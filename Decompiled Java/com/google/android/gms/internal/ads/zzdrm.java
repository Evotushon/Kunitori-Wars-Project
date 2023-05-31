package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrm {
    public static void zza(zzdtl zzdtl) throws GeneralSecurityException {
        zzdvy.zza(zza(zzdtl.zzaxg().zzaxt()));
        zza(zzdtl.zzaxg().zzaxu());
        if (zzdtl.zzaxi() != zzdtf.UNKNOWN_FORMAT) {
            zzdpu.zza(zzdtl.zzaxh().zzaxb());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String zza(zzdtv zzdtv) throws NoSuchAlgorithmException {
        int i = zzdrp.zzhgc[zzdtv.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzdtv);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static zzdwa zza(zzdtt zzdtt) throws GeneralSecurityException {
        int i = zzdrp.zzhgd[zzdtt.ordinal()];
        if (i == 1) {
            return zzdwa.NIST_P256;
        }
        if (i == 2) {
            return zzdwa.NIST_P384;
        }
        if (i == 3) {
            return zzdwa.NIST_P521;
        }
        String valueOf = String.valueOf(zzdtt);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static zzdwd zza(zzdtf zzdtf) throws GeneralSecurityException {
        int i = zzdrp.zzhge[zzdtf.ordinal()];
        if (i == 1) {
            return zzdwd.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzdwd.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (i == 3) {
            return zzdwd.COMPRESSED;
        }
        String valueOf = String.valueOf(zzdtf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }
}

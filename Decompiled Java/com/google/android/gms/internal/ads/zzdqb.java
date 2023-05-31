package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzdun;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdqb {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);

    public static zzdun zzb(zzdum zzdum) {
        zzdun.zza zzer = zzdun.zzazc().zzer(zzdum.zzayu());
        for (zzdum.zza next : zzdum.zzayv()) {
            zzer.zzb((zzdun.zzb) ((zzdyz) zzdun.zzb.zzaze().zzhf(next.zzayz().zzayh()).zza(next.zzavi()).zza(next.zzavj()).zzes(next.zzaza()).zzbcx()));
        }
        return (zzdun) ((zzdyz) zzer.zzbcx());
    }

    public static void zzc(zzdum zzdum) throws GeneralSecurityException {
        int zzayu = zzdum.zzayu();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzdum.zza next : zzdum.zzayv()) {
            if (next.zzavi() == zzdug.ENABLED) {
                if (!next.zzayy()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.zzaza())}));
                } else if (next.zzavj() == zzduy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.zzaza())}));
                } else if (next.zzavi() != zzdug.UNKNOWN_STATUS) {
                    if (next.zzaza() == zzayu) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.zzayz().zzayj() != zzduc.zzb.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.zzaza())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}

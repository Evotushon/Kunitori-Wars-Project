package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzdum;
import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdpo {
    @Deprecated
    public static final zzdpk zzk(byte[] bArr) throws GeneralSecurityException {
        try {
            zzdum zzc = zzdum.zzc(bArr, zzdym.zzbcg());
            for (zzdum.zza next : zzc.zzayv()) {
                if (next.zzayz().zzayj() == zzduc.zzb.UNKNOWN_KEYMATERIAL || next.zzayz().zzayj() == zzduc.zzb.SYMMETRIC || next.zzayz().zzayj() == zzduc.zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzdpk.zza(zzc);
        } catch (zzdzh unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}

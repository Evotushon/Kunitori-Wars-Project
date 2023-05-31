package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzdqd implements zzdpt<zzdoy> {
    private static final Logger logger = Logger.getLogger(zzdqd.class.getName());

    zzdqd() {
    }

    public final Class<zzdoy> zzauy() {
        return zzdoy.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static class zza implements zzdoy {
        private final zzdpr<zzdoy> zzhfh;

        private zza(zzdpr<zzdoy> zzdpr) {
            this.zzhfh = zzdpr;
        }

        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzdvp.zza(this.zzhfh.zzavl().zzavk(), this.zzhfh.zzavl().zzavh().zzc(bArr, bArr2));
        }
    }

    public final /* synthetic */ Object zza(zzdpr zzdpr) throws GeneralSecurityException {
        return new zza(zzdpr);
    }
}

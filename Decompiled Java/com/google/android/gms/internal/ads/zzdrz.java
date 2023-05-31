package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
class zzdrz implements zzdpt<zzdpp> {
    private static final Logger logger = Logger.getLogger(zzdrz.class.getName());

    zzdrz() {
    }

    public final Class<zzdpp> zzauy() {
        return zzdpp.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static class zza implements zzdpp {
        private final zzdpr<zzdpp> zzhfw;
        private final byte[] zzhgk;

        private zza(zzdpr<zzdpp> zzdpr) {
            this.zzhgk = new byte[]{0};
            this.zzhfw = zzdpr;
        }

        public final byte[] zzl(byte[] bArr) throws GeneralSecurityException {
            if (this.zzhfw.zzavl().zzavj().equals(zzduy.LEGACY)) {
                return zzdvp.zza(this.zzhfw.zzavl().zzavk(), this.zzhfw.zzavl().zzavh().zzl(zzdvp.zza(bArr, this.zzhgk)));
            }
            return zzdvp.zza(this.zzhfw.zzavl().zzavk(), this.zzhfw.zzavl().zzavh().zzl(bArr));
        }
    }

    public final /* synthetic */ Object zza(zzdpr zzdpr) throws GeneralSecurityException {
        return new zza(zzdpr);
    }
}

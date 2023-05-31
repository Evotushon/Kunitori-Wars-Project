package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdrv extends zzdpl<zzdpp, zzdtx> {
    zzdrv(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zzak(Object obj) throws GeneralSecurityException {
        zzdtx zzdtx = (zzdtx) obj;
        zzdtv zzaye = zzdtx.zzaxy().zzaye();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdtx.zzavr().toByteArray(), "HMAC");
        int zzavw = zzdtx.zzaxy().zzavw();
        int i = zzdrx.zzhgc[zzaye.ordinal()];
        if (i == 1) {
            return new zzdwo("HMACSHA1", secretKeySpec, zzavw);
        }
        if (i == 2) {
            return new zzdwo("HMACSHA256", secretKeySpec, zzavw);
        }
        if (i == 3) {
            return new zzdwo("HMACSHA512", secretKeySpec, zzavw);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}

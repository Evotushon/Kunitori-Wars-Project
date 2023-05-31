package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvv implements zzdpc {
    private static final byte[] zzhfn = new byte[0];
    private final String zzhlu;
    private final byte[] zzhlv;
    private final zzdwd zzhlw;
    private final zzdvs zzhlx;
    private final ECPrivateKey zzhly;
    private final zzdvx zzhlz;

    public zzdvv(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzdwd zzdwd, zzdvs zzdvs) throws GeneralSecurityException {
        this.zzhly = eCPrivateKey;
        this.zzhlz = new zzdvx(eCPrivateKey);
        this.zzhlv = bArr;
        this.zzhlu = str;
        this.zzhlw = zzdwd;
        this.zzhlx = zzdvs;
    }
}

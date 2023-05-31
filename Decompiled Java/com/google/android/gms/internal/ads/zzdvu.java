package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdvu implements zzdpf {
    private static final byte[] zzhfn = new byte[0];
    private final zzdvw zzhlt;
    private final String zzhlu;
    private final byte[] zzhlv;
    private final zzdwd zzhlw;
    private final zzdvs zzhlx;

    public zzdvu(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdwd zzdwd, zzdvs zzdvs) throws GeneralSecurityException {
        zzdvy.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzhlt = new zzdvw(eCPublicKey);
        this.zzhlv = bArr;
        this.zzhlu = str;
        this.zzhlw = zzdwd;
        this.zzhlx = zzdvs;
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzdvz zza = this.zzhlt.zza(this.zzhlu, this.zzhlv, bArr2, this.zzhlx.zzavq(), this.zzhlw);
        byte[] zzc = this.zzhlx.zzm(zza.zzbad()).zzc(bArr, zzhfn);
        byte[] zzbac = zza.zzbac();
        return ByteBuffer.allocate(zzbac.length + zzc.length).put(zzbac).put(zzc).array();
    }
}

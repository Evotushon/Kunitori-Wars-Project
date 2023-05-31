package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdrh {
    @Deprecated
    public static final zzdva zzhfe = zzdva.zzazu();
    @Deprecated
    private static final zzdva zzhff = zzdva.zzazu();
    @Deprecated
    private static final zzdva zzhfg = zzdva.zzazu();
    private static final String zzhfu = new zzdrf().getKeyType();
    private static final String zzhfv = new zzdre().getKeyType();

    static {
        try {
            zzdqa.zzavp();
            zzdpu.zza(new zzdre(), new zzdrf(), true);
            zzdpu.zza(new zzdrj());
            zzdpu.zza(new zzdrk());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}

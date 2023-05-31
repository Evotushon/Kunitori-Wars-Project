package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdrw {
    @Deprecated
    private static final zzdva zzhfe;
    @Deprecated
    private static final zzdva zzhff;
    @Deprecated
    private static final zzdva zzhfg = zzhfe;
    private static final String zzhgf = new zzdrs().getKeyType();

    public static void zzavp() throws GeneralSecurityException {
        zzdpu.zza(new zzdrs(), true);
        zzdpu.zza(new zzdrr(), true);
        zzdpu.zza(new zzdrz());
    }

    static {
        zzdva zzazu = zzdva.zzazu();
        zzhfe = zzazu;
        zzhff = zzazu;
        try {
            zzavp();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdqa {
    public static final String zzhex = new zzdqe().getKeyType();
    public static final String zzhey = new zzdqo().getKeyType();
    private static final String zzhez = new zzdqj().getKeyType();
    private static final String zzhfa = new zzdqu().getKeyType();
    private static final String zzhfb = new zzdqy().getKeyType();
    private static final String zzhfc = new zzdqp().getKeyType();
    private static final String zzhfd = new zzdqz().getKeyType();
    @Deprecated
    private static final zzdva zzhfe;
    @Deprecated
    private static final zzdva zzhff;
    @Deprecated
    private static final zzdva zzhfg = zzhfe;

    public static void zzavp() throws GeneralSecurityException {
        zzdrw.zzavp();
        zzdpu.zza(new zzdqe(), true);
        zzdpu.zza(new zzdqj(), true);
        zzdpu.zza(new zzdqo(), true);
        zzdpu.zza(new zzdqp(), true);
        zzdpu.zza(new zzdqu(), true);
        zzdpu.zza(new zzdqy(), true);
        zzdpu.zza(new zzdqz(), true);
        zzdpu.zza(new zzdqd());
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

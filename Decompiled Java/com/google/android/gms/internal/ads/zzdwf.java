package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdwe;
import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdwf<T_WRAPPER extends zzdwe<T_ENGINE>, T_ENGINE> {
    private static final Logger logger = Logger.getLogger(zzdwf.class.getName());
    private static final List<Provider> zzhmq;
    public static final zzdwf<zzdwh, Cipher> zzhmr = new zzdwf<>(new zzdwh());
    public static final zzdwf<zzdwl, Mac> zzhms = new zzdwf<>(new zzdwl());
    private static final zzdwf<zzdwn, Signature> zzhmt = new zzdwf<>(new zzdwn());
    private static final zzdwf<zzdwk, MessageDigest> zzhmu = new zzdwf<>(new zzdwk());
    public static final zzdwf<zzdwg, KeyAgreement> zzhmv = new zzdwf<>(new zzdwg());
    public static final zzdwf<zzdwi, KeyPairGenerator> zzhmw = new zzdwf<>(new zzdwi());
    public static final zzdwf<zzdwj, KeyFactory> zzhmx = new zzdwf<>(new zzdwj());
    private T_WRAPPER zzhmy;
    private List<Provider> zzhmz = zzhmq;
    private boolean zzhna = true;

    private zzdwf(T_WRAPPER t_wrapper) {
        this.zzhmy = t_wrapper;
    }

    public final T_ENGINE zzhg(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider zza : this.zzhmz) {
            try {
                return this.zzhmy.zza(str, zza);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.zzhna) {
            return this.zzhmy.zza(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    static {
        if (zzdws.zzbag()) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    logger.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            zzhmq = arrayList;
        } else {
            zzhmq = new ArrayList();
        }
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdvn extends ThreadLocal<Cipher> {
    zzdvn() {
    }

    private static Cipher zzbaa() {
        try {
            return zzdwf.zzhmr.zzhg("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return zzbaa();
    }
}

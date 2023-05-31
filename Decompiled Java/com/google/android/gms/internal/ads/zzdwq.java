package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdwq {
    private static final ThreadLocal<SecureRandom> zzhnf = new zzdwt();

    /* access modifiers changed from: private */
    public static SecureRandom zzbae() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] zzey(int i) {
        byte[] bArr = new byte[i];
        zzhnf.get().nextBytes(bArr);
        return bArr;
    }
}

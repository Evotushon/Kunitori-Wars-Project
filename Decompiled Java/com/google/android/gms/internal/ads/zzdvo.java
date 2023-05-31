package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdvo extends zzdvr {
    zzdvo(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    public final int zzbab() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    public final int[] zzb(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            zzdvr.zza(iArr2, this.zzhlp);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length << 5)}));
    }
}

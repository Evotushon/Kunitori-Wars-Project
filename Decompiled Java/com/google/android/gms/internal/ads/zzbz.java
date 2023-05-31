package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public enum zzbz implements zzdzb {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4);
    
    private static final zzdze<zzbz> zzen = null;
    private final int value;

    public final int zzaf() {
        return this.value;
    }

    public static zzbz zzi(int i) {
        if (i == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i == 1) {
            return BITSLICER;
        }
        if (i == 2) {
            return TINK_HYBRID;
        }
        if (i == 3) {
            return UNENCRYPTED;
        }
        if (i != 4) {
            return null;
        }
        return DG;
    }

    public static zzdzd zzag() {
        return zzca.zzew;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    private zzbz(int i) {
        this.value = i;
    }

    static {
        zzen = new zzcb();
    }
}

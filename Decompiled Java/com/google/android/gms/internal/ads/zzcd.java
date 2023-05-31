package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public enum zzcd implements zzdzb {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    
    private static final zzdze<zzcd> zzen = null;
    private final int value;

    public final int zzaf() {
        return this.value;
    }

    public static zzcd zzj(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzdzd zzag() {
        return zzcf.zzew;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    private zzcd(int i) {
        this.value = i;
    }

    static {
        zzen = new zzcc();
    }
}

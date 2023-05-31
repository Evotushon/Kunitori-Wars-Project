package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public enum zztf implements zzdzb {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final zzdze<zztf> zzen = null;
    private final int value;

    public final int zzaf() {
        return this.value;
    }

    public static zztf zzbx(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static zzdzd zzag() {
        return zztg.zzew;
    }

    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    private zztf(int i) {
        this.value = i;
    }

    static {
        zzen = new zzte();
    }
}

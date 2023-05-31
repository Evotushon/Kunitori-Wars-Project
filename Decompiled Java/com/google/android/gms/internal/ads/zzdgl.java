package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdgl implements zzdgj {
    private final String zzcc;

    public zzdgl(String str) {
        this.zzcc = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdgl)) {
            return false;
        }
        return this.zzcc.equals(((zzdgl) obj).zzcc);
    }

    public final int hashCode() {
        return this.zzcc.hashCode();
    }

    public final String toString() {
        return this.zzcc;
    }
}

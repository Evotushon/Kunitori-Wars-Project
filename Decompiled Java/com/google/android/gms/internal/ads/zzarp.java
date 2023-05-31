package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzarp extends zzaru {
    private final String type;
    private final int zzdot;

    public zzarp(String str, int i) {
        this.type = str;
        this.zzdot = i;
    }

    public final String getType() {
        return this.type;
    }

    public final int getAmount() {
        return this.zzdot;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzarp)) {
            zzarp zzarp = (zzarp) obj;
            if (!Objects.equal(this.type, zzarp.type) || !Objects.equal(Integer.valueOf(this.zzdot), Integer.valueOf(zzarp.zzdot))) {
                return false;
            }
            return true;
        }
        return false;
    }
}

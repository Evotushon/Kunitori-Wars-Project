package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzna {
    public final int viewportHeight;
    public final int viewportWidth;
    public final String zzbdt;
    public final String zzbdu;
    public final boolean zzbdv;
    public final boolean zzbdw;
    public final int zzbdx;
    public final int zzbdy;
    public final int zzbdz;
    public final boolean zzbea;
    public final boolean zzbeb;
    public final boolean zzbec;

    public zzna() {
        this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private zzna(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.zzbdt = null;
        this.zzbdu = null;
        this.zzbdv = false;
        this.zzbdw = true;
        this.zzbdx = Integer.MAX_VALUE;
        this.zzbdy = Integer.MAX_VALUE;
        this.zzbdz = Integer.MAX_VALUE;
        this.zzbea = true;
        this.zzbeb = true;
        this.viewportWidth = Integer.MAX_VALUE;
        this.viewportHeight = Integer.MAX_VALUE;
        this.zzbec = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzna zzna = (zzna) obj;
            return this.zzbdw == zzna.zzbdw && this.zzbdx == zzna.zzbdx && this.zzbdy == zzna.zzbdy && this.zzbea == zzna.zzbea && this.zzbeb == zzna.zzbeb && this.zzbec == zzna.zzbec && this.viewportWidth == zzna.viewportWidth && this.viewportHeight == zzna.viewportHeight && this.zzbdz == zzna.zzbdz && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.zzbdw ? 1 : 0)) * 31) + this.zzbdx) * 31) + this.zzbdy) * 31) + this.zzbdz) * 31) + (this.zzbea ? 1 : 0)) * 31) + (this.zzbeb ? 1 : 0)) * 31) + (this.zzbec ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight;
    }
}

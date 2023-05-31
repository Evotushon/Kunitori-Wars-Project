package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdyz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeay implements zzeaf {
    private final int flags;
    private final String info;
    private final Object[] zzhvg;
    private final zzeah zzhvj;

    zzeay(zzeah zzeah, String str, Object[] objArr) {
        this.zzhvj = zzeah;
        this.info = str;
        this.zzhvg = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.flags = c | (charAt2 << i);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzben() {
        return this.info;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzbeo() {
        return this.zzhvg;
    }

    public final zzeah zzbee() {
        return this.zzhvj;
    }

    public final int zzbec() {
        return (this.flags & 1) == 1 ? zzdyz.zzf.zzhtk : zzdyz.zzf.zzhtl;
    }

    public final boolean zzbed() {
        return (this.flags & 2) == 2;
    }
}

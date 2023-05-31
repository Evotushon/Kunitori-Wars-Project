package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbxi implements zzbng<zzbnl> {
    private final zzbzg zzfge;
    private final Map<String, zzcly<zzbnl>> zzfhz;
    private final Map<String, zzcly<zzbyo>> zzfmo;
    private final Map<String, zzcoe<zzbyo>> zzfmp;
    private final zzeew<zzbng<zzblg>> zzfmq;

    zzbxi(Map<String, zzcly<zzbnl>> map, Map<String, zzcly<zzbyo>> map2, Map<String, zzcoe<zzbyo>> map3, zzeew<zzbng<zzblg>> zzeew, zzbzg zzbzg) {
        this.zzfhz = map;
        this.zzfmo = map2;
        this.zzfmp = map3;
        this.zzfmq = zzeew;
        this.zzfge = zzbzg;
    }

    @Nullable
    public final zzcly<zzbnl> zzd(int i, String str) {
        zzcly zzd;
        zzcly<zzbnl> zzcly = this.zzfhz.get(str);
        if (zzcly != null) {
            return zzcly;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzcoe zzcoe = this.zzfmp.get(str);
            if (zzcoe != null) {
                return zzbnl.zza((zzcoe<? extends zzbnf>) zzcoe);
            }
            zzcly zzcly2 = this.zzfmo.get(str);
            if (zzcly2 != null) {
                return zzbnl.zza((zzcly<? extends zzbnf>) zzcly2);
            }
            return null;
        } else if (this.zzfge.zzakw() == null || (zzd = this.zzfmq.get().zzd(i, str)) == null) {
            return null;
        } else {
            return zzbnl.zza((zzcly<? extends zzbnf>) zzd);
        }
    }
}

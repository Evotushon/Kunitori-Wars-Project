package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdmg extends zzdlr<Map.Entry<K, V>> {
    private final /* synthetic */ zzdmd zzhaw;

    zzdmg(zzdmd zzdmd) {
        this.zzhaw = zzdmd;
    }

    public final boolean zzaub() {
        return true;
    }

    public final int size() {
        return this.zzhaw.size;
    }

    public final /* synthetic */ Object get(int i) {
        zzdlg.zzs(i, this.zzhaw.size);
        Object[] zzb = this.zzhaw.zzhas;
        int i2 = i * 2;
        zzdmd zzdmd = this.zzhaw;
        Object obj = zzb[i2];
        Object[] zzb2 = zzdmd.zzhas;
        zzdmd zzdmd2 = this.zzhaw;
        return new AbstractMap.SimpleImmutableEntry(obj, zzb2[i2 + 1]);
    }
}

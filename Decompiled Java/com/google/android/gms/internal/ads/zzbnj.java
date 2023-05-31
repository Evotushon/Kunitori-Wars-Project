package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnj<AdT> implements zzbng<AdT> {
    private final Map<String, zzcly<AdT>> zzfhz;

    zzbnj(Map<String, zzcly<AdT>> map) {
        this.zzfhz = map;
    }

    @Nullable
    public final zzcly<AdT> zzd(int i, String str) {
        return this.zzfhz.get(str);
    }
}

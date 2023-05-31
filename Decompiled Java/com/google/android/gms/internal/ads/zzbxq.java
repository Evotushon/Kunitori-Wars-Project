package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxq implements zzeej<Set<String>> {
    private final zzeew<zzbzg> zzfgl;

    public zzbxq(zzeew<zzbzg> zzeew) {
        this.zzfgl = zzeew;
    }

    public static Set<String> zza(zzbzg zzbzg) {
        Set set;
        if (zzbzg.zzakw() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        return (Set) zzeep.zza(set, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfgl.get());
    }
}

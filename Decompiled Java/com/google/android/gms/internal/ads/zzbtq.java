package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbtq implements zzeej<Set<zzbuv<zzp>>> {
    private final zzbtl zzflk;

    private zzbtq(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbtq zzh(zzbtl zzbtl) {
        return new zzbtq(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

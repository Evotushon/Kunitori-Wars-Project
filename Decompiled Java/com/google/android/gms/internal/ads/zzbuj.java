package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbuj implements zzeej<Set<zzbuv<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbtl zzflk;

    private zzbuj(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbuj zzz(zzbtl zzbtl) {
        return new zzbuj(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

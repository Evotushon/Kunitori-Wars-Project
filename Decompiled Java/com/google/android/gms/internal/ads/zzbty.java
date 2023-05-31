package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbty implements zzeej<Set<zzbuv<AdMetadataListener>>> {
    private final zzbtl zzflk;

    private zzbty(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbty zzp(zzbtl zzbtl) {
        return new zzbty(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzail(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

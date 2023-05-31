package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbrs implements zzeej<zzbrq> {
    private final zzeew<Set<zzbuv<AdMetadataListener>>> zzfgs;

    private zzbrs(zzeew<Set<zzbuv<AdMetadataListener>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbrs zzl(zzeew<Set<zzbuv<AdMetadataListener>>> zzeew) {
        return new zzbrs(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbrq(this.zzfgs.get());
    }
}

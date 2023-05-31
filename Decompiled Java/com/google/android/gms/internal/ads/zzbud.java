package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbud implements zzeej<Set<zzbuv<AppEventListener>>> {
    private final zzbtl zzflk;

    private zzbud(zzbtl zzbtl) {
        this.zzflk = zzbtl;
    }

    public static zzbud zzv(zzbtl zzbtl) {
        return new zzbud(zzbtl);
    }

    public final /* synthetic */ Object get() {
        return (Set) zzeep.zza(this.zzflk.zzaim(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

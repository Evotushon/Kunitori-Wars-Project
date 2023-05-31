package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbta implements zzeej<zzbsy> {
    private final zzeew<Set<zzbuv<AppEventListener>>> zzfgs;

    private zzbta(zzeew<Set<zzbuv<AppEventListener>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbta zzq(zzeew<Set<zzbuv<AppEventListener>>> zzeew) {
        return new zzbta(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbsy(this.zzfgs.get());
    }
}

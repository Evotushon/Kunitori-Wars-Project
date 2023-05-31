package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbvq implements zzeej<zzbvk> {
    private final zzeew<Set<zzbuv<VideoController.VideoLifecycleCallbacks>>> zzfgs;

    private zzbvq(zzeew<Set<zzbuv<VideoController.VideoLifecycleCallbacks>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbvq zzu(zzeew<Set<zzbuv<VideoController.VideoLifecycleCallbacks>>> zzeew) {
        return new zzbvq(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbvk(this.zzfgs.get());
    }
}

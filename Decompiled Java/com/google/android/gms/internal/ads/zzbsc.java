package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbsc implements zzeej<zzbrv> {
    private final zzeew<Set<zzbuv<zzp>>> zzfgs;

    private zzbsc(zzeew<Set<zzbuv<zzp>>> zzeew) {
        this.zzfgs = zzeew;
    }

    public static zzbsc zzn(zzeew<Set<zzbuv<zzp>>> zzeew) {
        return new zzbsc(zzeew);
    }

    public final /* synthetic */ Object get() {
        return new zzbrv(this.zzfgs.get());
    }
}

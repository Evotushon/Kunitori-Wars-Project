package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpu;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdpx implements zzdpu.zza {
    private final /* synthetic */ zzdpe zzhet;

    zzdpx(zzdpe zzdpe) {
        this.zzhet = zzdpe;
    }

    public final Class<?> zzavo() {
        return null;
    }

    public final <Q> zzdpe<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (this.zzhet.zzauy().equals(cls)) {
            return this.zzhet;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final zzdpe<?> zzavm() {
        return this.zzhet;
    }

    public final Class<?> zzavn() {
        return this.zzhet.getClass();
    }

    public final Set<Class<?>> zzavd() {
        return Collections.singleton(this.zzhet.zzauy());
    }
}

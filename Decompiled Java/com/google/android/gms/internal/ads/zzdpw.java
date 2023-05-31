package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpu;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdpw implements zzdpu.zza {
    private final /* synthetic */ zzdpj zzhes;

    zzdpw(zzdpj zzdpj) {
        this.zzhes = zzdpj;
    }

    public final Class<?> zzavo() {
        return null;
    }

    public final <Q> zzdpe<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdph(this.zzhes, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzdpe<?> zzavm() {
        zzdpj zzdpj = this.zzhes;
        return new zzdph(zzdpj, zzdpj.zzave());
    }

    public final Class<?> zzavn() {
        return this.zzhes.getClass();
    }

    public final Set<Class<?>> zzavd() {
        return this.zzhes.zzavd();
    }
}

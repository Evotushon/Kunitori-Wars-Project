package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdpu;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdpz implements zzdpu.zza {
    private final /* synthetic */ zzdpv zzhev;
    private final /* synthetic */ zzdpj zzhew;

    zzdpz(zzdpv zzdpv, zzdpj zzdpj) {
        this.zzhev = zzdpv;
        this.zzhew = zzdpj;
    }

    public final <Q> zzdpe<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdps(this.zzhev, this.zzhew, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzdpe<?> zzavm() {
        zzdpv zzdpv = this.zzhev;
        return new zzdps(zzdpv, this.zzhew, zzdpv.zzave());
    }

    public final Class<?> zzavn() {
        return this.zzhev.getClass();
    }

    public final Set<Class<?>> zzavd() {
        return this.zzhev.zzavd();
    }

    public final Class<?> zzavo() {
        return this.zzhew.getClass();
    }
}

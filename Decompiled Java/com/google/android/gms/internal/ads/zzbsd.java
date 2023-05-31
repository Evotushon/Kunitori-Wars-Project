package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbsd implements zzeej<zzbsb> {
    private final zzeew<zzdei> zzfeb;
    private final zzeew<Set<zzbuv<zzbsg>>> zzfgs;

    private zzbsd(zzeew<Set<zzbuv<zzbsg>>> zzeew, zzeew<zzdei> zzeew2) {
        this.zzfgs = zzeew;
        this.zzfeb = zzeew2;
    }

    public static zzbsd zzm(zzeew<Set<zzbuv<zzbsg>>> zzeew, zzeew<zzdei> zzeew2) {
        return new zzbsd(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzbsb(this.zzfgs.get(), this.zzfeb.get());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdip implements zzeej<zzakk> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazo> zzfkh;
    private final zzdiq zzgwe;

    public zzdip(zzdiq zzdiq, zzeew<Context> zzeew, zzeew<zzazo> zzeew2) {
        this.zzgwe = zzdiq;
        this.zzelc = zzeew;
        this.zzfkh = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzakk) zzeep.zza(new zzakf().zzb(this.zzelc.get(), this.zzfkh.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

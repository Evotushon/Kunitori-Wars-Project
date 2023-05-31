package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbom implements zzeej<zzavq> {
    private final zzeew<zzawc> zzeqr;
    private final zzeew<Clock> zzfex;
    private final zzeew<zzdeu> zzfgu;

    private zzbom(zzeew<Clock> zzeew, zzeew<zzawc> zzeew2, zzeew<zzdeu> zzeew3) {
        this.zzfex = zzeew;
        this.zzeqr = zzeew2;
        this.zzfgu = zzeew3;
    }

    public static zzbom zzg(zzeew<Clock> zzeew, zzeew<zzawc> zzeew2, zzeew<zzdeu> zzeew3) {
        return new zzbom(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return (zzavq) zzeep.zza(this.zzeqr.get().zza(this.zzfex.get(), this.zzfgu.get().zzgqr), "Cannot return null from a non-@Nullable @Provides method");
    }
}

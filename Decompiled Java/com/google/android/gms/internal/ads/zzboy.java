package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzboy implements zzeej<zzbuv<zzp>> {
    private final zzeew<zzbnz> zzffv;
    private final zzboz zzfji;

    private zzboy(zzboz zzboz, zzeew<zzbnz> zzeew) {
        this.zzfji = zzboz;
        this.zzffv = zzeew;
    }

    public static zzboy zza(zzboz zzboz, zzeew<zzbnz> zzeew) {
        return new zzboy(zzboz, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (zzbuv) zzeep.zza(new zzbuv(this.zzffv.get(), zzazq.zzdxp), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvi implements zzeej<zzcvg<zzcux>> {
    private final zzeew<Clock> zzfex;
    private final zzeew<zzcva> zzgja;

    public zzcvi(zzeew<zzcva> zzeew, zzeew<Clock> zzeew2) {
        this.zzgja = zzeew;
        this.zzfex = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzcvg) zzeep.zza(new zzcvg(this.zzgja.get(), 10000, this.zzfex.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

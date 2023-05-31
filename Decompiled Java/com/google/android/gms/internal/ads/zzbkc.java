package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbkc implements zzeej<zzbkb> {
    private final zzeew<zzakt> zzfet;
    private final zzeew<zzbjz> zzfeu;
    private final zzeew<Executor> zzfev;
    private final zzeew<zzbjs> zzfew;
    private final zzeew<Clock> zzfex;

    private zzbkc(zzeew<zzakt> zzeew, zzeew<zzbjz> zzeew2, zzeew<Executor> zzeew3, zzeew<zzbjs> zzeew4, zzeew<Clock> zzeew5) {
        this.zzfet = zzeew;
        this.zzfeu = zzeew2;
        this.zzfev = zzeew3;
        this.zzfew = zzeew4;
        this.zzfex = zzeew5;
    }

    public static zzbkc zza(zzeew<zzakt> zzeew, zzeew<zzbjz> zzeew2, zzeew<Executor> zzeew3, zzeew<zzbjs> zzeew4, zzeew<Clock> zzeew5) {
        return new zzbkc(zzeew, zzeew2, zzeew3, zzeew4, zzeew5);
    }

    public final /* synthetic */ Object get() {
        return new zzbkb(this.zzfet.get(), this.zzfeu.get(), this.zzfev.get(), this.zzfew.get(), this.zzfex.get());
    }
}

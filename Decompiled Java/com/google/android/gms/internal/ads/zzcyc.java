package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyc implements zzeej<zzcxv> {
    private final zzeew<zzdoe> zzfev;
    private final zzeew<Context> zzfjj;

    private zzcyc(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2) {
        this.zzfev = zzeew;
        this.zzfjj = zzeew2;
    }

    public static zzcyc zzaz(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2) {
        return new zzcyc(zzeew, zzeew2);
    }

    public static zzcxv zza(zzdoe zzdoe, Context context) {
        return new zzcxv(zzdoe, context);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfev.get(), this.zzfjj.get());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvn implements zzeej<zzcvj> {
    private final zzeew<zzdoe> zzfev;
    private final zzeew<Context> zzfjj;

    private zzcvn(zzeew<Context> zzeew, zzeew<zzdoe> zzeew2) {
        this.zzfjj = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzcvn zzat(zzeew<Context> zzeew, zzeew<zzdoe> zzeew2) {
        return new zzcvn(zzeew, zzeew2);
    }

    public static zzcvj zza(Context context, zzdoe zzdoe) {
        return new zzcvj(context, zzdoe);
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzfjj.get(), this.zzfev.get());
    }
}

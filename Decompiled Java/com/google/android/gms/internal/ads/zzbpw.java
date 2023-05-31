package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpw implements zzeej<Context> {
    private final zzeew<Context> zzfjj;
    private final zzbpt zzfkc;

    private zzbpw(zzbpt zzbpt, zzeew<Context> zzeew) {
        this.zzfkc = zzbpt;
        this.zzfjj = zzeew;
    }

    public static zzbpw zza(zzbpt zzbpt, zzeew<Context> zzeew) {
        return new zzbpw(zzbpt, zzeew);
    }

    public final /* synthetic */ Object get() {
        return (Context) zzeep.zza(this.zzfkc.zzcb(this.zzfjj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

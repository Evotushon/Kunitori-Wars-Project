package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbyi implements zzeej<zzbuu> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdei> zzfhn;

    public zzbyi(zzeew<Context> zzeew, zzeew<zzdei> zzeew2) {
        this.zzelc = zzeew;
        this.zzfhn = zzeew2;
    }

    public final /* synthetic */ Object get() {
        return (zzbuu) zzeep.zza(new zzbuu(this.zzelc.get(), new HashSet(), this.zzfhn.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

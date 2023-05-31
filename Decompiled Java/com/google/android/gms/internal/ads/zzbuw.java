package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbuw implements zzeej<zzbuu> {
    private final zzeew<Context> zzelc;
    private final zzeew<Set<zzbuv<zzpt>>> zzfgs;
    private final zzeew<zzdei> zzfhn;

    private zzbuw(zzeew<Context> zzeew, zzeew<Set<zzbuv<zzpt>>> zzeew2, zzeew<zzdei> zzeew3) {
        this.zzelc = zzeew;
        this.zzfgs = zzeew2;
        this.zzfhn = zzeew3;
    }

    public static zzbuw zzi(zzeew<Context> zzeew, zzeew<Set<zzbuv<zzpt>>> zzeew2, zzeew<zzdei> zzeew3) {
        return new zzbuw(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzbuu(this.zzelc.get(), this.zzfgs.get(), this.zzfhn.get());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpn implements zzeej<zzbpk> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdei> zzfhn;
    private final zzeew<zzapm> zzfjq;

    private zzbpn(zzeew<Context> zzeew, zzeew<zzdei> zzeew2, zzeew<zzapm> zzeew3) {
        this.zzelc = zzeew;
        this.zzfhn = zzeew2;
        this.zzfjq = zzeew3;
    }

    public static zzbpn zzh(zzeew<Context> zzeew, zzeew<zzdei> zzeew2, zzeew<zzapm> zzeew3) {
        return new zzbpn(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzbpk(this.zzelc.get(), this.zzfhn.get(), this.zzfjq.get());
    }
}

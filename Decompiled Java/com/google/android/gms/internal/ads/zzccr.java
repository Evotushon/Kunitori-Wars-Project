package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccr implements zzeej<zzccp> {
    private final zzeew<zzbzv> zzeqa;
    private final zzeew<Context> zzfjj;
    private final zzeew<zzbyz> zzfnw;
    private final zzeew<zzbyo> zzfte;

    private zzccr(zzeew<Context> zzeew, zzeew<zzbyz> zzeew2, zzeew<zzbzv> zzeew3, zzeew<zzbyo> zzeew4) {
        this.zzfjj = zzeew;
        this.zzfnw = zzeew2;
        this.zzeqa = zzeew3;
        this.zzfte = zzeew4;
    }

    public static zzccr zzb(zzeew<Context> zzeew, zzeew<zzbyz> zzeew2, zzeew<zzbzv> zzeew3, zzeew<zzbyo> zzeew4) {
        return new zzccr(zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        return new zzccp(this.zzfjj.get(), this.zzfnw.get(), this.zzeqa.get(), this.zzfte.get());
    }
}

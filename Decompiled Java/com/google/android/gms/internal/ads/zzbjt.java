package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjt implements zzeej<zzbjq> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdis> zzeuf;
    private final zzeew<zzdeq> zzfea;
    private final zzeew<zzdei> zzfeb;
    private final zzeew<View> zzfec;
    private final zzeew<zzdq> zzfed;

    private zzbjt(zzeew<Context> zzeew, zzeew<zzdeq> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzdis> zzeew4, zzeew<View> zzeew5, zzeew<zzdq> zzeew6) {
        this.zzelc = zzeew;
        this.zzfea = zzeew2;
        this.zzfeb = zzeew3;
        this.zzeuf = zzeew4;
        this.zzfec = zzeew5;
        this.zzfed = zzeew6;
    }

    public static zzbjt zza(zzeew<Context> zzeew, zzeew<zzdeq> zzeew2, zzeew<zzdei> zzeew3, zzeew<zzdis> zzeew4, zzeew<View> zzeew5, zzeew<zzdq> zzeew6) {
        return new zzbjt(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6);
    }

    public final /* synthetic */ Object get() {
        return new zzbjq(this.zzelc.get(), this.zzfea.get(), this.zzfeb.get(), this.zzeuf.get(), this.zzfec.get(), this.zzfed.get());
    }
}

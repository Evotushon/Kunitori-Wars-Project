package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctn implements zzeej<zzctl> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<ViewGroup> zzgda;
    private final zzeew<zzdoe> zzght;

    public zzctn(zzeew<zzdoe> zzeew, zzeew<Context> zzeew2, zzeew<zzdeu> zzeew3, zzeew<ViewGroup> zzeew4) {
        this.zzght = zzeew;
        this.zzelc = zzeew2;
        this.zzfgu = zzeew3;
        this.zzgda = zzeew4;
    }

    public final /* synthetic */ Object get() {
        return new zzctl(this.zzght.get(), this.zzelc.get(), this.zzfgu.get(), this.zzgda.get());
    }
}

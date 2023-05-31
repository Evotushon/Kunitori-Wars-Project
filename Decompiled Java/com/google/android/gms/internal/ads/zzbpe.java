package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbpe implements zzeej<zzbpf> {
    private final zzeew<zzcho> zzelw;
    private final zzeew<zzawh> zzerc;
    private final zzeew<zzazo> zzffi;
    private final zzeew<zzdeu> zzfgu;
    private final zzeew<Context> zzfjj;

    private zzbpe(zzeew<Context> zzeew, zzeew<zzdeu> zzeew2, zzeew<zzazo> zzeew3, zzeew<zzawh> zzeew4, zzeew<zzcho> zzeew5) {
        this.zzfjj = zzeew;
        this.zzfgu = zzeew2;
        this.zzffi = zzeew3;
        this.zzerc = zzeew4;
        this.zzelw = zzeew5;
    }

    public static zzbpe zzb(zzeew<Context> zzeew, zzeew<zzdeu> zzeew2, zzeew<zzazo> zzeew3, zzeew<zzawh> zzeew4, zzeew<zzcho> zzeew5) {
        return new zzbpe(zzeew, zzeew2, zzeew3, zzeew4, zzeew5);
    }

    public final /* synthetic */ Object get() {
        return new zzbpf(this.zzfjj.get(), this.zzfgu.get(), this.zzffi.get(), this.zzerc.get(), this.zzelw.get());
    }
}

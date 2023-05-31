package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxj implements zzeej<zzbxg> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzaui> zzfdd;
    private final zzeew<View> zzfec;
    private final zzeew<Integer> zzffj;
    private final zzeew<zzauf> zzfht;

    private zzbxj(zzeew<zzauf> zzeew, zzeew<Context> zzeew2, zzeew<zzaui> zzeew3, zzeew<View> zzeew4, zzeew<Integer> zzeew5) {
        this.zzfht = zzeew;
        this.zzelc = zzeew2;
        this.zzfdd = zzeew3;
        this.zzfec = zzeew4;
        this.zzffj = zzeew5;
    }

    public static zzbxj zzd(zzeew<zzauf> zzeew, zzeew<Context> zzeew2, zzeew<zzaui> zzeew3, zzeew<View> zzeew4, zzeew<Integer> zzeew5) {
        return new zzbxj(zzeew, zzeew2, zzeew3, zzeew4, zzeew5);
    }

    public final /* synthetic */ Object get() {
        return new zzbxg(this.zzfht.get(), this.zzelc.get(), this.zzfdd.get(), this.zzfec.get(), this.zzffj.get().intValue());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcop implements zzeej<zzcom> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzbxo> zzgbg;

    public zzcop(zzeew<Context> zzeew, zzeew<zzbxo> zzeew2, zzeew<Executor> zzeew3) {
        this.zzelc = zzeew;
        this.zzgbg = zzeew2;
        this.zzfgm = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return new zzcom(this.zzelc.get(), this.zzgbg.get(), this.zzfgm.get());
    }
}

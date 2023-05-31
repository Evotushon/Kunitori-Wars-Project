package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzckx implements zzeej<zzckh> {
    private final zzeew<Context> zzelc;
    private final zzeew<Executor> zzfgm;
    private final zzeew<zzaro> zzfzn;
    private final zzeew<zzbjh> zzfzo;
    private final zzeew<zzarl> zzfzp;
    private final zzeew<HashMap<String, zzcks>> zzfzq;

    private zzckx(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzaro> zzeew3, zzeew<zzbjh> zzeew4, zzeew<zzarl> zzeew5, zzeew<HashMap<String, zzcks>> zzeew6) {
        this.zzelc = zzeew;
        this.zzfgm = zzeew2;
        this.zzfzn = zzeew3;
        this.zzfzo = zzeew4;
        this.zzfzp = zzeew5;
        this.zzfzq = zzeew6;
    }

    public static zzckx zzc(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzaro> zzeew3, zzeew<zzbjh> zzeew4, zzeew<zzarl> zzeew5, zzeew<HashMap<String, zzcks>> zzeew6) {
        return new zzckx(zzeew, zzeew2, zzeew3, zzeew4, zzeew5, zzeew6);
    }

    public final /* synthetic */ Object get() {
        return new zzckh(this.zzelc.get(), this.zzfgm.get(), this.zzfzn.get(), this.zzfzo.get(), this.zzfzp.get(), this.zzfzq.get());
    }
}

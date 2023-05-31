package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgz implements zzeej<zzcgx> {
    private final zzeew<Context> zzelc;
    private final zzeew<zzazl> zzeuf;
    private final zzeew<Executor> zzfev;

    public zzcgz(zzeew<Executor> zzeew, zzeew<zzazl> zzeew2, zzeew<Context> zzeew3) {
        this.zzfev = zzeew;
        this.zzeuf = zzeew2;
        this.zzelc = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return new zzcgx(this.zzfev.get(), this.zzeuf.get(), this.zzelc.get());
    }
}

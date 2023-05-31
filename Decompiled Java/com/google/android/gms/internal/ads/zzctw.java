package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctw implements zzeej<zzctr> {
    private final zzeew<Executor> zzfev;
    private final zzeew<zzdof<String>> zzghy;

    private zzctw(zzeew<zzdof<String>> zzeew, zzeew<Executor> zzeew2) {
        this.zzghy = zzeew;
        this.zzfev = zzeew2;
    }

    public static zzctw zzap(zzeew<zzdof<String>> zzeew, zzeew<Executor> zzeew2) {
        return new zzctw(zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return new zzctr(this.zzghy.get(), this.zzfev.get());
    }
}

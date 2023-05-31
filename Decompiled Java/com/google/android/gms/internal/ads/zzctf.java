package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctf implements zzeej<zzdof<zzctj>> {
    private final zzeew<zzdif> zzfgx;
    private final zzeew<zzcti> zzghj;
    private final zzeew<zzbpm> zzghk;

    public zzctf(zzeew<zzdif> zzeew, zzeew<zzcti> zzeew2, zzeew<zzbpm> zzeew3) {
        this.zzfgx = zzeew;
        this.zzghj = zzeew2;
        this.zzghk = zzeew3;
    }

    public final /* synthetic */ Object get() {
        return (zzdof) zzeep.zza(this.zzfgx.get().zza(zzdig.GENERATE_SIGNALS, this.zzghk.get().zzaht()).zza(this.zzghj.get()).zza((long) ((Integer) zzvh.zzpd().zzd(zzzx.zzcpu)).intValue(), TimeUnit.SECONDS).zzata(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

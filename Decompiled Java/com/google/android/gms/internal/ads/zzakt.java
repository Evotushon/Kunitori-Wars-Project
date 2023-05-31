package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzakt {
    private zzaja zzdch;
    private zzdof<zzajy> zzdci;

    zzakt(zzaja zzaja) {
        this.zzdch = zzaja;
    }

    private final void zzsn() {
        if (this.zzdci == null) {
            zzazy zzazy = new zzazy();
            this.zzdci = zzazy;
            this.zzdch.zzb((zzdq) null).zza(new zzaks(zzazy), new zzakv(zzazy));
        }
    }

    public final <I, O> zzakw<I, O> zzb(String str, zzakh<I> zzakh, zzake<O> zzake) {
        zzsn();
        return new zzakw<>(this.zzdci, str, zzakh, zzake);
    }

    public final void zzc(String str, zzafz<? super zzajy> zzafz) {
        zzsn();
        this.zzdci = zzdnt.zzb(this.zzdci, new zzaku(str, zzafz), (Executor) zzazq.zzdxp);
    }

    public final void zzd(String str, zzafz<? super zzajy> zzafz) {
        this.zzdci = zzdnt.zzb(this.zzdci, new zzakx(str, zzafz), (Executor) zzazq.zzdxp);
    }
}

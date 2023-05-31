package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbnl {
    public final List<? extends zzdof<? extends zzbnf>> zzfia;

    public zzbnl(List<? extends zzdof<? extends zzbnf>> list) {
        this.zzfia = list;
    }

    public zzbnl(zzbnf zzbnf) {
        this.zzfia = Collections.singletonList(zzdnt.zzaj(zzbnf));
    }

    public static zzcly<zzbnl> zza(@NonNull zzcoe<? extends zzbnf> zzcoe) {
        return new zzcmb(zzcoe, zzbnk.zzdpv);
    }

    public static zzcly<zzbnl> zza(@NonNull zzcly<? extends zzbnf> zzcly) {
        return new zzcmb(zzcly, zzbnn.zzdpv);
    }
}

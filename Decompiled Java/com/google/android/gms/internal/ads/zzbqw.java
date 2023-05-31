package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbqw extends zzbtk<zzbqt> {
    public zzbqw(Set<zzbuv<zzbqt>> set) {
        super(set);
    }

    public final void zzby(Context context) {
        zza(new zzbqv(context));
    }

    public final void zzbz(Context context) {
        zza(new zzbqy(context));
    }

    public final void zzca(Context context) {
        zza(new zzbqx(context));
    }

    public final void zza(zzbvl zzbvl, Executor executor) {
        zza(zzbuv.zzb(new zzbra(this, zzbvl), executor));
    }
}

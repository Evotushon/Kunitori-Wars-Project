package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzakk {
    @VisibleForTesting
    private static final zzaxu<zzair> zzdbw = new zzakn();
    @VisibleForTesting
    private static final zzaxu<zzair> zzdbx = new zzakm();
    private final zzaja zzdby;

    public zzakk(Context context, zzazo zzazo, String str) {
        this.zzdby = new zzaja(context, zzazo, str, zzdbw, zzdbx);
    }

    public final <I, O> zzakc<I, O> zza(String str, zzakh<I> zzakh, zzake<O> zzake) {
        return new zzakp(this.zzdby, str, zzakh, zzake);
    }

    public final zzakt zzsm() {
        return new zzakt(this.zzdby);
    }
}

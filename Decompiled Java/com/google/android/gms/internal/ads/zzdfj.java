package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfj implements zzavx, zzbqm {
    private final zzawc zzdrf;
    @GuardedBy("this")
    private final HashSet<zzavq> zzgrf = new HashSet<>();
    private final Context zzur;

    public zzdfj(Context context, zzawc zzawc) {
        this.zzur = context;
        this.zzdrf = zzawc;
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (i != 3) {
            this.zzdrf.zzb(this.zzgrf);
        }
    }

    public final synchronized void zza(HashSet<zzavq> hashSet) {
        this.zzgrf.clear();
        this.zzgrf.addAll(hashSet);
    }

    public final Bundle zzare() {
        return this.zzdrf.zza(this.zzur, (zzavx) this);
    }
}

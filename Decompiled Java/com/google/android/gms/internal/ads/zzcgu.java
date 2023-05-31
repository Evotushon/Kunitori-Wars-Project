package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgu implements zzeej<zzcgs> {
    private final zzeew<Clock> zzfex;
    private final zzeew<zzcgq> zzfvy;
    private final zzeew<Set<zzcgv>> zzfvz;

    private zzcgu(zzeew<zzcgq> zzeew, zzeew<Set<zzcgv>> zzeew2, zzeew<Clock> zzeew3) {
        this.zzfvy = zzeew;
        this.zzfvz = zzeew2;
        this.zzfex = zzeew3;
    }

    public static zzcgu zzm(zzeew<zzcgq> zzeew, zzeew<Set<zzcgv>> zzeew2, zzeew<Clock> zzeew3) {
        return new zzcgu(zzeew, zzeew2, zzeew3);
    }

    public final /* synthetic */ Object get() {
        return new zzcgs(this.zzfvy.get(), this.zzfvz.get(), this.zzfex.get());
    }
}

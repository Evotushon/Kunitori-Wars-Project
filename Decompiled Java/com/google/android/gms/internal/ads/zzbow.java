package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzc;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbow implements zzeej<zzc> {
    private final zzeew<Context> zzelc;
    private final zzbox zzfjg;
    private final zzeew<zzaub> zzfjh;

    private zzbow(zzbox zzbox, zzeew<Context> zzeew, zzeew<zzaub> zzeew2) {
        this.zzfjg = zzbox;
        this.zzelc = zzeew;
        this.zzfjh = zzeew2;
    }

    public static zzbow zza(zzbox zzbox, zzeew<Context> zzeew, zzeew<zzaub> zzeew2) {
        return new zzbow(zzbox, zzeew, zzeew2);
    }

    public final /* synthetic */ Object get() {
        return (zzc) zzeep.zza(new zzc(this.zzelc.get(), this.zzfjh.get(), (zzaqm) null), "Cannot return null from a non-@Nullable @Provides method");
    }
}

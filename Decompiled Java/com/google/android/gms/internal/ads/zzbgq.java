package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbgq implements zzeej<Context> {
    private final zzbgn zzeky;

    public zzbgq(zzbgn zzbgn) {
        this.zzeky = zzbgn;
    }

    public static Context zza(zzbgn zzbgn) {
        return (Context) zzeep.zza(zzbgn.zzacu(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zza(this.zzeky);
    }
}

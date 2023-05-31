package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbhb implements zzeej<zzarl> {
    private final zzeew<Context> zzelc;

    public zzbhb(zzeew<Context> zzeew) {
        this.zzelc = zzeew;
    }

    public final /* synthetic */ Object get() {
        Context context = this.zzelc.get();
        return (zzarl) zzeep.zza(new zzarj(context, new zzarq(context).zzue()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

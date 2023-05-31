package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzblr implements zzeej<View> {
    private final zzbln zzfgr;

    public zzblr(zzbln zzbln) {
        this.zzfgr = zzbln;
    }

    public static View zzb(zzbln zzbln) {
        return (View) zzeep.zza(zzbln.zzagm(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zzb(this.zzfgr);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbgp implements zzeej<WeakReference<Context>> {
    private final zzbgn zzeky;

    public zzbgp(zzbgn zzbgn) {
        this.zzeky = zzbgn;
    }

    public final /* synthetic */ Object get() {
        return (WeakReference) zzeep.zza(this.zzeky.zzacv(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

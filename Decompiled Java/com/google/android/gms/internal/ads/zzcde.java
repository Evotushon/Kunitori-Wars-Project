package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcde<T> implements zzafz<Object> {
    private final WeakReference<T> zzftu;
    private final String zzftv;
    private final zzafz<T> zzftw;
    private final /* synthetic */ zzccv zzftx;

    private zzcde(zzccv zzccv, WeakReference<T> weakReference, String str, zzafz<T> zzafz) {
        this.zzftx = zzccv;
        this.zzftu = weakReference;
        this.zzftv = str;
        this.zzftw = zzafz;
    }

    public final void zza(Object obj, Map<String, String> map) {
        Object obj2 = this.zzftu.get();
        if (obj2 == null) {
            this.zzftx.zzb(this.zzftv, this);
        } else {
            this.zzftw.zza(obj2, map);
        }
    }

    /* synthetic */ zzcde(zzccv zzccv, WeakReference weakReference, String str, zzafz zzafz, zzccw zzccw) {
        this(zzccv, weakReference, str, zzafz);
    }
}

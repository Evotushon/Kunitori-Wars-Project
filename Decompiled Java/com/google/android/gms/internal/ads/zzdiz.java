package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final /* synthetic */ class zzdiz implements Callable {
    private final Context zzcgz;

    zzdiz(Context context) {
        this.zzcgz = context;
    }

    public final Object call() {
        return new zzss(this.zzcgz, "GLAS", (String) null);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzauq implements zzauy {
    private final Context zzcgz;
    private final String zzczs;

    zzauq(Context context, String str) {
        this.zzcgz = context;
        this.zzczs = str;
    }

    public final void zza(zzbgd zzbgd) {
        Context context = this.zzcgz;
        zzbgd.zzb(ObjectWrapper.wrap(context), this.zzczs, context.getPackageName());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbbe extends zzbaw {
    @Nullable
    public final zzbat zza(Context context, zzbbm zzbbm, int i, boolean z, zzaak zzaak, zzbbj zzbbj) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        zzbbl zzbbl = new zzbbl(context, zzbbm.zzyw(), zzbbm.zzyu(), zzaak, zzbbm.zzyr());
        if (i == 2) {
            return new zzbbp(context, zzbbl, zzbbm, z, zzb(zzbbm), zzbbj);
        }
        return new zzbak(context, z, zzb(zzbbm), zzbbj, new zzbbl(context, zzbbm.zzyw(), zzbbm.zzyu(), zzaak, zzbbm.zzyr()));
    }
}

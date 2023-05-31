package com.google.android.gms.internal.play_billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzab extends zzu {
    final /* synthetic */ zzac zza;

    zzab(zzac zzac) {
        this.zza = zzac;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzm.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzac zzac = this.zza;
        int i2 = i + i;
        Object obj = zzac.zzb[i2];
        obj.getClass();
        Object obj2 = zzac.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}

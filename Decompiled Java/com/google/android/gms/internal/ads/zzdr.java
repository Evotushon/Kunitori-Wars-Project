package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdr extends zzdi {
    public static zzdr zza(String str, Context context, boolean z) {
        zza(context, z);
        return new zzdr(context, str, z);
    }

    private zzdr(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* access modifiers changed from: protected */
    public final List<Callable<Void>> zza(zzei zzei, Context context, zzbs.zza.zzb zzb, zzbo.zza zza) {
        if (zzei.zzcc() == null || !this.zzvl) {
            return super.zza(zzei, context, zzb, zza);
        }
        int zzbs = zzei.zzbs();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zza(zzei, context, zzb, zza));
        arrayList.add(new zzfe(zzei, "qx4UdLiOxO035Rp2Sp5jdcIn7SxRXj1uC6nLGnC0V5PATHCv48yXpp/CIYW6LCQ1", "u/LSytBgFghDSxQZ2K1QNXzwbiqofQ/7a2BjJIFkPKQ=", zzb, zzbs, 24));
        return arrayList;
    }
}

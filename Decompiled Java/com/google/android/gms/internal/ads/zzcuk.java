package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcuk implements zzcyb {
    private final ArrayList zzgie;

    zzcuk(ArrayList arrayList) {
        this.zzgie = arrayList;
    }

    public final void zzs(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.zzgie);
    }
}

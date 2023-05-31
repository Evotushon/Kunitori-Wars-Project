package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwt implements zzcyb<Bundle> {
    private final Bundle zzfjz;

    public zzcwt(Bundle bundle) {
        this.zzfjz = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.zzfjz;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}

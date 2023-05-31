package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcvo implements zzcyb<Bundle> {
    private final String zzdlj;
    private final String zzgjc;
    private final Bundle zzgjd;

    private zzcvo(String str, String str2, Bundle bundle) {
        this.zzdlj = str;
        this.zzgjc = str2;
        this.zzgjd = bundle;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.zzdlj);
        bundle.putString("fc_consent", this.zzgjc);
        bundle.putBundle("iab_consent_info", this.zzgjd);
    }
}

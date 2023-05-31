package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvu implements zzcyb<Bundle> {
    private final String zzdkt;
    private final boolean zzdkv;

    public zzcvu(String str, boolean z) {
        this.zzdkt = str;
        this.zzdkv = z;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.zzdkt);
        if (this.zzdkv) {
            bundle.putString("de", "1");
        }
    }
}

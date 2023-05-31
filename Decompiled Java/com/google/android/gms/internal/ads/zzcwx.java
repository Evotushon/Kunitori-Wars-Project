package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwx implements zzcyb<Bundle> {
    private String zzdkd;

    public zzcwx(String str) {
        this.zzdkd = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        ((Bundle) obj).putString("request_id", this.zzdkd);
    }
}

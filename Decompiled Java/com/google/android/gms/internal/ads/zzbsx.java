package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbsx implements zzbtm {
    private final String zzczs;
    private final String zzczz;

    zzbsx(String str, String str2) {
        this.zzczz = str;
        this.zzczs = str2;
    }

    public final void zzp(Object obj) {
        ((AppEventListener) obj).onAppEvent(this.zzczz, this.zzczs);
    }
}

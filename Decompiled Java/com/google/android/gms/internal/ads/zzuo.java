package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzuo extends zzwe {
    private final AppEventListener zzbkr;

    public zzuo(AppEventListener appEventListener) {
        this.zzbkr = appEventListener;
    }

    public final void onAppEvent(String str, String str2) {
        this.zzbkr.onAppEvent(str, str2);
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbkr;
    }
}

package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class Common {
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>("Common.API", zapx, CLIENT_KEY);
    @KeepForSdk
    public static final Api.ClientKey<zaj> CLIENT_KEY = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<zaj, Api.ApiOptions.NoOptions> zapx = new zab();
    public static final zad zapy = new zac();
}

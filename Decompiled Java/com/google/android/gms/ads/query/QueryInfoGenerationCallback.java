package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public interface QueryInfoGenerationCallback {
    @KeepForSdk
    void onFailure(String str);

    @KeepForSdk
    void onSuccess(QueryInfo queryInfo);
}

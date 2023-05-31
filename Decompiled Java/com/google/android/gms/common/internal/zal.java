package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zal implements PendingResultUtil.ResultConverter<R, T> {
    private final /* synthetic */ Response zapm;

    zal(Response response) {
        this.zapm = response;
    }

    public final /* synthetic */ Object convert(Result result) {
        this.zapm.setResult(result);
        return this.zapm;
    }
}

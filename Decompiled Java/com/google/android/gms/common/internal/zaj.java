package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaj implements PendingResultUtil.zaa {
    zaj() {
    }

    public final ApiException zaf(Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}

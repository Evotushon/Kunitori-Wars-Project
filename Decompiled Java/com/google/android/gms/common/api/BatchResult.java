package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class BatchResult implements Result {
    private final Status mStatus;
    private final PendingResult<?>[] zabf;

    BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.mStatus = status;
        this.zabf = pendingResultArr;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final <R extends Result> R take(BatchResultToken<R> batchResultToken) {
        Preconditions.checkArgument(batchResultToken.mId < this.zabf.length, "The result token does not belong to this batch");
        return this.zabf[batchResultToken.mId].await(0, TimeUnit.MILLISECONDS);
    }
}

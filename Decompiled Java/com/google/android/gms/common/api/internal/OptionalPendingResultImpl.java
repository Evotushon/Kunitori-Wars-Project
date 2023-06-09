package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {
    private final BasePendingResult<R> zaju;

    public OptionalPendingResultImpl(PendingResult<R> pendingResult) {
        this.zaju = (BasePendingResult) pendingResult;
    }

    public final boolean isDone() {
        return this.zaju.isReady();
    }

    public final R get() {
        if (isDone()) {
            return await(0, TimeUnit.MILLISECONDS);
        }
        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    public final R await() {
        return this.zaju.await();
    }

    public final R await(long j, TimeUnit timeUnit) {
        return this.zaju.await(j, timeUnit);
    }

    public final void cancel() {
        this.zaju.cancel();
    }

    public final boolean isCanceled() {
        return this.zaju.isCanceled();
    }

    public final void setResultCallback(ResultCallback<? super R> resultCallback) {
        this.zaju.setResultCallback(resultCallback);
    }

    public final void setResultCallback(ResultCallback<? super R> resultCallback, long j, TimeUnit timeUnit) {
        this.zaju.setResultCallback(resultCallback, j, timeUnit);
    }

    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        this.zaju.addStatusListener(statusListener);
    }

    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        return this.zaju.then(resultTransform);
    }

    public final Integer zal() {
        return this.zaju.zal();
    }
}

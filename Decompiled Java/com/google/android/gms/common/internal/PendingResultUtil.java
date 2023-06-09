package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class PendingResultUtil {
    private static final zaa zaph = new zaj();

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        T convert(R r);
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface zaa {
        ApiException zaf(Status status);
    }

    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zaa zaa2 = zaph;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.addStatusListener(new zai(pendingResult, taskCompletionSource, resultConverter, zaa2));
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(PendingResult<R> pendingResult, T t) {
        return toTask(pendingResult, new zal(t));
    }

    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(PendingResult<R> pendingResult) {
        return toTask(pendingResult, new zak());
    }
}

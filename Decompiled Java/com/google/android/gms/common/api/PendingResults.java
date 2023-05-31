package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class PendingResults {
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private static final class zac<R extends Result> extends BasePendingResult<R> {
        public zac(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* access modifiers changed from: protected */
        public final R createFailedResult(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private static final class zaa<R extends Result> extends BasePendingResult<R> {
        private final R zacm;

        public zaa(GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.zacm = r;
        }

        /* access modifiers changed from: protected */
        public final R createFailedResult(Status status) {
            return this.zacm;
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private static final class zab<R extends Result> extends BasePendingResult<R> {
        private final R zacn;

        public zab(R r) {
            super(Looper.getMainLooper());
            this.zacn = r;
        }

        /* access modifiers changed from: protected */
        public final R createFailedResult(Status status) {
            if (status.getStatusCode() == this.zacn.getStatus().getStatusCode()) {
                return this.zacn;
            }
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(R r, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r, "Result must not be null");
        Preconditions.checkArgument(!r.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zaa zaa2 = new zaa(googleApiClient, r);
        zaa2.setResult(r);
        return zaa2;
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r) {
        Preconditions.checkNotNull(r, "Result must not be null");
        zac zac2 = new zac((GoogleApiClient) null);
        zac2.setResult(r);
        return new OptionalPendingResultImpl(zac2);
    }

    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r, "Result must not be null");
        zac zac2 = new zac(googleApiClient);
        zac2.setResult(r);
        return new OptionalPendingResultImpl(zac2);
    }

    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r) {
        Preconditions.checkNotNull(r, "Result must not be null");
        Preconditions.checkArgument(r.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zab zab2 = new zab(r);
        zab2.cancel();
        return zab2;
    }

    @KeepForSdk
    private PendingResults() {
    }
}

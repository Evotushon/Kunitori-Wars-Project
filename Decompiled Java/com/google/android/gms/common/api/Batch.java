package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class Batch extends BasePendingResult<BatchResult> {
    /* access modifiers changed from: private */
    public final Object mLock;
    /* access modifiers changed from: private */
    public int zabc;
    /* access modifiers changed from: private */
    public boolean zabd;
    /* access modifiers changed from: private */
    public boolean zabe;
    /* access modifiers changed from: private */
    public final PendingResult<?>[] zabf;

    private Batch(List<PendingResult<?>> list, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.mLock = new Object();
        this.zabc = list.size();
        this.zabf = new PendingResult[this.zabc];
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, this.zabf));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            PendingResult<?> pendingResult = list.get(i);
            this.zabf[i] = pendingResult;
            pendingResult.addStatusListener(new zaa(this));
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static final class Builder {
        private List<PendingResult<?>> zabg = new ArrayList();
        private GoogleApiClient zabh;

        public Builder(GoogleApiClient googleApiClient) {
            this.zabh = googleApiClient;
        }

        public final <R extends Result> BatchResultToken<R> add(PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.zabg.size());
            this.zabg.add(pendingResult);
            return batchResultToken;
        }

        public final Batch build() {
            return new Batch(this.zabg, this.zabh, (zaa) null);
        }
    }

    public final void cancel() {
        super.cancel();
        for (PendingResult<?> cancel : this.zabf) {
            cancel.cancel();
        }
    }

    public final BatchResult createFailedResult(Status status) {
        return new BatchResult(status, this.zabf);
    }

    /* synthetic */ Batch(List list, GoogleApiClient googleApiClient, zaa zaa) {
        this(list, googleApiClient);
    }

    static /* synthetic */ int zab(Batch batch) {
        int i = batch.zabc;
        batch.zabc = i - 1;
        return i;
    }
}

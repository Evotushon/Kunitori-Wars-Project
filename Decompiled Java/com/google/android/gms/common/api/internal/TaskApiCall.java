package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    private final Feature[] zakj;
    private final boolean zakq;

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zakj = null;
        this.zakq = false;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private Feature[] zakj;
        private boolean zakq;
        /* access modifiers changed from: private */
        public RemoteCall<A, TaskCompletionSource<ResultT>> zakr;

        private Builder() {
            this.zakq = true;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zakr = new zack(biConsumer);
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> run(RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zakr = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setFeatures(Feature... featureArr) {
            this.zakj = featureArr;
            return this;
        }

        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zakq = z;
            return this;
        }

        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zakr != null, "execute parameter required");
            return new zacj(this, this.zakj, this.zakq);
        }
    }

    @KeepForSdk
    private TaskApiCall(Feature[] featureArr, boolean z) {
        this.zakj = featureArr;
        this.zakq = z;
    }

    @Nullable
    public final Feature[] zabr() {
        return this.zakj;
    }

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zakq;
    }

    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>();
    }
}

package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacj extends TaskApiCall<A, ResultT> {
    private final /* synthetic */ TaskApiCall.Builder zaks;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zacj(TaskApiCall.Builder builder, Feature[] featureArr, boolean z) {
        super(featureArr, z);
        this.zaks = builder;
    }

    /* access modifiers changed from: protected */
    public final void doExecute(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException {
        this.zaks.zakr.accept(a, taskCompletionSource);
    }
}

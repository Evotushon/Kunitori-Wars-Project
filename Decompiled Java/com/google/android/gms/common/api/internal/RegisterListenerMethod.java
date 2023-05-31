package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder<L> zajv;
    private final Feature[] zajw;
    private final boolean zajx;

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder) {
        this.zajv = listenerHolder;
        this.zajw = null;
        this.zajx = false;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void registerListener(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder, Feature[] featureArr, boolean z) {
        this.zajv = listenerHolder;
        this.zajw = featureArr;
        this.zajx = z;
    }

    @KeepForSdk
    @Nullable
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajv.getListenerKey();
    }

    @KeepForSdk
    public void clearListener() {
        this.zajv.clear();
    }

    @KeepForSdk
    @Nullable
    public Feature[] getRequiredFeatures() {
        return this.zajw;
    }

    public final boolean shouldAutoResolveMissingFeatures() {
        return this.zajx;
    }
}

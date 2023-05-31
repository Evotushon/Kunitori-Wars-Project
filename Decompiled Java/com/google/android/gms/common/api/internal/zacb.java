package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacb extends UnregisterListenerMethod<A, L> {
    private final /* synthetic */ RegistrationMethods.Builder zakl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zacb(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zakl = builder;
    }

    /* access modifiers changed from: protected */
    public final void unregisterListener(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        this.zakl.zakh.accept(a, taskCompletionSource);
    }
}

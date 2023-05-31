package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class RegistrationMethods<A extends Api.AnyClient, L> {
    public final RegisterListenerMethod<A, L> zakb;
    public final UnregisterListenerMethod<A, L> zakc;
    public final Runnable zakd;

    private RegistrationMethods(RegisterListenerMethod<A, L> registerListenerMethod, UnregisterListenerMethod<A, L> unregisterListenerMethod, Runnable runnable) {
        this.zakb = registerListenerMethod;
        this.zakc = unregisterListenerMethod;
        this.zakd = runnable;
    }

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static class Builder<A extends Api.AnyClient, L> {
        private boolean zajx;
        private Runnable zakd;
        /* access modifiers changed from: private */
        public RemoteCall<A, TaskCompletionSource<Void>> zakg;
        /* access modifiers changed from: private */
        public RemoteCall<A, TaskCompletionSource<Boolean>> zakh;
        private ListenerHolder<L> zaki;
        private Feature[] zakj;

        private Builder() {
            this.zakd = zaby.zabq;
            this.zajx = true;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, L> register(BiConsumer<A, TaskCompletionSource<Void>> biConsumer) {
            this.zakg = new zabx(biConsumer);
            return this;
        }

        @KeepForSdk
        @Deprecated
        public Builder<A, L> unregister(BiConsumer<A, TaskCompletionSource<Boolean>> biConsumer) {
            this.zakg = new zaca(this);
            return this;
        }

        @KeepForSdk
        public Builder<A, L> register(RemoteCall<A, TaskCompletionSource<Void>> remoteCall) {
            this.zakg = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> unregister(RemoteCall<A, TaskCompletionSource<Boolean>> remoteCall) {
            this.zakh = remoteCall;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(Runnable runnable) {
            this.zakd = runnable;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> withHolder(ListenerHolder<L> listenerHolder) {
            this.zaki = listenerHolder;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setFeatures(Feature... featureArr) {
            this.zakj = featureArr;
            return this;
        }

        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zajx = z;
            return this;
        }

        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            boolean z = true;
            Preconditions.checkArgument(this.zakg != null, "Must set register function");
            Preconditions.checkArgument(this.zakh != null, "Must set unregister function");
            if (this.zaki == null) {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set holder");
            return new RegistrationMethods<>(new zabz(this, this.zaki, this.zakj, this.zajx), new zacb(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.zaki.getListenerKey(), "Key must not be null")), this.zakd);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void zaa(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
            this.zakg.accept(anyClient, taskCompletionSource);
        }
    }

    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>();
    }
}

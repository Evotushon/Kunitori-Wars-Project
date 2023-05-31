package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zabv {
    public final Runnable zakd;
    public final RegisterListenerMethod<Api.AnyClient, ?> zake;
    public final UnregisterListenerMethod<Api.AnyClient, ?> zakf;

    public zabv(@NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        this.zake = registerListenerMethod;
        this.zakf = unregisterListenerMethod;
        this.zakd = runnable;
    }
}

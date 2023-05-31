package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final /* synthetic */ class zack implements RemoteCall {
    private final BiConsumer zakk;

    zack(BiConsumer biConsumer) {
        this.zakk = biConsumer;
    }

    public final void accept(Object obj, Object obj2) {
        this.zakk.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}

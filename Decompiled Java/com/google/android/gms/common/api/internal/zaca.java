package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final /* synthetic */ class zaca implements RemoteCall {
    private final RegistrationMethods.Builder zakm;

    zaca(RegistrationMethods.Builder builder) {
        this.zakm = builder;
    }

    public final void accept(Object obj, Object obj2) {
        this.zakm.zaa((Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}

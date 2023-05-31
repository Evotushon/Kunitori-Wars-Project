package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zabp<O extends Api.ApiOptions> extends zaae {
    private final GoogleApi<O> zajm;

    public zabp(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zajm = googleApi;
    }

    public final void zaa(zacn zacn) {
    }

    public final void zab(zacn zacn) {
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        return this.zajm.doRead(t);
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        return this.zajm.doWrite(t);
    }

    public final Looper getLooper() {
        return this.zajm.getLooper();
    }

    public final Context getContext() {
        return this.zajm.getApplicationContext();
    }
}

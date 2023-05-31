package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaav implements zabd {
    private final zabc zafy;

    public zaav(zabc zabc) {
        this.zafy = zabc;
    }

    public final boolean disconnect() {
        return true;
    }

    public final void onConnected(Bundle bundle) {
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final void begin() {
        for (Api.Client disconnect : this.zafy.zahd.values()) {
            disconnect.disconnect();
        }
        this.zafy.zaej.zahe = Collections.emptySet();
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        this.zafy.zaej.zafg.add(t);
        return t;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void connect() {
        this.zafy.zaax();
    }
}

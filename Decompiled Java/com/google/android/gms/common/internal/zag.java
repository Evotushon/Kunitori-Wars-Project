package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zag implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ ConnectionCallbacks zaox;

    zag(ConnectionCallbacks connectionCallbacks) {
        this.zaox = connectionCallbacks;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        this.zaox.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.zaox.onConnectionSuspended(i);
    }
}

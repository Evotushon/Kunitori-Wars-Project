package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api<?> mApi;
    private final boolean zaeg;
    private zap zaeh;

    public zaq(Api<?> api, boolean z) {
        this.mApi = api;
        this.zaeg = z;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        zat();
        this.zaeh.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        zat();
        this.zaeh.onConnectionSuspended(i);
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zat();
        this.zaeh.zaa(connectionResult, this.mApi, this.zaeg);
    }

    public final void zaa(zap zap) {
        this.zaeh = zap;
    }

    private final void zat() {
        Preconditions.checkNotNull(this.zaeh, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}

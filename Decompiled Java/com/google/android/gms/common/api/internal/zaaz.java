package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaaz implements GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ StatusPendingResult zahm;

    zaaz(zaau zaau, StatusPendingResult statusPendingResult) {
        this.zahm = statusPendingResult;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zahm.setResult(new Status(8));
    }
}

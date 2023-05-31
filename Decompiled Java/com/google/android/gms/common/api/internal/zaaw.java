package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaaw implements GoogleApiClient.ConnectionCallbacks {
    private final /* synthetic */ AtomicReference zahl;
    private final /* synthetic */ StatusPendingResult zahm;
    private final /* synthetic */ zaau zahn;

    zaaw(zaau zaau, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.zahn = zaau;
        this.zahl = atomicReference;
        this.zahm = statusPendingResult;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        this.zahn.zaa((GoogleApiClient) this.zahl.get(), this.zahm, true);
    }
}

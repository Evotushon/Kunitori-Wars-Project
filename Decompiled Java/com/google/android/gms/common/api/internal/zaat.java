package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaat implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private final /* synthetic */ zaai zago;

    private zaat(zaai zaai) {
        this.zago = zaai;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        if (this.zago.zaex.isSignInClientDisconnectFixEnabled()) {
            this.zago.zaet.lock();
            try {
                if (this.zago.zagf != null) {
                    this.zago.zagf.zaa(new zaar(this.zago));
                    this.zago.zaet.unlock();
                }
            } finally {
                this.zago.zaet.unlock();
            }
        } else {
            this.zago.zagf.zaa(new zaar(this.zago));
        }
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zago.zaet.lock();
        try {
            if (this.zago.zad(connectionResult)) {
                this.zago.zaap();
                this.zago.zaan();
            } else {
                this.zago.zae(connectionResult);
            }
        } finally {
            this.zago.zaet.unlock();
        }
    }

    /* synthetic */ zaat(zaai zaai, zaal zaal) {
        this(zaai);
    }
}

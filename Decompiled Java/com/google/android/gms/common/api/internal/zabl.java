package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabl implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zajc;
    private final /* synthetic */ ConnectionResult zajd;

    zabl(GoogleApiManager.zaa zaa, ConnectionResult connectionResult) {
        this.zajc = zaa;
        this.zajd = connectionResult;
    }

    public final void run() {
        this.zajc.onConnectionFailed(this.zajd);
    }
}

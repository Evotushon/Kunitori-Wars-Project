package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabn implements Runnable {
    private final /* synthetic */ ConnectionResult zajd;
    private final /* synthetic */ GoogleApiManager.zac zajh;

    zabn(GoogleApiManager.zac zac, ConnectionResult connectionResult) {
        this.zajh = zac;
        this.zajd = connectionResult;
    }

    public final void run() {
        GoogleApiManager.zaa zaa = (GoogleApiManager.zaa) GoogleApiManager.this.zail.get(this.zajh.zafv);
        if (zaa != null) {
            if (this.zajd.isSuccess()) {
                boolean unused = this.zajh.zajk = true;
                if (this.zajh.zair.requiresSignIn()) {
                    this.zajh.zabp();
                    return;
                }
                try {
                    this.zajh.zair.getRemoteService((IAccountAccessor) null, this.zajh.zair.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    zaa.onConnectionFailed(new ConnectionResult(10));
                }
            } else {
                zaa.onConnectionFailed(this.zajd);
            }
        }
    }
}

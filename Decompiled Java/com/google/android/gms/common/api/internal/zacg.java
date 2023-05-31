package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacg implements Runnable {
    private final /* synthetic */ zace zakp;

    zacg(zace zace) {
        this.zakp = zace;
    }

    public final void run() {
        this.zakp.zako.zag(new ConnectionResult(4));
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zam;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacf implements Runnable {
    private final /* synthetic */ zam zagv;
    private final /* synthetic */ zace zakp;

    zacf(zace zace, zam zam) {
        this.zakp = zace;
        this.zagv = zam;
    }

    public final void run() {
        this.zakp.zac(this.zagv);
    }
}

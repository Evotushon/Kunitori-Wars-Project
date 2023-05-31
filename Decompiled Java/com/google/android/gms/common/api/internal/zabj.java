package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.GoogleApiManager;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabj implements Runnable {
    private final /* synthetic */ GoogleApiManager.zaa zajc;

    zabj(GoogleApiManager.zaa zaa) {
        this.zajc = zaa;
    }

    public final void run() {
        this.zajc.zabe();
    }
}

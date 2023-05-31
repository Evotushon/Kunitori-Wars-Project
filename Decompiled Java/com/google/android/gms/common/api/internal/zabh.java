package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabh implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ GoogleApiManager zajb;

    zabh(GoogleApiManager googleApiManager) {
        this.zajb = googleApiManager;
    }

    public final void onBackgroundStateChanged(boolean z) {
        this.zajb.handler.sendMessage(this.zajb.handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}

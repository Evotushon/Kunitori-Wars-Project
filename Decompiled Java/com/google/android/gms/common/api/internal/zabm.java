package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zabm implements Runnable {
    private final /* synthetic */ zabk zajg;

    zabm(zabk zabk) {
        this.zajg = zabk;
    }

    public final void run() {
        this.zajg.zajc.zair.disconnect();
    }
}

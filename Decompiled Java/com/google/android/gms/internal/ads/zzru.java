package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzru implements Runnable {
    private final /* synthetic */ zzrr zzbrq;

    zzru(zzrr zzrr) {
        this.zzbrq = zzrr;
    }

    public final void run() {
        this.zzbrq.disconnect();
    }
}

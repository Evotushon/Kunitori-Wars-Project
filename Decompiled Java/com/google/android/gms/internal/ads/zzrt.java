package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzrt implements zzqk {
    private final /* synthetic */ zzrr zzbrq;

    zzrt(zzrr zzrr) {
        this.zzbrq = zzrr;
    }

    public final void zzp(boolean z) {
        if (z) {
            this.zzbrq.connect();
        } else {
            this.zzbrq.disconnect();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzagu implements Runnable {
    private final /* synthetic */ zzagt zzcze;

    zzagu(zzagt zzagt) {
        this.zzcze = zzagt;
    }

    public final void run() {
        this.zzcze.disconnect();
    }
}

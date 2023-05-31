package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaal implements Runnable {
    private final /* synthetic */ zaai zago;

    zaal(zaai zaai) {
        this.zago = zaai;
    }

    public final void run() {
        this.zago.zafc.cancelAvailabilityErrorNotifications(this.zago.mContext);
    }
}

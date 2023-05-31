package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzk implements Runnable {
    public final /* synthetic */ AcknowledgePurchaseResponseListener zza;

    public /* synthetic */ zzk(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = acknowledgePurchaseResponseListener;
    }

    public final void run() {
        this.zza.onAcknowledgePurchaseResponse(zzat.zzn);
    }
}

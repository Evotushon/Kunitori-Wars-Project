package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzn implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ AcknowledgePurchaseParams zzb;
    public final /* synthetic */ AcknowledgePurchaseResponseListener zzc;

    public /* synthetic */ zzn(BillingClientImpl billingClientImpl, AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = acknowledgePurchaseParams;
        this.zzc = acknowledgePurchaseResponseListener;
    }

    public final Object call() {
        this.zza.zzl(this.zzb, this.zzc);
        return null;
    }
}

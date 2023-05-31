package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzv implements Runnable {
    public final /* synthetic */ PriceChangeConfirmationListener zza;
    public final /* synthetic */ BillingResult zzb;

    public /* synthetic */ zzv(PriceChangeConfirmationListener priceChangeConfirmationListener, BillingResult billingResult) {
        this.zza = priceChangeConfirmationListener;
        this.zzb = billingResult;
    }

    public final void run() {
        this.zza.onPriceChangeConfirmationResult(this.zzb);
    }
}

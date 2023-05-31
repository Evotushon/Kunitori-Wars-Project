package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ BillingResult zzb;

    public /* synthetic */ zzs(BillingClientImpl billingClientImpl, BillingResult billingResult) {
        this.zza = billingClientImpl;
        this.zzb = billingResult;
    }

    public final void run() {
        this.zza.zzE(this.zzb);
    }
}

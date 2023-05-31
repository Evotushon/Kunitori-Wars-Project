package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzaa extends ResultReceiver {
    final /* synthetic */ PriceChangeConfirmationListener zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaa(BillingClientImpl billingClientImpl, Handler handler, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        super(handler);
        this.zza = priceChangeConfirmationListener;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i);
        newBuilder.setDebugMessage(zzb.zzj(bundle, "BillingClient"));
        this.zza.onPriceChangeConfirmationResult(newBuilder.build());
    }
}

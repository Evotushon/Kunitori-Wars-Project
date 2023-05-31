package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzac implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzac(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zzc = billingClientImpl;
        this.zza = str;
        this.zzb = purchasesResponseListener;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        Purchase.PurchasesResult zzi = BillingClientImpl.zzi(this.zzc, this.zza);
        if (zzi.getPurchasesList() != null) {
            this.zzb.onQueryPurchasesResponse(zzi.getBillingResult(), zzi.getPurchasesList());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzi.getBillingResult(), zzu.zzh());
        return null;
    }
}

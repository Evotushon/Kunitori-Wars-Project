package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzw implements Runnable {
    public final /* synthetic */ PurchaseHistoryResponseListener zza;

    public /* synthetic */ zzw(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zza = purchaseHistoryResponseListener;
    }

    public final void run() {
        this.zza.onPurchaseHistoryResponse(zzat.zzn, (List<PurchaseHistoryRecord>) null);
    }
}

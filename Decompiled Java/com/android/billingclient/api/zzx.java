package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzx implements Runnable {
    public final /* synthetic */ PurchasesResponseListener zza;

    public /* synthetic */ zzx(PurchasesResponseListener purchasesResponseListener) {
        this.zza = purchasesResponseListener;
    }

    public final void run() {
        this.zza.onQueryPurchasesResponse(zzat.zzn, zzu.zzh());
    }
}

package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzy implements Runnable {
    public final /* synthetic */ SkuDetailsResponseListener zza;

    public /* synthetic */ zzy(SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zza = skuDetailsResponseListener;
    }

    public final void run() {
        this.zza.onSkuDetailsResponse(zzat.zzn, (List<SkuDetails>) null);
    }
}

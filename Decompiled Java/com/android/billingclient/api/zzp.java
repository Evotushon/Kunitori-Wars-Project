package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzp implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzp(BillingClientImpl billingClientImpl, String str) {
        this.zza = billingClientImpl;
        this.zzb = str;
    }

    public final Object call() {
        return this.zza.zzk(this.zzb);
    }
}

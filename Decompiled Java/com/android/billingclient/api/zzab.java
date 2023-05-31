package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
final class zzab implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ BillingClientImpl zzb;

    zzab(BillingClientImpl billingClientImpl, String str) {
        this.zzb = billingClientImpl;
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return BillingClientImpl.zzi(this.zzb, this.zza);
    }
}

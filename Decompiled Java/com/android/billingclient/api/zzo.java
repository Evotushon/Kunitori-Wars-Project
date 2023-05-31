package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzo implements Callable {
    public final /* synthetic */ BillingClientImpl zza;
    public final /* synthetic */ ConsumeParams zzb;
    public final /* synthetic */ ConsumeResponseListener zzc;

    public /* synthetic */ zzo(BillingClientImpl billingClientImpl, ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) {
        this.zza = billingClientImpl;
        this.zzb = consumeParams;
        this.zzc = consumeResponseListener;
    }

    public final Object call() {
        this.zza.zzm(this.zzb, this.zzc);
        return null;
    }
}

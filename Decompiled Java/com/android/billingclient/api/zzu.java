package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ ConsumeResponseListener zza;
    public final /* synthetic */ ConsumeParams zzb;

    public /* synthetic */ zzu(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zza = consumeResponseListener;
        this.zzb = consumeParams;
    }

    public final void run() {
        this.zza.onConsumeResponse(zzat.zzn, this.zzb.getPurchaseToken());
    }
}

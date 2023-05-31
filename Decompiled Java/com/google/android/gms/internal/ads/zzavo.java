package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzavo implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzazy zzdrb;

    zzavo(zzavl zzavl, Context context, zzazy zzazy) {
        this.val$context = context;
        this.zzdrb = zzazy;
    }

    public final void run() {
        try {
            this.zzdrb.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzdrb.setException(e);
            zzazh.zzc("Exception while getting advertising Id info", e);
        }
    }
}

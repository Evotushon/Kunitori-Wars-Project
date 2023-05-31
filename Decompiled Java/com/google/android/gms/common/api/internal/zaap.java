package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaap extends zabf {
    private final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks zagt;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaap(zaan zaan, zabd zabd, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabd);
        this.zagt = connectionProgressReportCallbacks;
    }

    @GuardedBy("mLock")
    public final void zaak() {
        this.zagt.onReportServiceBinding(new ConnectionResult(16, (PendingIntent) null));
    }
}

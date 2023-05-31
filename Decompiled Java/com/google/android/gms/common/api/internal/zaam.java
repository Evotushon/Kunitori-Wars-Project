package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaam extends zabf {
    private final /* synthetic */ ConnectionResult zagp;
    private final /* synthetic */ zaan zagq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaam(zaan zaan, zabd zabd, ConnectionResult connectionResult) {
        super(zabd);
        this.zagq = zaan;
        this.zagp = connectionResult;
    }

    @GuardedBy("mLock")
    public final void zaak() {
        this.zagq.zago.zae(this.zagp);
    }
}

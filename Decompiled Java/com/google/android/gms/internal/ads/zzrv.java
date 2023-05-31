package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzrv implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzrr zzbrq;

    zzrv(zzrr zzrr) {
        this.zzbrq = zzrr;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.zzbrq.lock) {
            zzse unused = this.zzbrq.zzbrn = null;
            if (this.zzbrq.zzbrm != null) {
                zzsa unused2 = this.zzbrq.zzbrm = null;
            }
            this.zzbrq.lock.notifyAll();
        }
    }
}

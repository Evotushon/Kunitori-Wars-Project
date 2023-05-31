package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzrw implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzrr zzbrq;

    zzrw(zzrr zzrr) {
        this.zzbrq = zzrr;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzbrq.lock) {
            try {
                if (this.zzbrq.zzbrm != null) {
                    zzse unused = this.zzbrq.zzbrn = this.zzbrq.zzbrm.zzmx();
                }
            } catch (DeadObjectException e) {
                zzawf.zzc("Unable to obtain a cache service instance.", e);
                this.zzbrq.disconnect();
            }
            this.zzbrq.lock.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zzbrq.lock) {
            zzse unused = this.zzbrq.zzbrn = null;
            this.zzbrq.lock.notifyAll();
        }
    }
}

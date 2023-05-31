package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zacm implements Runnable {
    private final /* synthetic */ Result zakt;
    private final /* synthetic */ zacn zaku;

    zacm(zacn zacn, Result result) {
        this.zaku = zacn;
        this.zakt = result;
    }

    @WorkerThread
    public final void run() {
        try {
            BasePendingResult.zadr.set(true);
            this.zaku.zala.sendMessage(this.zaku.zala.obtainMessage(0, this.zaku.zakv.onSuccess(this.zakt)));
            BasePendingResult.zadr.set(false);
            zacn.zab(this.zakt);
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zaku.zadu.get();
            if (googleApiClient != null) {
                googleApiClient.zab(this.zaku);
            }
        } catch (RuntimeException e) {
            this.zaku.zala.sendMessage(this.zaku.zala.obtainMessage(1, e));
            BasePendingResult.zadr.set(false);
            zacn.zab(this.zakt);
            GoogleApiClient googleApiClient2 = (GoogleApiClient) this.zaku.zadu.get();
            if (googleApiClient2 != null) {
                googleApiClient2.zab(this.zaku);
            }
        } catch (Throwable th) {
            BasePendingResult.zadr.set(false);
            zacn.zab(this.zakt);
            GoogleApiClient googleApiClient3 = (GoogleApiClient) this.zaku.zadu.get();
            if (googleApiClient3 != null) {
                googleApiClient3.zab(this.zaku);
            }
            throw th;
        }
    }
}

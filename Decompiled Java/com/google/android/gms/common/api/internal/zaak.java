package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaak implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final Api<?> mApi;
    /* access modifiers changed from: private */
    public final boolean zaeg;
    private final WeakReference<zaai> zagn;

    public zaak(zaai zaai, Api<?> api, boolean z) {
        this.zagn = new WeakReference<>(zaai);
        this.mApi = api;
        this.zaeg = z;
    }

    public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
        zaai zaai = (zaai) this.zagn.get();
        if (zaai != null) {
            Preconditions.checkState(Looper.myLooper() == zaai.zafy.zaej.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            zaai.zaet.lock();
            try {
                if (zaai.zac(0)) {
                    if (!connectionResult.isSuccess()) {
                        zaai.zab(connectionResult, this.mApi, this.zaeg);
                    }
                    if (zaai.zaam()) {
                        zaai.zaan();
                    }
                    zaai.zaet.unlock();
                }
            } finally {
                zaai.zaet.unlock();
            }
        }
    }
}

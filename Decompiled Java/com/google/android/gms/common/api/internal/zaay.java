package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaay implements ResultCallback<Status> {
    private final /* synthetic */ StatusPendingResult zahm;
    private final /* synthetic */ zaau zahn;
    private final /* synthetic */ boolean zaho;
    private final /* synthetic */ GoogleApiClient zahp;

    zaay(zaau zaau, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.zahn = zaau;
        this.zahm = statusPendingResult;
        this.zaho = z;
        this.zahp = googleApiClient;
    }

    public final /* synthetic */ void onResult(@NonNull Result result) {
        Status status = (Status) result;
        Storage.getInstance(this.zahn.mContext).zaf();
        if (status.isSuccess() && this.zahn.isConnected()) {
            this.zahn.reconnect();
        }
        this.zahm.setResult(status);
        if (this.zaho) {
            this.zahp.disconnect();
        }
    }
}

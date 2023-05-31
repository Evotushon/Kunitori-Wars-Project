package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaf implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ OnConnectionFailedListener zaow;

    zaf(OnConnectionFailedListener onConnectionFailedListener) {
        this.zaow = onConnectionFailedListener;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zaow.onConnectionFailed(connectionResult);
    }
}

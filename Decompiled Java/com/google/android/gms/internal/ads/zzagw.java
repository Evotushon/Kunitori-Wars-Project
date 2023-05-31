package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzagw implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzazy zzbsb;

    zzagw(zzagt zzagt, zzazy zzazy) {
        this.zzbsb = zzazy;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zzbsb.setException(new RuntimeException("Connection failed."));
    }
}

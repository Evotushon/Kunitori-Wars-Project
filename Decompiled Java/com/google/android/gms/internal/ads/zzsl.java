package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzsl implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzazy zzbsb;
    private final /* synthetic */ zzsf zzbsc;

    zzsl(zzsf zzsf, zzazy zzazy) {
        this.zzbsc = zzsf;
        this.zzbsb = zzazy;
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.zzbsc.lock) {
            this.zzbsb.setException(new RuntimeException("Connection failed."));
        }
    }
}

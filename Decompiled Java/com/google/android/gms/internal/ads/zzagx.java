package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzagx implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzazy zzbsb;
    private final /* synthetic */ zzagt zzcze;

    zzagx(zzagt zzagt, zzazy zzazy) {
        this.zzcze = zzagt;
        this.zzbsb = zzazy;
    }

    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.zzbsb.set(this.zzcze.zzczd.zzrw());
        } catch (DeadObjectException e) {
            this.zzbsb.setException(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        zzazy zzazy = this.zzbsb;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzazy.setException(new RuntimeException(sb.toString()));
    }
}

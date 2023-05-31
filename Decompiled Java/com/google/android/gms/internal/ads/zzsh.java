package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzsh implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzrz zzbsa;
    private final /* synthetic */ zzazy zzbsb;
    final /* synthetic */ zzsf zzbsc;

    zzsh(zzsf zzsf, zzrz zzrz, zzazy zzazy) {
        this.zzbsc = zzsf;
        this.zzbsa = zzrz;
        this.zzbsb = zzazy;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzbsc.lock) {
            if (!this.zzbsc.zzbrz) {
                boolean unused = this.zzbsc.zzbrz = true;
                zzsa zzd = this.zzbsc.zzbrm;
                if (zzd != null) {
                    this.zzbsb.addListener(new zzsj(this.zzbsb, zzazq.zzdxk.zzf(new zzsk(this, zzd, this.zzbsa, this.zzbsb))), zzazq.zzdxp);
                }
            }
        }
    }
}

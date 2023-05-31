package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdee extends AdMetadataListener {
    private final /* synthetic */ zzdec zzgpc;
    private final /* synthetic */ zzwa zzgpd;

    zzdee(zzdec zzdec, zzwa zzwa) {
        this.zzgpc = zzdec;
        this.zzgpd = zzwa;
    }

    public final void onAdMetadataChanged() {
        if (this.zzgpc.zzgpa != null) {
            try {
                this.zzgpd.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzawf.zze("#007 Could not call remote method.", e);
            }
        }
    }
}

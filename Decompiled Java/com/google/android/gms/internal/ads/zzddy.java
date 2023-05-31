package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzddy extends AdMetadataListener {
    private final /* synthetic */ zzddw zzgox;
    private final /* synthetic */ zzwy zzgpb;

    zzddy(zzddw zzddw, zzwy zzwy) {
        this.zzgox = zzddw;
        this.zzgpb = zzwy;
    }

    public final void onAdMetadataChanged() {
        if (this.zzgox.zzgpa != null) {
            try {
                this.zzgpb.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzawf.zze("#007 Could not call remote method.", e);
            }
        }
    }
}

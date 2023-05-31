package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyu extends zzxb {
    private final OnAdMetadataChangedListener zzcgg;

    public zzyu(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzcgg = onAdMetadataChangedListener;
    }

    public final void onAdMetadataChanged() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.zzcgg;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}

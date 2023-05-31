package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcsp implements zzbqm {
    private final zzcsg zzggq;
    private final zzaht zzggr;

    zzcsp(zzcsg zzcsg, zzaht zzaht) {
        this.zzggq = zzcsg;
        this.zzggr = zzaht;
    }

    public final void onAdFailedToLoad(int i) {
        zzcsg zzcsg = this.zzggq;
        zzaht zzaht = this.zzggr;
        zzcsg.onAdFailedToLoad(i);
        if (zzaht != null) {
            try {
                zzaht.onInstreamAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        }
    }
}

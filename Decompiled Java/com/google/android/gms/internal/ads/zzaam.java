package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzaam implements CustomRenderedAd {
    private final zzaap zzctd;

    public zzaam(zzaap zzaap) {
        this.zzctd = zzaap;
    }

    public final String getBaseUrl() {
        try {
            return this.zzctd.zzqx();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.zzctd.getContent();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.zzctd.zzn(view != null ? ObjectWrapper.wrap(view) : null);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordClick() {
        try {
            this.zzctd.recordClick();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zzctd.recordImpression();
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}

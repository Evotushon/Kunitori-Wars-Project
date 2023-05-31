package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzccl extends zzade {
    @Nullable
    private final String zzfik;
    private final zzbyz zzfne;
    private final zzbyo zzfqg;

    public zzccl(@Nullable String str, zzbyo zzbyo, zzbyz zzbyz) {
        this.zzfik = str;
        this.zzfqg = zzbyo;
        this.zzfne = zzbyz;
    }

    public final IObjectWrapper zzrj() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfqg);
    }

    public final String getHeadline() throws RemoteException {
        return this.zzfne.getHeadline();
    }

    public final List<?> getImages() throws RemoteException {
        return this.zzfne.getImages();
    }

    public final String getBody() throws RemoteException {
        return this.zzfne.getBody();
    }

    public final zzacr zzrk() throws RemoteException {
        return this.zzfne.zzrk();
    }

    public final String getCallToAction() throws RemoteException {
        return this.zzfne.getCallToAction();
    }

    public final double getStarRating() throws RemoteException {
        return this.zzfne.getStarRating();
    }

    public final String getStore() throws RemoteException {
        return this.zzfne.getStore();
    }

    public final String getPrice() throws RemoteException {
        return this.zzfne.getPrice();
    }

    public final Bundle getExtras() throws RemoteException {
        return this.zzfne.getExtras();
    }

    public final void destroy() throws RemoteException {
        this.zzfqg.destroy();
    }

    public final zzxj getVideoController() throws RemoteException {
        return this.zzfne.getVideoController();
    }

    public final void performClick(Bundle bundle) throws RemoteException {
        this.zzfqg.zzf(bundle);
    }

    public final boolean recordImpression(Bundle bundle) throws RemoteException {
        return this.zzfqg.zzh(bundle);
    }

    public final void reportTouchEvent(Bundle bundle) throws RemoteException {
        this.zzfqg.zzg(bundle);
    }

    public final zzacj zzrl() throws RemoteException {
        return this.zzfne.zzrl();
    }

    public final IObjectWrapper zzrm() throws RemoteException {
        return this.zzfne.zzrm();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return this.zzfik;
    }
}

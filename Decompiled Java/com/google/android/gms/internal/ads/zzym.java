package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzym extends zzwm {
    private zzahc zzcgb;

    public final String getVersionString() {
        return "";
    }

    public final void setAppMuted(boolean z) throws RemoteException {
    }

    public final void setAppVolume(float f) throws RemoteException {
    }

    public final void zza(zzalk zzalk) throws RemoteException {
    }

    public final void zza(zzyw zzyw) throws RemoteException {
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    public final void zzce(String str) throws RemoteException {
    }

    public final void zzcf(String str) throws RemoteException {
    }

    public final float zzpj() throws RemoteException {
        return 1.0f;
    }

    public final boolean zzpk() throws RemoteException {
        return false;
    }

    public final void initialize() throws RemoteException {
        zzazh.zzey("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzayx.zzyy.post(new zzyp(this));
    }

    public final void zza(zzahc zzahc) throws RemoteException {
        this.zzcgb = zzahc;
    }

    public final List<zzagz> zzpl() throws RemoteException {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzqb() {
        zzahc zzahc = this.zzcgb;
        if (zzahc != null) {
            try {
                zzahc.zzd(Collections.emptyList());
            } catch (RemoteException e) {
                zzazh.zzd("Could not notify onComplete event.", e);
            }
        }
    }
}

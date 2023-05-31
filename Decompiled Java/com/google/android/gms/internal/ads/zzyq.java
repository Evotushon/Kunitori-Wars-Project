package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyq extends zzasw {
    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final void zza(zzasy zzasy) throws RemoteException {
    }

    public final void zza(zzatg zzatg) throws RemoteException {
    }

    public final void zza(zzato zzato) {
    }

    public final void zza(zzwy zzwy) throws RemoteException {
    }

    public final void zza(zzxd zzxd) {
    }

    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final zzxe zzkg() {
        return null;
    }

    @Nullable
    public final zzass zzqc() {
        return null;
    }

    public final void zza(zzuh zzuh, zzatb zzatb) throws RemoteException {
        zzazh.zzey("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzayx.zzyy.post(new zzyt(zzatb));
    }

    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }
}

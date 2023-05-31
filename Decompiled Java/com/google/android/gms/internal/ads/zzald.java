package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzald extends zzbgg {
    private final AppMeasurementSdk zzdco;

    zzald(AppMeasurementSdk appMeasurementSdk) {
        this.zzdco = appMeasurementSdk;
    }

    public final void performAction(Bundle bundle) throws RemoteException {
        this.zzdco.performAction(bundle);
    }

    public final Bundle performActionWithResponse(Bundle bundle) throws RemoteException {
        return this.zzdco.performActionWithResponse(bundle);
    }

    public final void logEvent(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzdco.logEvent(str, str2, bundle);
    }

    public final void zza(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzdco.setUserProperty(str, str2, iObjectWrapper != null ? ObjectWrapper.unwrap(iObjectWrapper) : null);
    }

    public final Map getUserProperties(String str, String str2, boolean z) throws RemoteException {
        return this.zzdco.getUserProperties(str, str2, z);
    }

    public final int getMaxUserProperties(String str) throws RemoteException {
        return this.zzdco.getMaxUserProperties(str);
    }

    public final void setConditionalUserProperty(Bundle bundle) throws RemoteException {
        this.zzdco.setConditionalUserProperty(bundle);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        this.zzdco.clearConditionalUserProperty(str, str2, bundle);
    }

    public final List getConditionalUserProperties(String str, String str2) throws RemoteException {
        return this.zzdco.getConditionalUserProperties(str, str2);
    }

    public final String getAppInstanceId() throws RemoteException {
        return this.zzdco.getAppInstanceId();
    }

    public final String getGmpAppId() throws RemoteException {
        return this.zzdco.getGmpAppId();
    }

    public final long generateEventId() throws RemoteException {
        return this.zzdco.generateEventId();
    }

    public final void beginAdUnitExposure(String str) throws RemoteException {
        this.zzdco.beginAdUnitExposure(str);
    }

    public final void endAdUnitExposure(String str) throws RemoteException {
        this.zzdco.endAdUnitExposure(str);
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        this.zzdco.setCurrentScreen(iObjectWrapper != null ? (Activity) ObjectWrapper.unwrap(iObjectWrapper) : null, str, str2);
    }

    public final String getCurrentScreenName() throws RemoteException {
        return this.zzdco.getCurrentScreenName();
    }

    public final String getCurrentScreenClass() throws RemoteException {
        return this.zzdco.getCurrentScreenClass();
    }

    public final String getAppIdOrigin() throws RemoteException {
        return this.zzdco.getAppIdOrigin();
    }
}

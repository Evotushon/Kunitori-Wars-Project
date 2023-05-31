package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzbgi extends zzge implements zzbgf {
    public static zzbgf zzaq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof zzbgf) {
            return (zzbgf) queryLocalInterface;
        }
        return new zzbgh(iBinder);
    }
}

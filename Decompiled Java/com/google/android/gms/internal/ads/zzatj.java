package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzatj {
    public static zzast zzd(Context context, String str, zzalk zzalk) {
        try {
            IBinder zzd = ((zzasz) zzazk.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzatm.zzbun)).zzd(ObjectWrapper.wrap(context), str, zzalk, 20089000);
            if (zzd == null) {
                return null;
            }
            IInterface queryLocalInterface = zzd.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzast) {
                return (zzast) queryLocalInterface;
            }
            return new zzasv(zzd);
        } catch (RemoteException | zzazm e) {
            zzazh.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}

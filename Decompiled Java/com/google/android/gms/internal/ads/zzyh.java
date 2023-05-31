package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzyh extends RemoteCreator<zzwo> {
    public zzyh() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final zzwn zzj(Context context) {
        try {
            IBinder zzb = ((zzwo) getRemoteCreatorInstance(context)).zzb(ObjectWrapper.wrap(context), 20089000);
            if (zzb == null) {
                return null;
            }
            IInterface queryLocalInterface = zzb.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzwn) {
                return (zzwn) queryLocalInterface;
            }
            return new zzwp(zzb);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzazh.zzd("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzwo) {
            return (zzwo) queryLocalInterface;
        }
        return new zzwr(iBinder);
    }
}

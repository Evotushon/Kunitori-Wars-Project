package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzasf extends RemoteCreator<zzarz> {
    public zzasf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final zzary zza(Context context, zzalk zzalk) {
        try {
            IBinder zzb = ((zzarz) getRemoteCreatorInstance(context)).zzb(ObjectWrapper.wrap(context), zzalk, 20089000);
            if (zzb == null) {
                return null;
            }
            IInterface queryLocalInterface = zzb.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof zzary) {
                return (zzary) queryLocalInterface;
            }
            return new zzasa(zzb);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzazh.zzd("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzarz) {
            return (zzarz) queryLocalInterface;
        }
        return new zzasc(iBinder);
    }
}

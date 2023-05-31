package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzuf extends RemoteCreator<zzvy> {
    @VisibleForTesting
    public zzuf() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzvx zza(Context context, zzuk zzuk, String str, zzalk zzalk, int i) {
        try {
            IBinder zza = ((zzvy) getRemoteCreatorInstance(context)).zza(ObjectWrapper.wrap(context), zzuk, str, zzalk, 20089000, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzvx) {
                return (zzvx) queryLocalInterface;
            }
            return new zzvz(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzazh.zzb("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzvy) {
            return (zzvy) queryLocalInterface;
        }
        return new zzwb(iBinder);
    }
}

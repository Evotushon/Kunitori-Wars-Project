package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzuc extends RemoteCreator<zzvv> {
    public zzuc() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final zzvq zza(Context context, String str, zzalk zzalk) {
        try {
            IBinder zzc = ((zzvv) getRemoteCreatorInstance(context)).zzc(ObjectWrapper.wrap(context), str, zzalk, 20089000);
            if (zzc == null) {
                return null;
            }
            IInterface queryLocalInterface = zzc.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzvq) {
                return (zzvq) queryLocalInterface;
            }
            return new zzvs(zzc);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzazh.zzd("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzvv) {
            return (zzvv) queryLocalInterface;
        }
        return new zzvu(iBinder);
    }
}

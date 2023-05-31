package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzapc extends RemoteCreator<zzapg> {
    public zzapc() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzapb zzc(Activity activity) {
        try {
            IBinder zzae = ((zzapg) getRemoteCreatorInstance(activity)).zzae(ObjectWrapper.wrap(activity));
            if (zzae == null) {
                return null;
            }
            IInterface queryLocalInterface = zzae.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzapb) {
                return (zzapb) queryLocalInterface;
            }
            return new zzapd(zzae);
        } catch (RemoteException e) {
            zzazh.zzd("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzazh.zzd("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzapg) {
            return (zzapg) queryLocalInterface;
        }
        return new zzapf(iBinder);
    }
}

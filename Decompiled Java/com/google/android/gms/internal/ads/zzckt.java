package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzckt implements zzdnu<ParcelFileDescriptor> {
    private final /* synthetic */ zzaqr zzfzj;

    zzckt(zzckh zzckh, zzaqr zzaqr) {
        this.zzfzj = zzaqr;
    }

    public final void zzb(Throwable th) {
        try {
            this.zzfzj.zza(zzaxp.zza(th, zzcid.zzd(th)));
        } catch (RemoteException e) {
            zzawf.zza("Service can't call client", e);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zzfzj.zzb((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            zzawf.zza("Service can't call client", e);
        }
    }
}

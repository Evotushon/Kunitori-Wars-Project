package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcob implements zzbxb {
    private final zzcmd zzgbo;
    private final zzcma zzgcp;

    zzcob(zzcmd zzcmd, zzcma zzcma) {
        this.zzgbo = zzcmd;
        this.zzgcp = zzcma;
    }

    public final void zza(boolean z, Context context) {
        zzcmd zzcmd = this.zzgbo;
        zzcma zzcma = this.zzgcp;
        try {
            if (((zzanq) zzcmd.zzdel).zzz(ObjectWrapper.wrap(context))) {
                zzcma.zzaoc();
            } else {
                zzawf.zzfa("Cannot show interstitial.");
            }
        } catch (RemoteException e) {
            zzawf.zzd("Cannot show interstitial.", e);
        }
    }
}

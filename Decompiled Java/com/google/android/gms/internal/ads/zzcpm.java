package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcpm implements zzbxb {
    private final zzcmd zzgbo;
    private final zzcma zzgcp;

    zzcpm(zzcmd zzcmd, zzcma zzcma) {
        this.zzgbo = zzcmd;
        this.zzgcp = zzcma;
    }

    public final void zza(boolean z, Context context) {
        zzcmd zzcmd = this.zzgbo;
        zzcma zzcma = this.zzgcp;
        try {
            if (((zzanq) zzcmd.zzdel).zzaa(ObjectWrapper.wrap(context))) {
                zzcma.zzaoc();
            } else {
                zzawf.zzfa("Can't show rewarded video.");
            }
        } catch (RemoteException e) {
            zzawf.zzd("Can't show rewarded video.", e);
        }
    }
}

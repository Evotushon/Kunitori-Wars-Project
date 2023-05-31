package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzacn implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzadn zzcwv;

    public zzacn(zzadn zzadn) {
        this.zzcwv = zzadn;
        try {
            zzadn.zzrr();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zzcwv.zzrq();
        } catch (RemoteException e) {
            zzazh.zzc("", e);
            return false;
        }
    }

    public final void setView(View view) {
        try {
            this.zzcwv.zzq(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzazh.zzc("", e);
        }
    }
}

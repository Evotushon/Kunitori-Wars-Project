package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzss {
    @VisibleForTesting
    zzgh zzbul;
    @VisibleForTesting
    boolean zzbum;

    public final zzsw zzf(byte[] bArr) {
        return new zzsw(this, bArr);
    }

    public zzss(Context context, String str, String str2) {
        zzzx.initialize(context);
        try {
            this.zzbul = (zzgh) zzazk.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzsv.zzbun);
            ObjectWrapper.wrap(context);
            this.zzbul.zza(ObjectWrapper.wrap(context), str, (String) null);
            this.zzbum = true;
        } catch (RemoteException | zzazm | NullPointerException unused) {
            zzazh.zzeb("Cannot dynamite load clearcut");
        }
    }

    public zzss(Context context) {
        zzzx.initialize(context);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcot)).booleanValue()) {
            try {
                this.zzbul = (zzgh) zzazk.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzsu.zzbun);
                ObjectWrapper.wrap(context);
                this.zzbul.zza(ObjectWrapper.wrap(context), "GMA_SDK");
                this.zzbum = true;
            } catch (RemoteException | zzazm | NullPointerException unused) {
                zzazh.zzeb("Cannot dynamite load clearcut");
            }
        }
    }

    public zzss() {
    }
}

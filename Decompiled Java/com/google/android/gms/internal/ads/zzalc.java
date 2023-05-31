package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzalc {
    private static zzalc zzdcm;
    private AtomicBoolean zzdcn = new AtomicBoolean(false);

    public static zzalc zzso() {
        if (zzdcm == null) {
            zzdcm = new zzalc();
        }
        return zzdcm;
    }

    @VisibleForTesting
    zzalc() {
    }

    @Nullable
    public final Thread zzc(Context context, String str) {
        if (!this.zzdcn.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzalf(this, context, str));
        thread.start();
        return thread;
    }

    @Nullable
    public final Thread zzn(Context context) {
        if (!this.zzdcn.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzale(this, context));
        thread.start();
        return thread;
    }

    private static void zza(Context context, AppMeasurementSdk appMeasurementSdk) {
        try {
            ((zzbgf) zzazk.zza(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzalh.zzbun)).zza(ObjectWrapper.wrap(context), new zzald(appMeasurementSdk));
        } catch (RemoteException | zzazm | NullPointerException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }

    private static boolean zzo(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static /* synthetic */ void zzp(Context context) {
        zzzx.initialize(context);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcje)).booleanValue() && zzo(context)) {
            zza(context, AppMeasurementSdk.getInstance(context));
        }
    }

    static /* synthetic */ void zzd(Context context, String str) {
        zzzx.initialize(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzvh.zzpd().zzd(zzzx.zzciz)).booleanValue());
        zza(context, AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle));
    }
}

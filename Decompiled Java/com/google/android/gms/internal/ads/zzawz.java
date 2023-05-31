package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.zzq;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzawz extends zzaxa {
    public final boolean zza(Activity activity, Configuration configuration) {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcop)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcor)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzvh.zzoz();
        int zzb = zzayx.zzb((Context) activity, configuration.screenHeightDp);
        int zzb2 = zzayx.zzb((Context) activity, configuration.screenWidthDp);
        zzq.zzkv();
        DisplayMetrics zza = zzawo.zza((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zza.heightPixels;
        int i2 = zza.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzvh.zzpd().zzd(zzzx.zzcoo)).intValue();
        if (!(zze(i, zzb + dimensionPixelSize, round) && zze(i2, zzb2, round))) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    private static boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}

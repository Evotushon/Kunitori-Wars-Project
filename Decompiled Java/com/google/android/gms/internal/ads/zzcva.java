package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcva implements zzcye<zzcux> {
    private final zzdoe zzfrv;
    private final Context zzur;

    public zzcva(zzdoe zzdoe, Context context) {
        this.zzfrv = zzdoe;
        this.zzur = context;
    }

    public final zzdof<zzcux> zzapb() {
        return this.zzfrv.zzd(new zzcuz(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcux zzapf() throws Exception {
        double d;
        Intent registerReceiver = this.zzur.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            double intExtra2 = (double) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            double intExtra3 = (double) registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzcux(d, z);
    }
}

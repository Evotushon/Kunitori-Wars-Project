package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzayw extends BroadcastReceiver {
    private final /* synthetic */ zzayt zzdwm;

    zzayw(zzayt zzayt) {
        this.zzdwm = zzayt;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzdwm.zzc(context, intent);
    }
}

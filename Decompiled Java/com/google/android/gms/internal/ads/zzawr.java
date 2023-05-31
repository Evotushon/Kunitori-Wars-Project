package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzawr extends BroadcastReceiver {
    private final /* synthetic */ zzawo zzduc;

    private zzawr(zzawo zzawo) {
        this.zzduc = zzawo;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.zzduc.zzyc = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.zzduc.zzyc = false;
        }
    }

    /* synthetic */ zzawr(zzawo zzawo, zzawn zzawn) {
        this(zzawo);
    }
}

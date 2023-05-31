package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdn implements Runnable {
    private final /* synthetic */ Context zzwj;
    private final /* synthetic */ View zzwl;
    private final /* synthetic */ Activity zzwm;

    zzdn(zzdi zzdi, Context context, View view, Activity activity) {
        this.zzwj = context;
        this.zzwl = view;
        this.zzwm = activity;
    }

    public final void run() {
        try {
            zzdi.zzvf.zza(this.zzwj, this.zzwl, this.zzwm);
        } catch (Exception e) {
            zzdi.zzvh.zza(2020, -1, e);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdm implements Runnable {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Context zzwj;
    private final /* synthetic */ String zzwk;
    private final /* synthetic */ View zzwl;

    zzdm(zzdi zzdi, Context context, String str, View view, Activity activity) {
        this.zzwj = context;
        this.zzwk = str;
        this.zzwl = view;
        this.val$activity = activity;
    }

    public final void run() {
        try {
            zzdi.zzvf.zza(this.zzwj, this.zzwk, this.zzwl, this.val$activity);
        } catch (Exception e) {
            zzdi.zzvh.zza(2021, -1, e);
        }
    }
}

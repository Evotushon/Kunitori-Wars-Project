package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaxe implements View.OnApplyWindowInsetsListener {
    private final zzaxb zzdue;
    private final Activity zzduf;

    zzaxe(zzaxb zzaxb, Activity activity) {
        this.zzdue = zzaxb;
        this.zzduf = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return zzaxb.zza(this.zzduf, view, windowInsets);
    }
}

package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzawx extends zzawy {
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public final ViewGroup.LayoutParams zzwu() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}

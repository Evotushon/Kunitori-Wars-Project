package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbag {
    public static void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzbaf(view, onGlobalLayoutListener).attach();
    }

    public static void zza(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new zzbai(view, onScrollChangedListener).attach();
    }
}

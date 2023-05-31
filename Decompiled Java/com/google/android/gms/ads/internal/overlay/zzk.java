package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbdv;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzk {
    public final int index;
    public final ViewGroup parent;
    public final ViewGroup.LayoutParams zzdip;
    public final Context zzur;

    public zzk(zzbdv zzbdv) throws zzi {
        this.zzdip = zzbdv.getLayoutParams();
        ViewParent parent2 = zzbdv.getParent();
        this.zzur = zzbdv.zzaaa();
        if (parent2 == null || !(parent2 instanceof ViewGroup)) {
            throw new zzi("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent2;
        this.index = this.parent.indexOfChild(zzbdv.getView());
        this.parent.removeView(zzbdv.getView());
        zzbdv.zzax(true);
    }
}

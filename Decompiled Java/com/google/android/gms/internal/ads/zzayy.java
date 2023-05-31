package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayy {
    private final View view;
    private boolean zzboi;
    private boolean zzbsm;
    private Activity zzdwu;
    private boolean zzdwv;
    private ViewTreeObserver.OnGlobalLayoutListener zzdww;
    private ViewTreeObserver.OnScrollChangedListener zzdwx = null;

    public zzayy(Activity activity, View view2, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzdwu = activity;
        this.view = view2;
        this.zzdww = onGlobalLayoutListener;
    }

    public final void zzh(Activity activity) {
        this.zzdwu = activity;
    }

    public final void zzxl() {
        this.zzbsm = true;
        if (this.zzboi) {
            zzxn();
        }
    }

    public final void zzxm() {
        this.zzbsm = false;
        zzxo();
    }

    public final void onAttachedToWindow() {
        this.zzboi = true;
        if (this.zzbsm) {
            zzxn();
        }
    }

    public final void onDetachedFromWindow() {
        this.zzboi = false;
        zzxo();
    }

    private final void zzxn() {
        ViewTreeObserver zzi;
        if (!this.zzdwv) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzdww;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.zzdwu;
                if (!(activity == null || (zzi = zzi(activity)) == null)) {
                    zzi.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                zzq.zzls();
                zzbag.zza(this.view, this.zzdww);
            }
            this.zzdwv = true;
        }
    }

    private final void zzxo() {
        ViewTreeObserver zzi;
        Activity activity = this.zzdwu;
        if (activity != null && this.zzdwv) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzdww;
            if (!(onGlobalLayoutListener == null || (zzi = zzi(activity)) == null)) {
                zzq.zzkx();
                zzi.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzdwv = false;
        }
    }

    private static ViewTreeObserver zzi(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}

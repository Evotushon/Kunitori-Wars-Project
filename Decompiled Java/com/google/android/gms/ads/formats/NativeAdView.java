package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacv;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.ads.zzzx;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbkk;
    private final zzacv zzbkl = zzjq();

    public NativeAdView(Context context) {
        super(context);
        this.zzbkk = zze(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbkk = zze(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbkk = zze(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbkk = zze(context);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public AdChoicesView getAdChoicesView() {
        View zzbq = zzbq(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbq instanceof AdChoicesView) {
            return (AdChoicesView) zzbq;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzbkl.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setAssetView on delegate", e);
        }
    }

    /* access modifiers changed from: protected */
    public final View zzbq(String str) {
        try {
            IObjectWrapper zzcp = this.zzbkl.zzcp(str);
            if (zzcp != null) {
                return (View) ObjectWrapper.unwrap(zzcp);
            }
            return null;
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzbkl.zza((IObjectWrapper) nativeAd.zzjo());
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setNativeAd on delegate", e);
        }
    }

    public void destroy() {
        try {
            this.zzbkl.destroy();
        } catch (RemoteException e) {
            zzazh.zzc("Unable to destroy native ad view", e);
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzacv zzjq() {
        Preconditions.checkNotNull(this.zzbkk, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzvh.zzpa().zza(this.zzbkk.getContext(), (FrameLayout) this, this.zzbkk);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbkk);
    }

    public void removeView(View view) {
        if (this.zzbkk != view) {
            super.removeView(view);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbkk);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbkk;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzacv zzacv = this.zzbkl;
        if (zzacv != null) {
            try {
                zzacv.zzc(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzacv zzacv;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmm)).booleanValue() && (zzacv = this.zzbkl) != null) {
            try {
                zzacv.zzf(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}

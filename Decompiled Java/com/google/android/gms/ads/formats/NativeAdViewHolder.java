package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacy;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzvh;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class NativeAdViewHolder {
    public static WeakHashMap<View, NativeAdViewHolder> zzbkn = new WeakHashMap<>();
    private zzacy zzbkm;
    private WeakReference<View> zzbko;

    public NativeAdViewHolder(View view, Map<String, View> map, Map<String, View> map2) {
        Preconditions.checkNotNull(view, "ContainerView must not be null");
        if ((view instanceof NativeAdView) || (view instanceof UnifiedNativeAdView)) {
            zzazh.zzey("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
        } else if (zzbkn.get(view) != null) {
            zzazh.zzey("The provided containerView is already in use with another NativeAdViewHolder.");
        } else {
            zzbkn.put(view, this);
            this.zzbko = new WeakReference<>(view);
            this.zzbkm = zzvh.zzpa().zza(view, zzb(map), zzb(map2));
        }
    }

    private static HashMap<String, View> zzb(Map<String, View> map) {
        if (map == null) {
            return new HashMap<>();
        }
        return new HashMap<>(map);
    }

    public final void setNativeAd(NativeAd nativeAd) {
        zza((IObjectWrapper) nativeAd.zzjo());
    }

    public final void setNativeAd(UnifiedNativeAd unifiedNativeAd) {
        zza((IObjectWrapper) unifiedNativeAd.zzjo());
    }

    private final void zza(IObjectWrapper iObjectWrapper) {
        WeakReference<View> weakReference = this.zzbko;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzazh.zzfa("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!zzbkn.containsKey(view)) {
            zzbkn.put(view, this);
        }
        zzacy zzacy = this.zzbkm;
        if (zzacy != null) {
            try {
                zzacy.zza(iObjectWrapper);
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void unregisterNativeAd() {
        zzacy zzacy = this.zzbkm;
        if (zzacy != null) {
            try {
                zzacy.unregisterNativeAd();
            } catch (RemoteException e) {
                zzazh.zzc("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference<View> weakReference = this.zzbko;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zzbkn.remove(view);
        }
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.zzbkm.zze(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzazh.zzc("Unable to call setClickConfirmingView on delegate", e);
        }
    }
}

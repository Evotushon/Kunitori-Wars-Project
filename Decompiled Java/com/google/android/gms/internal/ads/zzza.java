package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzza extends zzaek {
    private final ShouldDelayBannerRenderingListener zzcgj;

    public zzza(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.zzcgj = shouldDelayBannerRenderingListener;
    }

    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.zzcgj.shouldDelayBannerRendering((Runnable) ObjectWrapper.unwrap(iObjectWrapper));
    }
}

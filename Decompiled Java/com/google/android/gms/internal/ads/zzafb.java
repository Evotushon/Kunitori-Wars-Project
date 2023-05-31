package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzafb extends zzaee {
    /* access modifiers changed from: private */
    public final OnPublisherAdViewLoadedListener zzcxr;

    public zzafb(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzcxr = onPublisherAdViewLoadedListener;
    }

    public final void zza(zzvx zzvx, IObjectWrapper iObjectWrapper) {
        if (zzvx != null && iObjectWrapper != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzvx.zzki() instanceof zzud) {
                    zzud zzud = (zzud) zzvx.zzki();
                    publisherAdView.setAdListener(zzud != null ? zzud.getAdListener() : null);
                }
            } catch (RemoteException e) {
                zzazh.zzc("", e);
            }
            try {
                if (zzvx.zzkh() instanceof zzuo) {
                    zzuo zzuo = (zzuo) zzvx.zzkh();
                    if (zzuo != null) {
                        appEventListener = zzuo.getAppEventListener();
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzazh.zzc("", e2);
            }
            zzayx.zzyy.post(new zzafa(this, publisherAdView, zzvx));
        }
    }
}

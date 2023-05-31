package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzq extends zzadb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcal {
    private final WeakReference<View> zzfqc;
    private final Map<String, WeakReference<View>> zzfqd = new HashMap();
    private final Map<String, WeakReference<View>> zzfqe = new HashMap();
    private final Map<String, WeakReference<View>> zzfqf = new HashMap();
    @GuardedBy("this")
    private zzbyo zzfqg;
    private zzpp zzfqh;

    public zzbzq(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzq.zzls();
        zzbag.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzq.zzls();
        zzbag.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfqc = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.zzfqd.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzfqf.putAll(this.zzfqd);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.zzfqe.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzfqf.putAll(this.zzfqe);
        this.zzfqh = new zzpp(view.getContext(), view);
    }

    @Nullable
    public final FrameLayout zzale() {
        return null;
    }

    public final synchronized void unregisterNativeAd() {
        if (this.zzfqg != null) {
            this.zzfqg.zzb(this);
            this.zzfqg = null;
        }
    }

    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzbyo)) {
            zzawf.zzfa("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.zzfqg != null) {
            this.zzfqg.zzb(this);
        }
        if (((zzbyo) unwrap).zzajz()) {
            this.zzfqg = (zzbyo) unwrap;
            this.zzfqg.zza((zzcal) this);
            this.zzfqg.zzz(zzagm());
            return;
        }
        zzawf.zzey("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Nullable
    public final View zzagm() {
        return (View) this.zzfqc.get();
    }

    public final zzpp zzalf() {
        return this.zzfqh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfqf     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfqd     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfqe     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.zzfqf     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0045
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0045
        L_0x002f:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.zzfqd     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0047 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0047 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0045:
            monitor-exit(r1)
            return
        L_0x0047:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzq.zza(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized Map<String, WeakReference<View>> zzalg() {
        return this.zzfqf;
    }

    public final synchronized Map<String, WeakReference<View>> zzalh() {
        return this.zzfqd;
    }

    @Nullable
    public final synchronized Map<String, WeakReference<View>> zzali() {
        return this.zzfqe;
    }

    public final synchronized View zzgc(String str) {
        WeakReference weakReference = this.zzfqf.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final synchronized String zzalj() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Nullable
    public final synchronized IObjectWrapper zzalk() {
        return null;
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfqg != null) {
            this.zzfqg.zza(view, motionEvent, zzagm());
        }
        return false;
    }

    public final synchronized void onClick(View view) {
        if (this.zzfqg != null) {
            this.zzfqg.zza(view, zzagm(), zzalg(), zzalh(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.zzfqg != null) {
            this.zzfqg.zzb(zzagm(), zzalg(), zzalh(), zzbyo.zzy(zzagm()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.zzfqg != null) {
            this.zzfqg.zzb(zzagm(), zzalg(), zzalh(), zzbyo.zzy(zzagm()));
        }
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        if (this.zzfqg != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzawf.zzfa("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zzfqg.setClickConfirmingView((View) unwrap);
        }
    }
}

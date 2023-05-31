package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbzt extends zzacu implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcal {
    public static final String[] zzfqk = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private FrameLayout zzbkk;
    private zzacm zzcfx;
    private final int zzdxg;
    private boolean zzehn = false;
    @GuardedBy("this")
    private zzbyo zzfqg;
    private zzpp zzfqh;
    private final String zzfqj;
    @GuardedBy("this")
    private Map<String, WeakReference<View>> zzfql = new HashMap();
    private FrameLayout zzfqm;
    private zzdoe zzfqn;
    private View zzfqo;
    private IObjectWrapper zzfqp = null;
    private boolean zzfqq;

    public zzbzt(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzfqm = frameLayout;
        this.zzbkk = frameLayout2;
        this.zzdxg = i;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzfqj = str;
        zzq.zzls();
        zzbag.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzq.zzls();
        zzbag.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfqn = zzazq.zzdxo;
        this.zzfqh = new zzpp(this.zzfqm.getContext(), this.zzfqm);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zza(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.zzehn     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.zzfql     // Catch:{ all -> 0x0041 }
            r3.remove(r2)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.zzfql     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0041 }
            r0.<init>(r3)     // Catch:{ all -> 0x0041 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r4 != 0) goto L_0x003f
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x002b
            goto L_0x003f
        L_0x002b:
            int r2 = r1.zzdxg     // Catch:{ all -> 0x0041 }
            boolean r2 = com.google.android.gms.internal.ads.zzayl.zzcs(r2)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0036
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0041 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)
            return
        L_0x003f:
            monitor-exit(r1)
            return
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzt.zza(java.lang.String, android.view.View, boolean):void");
    }

    public final synchronized IObjectWrapper zzcp(String str) {
        return ObjectWrapper.wrap(zzgc(str));
    }

    public final synchronized View zzgc(String str) {
        if (this.zzehn) {
            return null;
        }
        WeakReference weakReference = this.zzfql.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.dynamic.IObjectWrapper r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzehn     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ all -> 0x004a }
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzbyo     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0016
            java.lang.String r2 = "Not an instance of native engine. This is most likely a transient error"
            com.google.android.gms.internal.ads.zzawf.zzfa(r2)     // Catch:{ all -> 0x004a }
            monitor-exit(r1)
            return
        L_0x0016:
            com.google.android.gms.internal.ads.zzbyo r0 = r1.zzfqg     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzbyo r0 = r1.zzfqg     // Catch:{ all -> 0x004a }
            r0.zzb(r1)     // Catch:{ all -> 0x004a }
        L_0x001f:
            r1.zzall()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zzbyo r2 = (com.google.android.gms.internal.ads.zzbyo) r2     // Catch:{ all -> 0x004a }
            r1.zzfqg = r2     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zzbyo r2 = r1.zzfqg     // Catch:{ all -> 0x004a }
            r2.zza((com.google.android.gms.internal.ads.zzcal) r1)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zzbyo r2 = r1.zzfqg     // Catch:{ all -> 0x004a }
            android.widget.FrameLayout r0 = r1.zzfqm     // Catch:{ all -> 0x004a }
            r2.zzz(r0)     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zzbyo r2 = r1.zzfqg     // Catch:{ all -> 0x004a }
            android.widget.FrameLayout r0 = r1.zzbkk     // Catch:{ all -> 0x004a }
            r2.zzaa(r0)     // Catch:{ all -> 0x004a }
            boolean r2 = r1.zzfqq     // Catch:{ all -> 0x004a }
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbyo r2 = r1.zzfqg     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zzbyu r2 = r2.zzakb()     // Catch:{ all -> 0x004a }
            com.google.android.gms.internal.ads.zzacm r0 = r1.zzcfx     // Catch:{ all -> 0x004a }
            r2.zza(r0)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r1)
            return
        L_0x004a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzt.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    private final synchronized void zzall() {
        this.zzfqn.execute(new zzbzs(this));
    }

    public final synchronized void destroy() {
        if (!this.zzehn) {
            if (this.zzfqg != null) {
                this.zzfqg.zzb(this);
                this.zzfqg = null;
            }
            this.zzfql.clear();
            this.zzfqm.removeAllViews();
            this.zzbkk.removeAllViews();
            this.zzfql = null;
            this.zzfqm = null;
            this.zzbkk = null;
            this.zzfqo = null;
            this.zzfqh = null;
            this.zzehn = true;
        }
    }

    public final synchronized void zzc(IObjectWrapper iObjectWrapper, int i) {
    }

    public final synchronized void onClick(View view) {
        if (this.zzfqg != null) {
            this.zzfqg.cancelUnconfirmedClick();
            this.zzfqg.zza(view, this.zzfqm, zzalg(), zzalh(), false);
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfqg != null) {
            this.zzfqg.zza(view, motionEvent, this.zzfqm);
        }
        return false;
    }

    public final synchronized void onGlobalLayout() {
        if (this.zzfqg != null) {
            this.zzfqg.zzb(this.zzfqm, zzalg(), zzalh(), zzbyo.zzy(this.zzfqm));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.zzfqg != null) {
            this.zzfqg.zzb(this.zzfqm, zzalg(), zzalh(), zzbyo.zzy(this.zzfqm));
        }
    }

    public final synchronized Map<String, WeakReference<View>> zzalg() {
        return this.zzfql;
    }

    public final synchronized Map<String, WeakReference<View>> zzalh() {
        return this.zzfql;
    }

    @Nullable
    public final synchronized Map<String, WeakReference<View>> zzali() {
        return null;
    }

    public final synchronized String zzalj() {
        return this.zzfqj;
    }

    public final FrameLayout zzale() {
        return this.zzbkk;
    }

    public final zzpp zzalf() {
        return this.zzfqh;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        this.zzfqg.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        if (!this.zzehn) {
            this.zzfqp = iObjectWrapper;
        }
    }

    @Nullable
    public final IObjectWrapper zzalk() {
        return this.zzfqp;
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzfqm, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(com.google.android.gms.internal.ads.zzacm r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzehn     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r0 = 1
            r1.zzfqq = r0     // Catch:{ all -> 0x001b }
            r1.zzcfx = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzbyo r0 = r1.zzfqg     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzbyo r0 = r1.zzfqg     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzbyu r0 = r0.zzakb()     // Catch:{ all -> 0x001b }
            r0.zza(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzt.zza(com.google.android.gms.internal.ads.zzacm):void");
    }

    public final /* synthetic */ View zzagm() {
        return this.zzfqm;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzalm() {
        if (this.zzfqo == null) {
            this.zzfqo = new View(this.zzfqm.getContext());
            this.zzfqo.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzfqm != this.zzfqo.getParent()) {
            this.zzfqm.addView(this.zzfqo);
        }
    }
}

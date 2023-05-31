package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzpp implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long zzbnt = ((Long) zzvh.zzpd().zzd(zzzx.zzcla)).longValue();
    private final WindowManager zzbnu;
    @Nullable
    @VisibleForTesting
    private BroadcastReceiver zzbnv;
    private WeakReference<View> zzbnw;
    private zzpw zzbnx;
    private zzayn zzbny = new zzayn(zzbnt);
    private boolean zzbnz = false;
    private final HashSet<zzpt> zzboa = new HashSet<>();
    private final Rect zzbob;
    private final DisplayMetrics zzwi;
    private Application zzxe;
    private final Context zzyz;
    private final PowerManager zzza;
    private final KeyguardManager zzzb;
    private WeakReference<ViewTreeObserver> zzzd;
    private int zzzh = -1;

    public zzpp(Context context, View view) {
        this.zzyz = context.getApplicationContext();
        this.zzbnu = (WindowManager) context.getSystemService("window");
        this.zzza = (PowerManager) this.zzyz.getSystemService("power");
        this.zzzb = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.zzyz;
        if (context2 instanceof Application) {
            this.zzxe = (Application) context2;
            this.zzbnx = new zzpw((Application) context2, this);
        }
        this.zzwi = context.getResources().getDisplayMetrics();
        this.zzbob = new Rect();
        this.zzbob.right = this.zzbnu.getDefaultDisplay().getWidth();
        this.zzbob.bottom = this.zzbnu.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzbnw;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzbnw = new WeakReference<>(view);
        if (view != null) {
            if (zzq.zzkx().isAttachedToWindow(view)) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void zza(zzpt zzpt) {
        this.zzboa.add(zzpt);
        zzbn(3);
    }

    public final void zzb(zzpt zzpt) {
        this.zzboa.remove(zzpt);
    }

    private final void zzcp() {
        zzawo.zzdtx.post(new zzps(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzzh = -1;
        zze(view);
        zzbn(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzzh = -1;
        zzbn(3);
        zzcp();
        zzf(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzbnw != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.zzbnw.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.zzzh = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzbn(3);
        zzcp();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzbn(3);
        zzcp();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzbn(3);
        zzcp();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzbn(3);
        zzcp();
    }

    public final void onActivityStopped(Activity activity) {
        zzbn(3);
        zzcp();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbn(3);
        zzcp();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzbn(3);
        zzcp();
    }

    public final void onGlobalLayout() {
        zzbn(2);
        zzcp();
    }

    public final void onScrollChanged() {
        zzbn(1);
    }

    /* access modifiers changed from: private */
    public final void zzbn(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> list;
        int i2 = i;
        if (this.zzboa.size() != 0 && (weakReference = this.zzbnw) != null) {
            View view = (View) weakReference.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    zzawf.zzc("Failure getting view location.", e);
                }
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = rect.left + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcld)).booleanValue() || view == null) {
                list = Collections.emptyList();
            } else {
                list = zzh(view);
            }
            List<Rect> list2 = list;
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i3 = this.zzzh;
            if (i3 != -1) {
                windowVisibility = i3;
            }
            boolean z5 = !z4 && zzq.zzkv().zza(view, this.zzza, this.zzzb) && z2 && z && windowVisibility == 0;
            if (z3 && !this.zzbny.tryAcquire() && z5 == this.zzbnz) {
                return;
            }
            if (z5 || this.zzbnz || i2 != 1) {
                zzpu zzpu = new zzpu(zzq.zzlc().elapsedRealtime(), this.zzza.isScreenOn(), view != null && zzq.zzkx().isAttachedToWindow(view), view != null ? view.getWindowVisibility() : 8, zza(this.zzbob), zza(rect), zza(rect2), z2, zza(rect3), z, zza(rect4), this.zzwi.density, z5, list2);
                Iterator<zzpt> it = this.zzboa.iterator();
                while (it.hasNext()) {
                    it.next().zza(zzpu);
                }
                this.zzbnz = z5;
            }
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzbo(rect.left), zzbo(rect.top), zzbo(rect.right), zzbo(rect.bottom));
    }

    private final int zzbo(int i) {
        return (int) (((float) i) / this.zzwi.density);
    }

    private final List<Rect> zzh(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(zza(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            zzq.zzkz().zza(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzzd = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzbnv == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzbnv = new zzpr(this);
            zzq.zzlq().zza(this.zzyz, this.zzbnv, intentFilter);
        }
        Application application = this.zzxe;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzbnx);
            } catch (Exception e) {
                zzawf.zzc("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzf(View view) {
        try {
            if (this.zzzd != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzzd.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzzd = null;
            }
        } catch (Exception e) {
            zzawf.zzc("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzawf.zzc("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzbnv != null) {
            try {
                zzq.zzlq().zza(this.zzyz, this.zzbnv);
            } catch (IllegalStateException e3) {
                zzawf.zzc("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzq.zzkz().zza(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzbnv = null;
        }
        Application application = this.zzxe;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzbnx);
            } catch (Exception e5) {
                zzawf.zzc("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void zzen(long j) {
        this.zzbny.zzfb(j);
    }

    public final void zzlu() {
        this.zzbny.zzfb(zzbnt);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzlv() {
        zzbn(3);
    }
}

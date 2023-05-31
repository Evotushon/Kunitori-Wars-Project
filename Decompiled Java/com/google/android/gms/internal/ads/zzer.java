package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzer implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler zzyy = new Handler(Looper.getMainLooper());
    private final zzei zzuy;
    private Application zzxe;
    private final Context zzyz;
    @Nullable
    private final PowerManager zzza;
    @Nullable
    private final KeyguardManager zzzb;
    private BroadcastReceiver zzzc;
    private WeakReference<ViewTreeObserver> zzzd;
    private WeakReference<View> zzze;
    private zzdx zzzf;
    private byte zzzg = -1;
    private int zzzh = -1;
    private long zzzi = -3;

    public zzer(zzei zzei, View view) {
        this.zzuy = zzei;
        this.zzyz = zzei.zzur;
        this.zzza = (PowerManager) this.zzyz.getSystemService("power");
        this.zzzb = (KeyguardManager) this.zzyz.getSystemService("keyguard");
        Context context = this.zzyz;
        if (context instanceof Application) {
            this.zzxe = (Application) context;
            this.zzzf = new zzdx((Application) context, this);
        }
        zzd(view);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        WeakReference<View> weakReference = this.zzze;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzf(view2);
        }
        this.zzze = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                zze(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.zzzi = -2;
            return;
        }
        this.zzzi = -3;
    }

    private final void zzcp() {
        zzyy.post(new zzeu(this));
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzzh = -1;
        zze(view);
        zzcr();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzzh = -1;
        zzcr();
        zzcp();
        zzf(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzze != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.zzze.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.zzzh = i;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzcr();
    }

    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzcr();
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzcr();
        zzcp();
    }

    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzcr();
    }

    public final void onActivityStopped(Activity activity) {
        zzcr();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcr();
    }

    public final void onActivityDestroyed(Activity activity) {
        zzcr();
    }

    public final void onGlobalLayout() {
        zzcr();
    }

    public final void onScrollChanged() {
        zzcr();
    }

    public final long zzcq() {
        if (this.zzzi <= -2 && this.zzze.get() == null) {
            this.zzzi = -3;
        }
        return this.zzzi;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r7 == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzcr() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.zzze
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0015
            r9.zzzi = r2
            r9.zzzg = r1
            return
        L_0x0015:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x0029
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x0029:
            android.os.PowerManager r7 = r9.zzza
            if (r7 == 0) goto L_0x0036
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x0036
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x0036:
            com.google.android.gms.internal.ads.zzei r7 = r9.zzuy
            boolean r7 = r7.zzcj()
            if (r7 != 0) goto L_0x006a
            android.app.KeyguardManager r7 = r9.zzzb
            if (r7 == 0) goto L_0x0069
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x0069
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzep.zzc(r0)
            if (r7 == 0) goto L_0x0065
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x0056
            r7 = 0
            goto L_0x005a
        L_0x0056:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x005a:
            if (r7 == 0) goto L_0x0065
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0065
            r7 = 1
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            if (r7 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            if (r5 != 0) goto L_0x006f
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x006f:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x007d
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x007d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x008b
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x008b:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.zzzh
            if (r5 == r1) goto L_0x0094
            r0 = r5
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x0099:
            byte r0 = r9.zzzg
            if (r0 == r4) goto L_0x00ad
            r9.zzzg = r4
            byte r0 = r9.zzzg
            if (r0 != 0) goto L_0x00a8
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00ab
        L_0x00a8:
            long r0 = (long) r0
            long r0 = r2 - r0
        L_0x00ab:
            r9.zzzi = r0
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzer.zzcr():void");
    }

    private final void zze(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzzd = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzzc == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzzc = new zzet(this);
            this.zzyz.registerReceiver(this.zzzc, intentFilter);
        }
        Application application = this.zzxe;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzzf);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031 A[SYNTHETIC, Splitter:B:17:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzf(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.zzzd     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.zzzd     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.zzzd = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002d }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002d
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002d }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002d }
        L_0x002d:
            android.content.BroadcastReceiver r4 = r3.zzzc
            if (r4 == 0) goto L_0x0038
            android.content.Context r1 = r3.zzyz     // Catch:{ Exception -> 0x0036 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r3.zzzc = r0
        L_0x0038:
            android.app.Application r4 = r3.zzxe
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzdx r0 = r3.zzzf     // Catch:{ Exception -> 0x0041 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzer.zzf(android.view.View):void");
    }
}

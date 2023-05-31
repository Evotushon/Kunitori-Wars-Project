package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzqj extends Thread {
    private final Object lock;
    private boolean started;
    private final int zzbos;
    private final int zzbou;
    private final boolean zzbov;
    private boolean zzbps;
    private boolean zzbpt;
    private final zzqg zzbpu;
    private final int zzbpv;
    private final int zzbpw;
    private final int zzbpx;
    private final int zzbpy;
    private final int zzbpz;
    private final int zzbqa;
    private final String zzbqb;
    private final boolean zzbqc;
    private final boolean zzbqd;

    public zzqj() {
        this(new zzqg());
    }

    @VisibleForTesting
    private zzqj(zzqg zzqg) {
        this.started = false;
        this.zzbps = false;
        this.zzbpt = false;
        this.zzbpu = zzqg;
        this.lock = new Object();
        this.zzbos = zzabc.zzctw.get().intValue();
        this.zzbpw = zzabc.zzctt.get().intValue();
        this.zzbou = zzabc.zzctx.get().intValue();
        this.zzbpx = zzabc.zzctv.get().intValue();
        this.zzbpy = ((Integer) zzvh.zzpd().zzd(zzzx.zzcik)).intValue();
        this.zzbpz = ((Integer) zzvh.zzpd().zzd(zzzx.zzcil)).intValue();
        this.zzbqa = ((Integer) zzvh.zzpd().zzd(zzzx.zzcim)).intValue();
        this.zzbpv = zzabc.zzcty.get().intValue();
        this.zzbqb = (String) zzvh.zzpd().zzd(zzzx.zzcio);
        this.zzbqc = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcip)).booleanValue();
        this.zzbov = ((Boolean) zzvh.zzpd().zzd(zzzx.zzciq)).booleanValue();
        this.zzbqd = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcir)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void zzmg() {
        synchronized (this.lock) {
            if (this.started) {
                zzawf.zzeb("Content hash thread already started, quiting...");
                return;
            }
            this.started = true;
            start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.google.android.gms.ads.internal.zzq.zzkz().zza(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.internal.ads.zzawf.zzeb("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        com.google.android.gms.internal.ads.zzawf.zzc("Error in ContentFetchTask", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0084 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[ExcHandler: InterruptedException (r0v1 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[LOOP:1: B:30:0x0084->B:42:0x0084, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = zzmh()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            if (r0 == 0) goto L_0x005a
            com.google.android.gms.internal.ads.zzqf r0 = com.google.android.gms.ads.internal.zzq.zzky()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            android.app.Activity r0 = r0.getActivity()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzawf.zzeb(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r4.zzmj()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            goto L_0x0062
        L_0x0019:
            if (r0 == 0) goto L_0x0062
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007b }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007b }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007b }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007b }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007b }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d, InterruptedException -> 0x007b }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzavr r2 = com.google.android.gms.ads.internal.zzq.zzkz()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zza(r0, r3)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzawf.zzeb(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
        L_0x004c:
            if (r1 == 0) goto L_0x0062
            if (r1 != 0) goto L_0x0051
            goto L_0x0062
        L_0x0051:
            com.google.android.gms.internal.ads.zzqm r0 = new com.google.android.gms.internal.ads.zzqm     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            goto L_0x0062
        L_0x005a:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzawf.zzeb(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            r4.zzmj()     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
        L_0x0062:
            int r0 = r4.zzbpv     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007b, Exception -> 0x006b }
            goto L_0x0081
        L_0x006b:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzawf.zzc(r1, r0)
            com.google.android.gms.internal.ads.zzavr r1 = com.google.android.gms.ads.internal.zzq.zzkz()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.zza(r0, r2)
            goto L_0x0081
        L_0x007b:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzawf.zzc(r1, r0)
        L_0x0081:
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
        L_0x0084:
            boolean r1 = r4.zzbps     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0093
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzawf.zzeb(r1)     // Catch:{ InterruptedException -> 0x0084 }
            java.lang.Object r1 = r4.lock     // Catch:{ InterruptedException -> 0x0084 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0084 }
            goto L_0x0084
        L_0x0093:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x0000
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0099:
            throw r1
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqj.run():void");
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzi(View view) {
        try {
            zzqd zzqd = new zzqd(this.zzbos, this.zzbpw, this.zzbou, this.zzbpx, this.zzbpy, this.zzbpz, this.zzbqa, this.zzbov);
            Context context = zzq.zzky().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzbqb)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzvh.zzpd().zzd(zzzx.zzcin), "id", context.getPackageName()));
                if (str != null && str.equals(this.zzbqb)) {
                    return;
                }
            }
            zzqn zza = zza(view, zzqd);
            zzqd.zzme();
            if (zza.zzbqk != 0 || zza.zzbql != 0) {
                if (zza.zzbql != 0 || zzqd.zzmf() != 0) {
                    if (zza.zzbql != 0 || !this.zzbpu.zza(zzqd)) {
                        this.zzbpu.zzc(zzqd);
                    }
                }
            }
        } catch (Exception e) {
            zzawf.zzc("Exception in fetchContentOnUIThread", e);
            zzq.zzkz().zza(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    private static boolean zzmh() {
        boolean z;
        try {
            Context context = zzq.zzky().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        z = false;
                    } else {
                        z = powerManager.isScreenOn();
                    }
                    if (z) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzq.zzkz().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    @VisibleForTesting
    private final zzqn zza(@Nullable View view, zzqd zzqd) {
        boolean z;
        if (view == null) {
            return new zzqn(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzqn(this, 0, 0);
            }
            zzqd.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new zzqn(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbdv)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.isAtLeastKitKat()) {
                z = false;
            } else {
                zzqd.zzmc();
                webView.post(new zzql(this, zzqd, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new zzqn(this, 0, 1);
            }
            return new zzqn(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new zzqn(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzqn zza = zza(viewGroup.getChildAt(i3), zzqd);
                i += zza.zzbqk;
                i2 += zza.zzbql;
            }
            return new zzqn(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zza(zzqd zzqd, WebView webView, String str, boolean z) {
        zzqd.zzmb();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzbqc || TextUtils.isEmpty(webView.getTitle())) {
                    zzqd.zza(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzqd.zza(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzqd.zzlw()) {
                this.zzbpu.zzb(zzqd);
            }
        } catch (JSONException unused) {
            zzawf.zzeb("Json string may be malformed.");
        } catch (Throwable th) {
            zzawf.zzb("Failed to get webview content.", th);
            zzq.zzkz().zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzqd zzmi() {
        return this.zzbpu.zzo(this.zzbqd);
    }

    public final void wakeup() {
        synchronized (this.lock) {
            this.zzbps = false;
            this.lock.notifyAll();
            zzawf.zzeb("ContentFetchThread: wakeup");
        }
    }

    private final void zzmj() {
        synchronized (this.lock) {
            this.zzbps = true;
            boolean z = this.zzbps;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            zzawf.zzeb(sb.toString());
        }
    }

    public final boolean zzmk() {
        return this.zzbps;
    }
}

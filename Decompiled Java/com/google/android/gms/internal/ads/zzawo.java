package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzawo {
    public static final zzdkp zzdtx = new zzawi(Looper.getMainLooper());
    /* access modifiers changed from: private */
    @GuardedBy("userAgentLock")
    public String zzbfa;
    private AtomicReference<Pattern> zzdtv = new AtomicReference<>((Object) null);
    private AtomicReference<Pattern> zzdtw = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Object zzdty = new Object();
    private boolean zzdtz = false;
    private boolean zzdua = false;
    /* access modifiers changed from: private */
    public boolean zzyc = true;

    public final void zza(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", zzr(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public static boolean zzq(Context context, String str) {
        Context zzac = zzars.zzac(context);
        return Wrappers.packageManager(zzac).checkPermission(str, zzac.getPackageName()) == 0;
    }

    public static void zzb(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            new zzayo(context, str, (String) obj).zzvw();
        }
    }

    public static String zza(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public final boolean zzaq(Context context) {
        if (this.zzdtz) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new zzawr(this, (zzawn) null), intentFilter);
        this.zzdtz = true;
        return true;
    }

    public final boolean zzar(Context context) {
        if (this.zzdua) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new zzaws(this, (zzawn) null), intentFilter);
        this.zzdua = true;
        return true;
    }

    public final void zza(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(zzr(context, str));
    }

    private static String zzwo() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[Catch:{ Exception -> 0x00b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzr(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zzdty
            monitor-enter(r0)
            java.lang.String r1 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = zzwo()     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.zzawu r1 = com.google.android.gms.ads.internal.zzq.zzkx()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.getDefaultUserAgent(r5)     // Catch:{ Exception -> 0x001d }
            r4.zzbfa = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.zzvh.zzoz()     // Catch:{ all -> 0x00d2 }
            boolean r1 = com.google.android.gms.internal.ads.zzayx.zzxj()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0068
            r1 = 0
            r4.zzbfa = r1     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.internal.ads.zzdkp r1 = zzdtx     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.internal.ads.zzawq r2 = new com.google.android.gms.internal.ads.zzawq     // Catch:{ all -> 0x00d2 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d2 }
            r1.post(r2)     // Catch:{ all -> 0x00d2 }
        L_0x003b:
            java.lang.String r1 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x006e
            java.lang.Object r1 = r4.zzdty     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = zzwo()     // Catch:{ all -> 0x00d2 }
            r4.zzbfa = r1     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d2 }
            r1 = r2
        L_0x0064:
            com.google.android.gms.internal.ads.zzawf.zzfa(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x003b
        L_0x0068:
            java.lang.String r1 = zzas(r5)     // Catch:{ all -> 0x00d2 }
            r4.zzbfa = r1     // Catch:{ all -> 0x00d2 }
        L_0x006e:
            java.lang.String r1 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            int r2 = r2.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d2 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            r3.append(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d2 }
            r4.zzbfa = r6     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch:{ Exception -> 0x00b6 }
            boolean r5 = r5.isCallerInstantApp()     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = r4.zzbfa     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b6 }
            r4.zzbfa = r5     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00c0
        L_0x00b6:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzavr r6 = com.google.android.gms.ads.internal.zzq.zzkz()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.zza(r5, r1)     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            java.lang.String r5 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d2 }
            r4.zzbfa = r5     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r4.zzbfa     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d6
        L_0x00d5:
            throw r5
        L_0x00d6:
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawo.zzr(android.content.Context, java.lang.String):java.lang.String");
    }

    @VisibleForTesting
    protected static String zzas(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return zzwo();
        }
    }

    public final JSONObject zzi(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                zza(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final JSONObject zza(@Nullable Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return zzd(bundle);
            } catch (JSONException e) {
                zzawf.zzc("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    public final JSONObject zzd(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            zza(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    private final JSONArray zza(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object zza : collection) {
            zza(jSONArray, (Object) zza);
        }
        return jSONArray;
    }

    private final void zza(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(zzd((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(zzi((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(zza((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object zza : (Object[]) obj) {
                zza(jSONArray2, zza);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    private final void zza(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, zzd((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, zzi((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, zza((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, zza((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    private static int zza(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A' || c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c - c2) + 10;
    }

    public static Map<String, String> zzi(Uri uri) {
        if (!zzabe.zzcuf.get().booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            zzq.zzkx();
            for (String next : uri.getQueryParameterNames()) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '%') {
                    byte[] bArr = new byte[((length - i) / 3)];
                    int i2 = 0;
                    while (i < length - 2 && charAt == '%') {
                        try {
                            bArr[i2] = (byte) ((zza(encodedQuery.charAt(i + 1)) << 4) + zza(encodedQuery.charAt(i + 2)));
                            i2++;
                        } catch (IllegalArgumentException unused) {
                        }
                        i += 3;
                        if (i < length) {
                            charAt = encodedQuery.charAt(i);
                        }
                    }
                    try {
                        sb3.append(new String(bArr, 0, i2, Constants.ENCODING));
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    if (charAt != '%') {
                    }
                } else if (charAt == '&') {
                    if (sb.length() > 0 && sb3 != sb) {
                        hashMap2.put(sb.toString(), sb2.toString());
                        sb.setLength(0);
                        sb2.setLength(0);
                    }
                    sb3 = sb;
                } else if (charAt == '+') {
                    sb3.append(' ');
                } else if (charAt != '=') {
                    sb3.append(charAt);
                } else if (sb3 != sb2) {
                    sb3 = sb2;
                } else {
                    sb3.append(charAt);
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    public static String zzwp() {
        return UUID.randomUUID().toString();
    }

    public static int zzej(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zzawf.zzfa(sb.toString());
            return 0;
        }
    }

    public static String zzwq() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static int[] zzwr() {
        return new int[]{0, 0};
    }

    public static int[] zzd(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return zzwr();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public final int[] zze(Activity activity) {
        int[] zzd = zzd(activity);
        return new int[]{zzvh.zzoz().zzc(activity, zzd[0]), zzvh.zzoz().zzc(activity, zzd[1])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] zzf(android.app.Activity r7) {
        /*
            r6 = this;
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = zzwr()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzayx r1 = com.google.android.gms.internal.ads.zzvh.zzoz()
            r5 = r4[r3]
            int r1 = r1.zzc(r7, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzayx r1 = com.google.android.gms.internal.ads.zzvh.zzoz()
            r3 = r4[r2]
            int r7 = r1.zzc(r7, r3)
            r0[r2] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawo.zzf(android.app.Activity):int[]");
    }

    public static boolean zzek(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static DisplayMetrics zza(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static AlertDialog.Builder zzat(Context context) {
        return new AlertDialog.Builder(context);
    }

    public static zzze zzau(Context context) {
        return new zzze(context);
    }

    public static Bitmap zzk(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static PopupWindow zza(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    @SuppressLint({"NewApi"})
    public static String zzav(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean zzaw(Context context) {
        boolean z;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                z = false;
                            } else {
                                z = powerManager.isScreenOn();
                            }
                            if (z) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void zza(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        zzq.zzkv();
        bundle.putString("device", zzwq());
        bundle.putString("eids", TextUtils.join(",", zzzx.zzqj()));
        zzvh.zzoz();
        zzayx.zza(context, str, str2, bundle, true, new zzawp(this, context, str));
    }

    public static void zzc(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzazq.zzdxk.execute(runnable);
        }
    }

    public static Bitmap zzl(View view) {
        if (view == null) {
            return null;
        }
        Bitmap zzn = zzn(view);
        return zzn == null ? zzm(view) : zzn;
    }

    private static Bitmap zzm(@NonNull View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            zzawf.zzfa("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            zzawf.zzc("Fail to capture the webview", e);
            return null;
        }
    }

    private static Bitmap zzn(@NonNull View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            zzawf.zzc("Fail to capture the web view", e);
        }
        return bitmap;
    }

    public static void zza(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int zzax(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    public final boolean zza(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zza(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzay(context));
    }

    @Nullable
    private static KeyguardManager zzay(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzawo r0 = com.google.android.gms.ads.internal.zzq.zzkv()
            boolean r0 = r0.zzyc
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            if (r6 != 0) goto L_0x000e
            r6 = 0
            goto L_0x0012
        L_0x000e:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r6 == 0) goto L_0x001d
            boolean r6 = zzo(r4)
            if (r6 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r6 = 0
            goto L_0x001e
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x0035
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r5 == 0) goto L_0x0063
            if (r6 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.zzzx.zzckz
            com.google.android.gms.internal.ads.zzzt r6 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r5 = r6.zzd(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L_0x0063
        L_0x0062:
            return r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawo.zza(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zzo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawo.zzo(android.view.View):boolean");
    }

    @TargetApi(16)
    public static boolean zzaz(Context context) {
        KeyguardManager zzay;
        if (context == null || !PlatformVersion.isAtLeastJellyBean() || (zzay = zzay(context)) == null || !zzay.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static int zzp(@Nullable View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static boolean zzba(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzawf.zzc("Error loading class.", th);
            zzq.zzkz().zza(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    @TargetApi(18)
    public static void zza(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzb(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zzawf.zzeb(sb.toString());
        } catch (ActivityNotFoundException e) {
            zzawf.zzc("No browser is found.", e);
        }
    }

    @TargetApi(18)
    public static void zzb(Context context, Intent intent) {
        if (intent != null && PlatformVersion.isAtLeastJellyBeanMR2()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static void zzc(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes(Constants.ENCODING));
            openFileOutput.close();
        } catch (Exception e) {
            zzawf.zzc("Error writing to file in internal storage.", e);
        }
    }

    public static String zzs(Context context, String str) {
        try {
            return new String(IOUtils.readInputStreamFully(context.openFileInput(str), true), Constants.ENCODING);
        } catch (IOException unused) {
            zzawf.zzeb("Error reading from internal storage.");
            return "";
        }
    }

    public final boolean zzel(String str) {
        return zza(str, this.zzdtv, (String) zzvh.zzpd().zzd(zzzx.zzcit));
    }

    public final boolean zzem(String str) {
        return zza(str, this.zzdtw, (String) zzvh.zzpd().zzd(zzzx.zzciu));
    }

    private static boolean zza(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String zzws() {
        Resources resources = zzq.zzkz().getResources();
        return resources != null ? resources.getString(R.string.s7) : "Test Ad";
    }

    @Nullable
    public static WebResourceResponse zzd(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzq.zzkv().zzr(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzaxx(context).zzc(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", Constants.ENCODING, new ByteArrayInputStream(str3.getBytes(Constants.ENCODING)));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzawf.zzd("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    public static WebResourceResponse zzd(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        zzq.zzkv();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        zzq.zzkv();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzq.zzkx().zza(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static void zza(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = zzabo.zzcvi.get().booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                CrashUtils.addDynamiteErrorToDropBox(context, th);
            }
        }
    }

    public static String zzbb(Context context) {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcqv)).booleanValue()) {
            return "";
        }
        return context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }

    public static Bundle zzbc(Context context) {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcqw)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, (String) null));
            }
        }
        return bundle;
    }

    public static boolean zzbd(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean zzen(String str) {
        if (!zzazb.isEnabled()) {
            return false;
        }
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcov)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzvh.zzpd().zzd(zzzx.zzcox);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzvh.zzpd().zzd(zzzx.zzcow);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String zzbe(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        try {
            Bundle bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return "";
            }
            String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            if (TextUtils.isEmpty(string)) {
                return "";
            }
            if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
                return string;
            }
            return "";
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zzawf.zza("Error getting metadata", e);
            return "";
        }
    }
}

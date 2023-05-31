package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzayx {
    private static final String zzdwn = AdView.class.getName();
    private static final String zzdwo = InterstitialAd.class.getName();
    private static final String zzdwp = PublisherAdView.class.getName();
    private static final String zzdwq = PublisherInterstitialAd.class.getName();
    private static final String zzdwr = SearchAdView.class.getName();
    private static final String zzdws = AdLoader.class.getName();
    public static final Handler zzyy = new zzdkp(Looper.getMainLooper());
    private float zzdwt = -1.0f;

    public static void zza(boolean z, HttpURLConnection httpURLConnection, @Nullable String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static int zzb(Context context, int i) {
        return zza(context.getResources().getDisplayMetrics(), i);
    }

    public static int zza(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public final int zzc(Context context, int i) {
        if (this.zzdwt < 0.0f) {
            synchronized (this) {
                if (this.zzdwt < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.zzdwt = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.zzdwt);
    }

    public static int zzb(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public final void zza(ViewGroup viewGroup, zzuk zzuk, String str, String str2) {
        zzazh.zzfa(str2);
        zza(viewGroup, zzuk, str, (int) SupportMenu.CATEGORY_MASK, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    public final void zza(ViewGroup viewGroup, zzuk zzuk, String str) {
        zza(viewGroup, zzuk, str, (int) ViewCompat.MEASURED_STATE_MASK, -1);
    }

    private final void zza(ViewGroup viewGroup, zzuk zzuk, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int zzb = zzb(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzuk.widthPixels - zzb, zzuk.heightPixels - zzb, 17));
            viewGroup.addView(frameLayout, zzuk.widthPixels, zzuk.heightPixels);
        }
    }

    public static String zzbl(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || zzxi()) {
            str = "emulator";
        }
        return zzet(str);
    }

    @Nullable
    public static String zzbm(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    public static boolean zzxi() {
        return Build.DEVICE.startsWith("generic");
    }

    public static boolean zzxj() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static String zzet(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean zzd(Context context, int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i) == 0;
    }

    public static boolean zzbn(Context context) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2;
    }

    public static boolean zzbo(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600) {
            return true;
        }
        return false;
    }

    @TargetApi(17)
    public static boolean zzbp(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    public static int zzbq(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @Nullable
    @VisibleForTesting
    public static String zza(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!zzdwn.equalsIgnoreCase(className) && !zzdwo.equalsIgnoreCase(className) && !zzdwp.equalsIgnoreCase(className) && !zzdwq.equalsIgnoreCase(className) && !zzdwr.equalsIgnoreCase(className) && !zzdws.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    public final void zza(Context context, @Nullable String str, String str2, Bundle bundle, boolean z) {
        zza(context, str, str2, bundle, true, new zzaza(this));
    }

    public static void zza(Context context, @Nullable String str, String str2, Bundle bundle, boolean z, zzazc zzazc) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(apkVersion);
            sb.append(".20089000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzazc.zzeo(appendQueryParameter.toString());
    }

    public static String zzxk() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static Throwable zzc(Throwable th) {
        if (zzabo.zzcvm.get().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (zzeu(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.AdSize zza(android.content.Context r1, int r2, int r3, int r4) {
        /*
            r3 = -1
            if (r1 != 0) goto L_0x0005
        L_0x0003:
            r1 = -1
            goto L_0x0040
        L_0x0005:
            android.content.Context r0 = r1.getApplicationContext()
            if (r0 == 0) goto L_0x000f
            android.content.Context r1 = r1.getApplicationContext()
        L_0x000f:
            android.content.res.Resources r1 = r1.getResources()
            if (r1 != 0) goto L_0x0016
            goto L_0x0003
        L_0x0016:
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            if (r0 != 0) goto L_0x001d
            goto L_0x0003
        L_0x001d:
            android.content.res.Configuration r1 = r1.getConfiguration()
            if (r1 != 0) goto L_0x0024
            goto L_0x0003
        L_0x0024:
            int r1 = r1.orientation
            if (r4 != 0) goto L_0x0029
            r4 = r1
        L_0x0029:
            if (r4 != r1) goto L_0x0036
            int r1 = r0.heightPixels
            float r1 = (float) r1
            float r4 = r0.density
            float r1 = r1 / r4
            int r1 = java.lang.Math.round(r1)
            goto L_0x0040
        L_0x0036:
            int r1 = r0.widthPixels
            float r1 = (float) r1
            float r4 = r0.density
            float r1 = r1 / r4
            int r1 = java.lang.Math.round(r1)
        L_0x0040:
            if (r1 != r3) goto L_0x0045
            com.google.android.gms.ads.AdSize r1 = com.google.android.gms.ads.AdSize.INVALID
            return r1
        L_0x0045:
            r3 = 90
            float r1 = (float) r1
            r4 = 1041865114(0x3e19999a, float:0.15)
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.min(r3, r1)
            r3 = 655(0x28f, float:9.18E-43)
            if (r2 <= r3) goto L_0x0066
            float r3 = (float) r2
            r4 = 1144389632(0x44360000, float:728.0)
            float r3 = r3 / r4
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            goto L_0x0091
        L_0x0066:
            r3 = 632(0x278, float:8.86E-43)
            if (r2 <= r3) goto L_0x006d
            r3 = 81
            goto L_0x0091
        L_0x006d:
            r3 = 526(0x20e, float:7.37E-43)
            if (r2 <= r3) goto L_0x007e
            float r3 = (float) r2
            r4 = 1139408896(0x43ea0000, float:468.0)
            float r3 = r3 / r4
            r4 = 1114636288(0x42700000, float:60.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            goto L_0x0091
        L_0x007e:
            r3 = 432(0x1b0, float:6.05E-43)
            if (r2 <= r3) goto L_0x0085
            r3 = 68
            goto L_0x0091
        L_0x0085:
            float r3 = (float) r2
            r4 = 1134559232(0x43a00000, float:320.0)
            float r3 = r3 / r4
            r4 = 1112014848(0x42480000, float:50.0)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
        L_0x0091:
            int r1 = java.lang.Math.min(r3, r1)
            r3 = 50
            int r1 = java.lang.Math.max(r1, r3)
            com.google.android.gms.ads.AdSize r3 = new com.google.android.gms.ads.AdSize
            r3.<init>(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayx.zza(android.content.Context, int, int, int):com.google.android.gms.ads.AdSize");
    }

    @VisibleForTesting
    public static boolean zzeu(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(zzabo.zzcvk.get());
    }
}

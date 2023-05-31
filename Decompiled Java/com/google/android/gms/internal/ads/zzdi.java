package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbo;
import com.google.android.gms.internal.ads.zzbs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzdi extends zzdj {
    private static final String TAG = zzdi.class.getSimpleName();
    private static long startTime = 0;
    /* access modifiers changed from: private */
    public static zzdc zzvf;
    private static ExecutorService zzvg;
    /* access modifiers changed from: private */
    public static zzdix zzvh;
    private static final Object zzvi = new Object();
    private static boolean zzvj = false;
    @VisibleForTesting
    private static boolean zzvk = false;
    protected boolean zzvl = false;
    private String zzvm;
    private boolean zzvn = false;
    private boolean zzvo = false;
    @VisibleForTesting
    private zzer zzvp;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static synchronized void zza(android.content.Context r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.internal.ads.zzdi> r0 = com.google.android.gms.internal.ads.zzdi.class
            monitor-enter(r0)
            boolean r1 = zzvk     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x008e
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0090 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            startTime = r1     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzei r10 = zzb(r9, r10)     // Catch:{ all -> 0x0090 }
            zzuy = r10     // Catch:{ all -> 0x0090 }
            r10 = 1
            zzvk = r10     // Catch:{ all -> 0x0090 }
            boolean r1 = zzbw()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x008e
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r10)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdix r1 = com.google.android.gms.internal.ads.zzdix.zza(r9, r1)     // Catch:{ all -> 0x0090 }
            zzvh = r1     // Catch:{ all -> 0x0090 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0090 }
            boolean r3 = zzbv()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdix r4 = zzvh     // Catch:{ all -> 0x0090 }
            r5 = 3005(0xbbd, float:4.211E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0090 }
            long r6 = r6 - r1
            r4.zzg(r5, r6)     // Catch:{ all -> 0x0090 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0090 }
            boolean r4 = zzc(r9)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdix r5 = zzvh     // Catch:{ all -> 0x0090 }
            r6 = 3006(0xbbe, float:4.212E-42)
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0090 }
            long r7 = r7 - r1
            r5.zzg(r6, r7)     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0057
            if (r4 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            zzvj = r1     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.zzdix r9 = zzvh     // Catch:{ all -> 0x0090 }
            r10 = 5005(0x138d, float:7.013E-42)
            r1 = -1
            r9.zzg(r10, r1)     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)
            return
        L_0x0067:
            com.google.android.gms.internal.ads.zzdix r3 = zzvh     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdc r7 = new com.google.android.gms.internal.ads.zzdc     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdka r4 = new com.google.android.gms.internal.ads.zzdka     // Catch:{ all -> 0x0090 }
            r4.<init>(r9)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdja r5 = new com.google.android.gms.internal.ads.zzdja     // Catch:{ all -> 0x0090 }
            r5.<init>(r9, r3)     // Catch:{ all -> 0x0090 }
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newFixedThreadPool(r10)     // Catch:{ all -> 0x0090 }
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0090 }
            zzvf = r7     // Catch:{ all -> 0x0090 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newFixedThreadPool(r10)     // Catch:{ all -> 0x0090 }
            zzvg = r9     // Catch:{ all -> 0x0090 }
            com.google.android.gms.internal.ads.zzdl r10 = new com.google.android.gms.internal.ads.zzdl     // Catch:{ all -> 0x0090 }
            r10.<init>()     // Catch:{ all -> 0x0090 }
            r9.execute(r10)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)
            return
        L_0x0090:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdi.zza(android.content.Context, boolean):void");
    }

    private static boolean zzar(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("64") || str.contains("v8")) {
            return true;
        }
        return false;
    }

    private static boolean zzbv() {
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0 && zzar(strArr[0])) {
                return true;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return zzar(zzdli.zzgzp.value()) || zzar(Build.CPU_ABI) || zzar(Build.CPU_ABI2);
    }

    private static boolean zzc(Context context) {
        File[] listFiles;
        FileInputStream fileInputStream;
        File file = new File(String.valueOf(context.getApplicationInfo().dataDir).concat("/lib"));
        if (!(!file.exists() || (listFiles = file.listFiles(new zzdmq(Pattern.compile(".*\\.so$", 2)))) == null || listFiles.length == 0)) {
            try {
                fileInputStream = new FileInputStream(listFiles[0]);
                byte[] bArr = new byte[5];
                if (fileInputStream.read(bArr) == 5 && bArr[4] == 1) {
                    fileInputStream.close();
                    return true;
                }
                fileInputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                zzdww.zza(th, th);
            }
        }
        return false;
        throw th;
    }

    private static boolean zzbw() {
        try {
            return ((Boolean) zzvh.zzpd().zzd(zzzx.zzcsj)).booleanValue();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private static boolean zzbx() {
        return zzbw() && !zzvj;
    }

    protected zzdi(Context context, String str, boolean z) {
        super(context);
        this.zzvm = str;
        this.zzvl = z;
    }

    private static zzei zzb(Context context, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (zzuy == null) {
            synchronized (zzvi) {
                if (zzuy == null) {
                    zzei zza = zzei.zza(context, "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", z);
                    if (zza.isInitialized()) {
                        try {
                            z2 = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcmb)).booleanValue();
                        } catch (IllegalStateException unused) {
                            z2 = false;
                        }
                        if (z2) {
                            zza.zza("YmR6FQNezGZtzakNCdp/X8yOsex9KR4dfN+xewlK0xIWqlIYp672W4ywsMH2gHbP", "NklASs7aYWmFe9YJqrin6meKy0Kr6kcwDcOgqDcpN3U=", new Class[0]);
                        }
                        zza.zza("qx4UdLiOxO035Rp2Sp5jdcIn7SxRXj1uC6nLGnC0V5PATHCv48yXpp/CIYW6LCQ1", "u/LSytBgFghDSxQZ2K1QNXzwbiqofQ/7a2BjJIFkPKQ=", Context.class);
                        zza.zza("mSF42fN/+dhiDz13eFTCeatQsb1ryp9iJsUAwIZ5/khK+5IBTSBKcV5w52ZlCKbD", "SteB3Djh0F6No+AbAKc2SxqRRFbsaQIzQ5W7drJ+aJU=", Context.class);
                        zza.zza("Et6rSyDWWbPSTkTj8+UxFOZVUx9Ssbbf3PsNWbZf4FzUjVViagIjECA3qPPgTmqA", "1sbZkWsB6A4+kqOegsEGy+qvkgmp1yQ8NroeoEOo+ZE=", Context.class);
                        zza.zza("LWLWHvq2nmNeeVR1+AieDAt33kX3Ph0F3RELGreUjtE768eeFei1N5fXM8AFUpQ2", "tPlymMBsPWMx9Jcyu21tBIn0g8HJ2Mp9r3tGly9G4gs=", Context.class);
                        zza.zza("Jc0u5xg7GmE6SS+dbHFANSyXa7JrqMxhPNLja5iLtJ3dUsfwI3w054G/VYMUh1W1", "mi1J+ws3EssJQuN03F9TjrYpKTGawEwHmLxvkU4VJs0=", Context.class);
                        zza.zza("mDzd4pimg/1s00KizSpf7pxFt7vA4fD9Hq1SCsw/jja5G4qY7KRPuPMOl1aloafq", "h1MKYtIXggqmV1DRu1SfDH7KGQTzGUBsJ3NwCixlyVo=", Context.class, Boolean.TYPE);
                        zza.zza("8hMDn6P0FZ40LFemwqBNLkAqLqdgypul8qVtD+VR/+TSyG78EQXDOUS39tc5Dmbj", "Mcifom/RASHODYaFgWqsAeMqXpaPaMTcohG07H5flsA=", Context.class);
                        zza.zza("eQTaGaLJfTj/6wy1qbzPfvCPsx/nqyZgskiW8GvlOIZziOUuHNOSydxxDpAhxto3", "rjKdDKrKZQEljz2+7aRtjC9KIKYR2bMECaH3lB/hD2Q=", Context.class);
                        zza.zza("Ae9+GIETYT0ekglr47kGKvddP9/W5ts0os804O2jByx5iRJfCcjS0M3zUUSW6zu9", "nESdITMFaK/0Ub/HGHG5xWdszcxRW457CAvGIX9dtQg=", MotionEvent.class, DisplayMetrics.class);
                        zza.zza("DsebolGfnOmE8f2kos4s5Rr8/N+Z/hcgzzLP9Tgxl5xKnAMiSXB7q1SIWBjT7s9a", "C2Nn5PmEwRZYQ6LV5i3ixtXbuoenQK2ZvX3aIEXwW7g=", MotionEvent.class, DisplayMetrics.class);
                        zza.zza("qHnyf1AJQ9zHNl8ID4EJelXdLPDqdEURrjOmyVLiOGO6/N1/HcQtTIamnEFaP9TI", "hDG/Y8NFdF4LVcGAkeeSN0jiIEzTlhndIfh5pVPm57k=", new Class[0]);
                        zza.zza("Mhq2egesEiC8lsCnnsUjn8xfaMmpUUJ4IZS5vHn/rnrgaLUJRfeM9wPDPTTtQ7XQ", "4tp407s2RsrfWPoD3r8SAU+ODX2ReUDk3z8J6S2496g=", new Class[0]);
                        zza.zza("5wmgguCWpa8A4GK/RTvWTg3nbCS9xRXZuWxVAJ2HTGATLbtCRSUc4I/tOpVxfW/Z", "mJbZgN0rHflH5yjCfGf53GbRI3tNbPDMzaQl5K0LYJA=", new Class[0]);
                        zza.zza("lsoOSydKzllVQl9FwpGPtp0F2AuN1oXwk9KL2Jud0i6e4komFDBggL1hWUVzVu5A", "bepHhwIoc7+Z7K24BJBDcklA+GUH66oGoI2amsHdFcc=", new Class[0]);
                        zza.zza("B2Ys5/N5/40gVBtPqHqCgi8WW0P8cGaUbxYWCaqJAo2Jd/bbGUMfMl4bZjEGEyHD", "uh6kuRlfuJRZEO1aKRdSxzZedSzl9DYU9qrT+HocXa0=", new Class[0]);
                        zza.zza("YPwiUiRFPwvCvSeE+AG0j1rLdqThO5FfY8VaOSDJirt5qOlzMJquzAMtqAx1TkI7", "gmtYkll3b18cIwDQCbn3+2mmQP68ZgMd/nlZjZtUM6A=", new Class[0]);
                        zza.zza("ZGYmBmml3Jd+/ITmzdkZiCas+8H+g+VfG9WXVKdB8BeHciADBp0w/FZDZILgs8dp", "OoI+FQzHPZRQuDYCYW5AOL0oCtDbK8VcMtJZFcOGeBk=", Context.class, Boolean.TYPE, Boolean.TYPE);
                        zza.zza("GxAlIXEz8vf05x5e9d3mPxErVtwiMZsensz74o5zbhxzuypY3YJa0sEo+8jsL1JF", "6fkJdbcpoaEXdvpcm/2IatfPgMOsbDWdtyMTuF63rO0=", StackTraceElement[].class);
                        zza.zza("py5uVuwAkD0OixTjdINk0VAwor0jNWb9vqw62qdDS+IH8szjJ686tbKQlukw7LZz", "R12hE4+XgQqdntVdjppWFRoA6DhycksBMsspuMiRA+0=", View.class, DisplayMetrics.class, Boolean.TYPE);
                        zza.zza("U0l9tWgODmFiQmVsm8cIQDp95cwDXh4tElGMa0ZvGogy7J8juQfz55AEkyjapnOD", "BYNxpoSmkBGBLpoKGqDNrWXiu1NajVpXWjm6XYKYRos=", Context.class, Boolean.TYPE);
                        zza.zza("Gq8i2sZunMkMVSFPbYPdfnK/NzWgJ7kBOBZB1WGR0hrkzk9rB7o5I/O31mcLapij", "REG23sc6MvGPG0VJZ+m9QIS+D8EqzQ/dYYsuYbzD33I=", View.class, Activity.class, Boolean.TYPE);
                        zza.zza("kLebhRa6mGS5mdiJPmtD5L4yghZsR49t7z4RJtEfzzU+iwFgZ/VlIxuuL0Hrp3mB", "2NKk5ECEEw+V8idRg8oF2XnjqFMIfO+550oWO0S/5IQ=", Long.TYPE);
                        try {
                            z3 = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcmh)).booleanValue();
                        } catch (IllegalStateException unused2) {
                            z3 = false;
                        }
                        if (z3) {
                            zza.zza("R4RLcG2RlpB1L13PeYUIvAmlGQ55lN+nAH8chTt6r/+m5OuDLtT3SysetnH/nvZd", "gD0mzmsTCOIXtNFcYnY0khyaMsFrS58c+lt5La686TY=", Context.class);
                        }
                        try {
                            z4 = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcmj)).booleanValue();
                        } catch (IllegalStateException unused3) {
                            z4 = false;
                        }
                        if (z4) {
                            zza.zza("Jy9/JNn7gPEbN3Hj/j57svWsuEbYHssIQM9lEkExt/jE2ycDsiYFB1JZTXeSWucL", "3KzLXNfXk4TQbHIvqQLV2IFkIvJRsrwOwwwSY6xNBck=", Context.class);
                        }
                        try {
                            z5 = ((Boolean) zzvh.zzpd().zzd(zzzx.zzcmk)).booleanValue();
                        } catch (IllegalStateException unused4) {
                            z5 = false;
                        }
                        if (z5) {
                            zza.zza("tt0x+hozcvNEZYenLeQrCmkbCJrgt7dHSNBckWEU0MLJBaKmUVANOEOcGO3VXVFn", "OOFbzfbBOCR27VmrEfYiPpiTX6PJscRF9fryyPsYIJg=", Context.class);
                        }
                    }
                    zzuy = zza;
                }
            }
        }
        return zzuy;
    }

    private static zzeq zza(zzei zzei, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzeh {
        Method zza = zzei.zza("Ae9+GIETYT0ekglr47kGKvddP9/W5ts0os804O2jByx5iRJfCcjS0M3zUUSW6zu9", "nESdITMFaK/0Ub/HGHG5xWdszcxRW457CAvGIX9dtQg=");
        if (zza == null || motionEvent == null) {
            throw new zzeh();
        }
        try {
            return new zzeq((String) zza.invoke((Object) null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzeh(e);
        }
    }

    /* access modifiers changed from: protected */
    public final zzbs.zza.zzb zza(Context context, zzbo.zza zza) {
        zzbs.zza.zzb zzao = zzbs.zza.zzao();
        if (!TextUtils.isEmpty(this.zzvm)) {
            zzao.zzag(this.zzvm);
        }
        zzei zzb = zzb(context, this.zzvl);
        if (zzb.zzcc() != null) {
            zza(zza(zzb, context, zzao, (zzbo.zza) null));
        }
        return zzao;
    }

    public final String zzb(Context context) {
        if (zzbx()) {
            zzvg.execute(new zzdk(this, context));
        }
        return super.zzb(context);
    }

    public final String zza(Context context, View view, Activity activity) {
        if (zzbx()) {
            zzvg.execute(new zzdn(this, context, view, activity));
        }
        return super.zza(context, view, activity);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        if (zzbx()) {
            zzvg.execute(new zzdm(this, context, str, view, activity));
        }
        return super.zza(context, str, view, activity);
    }

    public final void zza(MotionEvent motionEvent) {
        if (zzbx()) {
            zzvg.execute(new zzdp(this, motionEvent));
        }
        super.zza(motionEvent);
    }

    public final void zza(int i, int i2, int i3) {
        if (zzbx()) {
            zzvg.execute(new zzdo(this, i3, i, i2));
        }
        super.zza(i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public final zzbs.zza.zzb zzb(Context context, View view, Activity activity) {
        zzbs.zza.zzb zzag = zzbs.zza.zzao().zzag(this.zzvm);
        zza(zzb(context, this.zzvl), zzag, view, activity, false);
        return zzag;
    }

    /* access modifiers changed from: protected */
    public final zzbs.zza.zzb zzc(Context context, View view, Activity activity) {
        zzbs.zza.zzb zzao = zzbs.zza.zzao();
        if (!TextUtils.isEmpty(this.zzvm)) {
            zzao.zzag(this.zzvm);
        }
        zza(zzb(context, this.zzvl), zzao, view, activity, true);
        return zzao;
    }

    /* access modifiers changed from: protected */
    public List<Callable<Void>> zza(zzei zzei, Context context, zzbs.zza.zzb zzb, zzbo.zza zza) {
        int zzbs = zzei.zzbs();
        ArrayList arrayList = new ArrayList();
        if (!zzei.isInitialized()) {
            zzb.zzau((long) zzbs.zza.zzd.PSN_INITIALIZATION_FAIL.zzaf());
            return arrayList;
        }
        zzbs.zza.zzb zzb2 = zzb;
        zzei zzei2 = zzei;
        zzbs.zza.zzb zzb3 = zzb;
        arrayList.add(new zzex(zzei2, "ZGYmBmml3Jd+/ITmzdkZiCas+8H+g+VfG9WXVKdB8BeHciADBp0w/FZDZILgs8dp", "OoI+FQzHPZRQuDYCYW5AOL0oCtDbK8VcMtJZFcOGeBk=", zzb3, zzbs, 27, context, zza));
        arrayList.add(new zzfb(zzei2, "qHnyf1AJQ9zHNl8ID4EJelXdLPDqdEURrjOmyVLiOGO6/N1/HcQtTIamnEFaP9TI", "hDG/Y8NFdF4LVcGAkeeSN0jiIEzTlhndIfh5pVPm57k=", zzb3, startTime, zzbs, 25));
        int i = zzbs;
        arrayList.add(new zzfk(zzei2, "5wmgguCWpa8A4GK/RTvWTg3nbCS9xRXZuWxVAJ2HTGATLbtCRSUc4I/tOpVxfW/Z", "mJbZgN0rHflH5yjCfGf53GbRI3tNbPDMzaQl5K0LYJA=", zzb3, i, 1));
        arrayList.add(new zzfl(zzei2, "Et6rSyDWWbPSTkTj8+UxFOZVUx9Ssbbf3PsNWbZf4FzUjVViagIjECA3qPPgTmqA", "1sbZkWsB6A4+kqOegsEGy+qvkgmp1yQ8NroeoEOo+ZE=", zzb3, i, 31));
        arrayList.add(new zzfs(zzei2, "Mhq2egesEiC8lsCnnsUjn8xfaMmpUUJ4IZS5vHn/rnrgaLUJRfeM9wPDPTTtQ7XQ", "4tp407s2RsrfWPoD3r8SAU+ODX2ReUDk3z8J6S2496g=", zzb3, i, 33));
        arrayList.add(new zzey(zzei2, "mSF42fN/+dhiDz13eFTCeatQsb1ryp9iJsUAwIZ5/khK+5IBTSBKcV5w52ZlCKbD", "SteB3Djh0F6No+AbAKc2SxqRRFbsaQIzQ5W7drJ+aJU=", zzb3, i, 29, context));
        arrayList.add(new zzez(zzei2, "LWLWHvq2nmNeeVR1+AieDAt33kX3Ph0F3RELGreUjtE768eeFei1N5fXM8AFUpQ2", "tPlymMBsPWMx9Jcyu21tBIn0g8HJ2Mp9r3tGly9G4gs=", zzb3, i, 5));
        arrayList.add(new zzfh(zzei2, "Jc0u5xg7GmE6SS+dbHFANSyXa7JrqMxhPNLja5iLtJ3dUsfwI3w054G/VYMUh1W1", "mi1J+ws3EssJQuN03F9TjrYpKTGawEwHmLxvkU4VJs0=", zzb3, i, 12));
        arrayList.add(new zzfj(zzei2, "mDzd4pimg/1s00KizSpf7pxFt7vA4fD9Hq1SCsw/jja5G4qY7KRPuPMOl1aloafq", "h1MKYtIXggqmV1DRu1SfDH7KGQTzGUBsJ3NwCixlyVo=", zzb3, i, 3));
        arrayList.add(new zzfc(zzei2, "lsoOSydKzllVQl9FwpGPtp0F2AuN1oXwk9KL2Jud0i6e4komFDBggL1hWUVzVu5A", "bepHhwIoc7+Z7K24BJBDcklA+GUH66oGoI2amsHdFcc=", zzb3, i, 44));
        arrayList.add(new zzfg(zzei2, "B2Ys5/N5/40gVBtPqHqCgi8WW0P8cGaUbxYWCaqJAo2Jd/bbGUMfMl4bZjEGEyHD", "uh6kuRlfuJRZEO1aKRdSxzZedSzl9DYU9qrT+HocXa0=", zzb3, i, 22));
        arrayList.add(new zzfr(zzei2, "8hMDn6P0FZ40LFemwqBNLkAqLqdgypul8qVtD+VR/+TSyG78EQXDOUS39tc5Dmbj", "Mcifom/RASHODYaFgWqsAeMqXpaPaMTcohG07H5flsA=", zzb3, i, 48));
        arrayList.add(new zzev(zzei2, "eQTaGaLJfTj/6wy1qbzPfvCPsx/nqyZgskiW8GvlOIZziOUuHNOSydxxDpAhxto3", "rjKdDKrKZQEljz2+7aRtjC9KIKYR2bMECaH3lB/hD2Q=", zzb3, i, 49));
        arrayList.add(new zzfq(zzei2, "YPwiUiRFPwvCvSeE+AG0j1rLdqThO5FfY8VaOSDJirt5qOlzMJquzAMtqAx1TkI7", "gmtYkll3b18cIwDQCbn3+2mmQP68ZgMd/nlZjZtUM6A=", zzb3, i, 51));
        arrayList.add(new zzfo(zzei2, "U0l9tWgODmFiQmVsm8cIQDp95cwDXh4tElGMa0ZvGogy7J8juQfz55AEkyjapnOD", "BYNxpoSmkBGBLpoKGqDNrWXiu1NajVpXWjm6XYKYRos=", zzb3, i, 61));
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmk)).booleanValue()) {
            arrayList.add(new zzfi(zzei, "tt0x+hozcvNEZYenLeQrCmkbCJrgt7dHSNBckWEU0MLJBaKmUVANOEOcGO3VXVFn", "OOFbzfbBOCR27VmrEfYiPpiTX6PJscRF9fryyPsYIJg=", zzb, zzbs, 11));
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmh)).booleanValue()) {
            arrayList.add(new zzfm(zzei, "R4RLcG2RlpB1L13PeYUIvAmlGQ55lN+nAH8chTt6r/+m5OuDLtT3SysetnH/nvZd", "gD0mzmsTCOIXtNFcYnY0khyaMsFrS58c+lt5La686TY=", zzb, zzbs, 73));
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmj)).booleanValue()) {
            arrayList.add(new zzff(zzei, "Jy9/JNn7gPEbN3Hj/j57svWsuEbYHssIQM9lEkExt/jE2ycDsiYFB1JZTXeSWucL", "3KzLXNfXk4TQbHIvqQLV2IFkIvJRsrwOwwwSY6xNBck=", zzb, zzbs, 76));
        }
        return arrayList;
    }

    private final void zza(zzei zzei, zzbs.zza.zzb zzb, View view, Activity activity, boolean z) {
        List list;
        Long l;
        zzei zzei2 = zzei;
        zzbs.zza.zzb zzb2 = zzb;
        if (!zzei.isInitialized()) {
            zzb2.zzau((long) zzbs.zza.zzd.PSN_INITIALIZATION_FAIL.zzaf());
            list = Arrays.asList(new Callable[]{new zzfd(zzei2, zzb2)});
        } else {
            try {
                zzeq zza = zza(zzei2, this.zzvq, this.zzwi);
                if (zza.zzyn != null) {
                    zzb2.zzaq(zza.zzyn.longValue());
                }
                if (zza.zzyo != null) {
                    zzb2.zzar(zza.zzyo.longValue());
                }
                if (zza.zzyp != null) {
                    zzb2.zzas(zza.zzyp.longValue());
                }
                if (this.zzwh) {
                    if (zza.zzyq != null) {
                        zzb2.zzbb(zza.zzyq.longValue());
                    }
                    if (zza.zzyr != null) {
                        zzb2.zzbc(zza.zzyr.longValue());
                    }
                }
            } catch (zzeh unused) {
            }
            zzbs.zza.zze.C0006zza zzas = zzbs.zza.zze.zzas();
            if (this.zzvs > 0 && zzep.zza(this.zzwi)) {
                zzas.zzcv(zzep.zza(this.zzvz, this.zzwi));
                zzas.zzcw(zzep.zza((double) (this.zzwe - this.zzwc), this.zzwi)).zzcx(zzep.zza((double) (this.zzwf - this.zzwd), this.zzwi)).zzda(zzep.zza((double) this.zzwc, this.zzwi)).zzdb(zzep.zza((double) this.zzwd, this.zzwi));
                if (this.zzwh && this.zzvq != null) {
                    long zza2 = zzep.zza((double) (((this.zzwc - this.zzwe) + this.zzvq.getRawX()) - this.zzvq.getX()), this.zzwi);
                    if (zza2 != 0) {
                        zzas.zzcy(zza2);
                    }
                    long zza3 = zzep.zza((double) (((this.zzwd - this.zzwf) + this.zzvq.getRawY()) - this.zzvq.getY()), this.zzwi);
                    if (zza3 != 0) {
                        zzas.zzcz(zza3);
                    }
                }
            }
            try {
                zzeq zzb3 = zzb(this.zzvq);
                if (zzb3.zzyn != null) {
                    zzas.zzcl(zzb3.zzyn.longValue());
                }
                if (zzb3.zzyo != null) {
                    zzas.zzcm(zzb3.zzyo.longValue());
                }
                zzas.zzcr(zzb3.zzyp.longValue());
                if (this.zzwh) {
                    if (zzb3.zzyr != null) {
                        zzas.zzcn(zzb3.zzyr.longValue());
                    }
                    if (zzb3.zzyq != null) {
                        zzas.zzcp(zzb3.zzyq.longValue());
                    }
                    if (zzb3.zzys != null) {
                        zzas.zzm(zzb3.zzys.longValue() != 0 ? zzcd.ENUM_TRUE : zzcd.ENUM_FALSE);
                    }
                    if (this.zzvt > 0) {
                        if (zzep.zza(this.zzwi)) {
                            double d = (double) this.zzvy;
                            double d2 = (double) this.zzvt;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            l = Long.valueOf(Math.round(d / d2));
                        } else {
                            l = null;
                        }
                        if (l != null) {
                            zzas.zzco(l.longValue());
                        } else {
                            zzas.zzaw();
                        }
                        double d3 = (double) this.zzvx;
                        double d4 = (double) this.zzvt;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        zzas.zzcq(Math.round(d3 / d4));
                    }
                    if (zzb3.zzyv != null) {
                        zzas.zzct(zzb3.zzyv.longValue());
                    }
                    if (zzb3.zzyw != null) {
                        zzas.zzcs(zzb3.zzyw.longValue());
                    }
                    if (zzb3.zzyx != null) {
                        zzas.zzn(zzb3.zzyx.longValue() != 0 ? zzcd.ENUM_TRUE : zzcd.ENUM_FALSE);
                    }
                }
            } catch (zzeh unused2) {
            }
            if (this.zzvw > 0) {
                zzas.zzcu(this.zzvw);
            }
            zzb2.zzc((zzbs.zza.zze) ((zzdyz) zzas.zzbcx()));
            if (this.zzvs > 0) {
                zzb2.zzbf(this.zzvs);
            }
            if (this.zzvt > 0) {
                zzb2.zzbe(this.zzvt);
            }
            if (this.zzvu > 0) {
                zzb2.zzbd(this.zzvu);
            }
            if (this.zzvv > 0) {
                zzb2.zzbg(this.zzvv);
            }
            try {
                int size = this.zzvr.size() - 1;
                if (size > 0) {
                    zzb.zzaq();
                    for (int i = 0; i < size; i++) {
                        zzeq zza4 = zza(zzuy, (MotionEvent) this.zzvr.get(i), this.zzwi);
                        zzb2.zzd((zzbs.zza.zze) ((zzdyz) zzbs.zza.zze.zzas().zzcl(zza4.zzyn.longValue()).zzcm(zza4.zzyo.longValue()).zzbcx()));
                    }
                }
            } catch (zzeh unused3) {
                zzb.zzaq();
            }
            list = new ArrayList();
            if (zzei.zzcc() != null) {
                int zzbs = zzei.zzbs();
                list.add(new zzfd(zzei2, zzb2));
                zzei zzei3 = zzei;
                zzbs.zza.zzb zzb4 = zzb;
                list.add(new zzfk(zzei3, "5wmgguCWpa8A4GK/RTvWTg3nbCS9xRXZuWxVAJ2HTGATLbtCRSUc4I/tOpVxfW/Z", "mJbZgN0rHflH5yjCfGf53GbRI3tNbPDMzaQl5K0LYJA=", zzb4, zzbs, 1));
                list.add(new zzfb(zzei3, "qHnyf1AJQ9zHNl8ID4EJelXdLPDqdEURrjOmyVLiOGO6/N1/HcQtTIamnEFaP9TI", "hDG/Y8NFdF4LVcGAkeeSN0jiIEzTlhndIfh5pVPm57k=", zzb4, startTime, zzbs, 25));
                int i2 = zzbs;
                list.add(new zzfc(zzei3, "lsoOSydKzllVQl9FwpGPtp0F2AuN1oXwk9KL2Jud0i6e4komFDBggL1hWUVzVu5A", "bepHhwIoc7+Z7K24BJBDcklA+GUH66oGoI2amsHdFcc=", zzb4, i2, 44));
                list.add(new zzfh(zzei3, "Jc0u5xg7GmE6SS+dbHFANSyXa7JrqMxhPNLja5iLtJ3dUsfwI3w054G/VYMUh1W1", "mi1J+ws3EssJQuN03F9TjrYpKTGawEwHmLxvkU4VJs0=", zzb4, i2, 12));
                list.add(new zzfj(zzei3, "mDzd4pimg/1s00KizSpf7pxFt7vA4fD9Hq1SCsw/jja5G4qY7KRPuPMOl1aloafq", "h1MKYtIXggqmV1DRu1SfDH7KGQTzGUBsJ3NwCixlyVo=", zzb4, i2, 3));
                list.add(new zzfg(zzei3, "B2Ys5/N5/40gVBtPqHqCgi8WW0P8cGaUbxYWCaqJAo2Jd/bbGUMfMl4bZjEGEyHD", "uh6kuRlfuJRZEO1aKRdSxzZedSzl9DYU9qrT+HocXa0=", zzb4, i2, 22));
                list.add(new zzez(zzei3, "LWLWHvq2nmNeeVR1+AieDAt33kX3Ph0F3RELGreUjtE768eeFei1N5fXM8AFUpQ2", "tPlymMBsPWMx9Jcyu21tBIn0g8HJ2Mp9r3tGly9G4gs=", zzb4, i2, 5));
                list.add(new zzfr(zzei3, "8hMDn6P0FZ40LFemwqBNLkAqLqdgypul8qVtD+VR/+TSyG78EQXDOUS39tc5Dmbj", "Mcifom/RASHODYaFgWqsAeMqXpaPaMTcohG07H5flsA=", zzb4, i2, 48));
                list.add(new zzev(zzei3, "eQTaGaLJfTj/6wy1qbzPfvCPsx/nqyZgskiW8GvlOIZziOUuHNOSydxxDpAhxto3", "rjKdDKrKZQEljz2+7aRtjC9KIKYR2bMECaH3lB/hD2Q=", zzb4, i2, 49));
                list.add(new zzfq(zzei3, "YPwiUiRFPwvCvSeE+AG0j1rLdqThO5FfY8VaOSDJirt5qOlzMJquzAMtqAx1TkI7", "gmtYkll3b18cIwDQCbn3+2mmQP68ZgMd/nlZjZtUM6A=", zzb4, i2, 51));
                list.add(new zzfn(zzei3, "GxAlIXEz8vf05x5e9d3mPxErVtwiMZsensz74o5zbhxzuypY3YJa0sEo+8jsL1JF", "6fkJdbcpoaEXdvpcm/2IatfPgMOsbDWdtyMTuF63rO0=", zzb4, i2, 45, new Throwable().getStackTrace()));
                list.add(new zzfu(zzei3, "py5uVuwAkD0OixTjdINk0VAwor0jNWb9vqw62qdDS+IH8szjJ686tbKQlukw7LZz", "R12hE4+XgQqdntVdjppWFRoA6DhycksBMsspuMiRA+0=", zzb4, i2, 57, view));
                list.add(new zzfo(zzei3, "U0l9tWgODmFiQmVsm8cIQDp95cwDXh4tElGMa0ZvGogy7J8juQfz55AEkyjapnOD", "BYNxpoSmkBGBLpoKGqDNrWXiu1NajVpXWjm6XYKYRos=", zzb4, i2, 61));
                if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclu)).booleanValue()) {
                    list.add(new zzew(zzei, "Gq8i2sZunMkMVSFPbYPdfnK/NzWgJ7kBOBZB1WGR0hrkzk9rB7o5I/O31mcLapij", "REG23sc6MvGPG0VJZ+m9QIS+D8EqzQ/dYYsuYbzD33I=", zzb, zzbs, 62, view, activity));
                }
                if (z) {
                    if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclw)).booleanValue()) {
                        list.add(new zzfp(zzei, "kLebhRa6mGS5mdiJPmtD5L4yghZsR49t7z4RJtEfzzU+iwFgZ/VlIxuuL0Hrp3mB", "2NKk5ECEEw+V8idRg8oF2XnjqFMIfO+550oWO0S/5IQ=", zzb, zzbs, 53, this.zzvp));
                    }
                }
            }
        }
        zza((List<Callable<Void>>) list);
    }

    private static void zza(List<Callable<Void>> list) {
        ExecutorService zzcc;
        if (zzuy != null && (zzcc = zzuy.zzcc()) != null && !list.isEmpty()) {
            try {
                zzcc.invokeAll(list, ((Long) zzvh.zzpd().zzd(zzzx.zzclt)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                Log.d(TAG, String.format("class methods got exception: %s", new Object[]{zzep.zza((Throwable) e)}));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final zzeq zzb(MotionEvent motionEvent) throws zzeh {
        Method zza = zzuy.zza("DsebolGfnOmE8f2kos4s5Rr8/N+Z/hcgzzLP9Tgxl5xKnAMiSXB7q1SIWBjT7s9a", "C2Nn5PmEwRZYQ6LV5i3ixtXbuoenQK2ZvX3aIEXwW7g=");
        if (zza == null || motionEvent == null) {
            throw new zzeh();
        }
        try {
            return new zzeq((String) zza.invoke((Object) null, new Object[]{motionEvent, this.zzwi}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzeh(e);
        }
    }

    /* access modifiers changed from: protected */
    public final long zza(StackTraceElement[] stackTraceElementArr) throws zzeh {
        Method zza = zzuy.zza("GxAlIXEz8vf05x5e9d3mPxErVtwiMZsensz74o5zbhxzuypY3YJa0sEo+8jsL1JF", "6fkJdbcpoaEXdvpcm/2IatfPgMOsbDWdtyMTuF63rO0=");
        if (zza == null || stackTraceElementArr == null) {
            throw new zzeh();
        }
        try {
            return new zzeg((String) zza.invoke((Object) null, new Object[]{stackTraceElementArr})).zzxl.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzeh(e);
        }
    }

    public final void zzb(View view) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzclw)).booleanValue()) {
            zzer zzer = this.zzvp;
            if (zzer == null) {
                this.zzvp = new zzer(zzuy, view);
            } else {
                zzer.zzd(view);
            }
        }
    }
}

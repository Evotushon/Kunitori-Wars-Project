package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbs;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzei {
    private static final String TAG = "zzei";
    protected Context zzur;
    private volatile boolean zzvl = false;
    private ExecutorService zzxo;
    private DexClassLoader zzxp;
    private zzds zzxq;
    private byte[] zzxr;
    private volatile AdvertisingIdClient zzxs = null;
    private Future zzxt = null;
    private boolean zzxu;
    /* access modifiers changed from: private */
    public volatile zzbs.zza zzxv = null;
    private Future zzxw = null;
    private zzde zzxx;
    private boolean zzxy = false;
    private boolean zzxz = false;
    private Map<Pair<String, String>, zzft> zzya;
    private boolean zzyb = false;
    /* access modifiers changed from: private */
    public boolean zzyc;
    private boolean zzyd;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    final class zza extends BroadcastReceiver {
        private zza() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                boolean unused = zzei.this.zzyc = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = zzei.this.zzyc = false;
            }
        }

        /* synthetic */ zza(zzei zzei, zzel zzel) {
            this();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48|69) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004d */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A[Catch:{ zzdv -> 0x0150, zzeh -> 0x0157 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ zzdv -> 0x0150, zzeh -> 0x0157 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzei zza(android.content.Context r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            com.google.android.gms.internal.ads.zzei r1 = new com.google.android.gms.internal.ads.zzei
            r1.<init>(r9)
            com.google.android.gms.internal.ads.zzel r9 = new com.google.android.gms.internal.ads.zzel     // Catch:{ zzeh -> 0x0157 }
            r9.<init>()     // Catch:{ zzeh -> 0x0157 }
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.newCachedThreadPool(r9)     // Catch:{ zzeh -> 0x0157 }
            r1.zzxo = r9     // Catch:{ zzeh -> 0x0157 }
            r1.zzvl = r12     // Catch:{ zzeh -> 0x0157 }
            if (r12 == 0) goto L_0x0023
            java.util.concurrent.ExecutorService r9 = r1.zzxo     // Catch:{ zzeh -> 0x0157 }
            com.google.android.gms.internal.ads.zzek r12 = new com.google.android.gms.internal.ads.zzek     // Catch:{ zzeh -> 0x0157 }
            r12.<init>(r1)     // Catch:{ zzeh -> 0x0157 }
            java.util.concurrent.Future r9 = r9.submit(r12)     // Catch:{ zzeh -> 0x0157 }
            r1.zzxt = r9     // Catch:{ zzeh -> 0x0157 }
        L_0x0023:
            java.util.concurrent.ExecutorService r9 = r1.zzxo     // Catch:{ zzeh -> 0x0157 }
            com.google.android.gms.internal.ads.zzem r12 = new com.google.android.gms.internal.ads.zzem     // Catch:{ zzeh -> 0x0157 }
            r12.<init>(r1)     // Catch:{ zzeh -> 0x0157 }
            r9.execute(r12)     // Catch:{ zzeh -> 0x0157 }
            r9 = 1
            r12 = 0
            com.google.android.gms.common.GoogleApiAvailabilityLight r2 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()     // Catch:{ Throwable -> 0x004d }
            android.content.Context r3 = r1.zzur     // Catch:{ Throwable -> 0x004d }
            int r3 = r2.getApkVersion(r3)     // Catch:{ Throwable -> 0x004d }
            if (r3 <= 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r1.zzxy = r3     // Catch:{ Throwable -> 0x004d }
            android.content.Context r3 = r1.zzur     // Catch:{ Throwable -> 0x004d }
            int r2 = r2.isGooglePlayServicesAvailable(r3)     // Catch:{ Throwable -> 0x004d }
            if (r2 != 0) goto L_0x004a
            r2 = 1
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            r1.zzxz = r2     // Catch:{ Throwable -> 0x004d }
        L_0x004d:
            r1.zza((int) r12, (boolean) r9)     // Catch:{ zzeh -> 0x0157 }
            boolean r2 = com.google.android.gms.internal.ads.zzep.isMainThread()     // Catch:{ zzeh -> 0x0157 }
            if (r2 == 0) goto L_0x0071
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzzx.zzcme     // Catch:{ zzeh -> 0x0157 }
            com.google.android.gms.internal.ads.zzzt r3 = com.google.android.gms.internal.ads.zzvh.zzpd()     // Catch:{ zzeh -> 0x0157 }
            java.lang.Object r2 = r3.zzd(r2)     // Catch:{ zzeh -> 0x0157 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ zzeh -> 0x0157 }
            boolean r2 = r2.booleanValue()     // Catch:{ zzeh -> 0x0157 }
            if (r2 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ zzeh -> 0x0157 }
            java.lang.String r10 = "Task Context initialization must not be called from the UI thread."
            r9.<init>(r10)     // Catch:{ zzeh -> 0x0157 }
            throw r9     // Catch:{ zzeh -> 0x0157 }
        L_0x0071:
            com.google.android.gms.internal.ads.zzds r2 = new com.google.android.gms.internal.ads.zzds     // Catch:{ zzeh -> 0x0157 }
            r3 = 0
            r2.<init>(r3)     // Catch:{ zzeh -> 0x0157 }
            r1.zzxq = r2     // Catch:{ zzeh -> 0x0157 }
            com.google.android.gms.internal.ads.zzds r2 = r1.zzxq     // Catch:{ zzdv -> 0x0150 }
            byte[] r10 = r2.zzas(r10)     // Catch:{ zzdv -> 0x0150 }
            r1.zzxr = r10     // Catch:{ zzdv -> 0x0150 }
            android.content.Context r10 = r1.zzur     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.io.File r10 = r10.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            if (r10 != 0) goto L_0x009a
            android.content.Context r10 = r1.zzur     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r2 = "dex"
            java.io.File r10 = r10.getDir(r2, r12)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            if (r10 == 0) goto L_0x0094
            goto L_0x009a
        L_0x0094:
            com.google.android.gms.internal.ads.zzeh r9 = new com.google.android.gms.internal.ads.zzeh     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            throw r9     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
        L_0x009a:
            java.lang.String r2 = "1571257279724"
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r5 = "%s/%s.jar"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r7[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r7[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r5 = java.lang.String.format(r5, r7)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            boolean r5 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            if (r5 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.zzds r5 = r1.zzxq     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r7 = r1.zzxr     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            byte[] r11 = r5.zza(r7, r11)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r5.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            int r7 = r11.length     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r5.write(r11, r12, r7)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
        L_0x00cb:
            r1.zzb((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            dalvik.system.DexClassLoader r11 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011f }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x011f }
            java.lang.String r7 = r10.getAbsolutePath()     // Catch:{ all -> 0x011f }
            android.content.Context r8 = r1.zzur     // Catch:{ all -> 0x011f }
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ all -> 0x011f }
            r11.<init>(r5, r7, r3, r8)     // Catch:{ all -> 0x011f }
            r1.zzxp = r11     // Catch:{ all -> 0x011f }
            zzb(r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r1.zza((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r11[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r11[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r10 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            zzat(r10)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            boolean r10 = r1.zzyd     // Catch:{ zzeh -> 0x0157 }
            if (r10 != 0) goto L_0x0115
            android.content.IntentFilter r10 = new android.content.IntentFilter     // Catch:{ zzeh -> 0x0157 }
            r10.<init>()     // Catch:{ zzeh -> 0x0157 }
            java.lang.String r11 = "android.intent.action.USER_PRESENT"
            r10.addAction(r11)     // Catch:{ zzeh -> 0x0157 }
            java.lang.String r11 = "android.intent.action.SCREEN_OFF"
            r10.addAction(r11)     // Catch:{ zzeh -> 0x0157 }
            android.content.Context r11 = r1.zzur     // Catch:{ zzeh -> 0x0157 }
            com.google.android.gms.internal.ads.zzei$zza r12 = new com.google.android.gms.internal.ads.zzei$zza     // Catch:{ zzeh -> 0x0157 }
            r12.<init>(r1, r3)     // Catch:{ zzeh -> 0x0157 }
            r11.registerReceiver(r12, r10)     // Catch:{ zzeh -> 0x0157 }
            r1.zzyd = r9     // Catch:{ zzeh -> 0x0157 }
        L_0x0115:
            com.google.android.gms.internal.ads.zzde r10 = new com.google.android.gms.internal.ads.zzde     // Catch:{ zzeh -> 0x0157 }
            r10.<init>(r1)     // Catch:{ zzeh -> 0x0157 }
            r1.zzxx = r10     // Catch:{ zzeh -> 0x0157 }
            r1.zzyb = r9     // Catch:{ zzeh -> 0x0157 }
            goto L_0x0157
        L_0x011f:
            r11 = move-exception
            zzb(r4)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r1.zza((java.io.File) r10, (java.lang.String) r2)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r3[r12] = r10     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            r3[r9] = r2     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            java.lang.String r9 = java.lang.String.format(r0, r3)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            zzat(r9)     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0149, IOException -> 0x0142, zzdv -> 0x013b, NullPointerException -> 0x0134 }
        L_0x0134:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeh r10 = new com.google.android.gms.internal.ads.zzeh     // Catch:{ zzeh -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzeh -> 0x0157 }
            throw r10     // Catch:{ zzeh -> 0x0157 }
        L_0x013b:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeh r10 = new com.google.android.gms.internal.ads.zzeh     // Catch:{ zzeh -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzeh -> 0x0157 }
            throw r10     // Catch:{ zzeh -> 0x0157 }
        L_0x0142:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeh r10 = new com.google.android.gms.internal.ads.zzeh     // Catch:{ zzeh -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzeh -> 0x0157 }
            throw r10     // Catch:{ zzeh -> 0x0157 }
        L_0x0149:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeh r10 = new com.google.android.gms.internal.ads.zzeh     // Catch:{ zzeh -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzeh -> 0x0157 }
            throw r10     // Catch:{ zzeh -> 0x0157 }
        L_0x0150:
            r9 = move-exception
            com.google.android.gms.internal.ads.zzeh r10 = new com.google.android.gms.internal.ads.zzeh     // Catch:{ zzeh -> 0x0157 }
            r10.<init>(r9)     // Catch:{ zzeh -> 0x0157 }
            throw r10     // Catch:{ zzeh -> 0x0157 }
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzei.zza(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.zzei");
    }

    public final Context getContext() {
        return this.zzur;
    }

    public final boolean isInitialized() {
        return this.zzyb;
    }

    public final ExecutorService zzcc() {
        return this.zzxo;
    }

    public final DexClassLoader zzcd() {
        return this.zzxp;
    }

    public final zzds zzce() {
        return this.zzxq;
    }

    public final byte[] zzcf() {
        return this.zzxr;
    }

    public final boolean zzcg() {
        return this.zzxy;
    }

    public final zzde zzch() {
        return this.zzxx;
    }

    public final boolean zzci() {
        return this.zzxz;
    }

    public final boolean zzcj() {
        return this.zzyc;
    }

    public final zzbs.zza zzck() {
        return this.zzxv;
    }

    public final Future zzcl() {
        return this.zzxw;
    }

    private zzei(Context context) {
        boolean z = true;
        this.zzyc = true;
        this.zzyd = false;
        Context applicationContext = context.getApplicationContext();
        this.zzxu = applicationContext == null ? false : z;
        this.zzur = this.zzxu ? applicationContext : context;
        this.zzya = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c0 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2 A[SYNTHETIC, Splitter:B:39:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7 A[SYNTHETIC, Splitter:B:43:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1 A[SYNTHETIC, Splitter:B:52:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e6 A[SYNTHETIC, Splitter:B:56:0x00e6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r2)
            r3.<init>(r10)
            boolean r10 = r3.exists()
            if (r10 != 0) goto L_0x0035
            return
        L_0x0035:
            long r5 = r3.length()
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0040
            return
        L_0x0040:
            int r10 = (int) r5
            byte[] r10 = new byte[r10]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00ce }
            r5.<init>(r3)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00de, all -> 0x00ce }
            int r6 = r5.read(r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            if (r6 > 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            zzb(r3)
            return
        L_0x0056:
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r6.print(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r6.print(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r6.print(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzbs$zzc$zza r0 = com.google.android.gms.internal.ads.zzbs.zzc.zzbc()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            byte[] r6 = r6.getBytes()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzdxn r6 = com.google.android.gms.internal.ads.zzdxn.zzt(r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzbs$zzc$zza r0 = r0.zzh(r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            byte[] r11 = r11.getBytes()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzdxn r11 = com.google.android.gms.internal.ads.zzdxn.zzt(r11)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzbs$zzc$zza r11 = r0.zzg(r11)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzds r0 = r9.zzxq     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            byte[] r6 = r9.zzxr     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            java.lang.String r10 = r0.zzb(r6, r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            byte[] r10 = r10.getBytes()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzdxn r0 = com.google.android.gms.internal.ads.zzdxn.zzt(r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzbs$zzc$zza r0 = r11.zze(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            byte[] r10 = com.google.android.gms.internal.ads.zzck.zzb(r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzdxn r10 = com.google.android.gms.internal.ads.zzdxn.zzt(r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r0.zzf(r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r1.createNewFile()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            r10.<init>(r1)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00df, all -> 0x00cc }
            com.google.android.gms.internal.ads.zzeah r11 = r11.zzbcx()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzdyz r11 = (com.google.android.gms.internal.ads.zzdyz) r11     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzbs$zzc r11 = (com.google.android.gms.internal.ads.zzbs.zzc) r11     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            byte[] r11 = r11.toByteArray()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            int r0 = r11.length     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            r10.write(r11, r4, r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            r10.close()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ca, all -> 0x00c7 }
            r5.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            r10.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            zzb(r3)
            return
        L_0x00c7:
            r11 = move-exception
            r2 = r10
            goto L_0x00d0
        L_0x00ca:
            r2 = r10
            goto L_0x00df
        L_0x00cc:
            r11 = move-exception
            goto L_0x00d0
        L_0x00ce:
            r11 = move-exception
            r5 = r2
        L_0x00d0:
            if (r5 == 0) goto L_0x00d5
            r5.close()     // Catch:{ IOException -> 0x00d5 }
        L_0x00d5:
            if (r2 == 0) goto L_0x00da
            r2.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            zzb(r3)
            throw r11
        L_0x00de:
            r5 = r2
        L_0x00df:
            if (r5 == 0) goto L_0x00e4
            r5.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            zzb(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzei.zza(java.io.File, java.lang.String):void");
    }

    private static void zzat(String str) {
        zzb(new File(str));
    }

    private static void zzb(File file) {
        if (!file.exists()) {
            Log.d(TAG, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e2 A[SYNTHETIC, Splitter:B:52:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7 A[SYNTHETIC, Splitter:B:56:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ee A[SYNTHETIC, Splitter:B:64:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f3 A[SYNTHETIC, Splitter:B:68:0x00f3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzb(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r10
            r4 = 1
            r2[r4] = r11
            java.lang.String r5 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r5, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001b
            return r3
        L_0x001b:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r4] = r11
            java.lang.String r10 = "%s/%s.dex"
            java.lang.String r10 = java.lang.String.format(r10, r1)
            r2.<init>(r10)
            boolean r10 = r2.exists()
            if (r10 == 0) goto L_0x0033
            return r3
        L_0x0033:
            r10 = 0
            long r5 = r0.length()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0042
            zzb(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            return r3
        L_0x0042:
            int r1 = (int) r5     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            byte[] r1 = new byte[r1]     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            r5.<init>(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00eb, all -> 0x00de }
            int r6 = r5.read(r1)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = TAG     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            zzb(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r5.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r3
        L_0x005e:
            com.google.android.gms.internal.ads.zzdym r6 = com.google.android.gms.internal.ads.zzdym.zzbch()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.zzbs$zzc r1 = com.google.android.gms.internal.ads.zzbs.zzc.zzb((byte[]) r1, (com.google.android.gms.internal.ads.zzdym) r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.zzdxn r7 = r1.zzba()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r7 = r7.toByteArray()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r6.<init>(r7)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            boolean r11 = r11.equals(r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r11 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzdxn r11 = r1.zzaz()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r11 = r11.toByteArray()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.zzdxn r6 = r1.zzay()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r6 = r6.toByteArray()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r6 = com.google.android.gms.internal.ads.zzck.zzb(r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r11 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzdxn r11 = r1.zzbb()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r11 = r11.toByteArray()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r6 = r6.getBytes()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            if (r11 != 0) goto L_0x00a8
            goto L_0x00d5
        L_0x00a8:
            com.google.android.gms.internal.ads.zzds r11 = r9.zzxq     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r0 = r9.zzxr     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            com.google.android.gms.internal.ads.zzdxn r1 = r1.zzay()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r1 = r1.toByteArray()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r6.<init>(r1)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            byte[] r11 = r11.zza(r0, r6)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r2.createNewFile()     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r0.<init>(r2)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            int r10 = r11.length     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00d3, all -> 0x00d0 }
            r0.write(r11, r3, r10)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00d3, all -> 0x00d0 }
            r5.close()     // Catch:{ IOException -> 0x00cc }
        L_0x00cc:
            r0.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            return r4
        L_0x00d0:
            r11 = move-exception
            r10 = r0
            goto L_0x00e0
        L_0x00d3:
            r10 = r0
            goto L_0x00ec
        L_0x00d5:
            zzb(r0)     // Catch:{ zzdv | IOException | NoSuchAlgorithmException -> 0x00ec, all -> 0x00dc }
            r5.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            return r3
        L_0x00dc:
            r11 = move-exception
            goto L_0x00e0
        L_0x00de:
            r11 = move-exception
            r5 = r10
        L_0x00e0:
            if (r5 == 0) goto L_0x00e5
            r5.close()     // Catch:{ IOException -> 0x00e5 }
        L_0x00e5:
            if (r10 == 0) goto L_0x00ea
            r10.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            throw r11
        L_0x00eb:
            r5 = r10
        L_0x00ec:
            if (r5 == 0) goto L_0x00f1
            r5.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            if (r10 == 0) goto L_0x00f6
            r10.close()     // Catch:{ IOException -> 0x00f6 }
        L_0x00f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzei.zzb(java.io.File, java.lang.String):boolean");
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzya.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzya.put(new Pair(str, str2), new zzft(this, str, str2, clsArr));
        return true;
    }

    public final Method zza(String str, String str2) {
        zzft zzft = this.zzya.get(new Pair(str, str2));
        if (zzft == null) {
            return null;
        }
        return zzft.zzcx();
    }

    /* access modifiers changed from: private */
    public final void zzcm() {
        try {
            if (this.zzxs == null && this.zzxu) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzur);
                advertisingIdClient.start();
                this.zzxs = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzxs = null;
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zza(int i, boolean z) {
        if (this.zzxz) {
            Future<?> submit = this.zzxo.submit(new zzen(this, i, z));
            if (i == 0) {
                this.zzxw = submit;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final zzbs.zza zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return zzcn();
    }

    /* access modifiers changed from: private */
    public static boolean zza(int i, zzbs.zza zza2) {
        if (i >= 4) {
            return false;
        }
        if (zza2 != null && zza2.zzak() && !zza2.zzah().equals("0000000000000000000000000000000000000000000000000000000000000000") && zza2.zzam() && zza2.zzan().zzbe() && zza2.zzan().zzbf() != -2) {
            return false;
        }
        return true;
    }

    @VisibleForTesting
    private final zzbs.zza zzcn() {
        try {
            return zzdjd.zzj(this.zzur, this.zzur.getPackageName(), Integer.toString(this.zzur.getPackageManager().getPackageInfo(this.zzur.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final AdvertisingIdClient zzco() {
        if (!this.zzvl) {
            return null;
        }
        if (this.zzxs != null) {
            return this.zzxs;
        }
        Future future = this.zzxt;
        if (future != null) {
            try {
                future.get(2000, TimeUnit.MILLISECONDS);
                this.zzxt = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.zzxt.cancel(true);
            }
        }
        return this.zzxs;
    }

    public final int zzbs() {
        if (this.zzxx != null) {
            return zzde.zzbs();
        }
        return Integer.MIN_VALUE;
    }
}

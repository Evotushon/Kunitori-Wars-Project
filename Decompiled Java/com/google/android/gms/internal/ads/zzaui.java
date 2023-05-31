package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaui {
    private final AtomicReference<ThreadPoolExecutor> zzdqj = new AtomicReference<>((Object) null);
    private final Object zzdqk = new Object();
    @GuardedBy("gmpAppIdLock")
    @Nullable
    private String zzdql = null;
    @GuardedBy("gmpAppIdLock")
    @Nullable
    private String zzdqm = null;
    @VisibleForTesting
    private final AtomicBoolean zzdqn = new AtomicBoolean(false);
    private final AtomicInteger zzdqo = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdqp = new AtomicReference<>((Object) null);
    private final AtomicReference<Object> zzdqq = new AtomicReference<>((Object) null);
    private final ConcurrentMap<String, Method> zzdqr = new ConcurrentHashMap(9);
    private final AtomicReference<zzbgd> zzdqs = new AtomicReference<>((Object) null);
    @GuardedBy("proxyReference")
    private final BlockingQueue<FutureTask<?>> zzdqt = new ArrayBlockingQueue(20);
    private final Object zzdqu = new Object();

    public final boolean zzad(Context context) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcis)).booleanValue() && !this.zzdqn.get()) {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjc)).booleanValue()) {
                return true;
            }
            if (this.zzdqo.get() == -1) {
                zzvh.zzoz();
                if (!zzayx.zzd(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzvh.zzoz();
                    if (zzayx.zzbn(context)) {
                        zzawf.zzfa("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzdqo.set(0);
                    }
                }
                this.zzdqo.set(1);
            }
            if (this.zzdqo.get() == 1) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    private static boolean zzae(Context context) {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzciz)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzvh.zzpd().zzd(zzzx.zzcja)).intValue()) {
            return false;
        }
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjb)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final void zza(Context context, zzyw zzyw) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjf)).booleanValue() && zzad(context) && zzae(context)) {
            synchronized (this.zzdqu) {
            }
        }
    }

    public final void zza(Context context, zzuh zzuh) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcjf)).booleanValue() && zzad(context) && zzae(context)) {
            synchronized (this.zzdqu) {
            }
        }
    }

    public final void zze(Context context, String str) {
        if (zzad(context)) {
            if (zzae(context)) {
                zza("beginAdUnitExposure", (zzauy) new zzauh(str));
            } else {
                zza(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzf(Context context, String str) {
        if (zzad(context)) {
            if (zzae(context)) {
                zza("endAdUnitExposure", (zzauy) new zzauo(str));
            } else {
                zza(context, str, "endAdUnitExposure");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzaf(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.zzad(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = zzae(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzauv r7 = com.google.android.gms.internal.ads.zzaun.zzdqw
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.zza((java.lang.String) r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.zzdqp
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.zza((android.content.Context) r7, (java.lang.String) r4, (java.util.concurrent.atomic.AtomicReference<java.lang.Object>) r1, (boolean) r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.zzm(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.zzdqp     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.zzm(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.zzdqp     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r7 = move-exception
            r6.zza((java.lang.Exception) r7, (java.lang.String) r0, (boolean) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaui.zzaf(android.content.Context):java.lang.String");
    }

    public final void zzg(Context context, String str) {
        if (!zzad(context) || !(context instanceof Activity)) {
            return;
        }
        if (zzae(context)) {
            zza("setScreenName", (zzauy) new zzauq(context, str));
        } else if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdqq, false)) {
            Method zzn = zzn(context, "setCurrentScreen");
            try {
                zzn.invoke(this.zzdqq.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e) {
                zza(e, "setCurrentScreen", false);
            }
        }
    }

    @Nullable
    public final String zzag(Context context) {
        if (!zzad(context)) {
            return null;
        }
        synchronized (this.zzdqk) {
            if (this.zzdql != null) {
                String str = this.zzdql;
                return str;
            }
            if (zzae(context)) {
                this.zzdql = (String) zza("getGmpAppId", this.zzdql, zzaup.zzdqw);
            } else {
                this.zzdql = (String) zza("getGmpAppId", context);
            }
            String str2 = this.zzdql;
            return str2;
        }
    }

    @Nullable
    public final String zzah(Context context) {
        if (!zzad(context)) {
            return null;
        }
        long longValue = ((Long) zzvh.zzpd().zzd(zzzx.zzcix)).longValue();
        if (zzae(context)) {
            if (longValue >= 0) {
                return (String) zzuv().submit(new zzaur(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) zza("getAppInstanceId", (Object) null, zzaus.zzdqw);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) zza("getAppInstanceId", context);
        } else {
            try {
                return (String) zzuv().submit(new zzauu(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    @Nullable
    public final String zzai(Context context) {
        if (!zzad(context)) {
            return null;
        }
        if (zzae(context)) {
            Long l = (Long) zza("getAdEventId", (Object) null, zzaut.zzdqw);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object zza = zza("generateEventId", context);
        if (zza != null) {
            return zza.toString();
        }
        return null;
    }

    @Nullable
    public final String zzaj(Context context) {
        if (!zzad(context)) {
            return null;
        }
        synchronized (this.zzdqk) {
            if (this.zzdqm != null) {
                String str = this.zzdqm;
                return str;
            }
            if (zzae(context)) {
                this.zzdqm = (String) zza("getAppIdOrigin", this.zzdqm, zzauk.zzdqw);
            } else {
                this.zzdqm = "fa";
            }
            String str2 = this.zzdqm;
            return str2;
        }
    }

    public final void zzh(Context context, String str) {
        zza(context, "_ac", str, (Bundle) null);
    }

    public final void zzi(Context context, String str) {
        zza(context, "_ai", str, (Bundle) null);
    }

    public final void zzj(Context context, String str) {
        zza(context, "_aq", str, (Bundle) null);
    }

    public final void zzk(Context context, String str) {
        zza(context, "_aa", str, (Bundle) null);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzad(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zza(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzawf.zzee(sb.toString());
        }
    }

    private final void zza(Context context, String str, String str2, @Nullable Bundle bundle) {
        if (zzad(context)) {
            Bundle zzl = zzl(str2, str);
            if (bundle != null) {
                zzl.putAll(bundle);
            }
            if (zzae(context)) {
                zza("logEventInternal", (zzauy) new zzauj(str, zzl));
            } else if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdqp, true)) {
                Method zzak = zzak(context);
                try {
                    zzak.invoke(this.zzdqp.get(), new Object[]{"am", str, zzl});
                } catch (Exception e) {
                    zza(e, "logEventInternal", true);
                }
            }
        }
    }

    private static Bundle zzl(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzawf.zzc(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    @Nullable
    private final Method zzak(Context context) {
        Method method = (Method) this.zzdqr.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
            this.zzdqr.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    @Nullable
    private final Method zzl(Context context, String str) {
        Method method = (Method) this.zzdqr.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.zzdqr.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    @Nullable
    private final Method zzm(Context context, String str) {
        Method method = (Method) this.zzdqr.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdqr.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzn(Context context, String str) {
        Method method = (Method) this.zzdqr.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.zzdqr.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final void zza(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdqp, true)) {
            Method zzl = zzl(context, str2);
            try {
                zzl.invoke(this.zzdqp.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzawf.zzee(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (!zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdqp, true)) {
            return null;
        }
        try {
            return zzm(context, str).invoke(this.zzdqp.get(), new Object[0]);
        } catch (Exception e) {
            zza(e, str, true);
            return null;
        }
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (!this.zzdqn.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            zzawf.zzfa(sb.toString());
            if (z) {
                zzawf.zzfa("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zzdqn.set(true);
            }
        }
    }

    private final ThreadPoolExecutor zzuv() {
        if (this.zzdqj.get() == null) {
            this.zzdqj.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) zzvh.zzpd().zzd(zzzx.zzciy)).intValue(), ((Integer) zzvh.zzpd().zzd(zzzx.zzciy)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzauw(this)));
        }
        return this.zzdqj.get();
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zza(String str, zzauy zzauy) {
        synchronized (this.zzdqs) {
            FutureTask futureTask = new FutureTask(new zzaum(this, zzauy, str), (Object) null);
            if (this.zzdqs.get() != null) {
                futureTask.run();
            } else {
                this.zzdqt.offer(futureTask);
            }
        }
    }

    private final <T> T zza(String str, @Nullable T t, zzauv<T> zzauv) {
        synchronized (this.zzdqs) {
            if (this.zzdqs.get() != null) {
                try {
                    T zzb = zzauv.zzb(this.zzdqs.get());
                    return zzb;
                } catch (Exception e) {
                    zza(e, str, false);
                    return t;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzauy zzauy, String str) {
        if (this.zzdqs.get() != null) {
            try {
                zzauy.zza(this.zzdqs.get());
            } catch (Exception e) {
                zza(e, str, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzal(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzuw() throws Exception {
        return (String) zza("getAppInstanceId", (Object) null, zzaul.zzdqw);
    }
}

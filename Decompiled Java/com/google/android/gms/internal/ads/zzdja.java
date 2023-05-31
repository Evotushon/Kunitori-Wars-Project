package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.ads.zzbs;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdja {
    private static HashMap<String, Class<?>> zzgwr = new HashMap<>();
    private zzdkb zzgws;
    private Object zzgwt;
    private final Context zzur;
    private final zzdix zzuu;

    public zzdja(@NonNull Context context, @NonNull zzdix zzdix) {
        this.zzur = context;
        this.zzuu = zzdix;
    }

    public final zzdkb zzatb() {
        return this.zzgws;
    }

    private final Class<?> zza(zzdkb zzdkb) {
        File zzatp = zzdkb.zzatp();
        File zzato = zzdkb.zzato();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!zzatp.exists()) {
                zzatp.mkdirs();
            }
            return new DexClassLoader(zzato.getAbsolutePath(), zzatp.getAbsolutePath(), (String) null, this.zzur.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
            zzb(2008, currentTimeMillis, e);
            return null;
        }
    }

    private final Object zza(Class<?> cls, zzdkb zzdkb) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return cls.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.zzur, "msa-r", zzdkb.zzatq(), null, new Bundle(), 2});
        } catch (IllegalAccessException e) {
            zzb(2004, currentTimeMillis, e);
            return null;
        } catch (InstantiationException e2) {
            zzb(2004, currentTimeMillis, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            zzb(2004, currentTimeMillis, e3);
            return null;
        } catch (InvocationTargetException e4) {
            zzb(2004, currentTimeMillis, e4);
            return null;
        }
    }

    private final boolean zzx(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            zzb(2001, currentTimeMillis, e);
            return false;
        }
    }

    public final zzdjb zzb(@NonNull zzdkb zzdkb) {
        long currentTimeMillis = System.currentTimeMillis();
        zzgb zzatn = zzdkb.zzatn();
        if (zzatn == null) {
            return new zzdjb(2, "mc");
        }
        String zzdc = zzatn.zzdc();
        Class<?> cls = zzgwr.get(zzdc);
        if (cls == null && (cls = zza(zzdkb)) != null) {
            zzgwr.put(zzdc, cls);
        }
        if (cls == null) {
            return new zzdjb(2, "lc");
        }
        Object zza = zza(cls, zzdkb);
        if (zza == null) {
            return new zzdjb(3, "it");
        }
        if (zzx(zza)) {
            int zzz = zzz(zza);
            if (zzz != 0) {
                this.zzuu.zza(4001, System.currentTimeMillis() - currentTimeMillis, Integer.toString(zzz), (Map<String, String>) null);
                StringBuilder sb = new StringBuilder(13);
                sb.append("ci");
                sb.append(zzz);
                return new zzdjb(5, sb.toString());
            }
            zzy(zza);
            this.zzgws = zzdkb;
            zza(PathInterpolatorCompat.MAX_NUM_POINTS, (Exception) null, currentTimeMillis);
            return null;
        }
        zza(4000, (Exception) null, currentTimeMillis);
        return new zzdjb(4, "ri");
    }

    private final synchronized void zzy(Object obj) {
        if (this.zzgwt != null) {
            close();
        }
        this.zzgwt = obj;
    }

    private final synchronized void close() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.zzgwt.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zzgwt, new Object[0]);
            zza(3001, (Exception) null, currentTimeMillis);
        } catch (Exception e) {
            zzb(2003, currentTimeMillis, e);
        }
    }

    public final synchronized String zzu(Context context, String str) {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put("ctx", context);
        hashMap.put("aid", (Object) null);
        return zzj(zzb((Map<String, String>) null, hashMap));
    }

    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put("ctx", context);
        hashMap.put("aid", (Object) null);
        hashMap.put(Promotion.ACTION_VIEW, view);
        hashMap.put("act", activity);
        return zzj(zzb((Map<String, String>) null, hashMap));
    }

    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        HashMap hashMap;
        hashMap = new HashMap();
        hashMap.put("ctx", context);
        hashMap.put("clickString", str2);
        hashMap.put("aid", (Object) null);
        hashMap.put(Promotion.ACTION_VIEW, view);
        hashMap.put("act", activity);
        return zzj(zzb((Map<String, String>) null, hashMap));
    }

    public final synchronized void zza(String str, MotionEvent motionEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("aid", (Object) null);
            hashMap.put("evt", motionEvent);
            this.zzgwt.getClass().getDeclaredMethod("he", new Class[]{Map.class}).invoke(this.zzgwt, new Object[]{hashMap});
            zza(3003, (Exception) null, currentTimeMillis);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            zzb(2005, currentTimeMillis, e);
        }
    }

    private final synchronized int zzz(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            zzb(2006, currentTimeMillis, e);
            return 0;
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    private static String zzj(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((zzbs.zzf) ((zzdyz) zzbs.zzf.zzbj().zza(zzbz.DG).zzi(zzdxn.zzt(bArr)).zzbcx())).toByteArray(), 11);
    }

    private final byte[] zzb(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = this.zzgwt;
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.zzgwt, new Object[]{null, map2});
        } catch (IllegalAccessException e) {
            zzb(2007, currentTimeMillis, e);
            return null;
        } catch (NoSuchMethodException e2) {
            zzb(2007, currentTimeMillis, e2);
            return null;
        } catch (InvocationTargetException e3) {
            zzb(2007, currentTimeMillis, e3);
            return null;
        }
    }

    private final void zzb(int i, long j, Exception exc) {
        zza(i, exc, j);
    }

    private final void zza(int i, Exception exc, long j) {
        this.zzuu.zza(i, System.currentTimeMillis() - j, exc);
    }
}

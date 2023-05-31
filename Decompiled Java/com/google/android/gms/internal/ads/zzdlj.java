package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzdlj {
    @NullableDecl
    private static final Object zzgzy;
    @NullableDecl
    private static final Method zzgzz;
    @NullableDecl
    private static final Method zzhaa;

    public static void zzg(Throwable th) {
        zzdlg.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    @Deprecated
    public static RuntimeException zzh(Throwable th) {
        zzg(th);
        throw new RuntimeException(th);
    }

    public static String zza(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zzdww.zza(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @NullableDecl
    private static Object zzatt() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method zzatu() {
        try {
            Method zza = zza("getStackTraceDepth", Throwable.class);
            if (zza == null) {
                return null;
            }
            zza.invoke(zzatt(), new Object[]{new Throwable()});
            return zza;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @NullableDecl
    private static Method zza(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Method method;
        Object zzatt = zzatt();
        zzgzy = zzatt;
        Method method2 = null;
        if (zzatt == null) {
            method = null;
        } else {
            method = zza("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        zzgzz = method;
        if (zzgzy != null) {
            method2 = zzatu();
        }
        zzhaa = method2;
    }
}

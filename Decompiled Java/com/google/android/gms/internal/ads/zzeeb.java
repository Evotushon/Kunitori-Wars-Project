package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzeeb {
    public abstract void zzhs(String str);

    public static zzeeb zzn(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzedy(cls.getSimpleName());
        }
        return new zzeea(cls.getSimpleName());
    }
}

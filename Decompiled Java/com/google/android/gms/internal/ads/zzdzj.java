package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public enum zzdzj {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzdxn.class, zzdxn.class, zzdxn.zzhoe),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzhue;
    private final Class<?> zzhuf;
    private final Object zzhug;

    private zzdzj(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzhue = cls;
        this.zzhuf = cls2;
        this.zzhug = obj;
    }

    public final Class<?> zzbdr() {
        return this.zzhuf;
    }
}

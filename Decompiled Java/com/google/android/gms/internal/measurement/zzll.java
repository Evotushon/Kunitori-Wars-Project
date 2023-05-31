package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.6.0 */
public enum zzll {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzgr.zza),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private zzll(Object obj) {
        this.zzj = obj;
    }
}

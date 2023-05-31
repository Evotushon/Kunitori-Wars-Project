package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzgk extends Exception {
    private final int type;
    private final int zzacp;

    public static zzgk zza(Exception exc, int i) {
        return new zzgk(1, (String) null, exc, i);
    }

    public static zzgk zza(IOException iOException) {
        return new zzgk(0, (String) null, iOException, -1);
    }

    static zzgk zza(RuntimeException runtimeException) {
        return new zzgk(2, (String) null, runtimeException, -1);
    }

    private zzgk(int i, String str, Throwable th, int i2) {
        super((String) null, th);
        this.type = i;
        this.zzacp = i2;
    }
}

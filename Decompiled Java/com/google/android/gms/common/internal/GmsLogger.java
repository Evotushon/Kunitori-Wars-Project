package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@17.2.1 */
public final class GmsLogger {
    private static final int zzer = 15;
    private static final String zzes = null;
    private final String zzet;
    private final String zzeu;

    public GmsLogger(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zzet = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzeu = null;
        } else {
            this.zzeu = str2;
        }
    }

    @KeepForSdk
    public final boolean canLogPii() {
        return false;
    }

    public GmsLogger(String str) {
        this(str, (String) null);
    }

    @KeepForSdk
    public final boolean canLog(int i) {
        return Log.isLoggable(this.zzet, i);
    }

    @KeepForSdk
    public final void d(String str, String str2) {
        if (canLog(3)) {
            Log.d(str, zzg(str2));
        }
    }

    @KeepForSdk
    public final void d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            Log.d(str, zzg(str2), th);
        }
    }

    @KeepForSdk
    public final void v(String str, String str2) {
        if (canLog(2)) {
            Log.v(str, zzg(str2));
        }
    }

    @KeepForSdk
    public final void v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            Log.v(str, zzg(str2), th);
        }
    }

    @KeepForSdk
    public final void i(String str, String str2) {
        if (canLog(4)) {
            Log.i(str, zzg(str2));
        }
    }

    @KeepForSdk
    public final void i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            Log.i(str, zzg(str2), th);
        }
    }

    @KeepForSdk
    public final void w(String str, String str2) {
        if (canLog(5)) {
            Log.w(str, zzg(str2));
        }
    }

    @KeepForSdk
    public final void w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            Log.w(str, zzg(str2), th);
        }
    }

    @KeepForSdk
    public final void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            Log.w(this.zzet, zza(str2, objArr));
        }
    }

    @KeepForSdk
    public final void e(String str, String str2) {
        if (canLog(6)) {
            Log.e(str, zzg(str2));
        }
    }

    @KeepForSdk
    public final void e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            Log.e(str, zzg(str2), th);
        }
    }

    @KeepForSdk
    public final void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            Log.e(str, zza(str2, objArr));
        }
    }

    @KeepForSdk
    public final void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            Log.e(str, zzg(str2), th);
            Log.wtf(str, zzg(str2), th);
        }
    }

    @KeepForSdk
    public final void pii(String str, String str2) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            Log.i(" PII_LOG".length() != 0 ? valueOf.concat(" PII_LOG") : new String(valueOf), zzg(str2));
        }
    }

    @KeepForSdk
    public final void pii(String str, String str2, Throwable th) {
        if (canLogPii()) {
            String valueOf = String.valueOf(str);
            Log.i(" PII_LOG".length() != 0 ? valueOf.concat(" PII_LOG") : new String(valueOf), zzg(str2), th);
        }
    }

    private final String zzg(String str) {
        String str2 = this.zzeu;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    private final String zza(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzeu;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }
}

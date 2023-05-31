package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzcid extends Exception {
    private final int errorCode;

    public static int zzd(Throwable th) {
        if (th instanceof zzcid) {
            return ((zzcid) th).errorCode;
        }
        if (th instanceof zzaxs) {
            return ((zzaxs) th).getErrorCode();
        }
        return 0;
    }

    public zzcid(int i) {
        this.errorCode = i;
    }

    public zzcid(String str, int i) {
        super(str);
        this.errorCode = i;
    }

    public zzcid(String str, Throwable th, int i) {
        super(str, th);
        this.errorCode = 0;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

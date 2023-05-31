package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzchv implements Runnable {
    private final Object zzdcl;
    private final String zzfux;
    private final zzcho zzfwv;
    private final zzazy zzfwy;
    private final long zzfwz;

    zzchv(zzcho zzcho, Object obj, zzazy zzazy, String str, long j) {
        this.zzfwv = zzcho;
        this.zzdcl = obj;
        this.zzfwy = zzazy;
        this.zzfux = str;
        this.zzfwz = j;
    }

    public final void run() {
        this.zzfwv.zza(this.zzdcl, this.zzfwy, this.zzfux, this.zzfwz);
    }
}

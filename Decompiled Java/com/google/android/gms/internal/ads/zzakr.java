package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzakr implements zzbaa {
    private final /* synthetic */ zzazy zzcyv;
    private final /* synthetic */ zzajr zzdbz;

    zzakr(zzakp zzakp, zzazy zzazy, zzajr zzajr) {
        this.zzcyv = zzazy;
        this.zzdbz = zzajr;
    }

    public final void run() {
        this.zzcyv.setException(new zzakd("Unable to obtain a JavascriptEngine."));
        this.zzdbz.release();
    }
}

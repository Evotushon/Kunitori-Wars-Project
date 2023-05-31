package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcek implements zzbfh {
    private final zzazy zzbsd;

    zzcek(zzazy zzazy) {
        this.zzbsd = zzazy;
    }

    public final void zzai(boolean z) {
        zzazy zzazy = this.zzbsd;
        if (z) {
            zzazy.set(null);
        } else {
            zzazy.setException(new Exception("Ad Web View failed to load."));
        }
    }
}

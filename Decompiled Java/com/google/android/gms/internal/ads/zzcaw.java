package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcaw implements zzdku<zzo, Bitmap> {
    private final /* synthetic */ double zzfrr;
    private final /* synthetic */ boolean zzfrs;
    private final /* synthetic */ zzcax zzfrt;

    zzcaw(zzcax zzcax, double d, boolean z) {
        this.zzfrt = zzcax;
        this.zzfrr = d;
        this.zzfrs = z;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.zzfrt.zza(((zzo) obj).data, this.zzfrr, this.zzfrs);
    }
}

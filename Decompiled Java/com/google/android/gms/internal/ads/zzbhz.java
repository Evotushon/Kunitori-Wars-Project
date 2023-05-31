package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbhz implements zzddz {
    private final /* synthetic */ zzbhf zzene;
    private Context zzexp;
    private String zzexq;

    private zzbhz(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    public final zzdea zzaew() {
        zzeep.zza(this.zzexp, Context.class);
        return new zzbic(this.zzene, this.zzexp, this.zzexq);
    }

    public final /* synthetic */ zzddz zzfs(String str) {
        this.zzexq = str;
        return this;
    }

    public final /* synthetic */ zzddz zzbx(Context context) {
        this.zzexp = (Context) zzeep.checkNotNull(context);
        return this;
    }
}

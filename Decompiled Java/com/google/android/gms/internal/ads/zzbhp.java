package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbhp implements zzdbi {
    private final /* synthetic */ zzbhf zzene;
    private Context zzexp;
    private String zzexq;

    private zzbhp(zzbhf zzbhf) {
        this.zzene = zzbhf;
    }

    public final zzdbf zzaei() {
        zzeep.zza(this.zzexp, Context.class);
        zzeep.zza(this.zzexq, String.class);
        return new zzbhs(this.zzene, this.zzexp, this.zzexq);
    }

    public final /* synthetic */ zzdbi zzfr(String str) {
        this.zzexq = (String) zzeep.checkNotNull(str);
        return this;
    }

    public final /* synthetic */ zzdbi zzbw(Context context) {
        this.zzexp = (Context) zzeep.checkNotNull(context);
        return this;
    }
}

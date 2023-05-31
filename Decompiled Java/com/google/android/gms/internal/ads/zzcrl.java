package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcrl implements zzcrf<zzbvu> {
    private final zzbwt zzgbv;
    private final Context zzur;

    public zzcrl(Context context, zzbwt zzbwt) {
        this.zzur = context;
        this.zzgbv = zzbwt;
    }

    public final /* synthetic */ Object zza(zzdeq zzdeq, zzdei zzdei, View view, zzcri zzcri) {
        zzbvw zza = this.zzgbv.zza(new zzbnv(zzdeq, zzdei, (String) null), new zzcrn(this, zzcrk.zzgfb));
        zzcri.zza(new zzcrm(this, zza));
        return zza.zzaex();
    }
}

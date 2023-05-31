package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbed implements zzdng {
    private final Context zzcgz;
    private final zzdq zzdaq;
    private final zzazo zzegf;
    private final zza zzegg;
    private final String zzegh;

    zzbed(Context context, zzdq zzdq, zzazo zzazo, zza zza, String str) {
        this.zzcgz = context;
        this.zzdaq = zzdq;
        this.zzegf = zzazo;
        this.zzegg = zza;
        this.zzegh = str;
    }

    public final zzdof zzf(Object obj) {
        Context context = this.zzcgz;
        zzdq zzdq = this.zzdaq;
        zzazo zzazo = this.zzegf;
        zza zza = this.zzegg;
        String str = this.zzegh;
        zzq.zzkw();
        zzbdv zza2 = zzbee.zza(context, zzbfl.zzabv(), "", false, false, zzdq, zzazo, (zzaak) null, (zzi) null, zza, zzsn.zzmy(), (zzrp) null, false);
        zzazv zzl = zzazv.zzl(zza2);
        zza2.zzaaf().zza((zzbfh) new zzbef(zzl));
        zza2.loadUrl(str);
        return zzl;
    }
}

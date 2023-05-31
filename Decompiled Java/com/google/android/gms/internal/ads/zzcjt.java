package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcjt implements zzbsn {
    private final zzaui zzbnp;
    private final Context zzur;

    zzcjt(Context context, zzaui zzaui) {
        this.zzur = context;
        this.zzbnp = zzaui;
    }

    public final void zzd(zzaqx zzaqx) {
    }

    public final void zzb(zzdeq zzdeq) {
        if (!TextUtils.isEmpty(zzdeq.zzgqm.zzgqj.zzdmp)) {
            this.zzbnp.zza(this.zzur, zzdeq.zzgql.zzfir.zzgqq);
            this.zzbnp.zzj(this.zzur, zzdeq.zzgqm.zzgqj.zzdmp);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbpk implements zzbqt, zzbrn {
    private final zzapm zzbla;
    private final zzdei zzfhg;
    private final Context zzur;

    public zzbpk(Context context, zzdei zzdei, zzapm zzapm) {
        this.zzur = context;
        this.zzfhg = zzdei;
        this.zzbla = zzapm;
    }

    public final void zzby(@Nullable Context context) {
    }

    public final void zzbz(@Nullable Context context) {
    }

    public final void onAdLoaded() {
        if (this.zzfhg.zzgqd != null && this.zzfhg.zzgqd.zzdjf) {
            ArrayList arrayList = new ArrayList();
            if (!this.zzfhg.zzgqd.zzdjg.isEmpty()) {
                arrayList.add(this.zzfhg.zzgqd.zzdjg);
            }
            this.zzbla.zza(this.zzur, arrayList);
        }
    }

    public final void zzca(@Nullable Context context) {
        this.zzbla.detach();
    }
}

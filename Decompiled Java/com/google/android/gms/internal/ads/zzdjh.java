package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.zzdjj;
import com.google.android.gms.internal.ads.zzdjn;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjh {
    private final Looper zzgxc;
    private final Context zzur;

    public zzdjh(@NonNull Context context, @NonNull Looper looper) {
        this.zzur = context;
        this.zzgxc = looper;
    }

    public final void zzgt(@NonNull String str) {
        new zzdjg(this.zzur, this.zzgxc, (zzdjn) ((zzdyz) zzdjn.zzati().zzgw(this.zzur.getPackageName()).zzb(zzdjn.zzb.BLOCKED_IMPRESSION).zza(zzdjj.zzatg().zzgv(str).zzb(zzdjj.zza.BLOCKED_REASON_BACKGROUND)).zzbcx())).zzatf();
    }
}

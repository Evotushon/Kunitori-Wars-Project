package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzsz;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzclq implements zzdnu<Bundle> {
    private final /* synthetic */ boolean zzgam;
    final /* synthetic */ zzclr zzgan;

    zzclq(zzclr zzclr, boolean z) {
        this.zzgan = zzclr;
        this.zzgam = z;
    }

    public final void zzb(Throwable th) {
        zzawf.zzey("Failed to get signals bundle");
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList zza = zzclr.zzl(bundle);
        zzsz.zzj.zzc zzb = zzclr.zzk(bundle);
        this.zzgan.zzgap.zza(new zzclt(this, this.zzgam, zza, this.zzgan.zzj(bundle), zzb));
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxq implements zzcyb<Bundle> {
    private final String zzbmj;
    private final int zzdkk;
    private final boolean zzdlh;
    private final boolean zzdxi;
    private final boolean zzgkc;
    private final int zzgkd;
    private final int zzgke;

    public zzcxq(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.zzgkc = z;
        this.zzdxi = z2;
        this.zzbmj = str;
        this.zzdlh = z3;
        this.zzdkk = i;
        this.zzgkd = i2;
        this.zzgke = i3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzbmj);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzvh.zzpd().zzd(zzzx.zzcmr));
        bundle.putInt("target_api", this.zzdkk);
        bundle.putInt("dv", this.zzgkd);
        bundle.putInt("lv", this.zzgke);
        Bundle zza = zzdez.zza(bundle, "sdk_env");
        zza.putBoolean("mf", zzabj.zzcux.get().booleanValue());
        zza.putBoolean("instant_app", this.zzgkc);
        zza.putBoolean("lite", this.zzdxi);
        zza.putBoolean("is_privileged_process", this.zzdlh);
        bundle.putBundle("sdk_env", zza);
        Bundle zza2 = zzdez.zza(zza, "build_meta");
        zza2.putString("cl", "300152424");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}

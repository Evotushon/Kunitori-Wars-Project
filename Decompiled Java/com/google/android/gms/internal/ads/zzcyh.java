package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyh implements zzcyb<Bundle> {
    private final boolean zzdoc;
    private final boolean zzdod;
    private final String zzdoe;
    private final boolean zzdof;
    private final boolean zzdog;
    private final boolean zzdoh;
    private final String zzdoi;
    private final String zzdoj;
    private final String zzdok;
    private final boolean zzdol;
    private final ArrayList<String> zzgks;
    private final String zzgkt;
    private final String zzgku;
    private final long zzgkv;

    public zzcyh(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList<String> arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j) {
        this.zzdoc = z;
        this.zzdod = z2;
        this.zzdoe = str;
        this.zzdof = z3;
        this.zzdog = z4;
        this.zzdoh = z5;
        this.zzdoi = str2;
        this.zzgks = arrayList;
        this.zzdoj = str3;
        this.zzdok = str4;
        this.zzgkt = str5;
        this.zzdol = z6;
        this.zzgku = str6;
        this.zzgkv = j;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zzdoc);
        bundle.putBoolean("coh", this.zzdod);
        bundle.putString("gl", this.zzdoe);
        bundle.putBoolean("simulator", this.zzdof);
        bundle.putBoolean("is_latchsky", this.zzdog);
        bundle.putBoolean("is_sidewinder", this.zzdoh);
        bundle.putString("hl", this.zzdoi);
        if (!this.zzgks.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzgks);
        }
        bundle.putString("mv", this.zzdoj);
        bundle.putString("submodel", this.zzgku);
        Bundle zza = zzdez.zza(bundle, "device");
        bundle.putBundle("device", zza);
        zza.putString("build", this.zzgkt);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcmp)).booleanValue()) {
            zza.putLong("remaining_data_partition_space", this.zzgkv);
        }
        Bundle zza2 = zzdez.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzdol);
        if (!TextUtils.isEmpty(this.zzdok)) {
            Bundle zza3 = zzdez.zza(zza, "play_store");
            zza.putBundle("play_store", zza3);
            zza3.putString("package_version", this.zzdok);
        }
    }
}

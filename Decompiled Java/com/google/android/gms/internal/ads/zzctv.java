package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzctv implements zzcyb<Bundle> {
    private final String zzabk;
    private final zzuk zzblv;
    private final float zzboq;
    private final boolean zzcde;
    private final int zzdhj;
    private final int zzdhk;
    private final String zzghw;
    private final String zzghx;

    public zzctv(zzuk zzuk, String str, boolean z, String str2, float f, int i, int i2, String str3) {
        Preconditions.checkNotNull(zzuk, "the adSize must not be null");
        this.zzblv = zzuk;
        this.zzabk = str;
        this.zzcde = z;
        this.zzghw = str2;
        this.zzboq = f;
        this.zzdhj = i;
        this.zzdhk = i2;
        this.zzghx = str3;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzdez.zza(bundle, "smart_w", "full", this.zzblv.width == -1);
        zzdez.zza(bundle, "smart_h", "auto", this.zzblv.height == -2);
        zzdez.zza(bundle, "ene", (Boolean) true, this.zzblv.zzcdf);
        zzdez.zza(bundle, "rafmt", "102", this.zzblv.zzcdi);
        zzdez.zza(bundle, "rafmt", "103", this.zzblv.zzcdj);
        zzdez.zza(bundle, "format", this.zzabk);
        zzdez.zza(bundle, "fluid", "height", this.zzcde);
        String str = this.zzghw;
        zzdez.zza(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zzboq);
        bundle.putInt("sw", this.zzdhj);
        bundle.putInt("sh", this.zzdhk);
        String str2 = this.zzghx;
        zzdez.zza(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        if (this.zzblv.zzcdd == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zzblv.height);
            bundle2.putInt("width", this.zzblv.width);
            bundle2.putBoolean("is_fluid_height", this.zzblv.zzcde);
            arrayList.add(bundle2);
        } else {
            for (zzuk zzuk : this.zzblv.zzcdd) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzuk.zzcde);
                bundle3.putInt("height", zzuk.height);
                bundle3.putInt("width", zzuk.width);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}

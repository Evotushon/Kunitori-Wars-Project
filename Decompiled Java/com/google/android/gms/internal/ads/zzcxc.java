package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxc implements zzcye<zzcyb<Bundle>> {
    private final String zzfka;
    private final Context zzur;

    zzcxc(Context context, @Nullable String str) {
        this.zzur = context;
        this.zzfka = str;
    }

    public final zzdof<zzcyb<Bundle>> zzapb() {
        zzcxb zzcxb;
        if (this.zzfka == null) {
            zzcxb = null;
        } else {
            zzcxb = new zzcxb(this);
        }
        return zzdnt.zzaj(zzcxb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.zzur.getPackageName());
    }
}

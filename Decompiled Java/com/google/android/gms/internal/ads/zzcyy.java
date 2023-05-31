package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyy implements zzcye<zzcyv> {
    private final Executor executor;
    @Nullable
    private final PackageInfo zzdju;
    private final zzavn zzglb;
    private final String zzgle;

    public zzcyy(zzavn zzavn, Executor executor2, String str, @Nullable PackageInfo packageInfo) {
        this.zzglb = zzavn;
        this.executor = executor2;
        this.zzgle = str;
        this.zzdju = packageInfo;
    }

    public final zzdof<zzcyv> zzapb() {
        return zzdnt.zzb(zzdnt.zzb(this.zzglb.zza(this.zzgle, this.zzdju), zzcyx.zzdpv, this.executor), Throwable.class, new zzcza(this), this.executor);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zzf(Throwable th) throws Exception {
        return zzdnt.zzaj(new zzcyv(this.zzgle));
    }
}

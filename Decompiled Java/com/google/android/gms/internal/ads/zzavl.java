package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzavl implements zzavn {
    public final zzdof<String> zza(String str, PackageInfo packageInfo) {
        return zzdnt.zzaj(str);
    }

    public final zzdof<AdvertisingIdClient.Info> zzam(Context context) {
        zzazy zzazy = new zzazy();
        zzvh.zzoz();
        if (zzayx.zzbn(context)) {
            zzazq.zzdxk.execute(new zzavo(this, context, zzazy));
        }
        return zzazy;
    }

    public final zzdof<String> zza(Context context, int i) {
        return zzdnt.zzaj(null);
    }
}

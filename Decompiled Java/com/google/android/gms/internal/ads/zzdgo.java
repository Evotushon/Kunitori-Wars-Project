package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdgo {
    private HashMap<zzdgf, zzdgn<? extends zzbnf>> zzgtp = new HashMap<>();

    public final <AdT extends zzbnf> zzdgn<AdT> zza(zzdgf zzdgf, Context context, zzdfw zzdfw, zzdgv<AdT> zzdgv) {
        zzdgn<AdT> zzdgn = this.zzgtp.get(zzdgf);
        if (zzdgn != null) {
            return zzdgn;
        }
        zzdgc zzdgc = new zzdgc(zzdgg.zza(zzdgf, context));
        zzdgn<AdT> zzdgn2 = new zzdgn<>(zzdgc, new zzdgs(zzdgc, zzdfw, zzdgv));
        this.zzgtp.put(zzdgf, zzdgn2);
        return zzdgn2;
    }
}

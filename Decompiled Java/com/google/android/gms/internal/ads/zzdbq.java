package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzdbq implements zzdng {
    private final zzdbn zzgni;
    private final zzdgk zzgnj;
    private final zzbod zzgnk;

    zzdbq(zzdbn zzdbn, zzdgk zzdgk, zzbod zzbod) {
        this.zzgni = zzdbn;
        this.zzgnj = zzdgk;
        this.zzgnk = zzbod;
    }

    public final zzdof zzf(Object obj) {
        zzdbn zzdbn = this.zzgni;
        zzdgk zzdgk = this.zzgnj;
        zzbod zzbod = this.zzgnk;
        zzdeq zzdeq = (zzdeq) obj;
        zzdgk.zzenb = zzdeq;
        Iterator<zzdei> it = zzdeq.zzgqm.zzgqi.iterator();
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            Iterator<String> it2 = it.next().zzgpk.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!it2.next().contains("FirstPartyRenderer")) {
                        break loop0;
                    }
                    z2 = true;
                }
            }
        }
        if (!z) {
            return zzdnt.zzaj(null);
        }
        return zzbod.zzb((zzdof<zzdeq>) zzdnt.zzaj(zzdeq));
    }
}

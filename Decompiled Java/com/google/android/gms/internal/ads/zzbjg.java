package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbjg implements zzdng<zzdeq, zzdeq> {
    private Map<String, zzbjj> zzfdm;

    public zzbjg(Map<String, zzbjj> map) {
        this.zzfdm = map;
    }

    public final /* synthetic */ zzdof zzf(Object obj) throws Exception {
        zzdeq zzdeq = (zzdeq) obj;
        for (zzden next : zzdeq.zzgqm.zzgqk) {
            if (this.zzfdm.containsKey(next.name)) {
                this.zzfdm.get(next.name).zzk(next.zzgqh);
            }
        }
        return zzdnt.zzaj(zzdeq);
    }
}

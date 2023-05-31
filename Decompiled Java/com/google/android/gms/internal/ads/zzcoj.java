package com.google.android.gms.internal.ads;

import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcoj implements zzdng {
    private final zzdei zzfgp;
    private final zzdeq zzfsg;
    private final zzcoh zzgcq;

    zzcoj(zzcoh zzcoh, zzdeq zzdeq, zzdei zzdei) {
        this.zzgcq = zzcoh;
        this.zzfsg = zzdeq;
        this.zzfgp = zzdei;
    }

    public final zzdof zzf(Object obj) {
        return this.zzgcq.zza(this.zzfsg, this.zzfgp, (JSONArray) obj);
    }
}

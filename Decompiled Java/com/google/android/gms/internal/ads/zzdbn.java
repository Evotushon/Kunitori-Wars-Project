package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbpr;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdbn<R extends zzbpr<AdT>, AdT extends zzbnf> implements zzdco<R, zzdgk<AdT>> {
    private final Executor executor = zzdoh.zzauv();
    private R zzgnf;

    public final zzdof<zzdgk<AdT>> zza(zzdcp zzdcp, zzdcq<R> zzdcq) {
        zzdof<zzdeq> zzdof;
        zzbpq<R> zzc = zzdcq.zzc(zzdcp.zzgoi);
        zzc.zza(new zzdcu(true));
        this.zzgnf = (zzbpr) zzc.zzadi();
        zzbod zzadx = this.zzgnf.zzadx();
        zzdgk zzdgk = new zzdgk();
        if (zzdcp.zzgoh != null) {
            zzdof = zzadx.zza(zzdcp.zzgoh);
        } else {
            zzdof = zzadx.zzahp();
        }
        return zzdno.zzg(zzdof).zzb(new zzdbq(this, zzdgk, zzadx), this.executor).zza(new zzdbp(zzdgk), this.executor);
    }

    public final /* synthetic */ Object zzaqj() {
        return this.zzgnf;
    }
}

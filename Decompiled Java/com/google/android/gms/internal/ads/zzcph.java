package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcph<AdT> implements zzdng<zzdeq, AdT> {
    private final Executor executor;
    private final zzdis zzfdr;
    private final ScheduledExecutorService zzffm;
    private final zzdif zzfis;
    private final zzbqk zzflh;
    private final zzbng<AdT> zzgdh;
    private final zzcpc zzgdi;

    public zzcph(zzdif zzdif, zzcpc zzcpc, zzbqk zzbqk, zzdis zzdis, zzbng<AdT> zzbng, Executor executor2, ScheduledExecutorService scheduledExecutorService) {
        this.zzfis = zzdif;
        this.zzgdi = zzcpc;
        this.zzflh = zzbqk;
        this.zzfdr = zzdis;
        this.zzgdh = zzbng;
        this.executor = executor2;
        this.zzffm = scheduledExecutorService;
    }

    public final /* synthetic */ zzdof zzf(Object obj) throws Exception {
        zzdeq zzdeq = (zzdeq) obj;
        zzdhs<E, I> zzata = this.zzfis.zzu(zzdig.RENDER_CONFIG_INIT).zze(zzdnt.immediateFailedFuture(new zzcpe("No ad configs", 3))).zzata();
        this.zzflh.zza(new zzbjr(zzdeq, this.zzfdr), this.executor);
        int i = 0;
        for (zzdei next : zzdeq.zzgqm.zzgqi) {
            Iterator<String> it = next.zzgpk.iterator();
            while (true) {
                if (it.hasNext()) {
                    String next2 = it.next();
                    zzcly<AdT> zzd = this.zzgdh.zzd(next.zzfmh, next2);
                    if (zzd != null && zzd.zza(zzdeq, next)) {
                        zzdhx<I> zza = this.zzfis.zza(zzdig.RENDER_CONFIG_WATERFALL, zzata);
                        StringBuilder sb = new StringBuilder(String.valueOf(next2).length() + 26);
                        sb.append("render-config-");
                        sb.append(i);
                        sb.append("-");
                        sb.append(next2);
                        zzata = zza.zzgq(sb.toString()).zza(Throwable.class, new zzcpg(this, next, zzd, zzdeq)).zzata();
                        break;
                    }
                } else {
                    break;
                }
            }
            i++;
        }
        return zzata;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdof zza(zzdei zzdei, zzcly zzcly, zzdeq zzdeq, Throwable th) throws Exception {
        return this.zzgdi.zza(zzdei, zzdnt.zza(zzcly.zzb(zzdeq, zzdei), (long) zzdei.zzgpz, TimeUnit.MILLISECONDS, this.zzffm));
    }
}

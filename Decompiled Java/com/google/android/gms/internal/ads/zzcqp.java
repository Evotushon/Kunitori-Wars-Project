package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbrk;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcqp<AdT, AdapterT, ListenerT extends zzbrk> implements zzcly<AdT> {
    private final zzcmc<AdapterT, ListenerT> zzfcu;
    private final zzdif zzfis;
    private final zzcmf<AdT, AdapterT, ListenerT> zzgee;
    private final zzdoe zzgef;

    public zzcqp(zzdif zzdif, zzdoe zzdoe, zzcmc<AdapterT, ListenerT> zzcmc, zzcmf<AdT, AdapterT, ListenerT> zzcmf) {
        this.zzfis = zzdif;
        this.zzgef = zzdoe;
        this.zzgee = zzcmf;
        this.zzfcu = zzcmc;
    }

    public final boolean zza(zzdeq zzdeq, zzdei zzdei) {
        return !zzdei.zzgpr.isEmpty();
    }

    public final zzdof<AdT> zzb(zzdeq zzdeq, zzdei zzdei) {
        zzcmd<AdapterT, ListenerT> zzcmd;
        Iterator<String> it = zzdei.zzgpr.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcmd = null;
                break;
            }
            try {
                zzcmd = this.zzfcu.zzd(it.next(), zzdei.zzgpt);
                break;
            } catch (zzdfa unused) {
            }
        }
        if (zzcmd == null) {
            return zzdnt.immediateFailedFuture(new zzcos("unable to instantiate mediation adapter class"));
        }
        zzazy zzazy = new zzazy();
        zzcmd.zzgbd.zza(new zzcqq(this, zzazy, zzcmd));
        if (zzdei.zzdnk) {
            Bundle bundle = zzdeq.zzgql.zzfir.zzgqq.zzcct;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.zzfis.zzu(zzdig.ADAPTER_LOAD_AD_SYN).zza((zzdhp) new zzcqo(this, zzdeq, zzdei, zzcmd), this.zzgef).zzw(zzdig.ADAPTER_LOAD_AD_ACK).zze(zzazy).zzw(zzdig.ADAPTER_WRAP_ADAPTER).zzb(new zzcqr(this, zzdeq, zzdei, zzcmd)).zzata();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd, Void voidR) throws Exception {
        return this.zzgee.zzb(zzdeq, zzdei, zzcmd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdeq zzdeq, zzdei zzdei, zzcmd zzcmd) throws Exception {
        this.zzgee.zza(zzdeq, zzdei, zzcmd);
    }
}

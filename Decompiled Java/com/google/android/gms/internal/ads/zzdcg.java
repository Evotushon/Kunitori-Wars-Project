package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbpr;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdcg<RequestComponentT extends zzbpr<AdT>, AdT> implements zzdco<RequestComponentT, AdT> {
    @GuardedBy("this")
    @Nullable
    private RequestComponentT zzgns;

    /* access modifiers changed from: private */
    /* renamed from: zzaqk */
    public final synchronized RequestComponentT zzaqj() {
        return this.zzgns;
    }

    public final synchronized zzdof<AdT> zza(zzdcp zzdcp, zzdcq<RequestComponentT> zzdcq) {
        this.zzgns = (zzbpr) zzdcq.zzc(zzdcp.zzgoi).zzadi();
        return this.zzgns.zzadx().zzahq();
    }
}

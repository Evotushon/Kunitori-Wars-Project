package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzcix implements zzdng<zzaqx, zzdeq> {
    /* access modifiers changed from: private */
    public final zzbsm zzfxx;

    public zzcix(zzbsm zzbsm) {
        this.zzfxx = zzbsm;
    }

    /* access modifiers changed from: protected */
    public abstract zzdof<zzdeq> zzb(zzaqx zzaqx) throws zzcid;

    public final /* synthetic */ zzdof zzf(Object obj) throws Exception {
        zzaqx zzaqx = (zzaqx) obj;
        this.zzfxx.zzd(zzaqx);
        zzdof<zzdeq> zzb = zzb(zzaqx);
        zzdnt.zza(zzb, new zzciw(this), zzazq.zzdxp);
        return zzb;
    }
}

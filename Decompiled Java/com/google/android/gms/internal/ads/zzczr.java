package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzczr implements zzcye<zzczs> {
    private String packageName;
    private zzdoe zzfrv;
    private zzavj zzgls;

    public zzczr(zzavj zzavj, zzdoe zzdoe, String str) {
        this.zzgls = zzavj;
        this.zzfrv = zzdoe;
        this.packageName = str;
    }

    public final zzdof<zzczs> zzapb() {
        new zzazy();
        zzdof<String> zzaj = zzdnt.zzaj(null);
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqh)).booleanValue()) {
            zzaj = this.zzgls.zzec(this.packageName);
        }
        zzdof<String> zzed = this.zzgls.zzed(this.packageName);
        return zzdnt.zzb((zzdof<? extends V>[]) new zzdof[]{zzaj, zzed}).zza(new zzczu(zzaj, zzed), zzazq.zzdxk);
    }
}

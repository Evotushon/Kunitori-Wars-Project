package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdhg implements zzeej<zzdoe> {
    public static zzdhg zzaso() {
        return zzdhf.zzguk;
    }

    public final /* synthetic */ Object get() {
        zzdoe zzdoe;
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpz)).booleanValue()) {
            zzdoe = zzazq.zzdxm;
        } else {
            if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcpy)).booleanValue()) {
                zzdoe = zzazq.zzdxk;
            } else {
                zzdoe = zzazq.zzdxo;
            }
        }
        return (zzdoe) zzeep.zza(zzdoe, "Cannot return null from a non-@Nullable @Provides method");
    }
}

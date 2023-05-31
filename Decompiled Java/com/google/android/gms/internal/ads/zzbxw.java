package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbpt;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbxw implements zzeej<zzbng<zzblg>> {
    private final zzeew<zzbsf> zzfjm;
    private final zzeew<zzbgk> zzfmx;
    private final zzeew<zzbpt.zza> zzfmy;
    private final zzeew<zzbtl> zzfmz;
    private final zzeew<zzbxk> zzfna;

    public zzbxw(zzeew<zzbgk> zzeew, zzeew<zzbpt.zza> zzeew2, zzeew<zzbtl> zzeew3, zzeew<zzbxk> zzeew4, zzeew<zzbsf> zzeew5) {
        this.zzfmx = zzeew;
        this.zzfmy = zzeew2;
        this.zzfmz = zzeew3;
        this.zzfna = zzeew4;
        this.zzfjm = zzeew5;
    }

    public final /* synthetic */ Object get() {
        return (zzbng) zzeep.zza(this.zzfmx.get().zzacm().zzc(this.zzfmy.get().zzahz()).zzc(this.zzfmz.get()).zzb(this.zzfna.get()).zza(new zzcrh((zzaaq) null)).zza(new zzbmy(this.zzfjm.get())).zzb(new zzblf((ViewGroup) null)).zzael().zzaes(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

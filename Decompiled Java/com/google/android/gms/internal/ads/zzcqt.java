package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbrk;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcqt<AdT, AdapterT, ListenerT extends zzbrk> implements zzeej<zzcqp<AdT, AdapterT, ListenerT>> {
    private final zzeew<zzcmc<AdapterT, ListenerT>> zzfdb;
    private final zzeew<zzdoe> zzfgm;
    private final zzeew<zzdif> zzfgx;
    private final zzeew<zzcmf<AdT, AdapterT, ListenerT>> zzgej;

    private zzcqt(zzeew<zzdif> zzeew, zzeew<zzdoe> zzeew2, zzeew<zzcmc<AdapterT, ListenerT>> zzeew3, zzeew<zzcmf<AdT, AdapterT, ListenerT>> zzeew4) {
        this.zzfgx = zzeew;
        this.zzfgm = zzeew2;
        this.zzfdb = zzeew3;
        this.zzgej = zzeew4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbrk> zzcqt<AdT, AdapterT, ListenerT> zze(zzeew<zzdif> zzeew, zzeew<zzdoe> zzeew2, zzeew<zzcmc<AdapterT, ListenerT>> zzeew3, zzeew<zzcmf<AdT, AdapterT, ListenerT>> zzeew4) {
        return new zzcqt<>(zzeew, zzeew2, zzeew3, zzeew4);
    }

    public final /* synthetic */ Object get() {
        return new zzcqp(this.zzfgx.get(), this.zzfgm.get(), this.zzfdb.get(), this.zzgej.get());
    }
}

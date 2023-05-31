package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdba implements zzeej<zzdat> {
    private final zzeew<zzbgk> zzela;
    private final zzeew<Executor> zzfgm;
    private final zzeew<Context> zzgmp;
    private final zzeew<zzdco<zzbku, zzbla>> zzgmq;
    private final zzeew<zzdbh> zzgmr;
    private final zzeew<zzdew> zzgms;

    public zzdba(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzbgk> zzeew3, zzeew<zzdco<zzbku, zzbla>> zzeew4, zzeew<zzdbh> zzeew5, zzeew<zzdew> zzeew6) {
        this.zzgmp = zzeew;
        this.zzfgm = zzeew2;
        this.zzela = zzeew3;
        this.zzgmq = zzeew4;
        this.zzgmr = zzeew5;
        this.zzgms = zzeew6;
    }

    public final /* synthetic */ Object get() {
        return new zzdat(this.zzgmp.get(), this.zzfgm.get(), this.zzela.get(), this.zzgmq.get(), this.zzgmr.get(), this.zzgms.get());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzddt implements zzeej<zzddq> {
    private final zzeew<zzbgk> zzela;
    private final zzeew<zzdep> zzfbm;
    private final zzeew<Executor> zzfgm;
    private final zzeew<Context> zzgmp;
    private final zzeew<zzdco<zzcdq, zzcdn>> zzgmq;
    private final zzeew<zzdct> zzgmr;
    private final zzeew<zzdew> zzgms;

    public zzddt(zzeew<Context> zzeew, zzeew<Executor> zzeew2, zzeew<zzbgk> zzeew3, zzeew<zzdco<zzcdq, zzcdn>> zzeew4, zzeew<zzdct> zzeew5, zzeew<zzdew> zzeew6, zzeew<zzdep> zzeew7) {
        this.zzgmp = zzeew;
        this.zzfgm = zzeew2;
        this.zzela = zzeew3;
        this.zzgmq = zzeew4;
        this.zzgmr = zzeew5;
        this.zzgms = zzeew6;
        this.zzfbm = zzeew7;
    }

    public final /* synthetic */ Object get() {
        return new zzddq(this.zzgmp.get(), this.zzfgm.get(), this.zzela.get(), this.zzgmq.get(), this.zzgmr.get(), this.zzgms.get(), this.zzfbm.get());
    }
}

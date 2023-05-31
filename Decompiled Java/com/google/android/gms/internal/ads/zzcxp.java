package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcxp implements zzcye<zzcxq> {
    private final zzazo zzblu;
    private final zzdoe zzfrv;
    private final Context zzur;

    public zzcxp(zzdoe zzdoe, Context context, zzazo zzazo) {
        this.zzfrv = zzdoe;
        this.zzur = context;
        this.zzblu = zzazo;
    }

    public final zzdof<zzcxq> zzapb() {
        return this.zzfrv.zzd(new zzcxs(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcxq zzapo() throws Exception {
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzur).isCallerInstantApp();
        zzq.zzkv();
        boolean zzba = zzawo.zzba(this.zzur);
        String str = this.zzblu.zzbmj;
        zzq.zzkx();
        boolean zzwv = zzawu.zzwv();
        zzq.zzkv();
        return new zzcxq(isCallerInstantApp, zzba, str, zzwv, zzawo.zzax(this.zzur), DynamiteModule.getRemoteVersion(this.zzur, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(this.zzur, ModuleDescriptor.MODULE_ID));
    }
}

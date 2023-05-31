package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwo implements zzcye<zzcwl> {
    private final zzdoe zzghq;
    private final Set<String> zzgib;
    private final Context zzur;

    public zzcwo(zzdoe zzdoe, Context context, Set<String> set) {
        this.zzghq = zzdoe;
        this.zzur = context;
        this.zzgib = set;
    }

    public final zzdof<zzcwl> zzapb() {
        return this.zzghq.zzd(new zzcwn(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcwl zzapj() throws Exception {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcoz)).booleanValue() || !zzcwl.zze(this.zzgib)) {
            return new zzcwl((String) null);
        }
        return new zzcwl(zzq.zzlk().getVersion(this.zzur));
    }
}

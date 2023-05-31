package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvj implements zzcye<zzcvo> {
    private final zzdoe zzfrv;
    private final Context zzyz;

    zzcvj(Context context, zzdoe zzdoe) {
        this.zzyz = context;
        this.zzfrv = zzdoe;
    }

    public final zzdof<zzcvo> zzapb() {
        return this.zzfrv.zzd(new zzcvm(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcvo zzapg() throws Exception {
        zzq.zzkv();
        String zzbb = zzawo.zzbb(this.zzyz);
        String str = "";
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzcqx)).booleanValue()) {
            str = this.zzyz.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        zzq.zzkv();
        return new zzcvo(zzbb, str, zzawo.zzbc(this.zzyz));
    }
}

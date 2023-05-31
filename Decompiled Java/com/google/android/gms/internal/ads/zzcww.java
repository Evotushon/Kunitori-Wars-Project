package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcww implements zzcye<zzcwt> {
    private final Bundle zzfjz;
    private final zzdoe zzfrv;

    public zzcww(zzdoe zzdoe, @Nullable Bundle bundle) {
        this.zzfrv = zzdoe;
        this.zzfjz = bundle;
    }

    public final zzdof<zzcwt> zzapb() {
        return this.zzfrv.zzd(new zzcwv(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcwt zzapk() throws Exception {
        return new zzcwt(this.zzfjz);
    }
}

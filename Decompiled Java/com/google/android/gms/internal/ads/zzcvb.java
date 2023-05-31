package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcvb implements zzcye<zzcyb<Bundle>> {
    @Nullable
    private final zzdby zzgit;

    zzcvb(@Nullable zzdby zzdby) {
        this.zzgit = zzdby;
    }

    public final zzdof<zzcyb<Bundle>> zzapb() {
        zzdby zzdby = this.zzgit;
        return zzdnt.zzaj((zzdby == null || zzdby.zzaqn() == null || this.zzgit.zzaqn().isEmpty()) ? null : new zzcve(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Bundle bundle) {
        bundle.putString("key_schema", this.zzgit.zzaqn());
    }
}

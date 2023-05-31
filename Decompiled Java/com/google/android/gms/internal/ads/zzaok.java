package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaok implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaol zzdgd;

    zzaok(zzaol zzaol) {
        this.zzdgd = zzaol;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent createIntent = this.zzdgd.createIntent();
        zzq.zzkv();
        zzawo.zza(this.zzdgd.zzur, createIntent);
    }
}

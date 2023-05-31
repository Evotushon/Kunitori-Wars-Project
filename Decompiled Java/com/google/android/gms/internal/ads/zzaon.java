package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaon implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaol zzdgd;

    zzaon(zzaol zzaol) {
        this.zzdgd = zzaol;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdgd.zzdt("Operation denied by user.");
    }
}

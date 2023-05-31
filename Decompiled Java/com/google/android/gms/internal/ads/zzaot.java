package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaot implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaor zzdhb;

    zzaot(zzaor zzaor) {
        this.zzdhb = zzaor;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdhb.zzdt("User canceled the download.");
    }
}

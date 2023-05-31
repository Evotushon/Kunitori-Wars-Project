package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaxi implements DialogInterface.OnClickListener {
    private final zzaxg zzdug;
    private final int zzdul;
    private final int zzdum;
    private final int zzdun;

    zzaxi(zzaxg zzaxg, int i, int i2, int i3) {
        this.zzdug = zzaxg;
        this.zzdul = i;
        this.zzdum = i2;
        this.zzdun = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdug.zza(this.zzdul, this.zzdum, this.zzdun, dialogInterface, i);
    }
}

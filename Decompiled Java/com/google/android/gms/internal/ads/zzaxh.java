package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzaxh implements DialogInterface.OnClickListener {
    private final String zzczs;
    private final zzaxg zzdug;

    zzaxh(zzaxg zzaxg, String str) {
        this.zzdug = zzaxg;
        this.zzczs = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdug.zza(this.zzczs, dialogInterface, i);
    }
}

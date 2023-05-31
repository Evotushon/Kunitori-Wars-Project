package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaxn implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaxo zzdut;

    zzaxn(zzaxo zzaxo) {
        this.zzdut = zzaxo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzq.zzkv();
        zzawo.zza(this.zzdut.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

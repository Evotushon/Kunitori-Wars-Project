package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzbea implements Runnable {
    private final String zzczz;

    zzbea(String str) {
        this.zzczz = str;
    }

    public final void run() {
        zzq.zzkz().zzve().zzcs(this.zzczz.substring(1));
    }
}

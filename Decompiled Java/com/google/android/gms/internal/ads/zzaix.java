package com.google.android.gms.internal.ads;

import com.adjust.sdk.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaix implements Runnable {
    private final /* synthetic */ String zzdah;
    private final /* synthetic */ zzait zzdai;

    zzaix(zzait zzait, String str) {
        this.zzdai = zzait;
        this.zzdah = str;
    }

    public final void run() {
        this.zzdai.zzdae.loadData(this.zzdah, "text/html", Constants.ENCODING);
    }
}

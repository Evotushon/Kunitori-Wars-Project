package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzaiz implements Runnable {
    private final /* synthetic */ zzait zzdai;
    private final /* synthetic */ String zzdak;

    zzaiz(zzait zzait, String str) {
        this.zzdai = zzait;
        this.zzdak = str;
    }

    public final void run() {
        this.zzdai.zzdae.loadUrl(this.zzdak);
    }
}

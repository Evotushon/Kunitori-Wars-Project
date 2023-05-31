package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final /* synthetic */ class zzcyg implements Runnable {
    private final zzcye zzgkq;
    private final long zzgkr;

    zzcyg(zzcye zzcye, long j) {
        this.zzgkq = zzcye;
        this.zzgkr = j;
    }

    public final void run() {
        zzcye zzcye = this.zzgkq;
        long j = this.zzgkr;
        String canonicalName = zzcye.getClass().getCanonicalName();
        long elapsedRealtime = zzq.zzlc().elapsedRealtime() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(elapsedRealtime);
        zzawf.zzee(sb.toString());
    }
}

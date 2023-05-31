package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzavt extends zzawb {
    private final /* synthetic */ zzavr zzdsc;

    zzavt(zzavr zzavr) {
        this.zzdsc = zzavr;
    }

    public final void zztz() {
        zzaab zzaab = new zzaab(this.zzdsc.zzur, this.zzdsc.zzblu.zzbmj);
        synchronized (this.zzdsc.lock) {
            try {
                zzq.zzle();
                zzaac.zza(this.zzdsc.zzdrp, zzaab);
            } catch (IllegalArgumentException e) {
                zzawf.zzd("Cannot config CSI reporter.", e);
            }
        }
    }
}

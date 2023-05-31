package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzdeb implements zzcsq<zzcdn> {
    private final /* synthetic */ zzdec zzgpc;

    zzdeb(zzdec zzdec) {
        this.zzgpc = zzdec;
    }

    public final void zzaow() {
        synchronized (this.zzgpc) {
            zzcdn unused = this.zzgpc.zzgpa = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzcdn zzcdn = (zzcdn) obj;
        synchronized (this.zzgpc) {
            zzcdn unused = this.zzgpc.zzgpa = zzcdn;
            this.zzgpc.zzgpa.zzags();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzddv implements zzcsq<zzcdn> {
    private final /* synthetic */ zzddw zzgox;

    zzddv(zzddw zzddw) {
        this.zzgox = zzddw;
    }

    public final void zzaow() {
        synchronized (this.zzgox) {
            zzcdn unused = this.zzgox.zzgpa = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzcdn zzcdn = (zzcdn) obj;
        synchronized (this.zzgox) {
            zzcdn unused = this.zzgox.zzgpa = zzcdn;
            this.zzgox.zzgpa.zzags();
        }
    }
}

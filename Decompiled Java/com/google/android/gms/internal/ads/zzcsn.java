package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzcsn implements zzcsq<zzbnf> {
    private final /* synthetic */ zzcsk zzggp;

    zzcsn(zzcsk zzcsk) {
        this.zzggp = zzcsk;
    }

    public final void zzaow() {
        synchronized (this.zzggp) {
            boolean unused = this.zzggp.zzadk = false;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbnf zzbnf = (zzbnf) obj;
        synchronized (this.zzggp) {
            boolean unused = this.zzggp.zzadk = false;
            zzxe unused2 = this.zzggp.zzaca = zzbnf.zzahi();
            zzbnf.zzags();
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzkh implements zzkf {
    private final zzom zzavd;
    private final int zzavl = this.zzavd.zzjc();
    private final int zzavm = this.zzavd.zzjc();

    public zzkh(zzke zzke) {
        this.zzavd = zzke.zzavd;
        this.zzavd.zzbh(12);
    }

    public final int zzgu() {
        return this.zzavm;
    }

    public final int zzgv() {
        int i = this.zzavl;
        return i == 0 ? this.zzavd.zzjc() : i;
    }

    public final boolean zzgw() {
        return this.zzavl != 0;
    }
}

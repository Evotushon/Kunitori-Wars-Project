package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzkg {
    public int index;
    public final int length;
    public int zzave;
    public long zzavf;
    private final boolean zzavg;
    private final zzom zzavh;
    private final zzom zzavi;
    private int zzavj;
    private int zzavk;

    public zzkg(zzom zzom, zzom zzom2, boolean z) {
        this.zzavi = zzom;
        this.zzavh = zzom2;
        this.zzavg = z;
        zzom2.zzbh(12);
        this.length = zzom2.zzjc();
        zzom.zzbh(12);
        this.zzavk = zzom.zzjc();
        zzob.checkState(zzom.readInt() != 1 ? false : true, "first_chunk must be 1");
        this.index = -1;
    }

    public final boolean zzgx() {
        long j;
        int i = this.index + 1;
        this.index = i;
        if (i == this.length) {
            return false;
        }
        if (this.zzavg) {
            j = this.zzavh.zzjd();
        } else {
            j = this.zzavh.zziz();
        }
        this.zzavf = j;
        if (this.index == this.zzavj) {
            this.zzave = this.zzavi.zzjc();
            this.zzavi.zzbi(4);
            int i2 = this.zzavk - 1;
            this.zzavk = i2;
            this.zzavj = i2 > 0 ? this.zzavi.zzjc() - 1 : -1;
        }
        return true;
    }
}

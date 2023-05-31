package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzeba extends zzdxn {
    static final int[] zzhwf = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzhwg;
    /* access modifiers changed from: private */
    public final zzdxn zzhwh;
    /* access modifiers changed from: private */
    public final zzdxn zzhwi;
    private final int zzhwj;
    private final int zzhwk;

    private zzeba(zzdxn zzdxn, zzdxn zzdxn2) {
        this.zzhwh = zzdxn;
        this.zzhwi = zzdxn2;
        this.zzhwj = zzdxn.size();
        this.zzhwg = this.zzhwj + zzdxn2.size();
        this.zzhwk = Math.max(zzdxn.zzbav(), zzdxn2.zzbav()) + 1;
    }

    static zzdxn zza(zzdxn zzdxn, zzdxn zzdxn2) {
        if (zzdxn2.size() == 0) {
            return zzdxn;
        }
        if (zzdxn.size() == 0) {
            return zzdxn2;
        }
        int size = zzdxn.size() + zzdxn2.size();
        if (size < 128) {
            return zzb(zzdxn, zzdxn2);
        }
        if (zzdxn instanceof zzeba) {
            zzeba zzeba = (zzeba) zzdxn;
            if (zzeba.zzhwi.size() + zzdxn2.size() < 128) {
                return new zzeba(zzeba.zzhwh, zzb(zzeba.zzhwi, zzdxn2));
            } else if (zzeba.zzhwh.zzbav() > zzeba.zzhwi.zzbav() && zzeba.zzbav() > zzdxn2.zzbav()) {
                return new zzeba(zzeba.zzhwh, new zzeba(zzeba.zzhwi, zzdxn2));
            }
        }
        if (size >= zzgu(Math.max(zzdxn.zzbav(), zzdxn2.zzbav()) + 1)) {
            return new zzeba(zzdxn, zzdxn2);
        }
        return new zzebc((zzeaz) null).zzc(zzdxn, zzdxn2);
    }

    private static zzdxn zzb(zzdxn zzdxn, zzdxn zzdxn2) {
        int size = zzdxn.size();
        int size2 = zzdxn2.size();
        byte[] bArr = new byte[(size + size2)];
        zzdxn.zza(bArr, 0, 0, size);
        zzdxn2.zza(bArr, 0, size, size2);
        return zzdxn.zzu(bArr);
    }

    static int zzgu(int i) {
        int[] iArr = zzhwf;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public final byte zzfe(int i) {
        zzaa(i, this.zzhwg);
        return zzff(i);
    }

    /* access modifiers changed from: package-private */
    public final byte zzff(int i) {
        int i2 = this.zzhwj;
        if (i < i2) {
            return this.zzhwh.zzff(i);
        }
        return this.zzhwi.zzff(i - i2);
    }

    public final int size() {
        return this.zzhwg;
    }

    public final zzdxw zzbar() {
        return new zzeaz(this);
    }

    /* access modifiers changed from: protected */
    public final int zzbav() {
        return this.zzhwk;
    }

    /* access modifiers changed from: protected */
    public final boolean zzbaw() {
        return this.zzhwg >= zzgu(this.zzhwk);
    }

    public final zzdxn zzz(int i, int i2) {
        int zzi = zzi(i, i2, this.zzhwg);
        if (zzi == 0) {
            return zzdxn.zzhoe;
        }
        if (zzi == this.zzhwg) {
            return this;
        }
        int i3 = this.zzhwj;
        if (i2 <= i3) {
            return this.zzhwh.zzz(i, i2);
        }
        if (i >= i3) {
            return this.zzhwi.zzz(i - i3, i2 - i3);
        }
        zzdxn zzdxn = this.zzhwh;
        return new zzeba(zzdxn.zzz(i, zzdxn.size()), this.zzhwi.zzz(0, i2 - this.zzhwj));
    }

    /* access modifiers changed from: protected */
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzhwj;
        if (i4 <= i5) {
            this.zzhwh.zzb(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zzhwi.zzb(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzhwh.zzb(bArr, i, i2, i6);
            this.zzhwi.zzb(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdxo zzdxo) throws IOException {
        this.zzhwh.zza(zzdxo);
        this.zzhwi.zza(zzdxo);
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public final boolean zzbat() {
        int zzg = this.zzhwh.zzg(0, 0, this.zzhwj);
        zzdxn zzdxn = this.zzhwi;
        if (zzdxn.zzg(zzg, 0, zzdxn.size()) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final int zzg(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzhwj;
        if (i4 <= i5) {
            return this.zzhwh.zzg(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzhwi.zzg(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzhwi.zzg(this.zzhwh.zzg(i, i2, i6), 0, i3 - i6);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdxn)) {
            return false;
        }
        zzdxn zzdxn = (zzdxn) obj;
        if (this.zzhwg != zzdxn.size()) {
            return false;
        }
        if (this.zzhwg == 0) {
            return true;
        }
        int zzbax = zzbax();
        int zzbax2 = zzdxn.zzbax();
        if (zzbax != 0 && zzbax2 != 0 && zzbax != zzbax2) {
            return false;
        }
        zzebb zzebb = new zzebb(this, (zzeaz) null);
        zzdxy zzdxy = (zzdxy) zzebb.next();
        zzebb zzebb2 = new zzebb(zzdxn, (zzeaz) null);
        zzdxy zzdxy2 = (zzdxy) zzebb2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = zzdxy.size() - i;
            int size2 = zzdxy2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                z = zzdxy.zza(zzdxy2, i2, min);
            } else {
                z = zzdxy2.zza(zzdxy, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzhwg;
            if (i3 < i4) {
                if (min == size) {
                    zzdxy = (zzdxy) zzebb.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    zzdxy2 = (zzdxy) zzebb2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int zzh(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzhwj;
        if (i4 <= i5) {
            return this.zzhwh.zzh(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzhwi.zzh(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzhwi.zzh(this.zzhwh.zzh(i, i2, i6), 0, i3 - i6);
    }

    public final zzdxz zzbau() {
        return new zzdye(new zzebe(this));
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* synthetic */ zzeba(zzdxn zzdxn, zzdxn zzdxn2, zzeaz zzeaz) {
        this(zzdxn, zzdxn2);
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
class zzdxx extends zzdxy {
    protected final byte[] zzhol;

    zzdxx(byte[] bArr) {
        if (bArr != null) {
            this.zzhol = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public int zzbay() {
        return 0;
    }

    public byte zzfe(int i) {
        return this.zzhol[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzff(int i) {
        return this.zzhol[i];
    }

    public int size() {
        return this.zzhol.length;
    }

    public final zzdxn zzz(int i, int i2) {
        int zzi = zzi(i, i2, size());
        if (zzi == 0) {
            return zzdxn.zzhoe;
        }
        return new zzdxu(this.zzhol, zzbay() + i, zzi);
    }

    /* access modifiers changed from: protected */
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhol, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdxo zzdxo) throws IOException {
        zzdxo.zzi(this.zzhol, zzbay(), size());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zzhol, zzbay(), size(), charset);
    }

    public final boolean zzbat() {
        int zzbay = zzbay();
        return zzece.zzm(this.zzhol, zzbay, size() + zzbay);
    }

    /* access modifiers changed from: protected */
    public final int zzg(int i, int i2, int i3) {
        int zzbay = zzbay() + i2;
        return zzece.zzb(i, this.zzhol, zzbay, i3 + zzbay);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdxn) || size() != ((zzdxn) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzdxx)) {
            return obj.equals(this);
        }
        zzdxx zzdxx = (zzdxx) obj;
        int zzbax = zzbax();
        int zzbax2 = zzdxx.zzbax();
        if (zzbax == 0 || zzbax2 == 0 || zzbax == zzbax2) {
            return zza(zzdxx, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzdxn zzdxn, int i, int i2) {
        if (i2 <= zzdxn.size()) {
            int i3 = i + i2;
            if (i3 > zzdxn.size()) {
                int size = zzdxn.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(zzdxn instanceof zzdxx)) {
                return zzdxn.zzz(i, i3).equals(zzz(0, i2));
            } else {
                zzdxx zzdxx = (zzdxx) zzdxn;
                byte[] bArr = this.zzhol;
                byte[] bArr2 = zzdxx.zzhol;
                int zzbay = zzbay() + i2;
                int zzbay2 = zzbay();
                int zzbay3 = zzdxx.zzbay() + i;
                while (zzbay2 < zzbay) {
                    if (bArr[zzbay2] != bArr2[zzbay3]) {
                        return false;
                    }
                    zzbay2++;
                    zzbay3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final int zzh(int i, int i2, int i3) {
        return zzdzc.zza(i, this.zzhol, zzbay() + i2, i3);
    }

    public final zzdxz zzbau() {
        return zzdxz.zzb(this.zzhol, zzbay(), size(), true);
    }
}

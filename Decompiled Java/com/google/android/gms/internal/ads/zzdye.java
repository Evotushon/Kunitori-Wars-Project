package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
final class zzdye extends zzdxz {
    private final byte[] buffer;
    private int pos;
    private int zzaiq;
    private int zzhos;
    private int zzhou;
    private int zzhov;
    private final InputStream zzhow;
    private int zzhox;
    private zzdyd zzhoy;

    private zzdye(InputStream inputStream, int i) {
        super();
        this.zzhov = Integer.MAX_VALUE;
        this.zzhoy = null;
        zzdzc.zza(inputStream, "input");
        this.zzhow = inputStream;
        this.buffer = new byte[i];
        this.zzaiq = 0;
        this.pos = 0;
        this.zzhox = 0;
    }

    public final int zzbbb() throws IOException {
        if (zzbbr()) {
            this.zzhou = 0;
            return 0;
        }
        this.zzhou = zzbbt();
        int i = this.zzhou;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw zzdzh.zzbdl();
    }

    public final void zzfh(int i) throws zzdzh {
        if (this.zzhou != i) {
            throw zzdzh.zzbdm();
        }
    }

    public final boolean zzfi(int i) throws IOException {
        int zzbbb;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzaiq - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzdzh.zzbdk();
            }
            while (i3 < 10) {
                if (zzbby() < 0) {
                    i3++;
                }
            }
            throw zzdzh.zzbdk();
            return true;
        } else if (i2 == 1) {
            zzfm(8);
            return true;
        } else if (i2 == 2) {
            zzfm(zzbbt());
            return true;
        } else if (i2 == 3) {
            do {
                zzbbb = zzbbb();
                if (zzbbb == 0 || !zzfi(zzbbb)) {
                    zzfh(((i >>> 3) << 3) | 4);
                }
                zzbbb = zzbbb();
                break;
            } while (!zzfi(zzbbb));
            zzfh(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzfm(4);
                return true;
            }
            throw zzdzh.zzbdn();
        }
    }

    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzbbw());
    }

    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzbbv());
    }

    public final long zzbbc() throws IOException {
        return zzbbu();
    }

    public final long zzbbd() throws IOException {
        return zzbbu();
    }

    public final int zzbbe() throws IOException {
        return zzbbt();
    }

    public final long zzbbf() throws IOException {
        return zzbbw();
    }

    public final int zzbbg() throws IOException {
        return zzbbv();
    }

    public final boolean zzbbh() throws IOException {
        return zzbbu() != 0;
    }

    public final String readString() throws IOException {
        int zzbbt = zzbbt();
        if (zzbbt > 0) {
            int i = this.zzaiq;
            int i2 = this.pos;
            if (zzbbt <= i - i2) {
                String str = new String(this.buffer, i2, zzbbt, zzdzc.UTF_8);
                this.pos += zzbbt;
                return str;
            }
        }
        if (zzbbt == 0) {
            return "";
        }
        if (zzbbt > this.zzaiq) {
            return new String(zzg(zzbbt, false), zzdzc.UTF_8);
        }
        zzfn(zzbbt);
        String str2 = new String(this.buffer, this.pos, zzbbt, zzdzc.UTF_8);
        this.pos += zzbbt;
        return str2;
    }

    public final String zzbbi() throws IOException {
        byte[] bArr;
        int zzbbt = zzbbt();
        int i = this.pos;
        int i2 = 0;
        if (zzbbt <= this.zzaiq - i && zzbbt > 0) {
            bArr = this.buffer;
            this.pos = i + zzbbt;
            i2 = i;
        } else if (zzbbt == 0) {
            return "";
        } else {
            if (zzbbt <= this.zzaiq) {
                zzfn(zzbbt);
                bArr = this.buffer;
                this.pos = zzbbt;
            } else {
                bArr = zzg(zzbbt, false);
            }
        }
        return zzece.zzo(bArr, i2, zzbbt);
    }

    public final zzdxn zzbbj() throws IOException {
        int zzbbt = zzbbt();
        int i = this.zzaiq;
        int i2 = this.pos;
        if (zzbbt <= i - i2 && zzbbt > 0) {
            zzdxn zzh = zzdxn.zzh(this.buffer, i2, zzbbt);
            this.pos += zzbbt;
            return zzh;
        } else if (zzbbt == 0) {
            return zzdxn.zzhoe;
        } else {
            byte[] zzfp = zzfp(zzbbt);
            if (zzfp != null) {
                return zzdxn.zzt(zzfp);
            }
            int i3 = this.pos;
            int i4 = this.zzaiq;
            int i5 = i4 - i3;
            this.zzhox += i4;
            this.pos = 0;
            this.zzaiq = 0;
            List<byte[]> zzfq = zzfq(zzbbt - i5);
            byte[] bArr = new byte[zzbbt];
            System.arraycopy(this.buffer, i3, bArr, 0, i5);
            for (byte[] next : zzfq) {
                System.arraycopy(next, 0, bArr, i5, next.length);
                i5 += next.length;
            }
            return zzdxn.zzu(bArr);
        }
    }

    public final int zzbbk() throws IOException {
        return zzbbt();
    }

    public final int zzbbl() throws IOException {
        return zzbbt();
    }

    public final int zzbbm() throws IOException {
        return zzbbv();
    }

    public final long zzbbn() throws IOException {
        return zzbbw();
    }

    public final int zzbbo() throws IOException {
        return zzfl(zzbbt());
    }

    public final long zzbbp() throws IOException {
        return zzfg(zzbbu());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzbbt() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.zzaiq
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.pos = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.pos = r1
            return r0
        L_0x006b:
            long r0 = r5.zzbbq()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdye.zzbbt():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long zzbbu() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.pos
            int r1 = r11.zzaiq
            if (r1 == r0) goto L_0x00b5
            byte[] r2 = r11.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.pos = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b5
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0026
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            r3 = r2
            goto L_0x00b2
        L_0x0026:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0037
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r3 = r9
            goto L_0x00b2
        L_0x0037:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0045
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0045:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005c
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0058:
            long r1 = r1 ^ r3
            r3 = r1
        L_0x005a:
            r1 = r0
            goto L_0x00b2
        L_0x005c:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006e:
            long r3 = r3 ^ r5
            goto L_0x00b2
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0058
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006e
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x005a
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
        L_0x00b2:
            r11.pos = r1
            return r3
        L_0x00b5:
            long r0 = r11.zzbbq()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdye.zzbbu():long");
    }

    /* access modifiers changed from: package-private */
    public final long zzbbq() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzbby = zzbby();
            j |= ((long) (zzbby & Byte.MAX_VALUE)) << i;
            if ((zzbby & 128) == 0) {
                return j;
            }
        }
        throw zzdzh.zzbdk();
    }

    private final int zzbbv() throws IOException {
        int i = this.pos;
        if (this.zzaiq - i < 4) {
            zzfn(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbbw() throws IOException {
        int i = this.pos;
        if (this.zzaiq - i < 8) {
            zzfn(8);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int zzfj(int i) throws zzdzh {
        if (i >= 0) {
            int i2 = i + this.zzhox + this.pos;
            int i3 = this.zzhov;
            if (i2 <= i3) {
                this.zzhov = i2;
                zzbbx();
                return i3;
            }
            throw zzdzh.zzbdi();
        }
        throw zzdzh.zzbdj();
    }

    private final void zzbbx() {
        this.zzaiq += this.zzhos;
        int i = this.zzhox;
        int i2 = this.zzaiq;
        int i3 = i + i2;
        int i4 = this.zzhov;
        if (i3 > i4) {
            this.zzhos = i3 - i4;
            this.zzaiq = i2 - this.zzhos;
            return;
        }
        this.zzhos = 0;
    }

    public final void zzfk(int i) {
        this.zzhov = i;
        zzbbx();
    }

    public final boolean zzbbr() throws IOException {
        return this.pos == this.zzaiq && !zzfo(1);
    }

    public final int zzbbs() {
        return this.zzhox + this.pos;
    }

    private final void zzfn(int i) throws IOException {
        if (zzfo(i)) {
            return;
        }
        if (i > (this.zzhoo - this.zzhox) - this.pos) {
            throw zzdzh.zzbdo();
        }
        throw zzdzh.zzbdi();
    }

    private final boolean zzfo(int i) throws IOException {
        while (this.pos + i > this.zzaiq) {
            int i2 = this.zzhoo;
            int i3 = this.zzhox;
            int i4 = this.pos;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.zzhov) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.zzaiq;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzhox += i4;
                this.zzaiq -= i4;
                this.pos = 0;
            }
            InputStream inputStream = this.zzhow;
            byte[] bArr2 = this.buffer;
            int i6 = this.zzaiq;
            int read = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.zzhoo - this.zzhox) - this.zzaiq));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                String valueOf = String.valueOf(this.zzhow.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.zzaiq += read;
                zzbbx();
                if (this.zzaiq >= i) {
                    return true;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte zzbby() throws IOException {
        if (this.pos == this.zzaiq) {
            zzfn(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final byte[] zzg(int i, boolean z) throws IOException {
        byte[] zzfp = zzfp(i);
        if (zzfp != null) {
            return zzfp;
        }
        int i2 = this.pos;
        int i3 = this.zzaiq;
        int i4 = i3 - i2;
        this.zzhox += i3;
        this.pos = 0;
        this.zzaiq = 0;
        List<byte[]> zzfq = zzfq(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] next : zzfq) {
            System.arraycopy(next, 0, bArr, i4, next.length);
            i4 += next.length;
        }
        return bArr;
    }

    private final byte[] zzfp(int i) throws IOException {
        if (i == 0) {
            return zzdzc.zzhtq;
        }
        if (i >= 0) {
            int i2 = this.zzhox + this.pos + i;
            if (i2 - this.zzhoo <= 0) {
                int i3 = this.zzhov;
                if (i2 <= i3) {
                    int i4 = this.zzaiq - this.pos;
                    int i5 = i - i4;
                    if (i5 >= 4096 && i5 > this.zzhow.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
                    this.zzhox += this.zzaiq;
                    this.pos = 0;
                    this.zzaiq = 0;
                    while (i4 < bArr.length) {
                        int read = this.zzhow.read(bArr, i4, i - i4);
                        if (read != -1) {
                            this.zzhox += read;
                            i4 += read;
                        } else {
                            throw zzdzh.zzbdi();
                        }
                    }
                    return bArr;
                }
                zzfm((i3 - this.zzhox) - this.pos);
                throw zzdzh.zzbdi();
            }
            throw zzdzh.zzbdo();
        }
        throw zzdzh.zzbdj();
    }

    private final List<byte[]> zzfq(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            byte[] bArr = new byte[Math.min(i, 4096)];
            int i2 = 0;
            while (i2 < bArr.length) {
                int read = this.zzhow.read(bArr, i2, bArr.length - i2);
                if (read != -1) {
                    this.zzhox += read;
                    i2 += read;
                } else {
                    throw zzdzh.zzbdi();
                }
            }
            i -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzfm(int i) throws IOException {
        int i2 = this.zzaiq;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
        } else if (i >= 0) {
            int i4 = this.zzhox;
            int i5 = this.pos;
            int i6 = i4 + i5 + i;
            int i7 = this.zzhov;
            if (i6 <= i7) {
                this.zzhox = i4 + i5;
                int i8 = this.zzaiq - i5;
                this.zzaiq = 0;
                this.pos = 0;
                while (i8 < i) {
                    try {
                        long j = (long) (i - i8);
                        long skip = this.zzhow.skip(j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            }
                            i8 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.zzhow.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.zzhox += i8;
                        zzbbx();
                        throw th;
                    }
                }
                this.zzhox += i8;
                zzbbx();
                if (i8 < i) {
                    int i9 = this.zzaiq;
                    int i10 = i9 - this.pos;
                    this.pos = i9;
                    zzfn(1);
                    while (true) {
                        int i11 = i - i10;
                        int i12 = this.zzaiq;
                        if (i11 > i12) {
                            i10 += i12;
                            this.pos = i12;
                            zzfn(1);
                        } else {
                            this.pos = i11;
                            return;
                        }
                    }
                }
            } else {
                zzfm((i7 - i4) - i5);
                throw zzdzh.zzbdi();
            }
        } else {
            throw zzdzh.zzbdj();
        }
    }
}

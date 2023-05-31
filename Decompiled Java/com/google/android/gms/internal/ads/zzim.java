package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzim {
    private final int zzafy;
    private float zzagk;
    private float zzagl;
    private final int zzalg;
    private final int zzalh;
    private final int zzali;
    private final int zzalj = (this.zzali * 2);
    private final short[] zzalk;
    private int zzall;
    private short[] zzalm;
    private int zzaln;
    private short[] zzalo;
    private int zzalp;
    private short[] zzalq;
    private int zzalr;
    private int zzals;
    private int zzalt;
    private int zzalu;
    private int zzalv;
    private int zzalw;
    private int zzalx;
    private int zzaly;
    private int zzalz;
    private int zzama;

    public zzim(int i, int i2) {
        this.zzafy = i;
        this.zzalg = i2;
        this.zzalh = i / 400;
        this.zzali = i / 65;
        int i3 = this.zzalj;
        this.zzalk = new short[i3];
        this.zzall = i3;
        this.zzalm = new short[(i3 * i2)];
        this.zzaln = i3;
        this.zzalo = new short[(i3 * i2)];
        this.zzalp = i3;
        this.zzalq = new short[(i3 * i2)];
        this.zzalr = 0;
        this.zzals = 0;
        this.zzalx = 0;
        this.zzagk = 1.0f;
        this.zzagl = 1.0f;
    }

    public final void setSpeed(float f) {
        this.zzagk = f;
    }

    public final void zza(float f) {
        this.zzagl = f;
    }

    public final void zza(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzalg;
        int i2 = remaining / i;
        zzv(i2);
        shortBuffer.get(this.zzalm, this.zzalt * this.zzalg, ((i * i2) << 1) / 2);
        this.zzalt += i2;
        zzgb();
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzalg, this.zzalu);
        shortBuffer.put(this.zzalo, 0, this.zzalg * min);
        this.zzalu -= min;
        short[] sArr = this.zzalo;
        int i = this.zzalg;
        System.arraycopy(sArr, min * i, sArr, 0, this.zzalu * i);
    }

    public final void zzfg() {
        int i;
        int i2 = this.zzalt;
        float f = this.zzagk;
        float f2 = this.zzagl;
        int i3 = this.zzalu + ((int) ((((((float) i2) / (f / f2)) + ((float) this.zzalv)) / f2) + 0.5f));
        zzv((this.zzalj * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.zzalj;
            int i5 = this.zzalg;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.zzalm[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.zzalt += i * 2;
        zzgb();
        if (this.zzalu > i3) {
            this.zzalu = i3;
        }
        this.zzalt = 0;
        this.zzalw = 0;
        this.zzalv = 0;
    }

    public final int zzga() {
        return this.zzalu;
    }

    private final void zzu(int i) {
        int i2 = this.zzalu + i;
        int i3 = this.zzaln;
        if (i2 > i3) {
            this.zzaln = i3 + (i3 / 2) + i;
            this.zzalo = Arrays.copyOf(this.zzalo, this.zzaln * this.zzalg);
        }
    }

    private final void zzv(int i) {
        int i2 = this.zzalt + i;
        int i3 = this.zzall;
        if (i2 > i3) {
            this.zzall = i3 + (i3 / 2) + i;
            this.zzalm = Arrays.copyOf(this.zzalm, this.zzall * this.zzalg);
        }
    }

    private final void zza(short[] sArr, int i, int i2) {
        zzu(i2);
        int i3 = this.zzalg;
        System.arraycopy(sArr, i * i3, this.zzalo, this.zzalu * i3, i3 * i2);
        this.zzalu += i2;
    }

    private final void zzb(short[] sArr, int i, int i2) {
        int i3 = this.zzalj / i2;
        int i4 = this.zzalg;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzalk[i7] = (short) (i8 / i5);
        }
    }

    private final int zza(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzalg;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.zzalz = i5 / i6;
        this.zzama = i7 / i8;
        return i6;
    }

    private final void zzgb() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzalu;
        float f = this.zzagk / this.zzagl;
        double d = (double) f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.zzalt;
            if (i9 >= this.zzalj) {
                int i10 = 0;
                while (true) {
                    int i11 = this.zzalw;
                    if (i11 > 0) {
                        int min = Math.min(this.zzalj, i11);
                        zza(this.zzalm, i10, min);
                        this.zzalw -= min;
                        i10 += min;
                    } else {
                        short[] sArr = this.zzalm;
                        int i12 = this.zzafy;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.zzalg == i8 && i13 == i8) {
                            i4 = zza(sArr, i10, this.zzalh, this.zzali);
                        } else {
                            zzb(sArr, i10, i13);
                            int zza = zza(this.zzalk, 0, this.zzalh / i13, this.zzali / i13);
                            if (i13 != i8) {
                                int i14 = zza * i13;
                                int i15 = i13 << 2;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.zzalh;
                                if (i16 >= i18) {
                                    i18 = i16;
                                }
                                int i19 = this.zzali;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.zzalg == i8) {
                                    i4 = zza(sArr, i10, i18, i17);
                                } else {
                                    zzb(sArr, i10, i8);
                                    i4 = zza(this.zzalk, 0, i18, i17);
                                }
                            } else {
                                i4 = zza;
                            }
                        }
                        int i20 = this.zzalz;
                        int i21 = i20 != 0 && this.zzalx != 0 && this.zzama <= i20 * 3 && (i20 << 1) > this.zzaly * 3 ? this.zzalx : i4;
                        this.zzaly = this.zzalz;
                        this.zzalx = i4;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzalm;
                            if (f >= 2.0f) {
                                i6 = (int) (((float) i21) / (f - 1.0f));
                            } else {
                                this.zzalw = (int) ((((float) i21) * (2.0f - f)) / (f - 1.0f));
                                i6 = i21;
                            }
                            zzu(i6);
                            int i22 = i6;
                            zza(i6, this.zzalg, this.zzalo, this.zzalu, sArr2, i10, sArr2, i10 + i21);
                            this.zzalu += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.zzalm;
                            if (f < 0.5f) {
                                i5 = (int) ((((float) i23) * f) / (1.0f - f));
                            } else {
                                this.zzalw = (int) ((((float) i23) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i5 = i23;
                            }
                            int i24 = i23 + i5;
                            zzu(i24);
                            int i25 = this.zzalg;
                            System.arraycopy(sArr3, i10 * i25, this.zzalo, this.zzalu * i25, i25 * i23);
                            zza(i5, this.zzalg, this.zzalo, this.zzalu + i23, sArr3, i23 + i10, sArr3, i10);
                            this.zzalu += i24;
                            i10 += i5;
                        }
                    }
                    if (this.zzalj + i10 > i9) {
                        break;
                    }
                    i8 = 1;
                }
                int i26 = this.zzalt - i10;
                short[] sArr4 = this.zzalm;
                int i27 = this.zzalg;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.zzalt = i26;
            }
        } else {
            zza(this.zzalm, 0, this.zzalt);
            this.zzalt = 0;
        }
        float f2 = this.zzagl;
        if (f2 != 1.0f && this.zzalu != i7) {
            int i28 = this.zzafy;
            int i29 = (int) (((float) i28) / f2);
            while (true) {
                if (i29 <= 16384 && i28 <= 16384) {
                    break;
                }
                i29 /= 2;
                i28 /= 2;
            }
            int i30 = this.zzalu - i7;
            int i31 = this.zzalv + i30;
            int i32 = this.zzalp;
            if (i31 > i32) {
                this.zzalp = i32 + (i32 / 2) + i30;
                this.zzalq = Arrays.copyOf(this.zzalq, this.zzalp * this.zzalg);
            }
            short[] sArr5 = this.zzalo;
            int i33 = this.zzalg;
            System.arraycopy(sArr5, i7 * i33, this.zzalq, this.zzalv * i33, i33 * i30);
            this.zzalu = i7;
            this.zzalv += i30;
            int i34 = 0;
            while (true) {
                i = this.zzalv;
                if (i34 >= i - 1) {
                    break;
                }
                while (true) {
                    i2 = this.zzalr;
                    int i35 = (i2 + 1) * i29;
                    i3 = this.zzals;
                    if (i35 <= i3 * i28) {
                        break;
                    }
                    zzu(1);
                    int i36 = 0;
                    while (true) {
                        int i37 = this.zzalg;
                        if (i36 >= i37) {
                            break;
                        }
                        short[] sArr6 = this.zzalq;
                        int i38 = (i34 * i37) + i36;
                        short s = sArr6[i38];
                        short s2 = sArr6[i38 + i37];
                        int i39 = this.zzalr;
                        int i40 = i39 * i29;
                        int i41 = (i39 + 1) * i29;
                        int i42 = i41 - (this.zzals * i28);
                        int i43 = i41 - i40;
                        this.zzalo[(this.zzalu * i37) + i36] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i36++;
                    }
                    this.zzals++;
                    this.zzalu++;
                }
                this.zzalr = i2 + 1;
                if (this.zzalr == i28) {
                    this.zzalr = 0;
                    zzob.checkState(i3 == i29);
                    this.zzals = 0;
                }
                i34++;
            }
            int i44 = i - 1;
            if (i44 != 0) {
                short[] sArr7 = this.zzalq;
                int i45 = this.zzalg;
                System.arraycopy(sArr7, i44 * i45, sArr7, 0, (i - i44) * i45);
                this.zzalv -= i44;
            }
        }
    }

    private static void zza(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}

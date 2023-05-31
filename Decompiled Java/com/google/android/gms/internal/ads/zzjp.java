package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzjp implements zzju {
    private final byte[] zzank = new byte[8];
    private final Stack<zzjr> zzanl = new Stack<>();
    private final zzjz zzanm = new zzjz();
    private zzjt zzann;
    private int zzano;
    private int zzanp;
    private long zzanq;

    zzjp() {
    }

    public final void zza(zzjt zzjt) {
        this.zzann = zzjt;
    }

    public final void reset() {
        this.zzano = 0;
        this.zzanl.clear();
        this.zzanm.reset();
    }

    public final boolean zzb(zzjf zzjf) throws IOException, InterruptedException {
        String str;
        double d;
        int zzak;
        int zza;
        zzob.checkState(this.zzann != null);
        while (true) {
            if (this.zzanl.isEmpty() || zzjf.getPosition() < this.zzanl.peek().zzant) {
                if (this.zzano == 0) {
                    long zza2 = this.zzanm.zza(zzjf, true, false, 4);
                    if (zza2 == -2) {
                        zzjf.zzgm();
                        while (true) {
                            zzjf.zza(this.zzank, 0, 4);
                            zzak = zzjz.zzak(this.zzank[0]);
                            if (zzak != -1 && zzak <= 4) {
                                zza = (int) zzjz.zza(this.zzank, zzak, false);
                                if (this.zzann.zzai(zza)) {
                                    break;
                                }
                            }
                            zzjf.zzac(1);
                        }
                        zzjf.zzac(zzak);
                        zza2 = (long) zza;
                    }
                    if (zza2 == -1) {
                        return false;
                    }
                    this.zzanp = (int) zza2;
                    this.zzano = 1;
                }
                if (this.zzano == 1) {
                    this.zzanq = this.zzanm.zza(zzjf, false, true, 8);
                    this.zzano = 2;
                }
                int zzah = this.zzann.zzah(this.zzanp);
                if (zzah == 0) {
                    zzjf.zzac((int) this.zzanq);
                    this.zzano = 0;
                } else if (zzah == 1) {
                    long position = zzjf.getPosition();
                    this.zzanl.add(new zzjr(this.zzanp, this.zzanq + position));
                    this.zzann.zzd(this.zzanp, position, this.zzanq);
                    this.zzano = 0;
                    return true;
                } else if (zzah == 2) {
                    long j = this.zzanq;
                    if (j <= 8) {
                        this.zzann.zzc(this.zzanp, zza(zzjf, (int) j));
                        this.zzano = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j);
                    throw new zzhc(sb.toString());
                } else if (zzah == 3) {
                    long j2 = this.zzanq;
                    if (j2 <= 2147483647L) {
                        zzjt zzjt = this.zzann;
                        int i = this.zzanp;
                        int i2 = (int) j2;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i2];
                            zzjf.readFully(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        zzjt.zza(i, str);
                        this.zzano = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j2);
                    throw new zzhc(sb2.toString());
                } else if (zzah == 4) {
                    this.zzann.zza(this.zzanp, (int) this.zzanq, zzjf);
                    this.zzano = 0;
                    return true;
                } else if (zzah == 5) {
                    long j3 = this.zzanq;
                    if (j3 == 4 || j3 == 8) {
                        zzjt zzjt2 = this.zzann;
                        int i3 = this.zzanp;
                        int i4 = (int) this.zzanq;
                        long zza3 = zza(zzjf, i4);
                        if (i4 == 4) {
                            d = (double) Float.intBitsToFloat((int) zza3);
                        } else {
                            d = Double.longBitsToDouble(zza3);
                        }
                        zzjt2.zza(i3, d);
                        this.zzano = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j3);
                    throw new zzhc(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(zzah);
                    throw new zzhc(sb4.toString());
                }
            } else {
                this.zzann.zzaj(this.zzanl.pop().zzanp);
                return true;
            }
        }
    }

    private final long zza(zzjf zzjf, int i) throws IOException, InterruptedException {
        zzjf.readFully(this.zzank, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zzank[i2] & 255));
        }
        return j;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public abstract class zzdyi extends zzdxo {
    private static final Logger logger = Logger.getLogger(zzdyi.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzhpd = zzecb.zzbfi();
    zzdyj zzhpe;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zza extends zzb {
        private final ByteBuffer zzhpf;
        private int zzhpg;

        zza(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzhpf = byteBuffer;
            this.zzhpg = byteBuffer.position();
        }

        public final void flush() {
            this.zzhpf.position(this.zzhpg + zzbce());
        }
    }

    public static int zzbq(boolean z) {
        return 1;
    }

    public static int zzc(double d) {
        return 8;
    }

    public static int zzfl(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int zzfn(long j) {
        return 8;
    }

    public static int zzfo(long j) {
        return 8;
    }

    private static long zzfp(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzg(float f) {
        return 4;
    }

    public static int zzgb(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzgd(int i) {
        return 4;
    }

    public static int zzge(int i) {
        return 4;
    }

    private static int zzgg(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static zzdyi zzv(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(int i, zzdxn zzdxn) throws IOException;

    public abstract void zza(int i, zzeah zzeah) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(int i, zzeah zzeah, zzebd zzebd) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zza(zzeah zzeah, zzebd zzebd) throws IOException;

    public abstract void zzab(int i, int i2) throws IOException;

    public abstract void zzac(int i, int i2) throws IOException;

    public abstract void zzad(int i, int i2) throws IOException;

    public abstract void zzaf(int i, int i2) throws IOException;

    public abstract void zzah(zzdxn zzdxn) throws IOException;

    public abstract void zzb(int i, zzdxn zzdxn) throws IOException;

    public abstract void zzb(int i, zzeah zzeah) throws IOException;

    public abstract int zzbcb();

    public abstract void zzd(byte b) throws IOException;

    public abstract void zzf(int i, String str) throws IOException;

    public abstract void zzfh(long j) throws IOException;

    public abstract void zzfj(long j) throws IOException;

    public abstract void zzfv(int i) throws IOException;

    public abstract void zzfw(int i) throws IOException;

    public abstract void zzfy(int i) throws IOException;

    public abstract void zzg(zzeah zzeah) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzh(int i, boolean z) throws IOException;

    public abstract void zzhj(String str) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void zzk(byte[] bArr, int i, int i2) throws IOException;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    public static class zzd extends IOException {
        zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzd(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyi.zzd.<init>(java.lang.String):void");
        }

        zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zzd(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyi.zzd.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public static zzdyi zzm(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zza(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (zzecb.zzbfj()) {
            return new zze(byteBuffer);
        } else {
            return new zzc(byteBuffer);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zzc extends zzdyi {
        private final ByteBuffer zzakt;
        private final int zzhpg;
        private final ByteBuffer zzhph;

        zzc(ByteBuffer byteBuffer) {
            super();
            this.zzhph = byteBuffer;
            this.zzakt = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzhpg = byteBuffer.position();
        }

        public final void zzab(int i, int i2) throws IOException {
            zzfw((i << 3) | i2);
        }

        public final void zzac(int i, int i2) throws IOException {
            zzab(i, 0);
            zzfv(i2);
        }

        public final void zzad(int i, int i2) throws IOException {
            zzab(i, 0);
            zzfw(i2);
        }

        public final void zzaf(int i, int i2) throws IOException {
            zzab(i, 5);
            zzfy(i2);
        }

        public final void zzh(int i, long j) throws IOException {
            zzab(i, 0);
            zzfh(j);
        }

        public final void zzj(int i, long j) throws IOException {
            zzab(i, 1);
            zzfj(j);
        }

        public final void zzh(int i, boolean z) throws IOException {
            zzab(i, 0);
            zzd(z ? (byte) 1 : 0);
        }

        public final void zzf(int i, String str) throws IOException {
            zzab(i, 2);
            zzhj(str);
        }

        public final void zza(int i, zzdxn zzdxn) throws IOException {
            zzab(i, 2);
            zzah(zzdxn);
        }

        public final void zza(int i, zzeah zzeah) throws IOException {
            zzab(i, 2);
            zzg(zzeah);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, zzeah zzeah, zzebd zzebd) throws IOException {
            zzab(i, 2);
            zza(zzeah, zzebd);
        }

        public final void zzb(int i, zzeah zzeah) throws IOException {
            zzab(1, 3);
            zzad(2, i);
            zza(3, zzeah);
            zzab(1, 4);
        }

        public final void zzb(int i, zzdxn zzdxn) throws IOException {
            zzab(1, 3);
            zzad(2, i);
            zza(3, zzdxn);
            zzab(1, 4);
        }

        public final void zzg(zzeah zzeah) throws IOException {
            zzfw(zzeah.zzbda());
            zzeah.zzb(this);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzeah zzeah, zzebd zzebd) throws IOException {
            zzdxd zzdxd = (zzdxd) zzeah;
            int zzbaj = zzdxd.zzbaj();
            if (zzbaj == -1) {
                zzbaj = zzebd.zzax(zzdxd);
                zzdxd.zzfa(zzbaj);
            }
            zzfw(zzbaj);
            zzebd.zza(zzeah, this.zzhpe);
        }

        public final void zzd(byte b) throws IOException {
            try {
                this.zzakt.put(b);
            } catch (BufferOverflowException e) {
                throw new zzd((Throwable) e);
            }
        }

        public final void zzah(zzdxn zzdxn) throws IOException {
            zzfw(zzdxn.size());
            zzdxn.zza((zzdxo) this);
        }

        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzfw(i2);
            write(bArr, 0, i2);
        }

        public final void zzfv(int i) throws IOException {
            if (i >= 0) {
                zzfw(i);
            } else {
                zzfh((long) i);
            }
        }

        public final void zzfw(int i) throws IOException {
            while ((i & -128) != 0) {
                this.zzakt.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.zzakt.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzd((Throwable) e);
            }
        }

        public final void zzfy(int i) throws IOException {
            try {
                this.zzakt.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzd((Throwable) e);
            }
        }

        public final void zzfh(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.zzakt.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.zzakt.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzd((Throwable) e);
            }
        }

        public final void zzfj(long j) throws IOException {
            try {
                this.zzakt.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzd((Throwable) e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.zzakt.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzd((Throwable) e2);
            }
        }

        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzhj(String str) throws IOException {
            int position = this.zzakt.position();
            try {
                int zzgb = zzgb(str.length() * 3);
                int zzgb2 = zzgb(str.length());
                if (zzgb2 == zzgb) {
                    int position2 = this.zzakt.position() + zzgb2;
                    this.zzakt.position(position2);
                    zzhl(str);
                    int position3 = this.zzakt.position();
                    this.zzakt.position(position);
                    zzfw(position3 - position2);
                    this.zzakt.position(position3);
                    return;
                }
                zzfw(zzece.zza(str));
                zzhl(str);
            } catch (zzech e) {
                this.zzakt.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzd((Throwable) e2);
            }
        }

        public final void flush() {
            this.zzhph.position(this.zzakt.position());
        }

        public final int zzbcb() {
            return this.zzakt.remaining();
        }

        private final void zzhl(String str) throws IOException {
            try {
                zzece.zza(str, this.zzakt);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd((Throwable) e);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static final class zze extends zzdyi {
        private final ByteBuffer zzakt;
        private long zzana = this.zzhpj;
        private final ByteBuffer zzhph;
        private final long zzhpi;
        private final long zzhpj;
        private final long zzhpk;
        private final long zzhpl = (this.zzhpk - 10);

        zze(ByteBuffer byteBuffer) {
            super();
            this.zzhph = byteBuffer;
            this.zzakt = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzhpi = zzecb.zzn(byteBuffer);
            this.zzhpj = this.zzhpi + ((long) byteBuffer.position());
            this.zzhpk = this.zzhpi + ((long) byteBuffer.limit());
        }

        public final void zzab(int i, int i2) throws IOException {
            zzfw((i << 3) | i2);
        }

        public final void zzac(int i, int i2) throws IOException {
            zzab(i, 0);
            zzfv(i2);
        }

        public final void zzad(int i, int i2) throws IOException {
            zzab(i, 0);
            zzfw(i2);
        }

        public final void zzaf(int i, int i2) throws IOException {
            zzab(i, 5);
            zzfy(i2);
        }

        public final void zzh(int i, long j) throws IOException {
            zzab(i, 0);
            zzfh(j);
        }

        public final void zzj(int i, long j) throws IOException {
            zzab(i, 1);
            zzfj(j);
        }

        public final void zzh(int i, boolean z) throws IOException {
            zzab(i, 0);
            zzd(z ? (byte) 1 : 0);
        }

        public final void zzf(int i, String str) throws IOException {
            zzab(i, 2);
            zzhj(str);
        }

        public final void zza(int i, zzdxn zzdxn) throws IOException {
            zzab(i, 2);
            zzah(zzdxn);
        }

        public final void zza(int i, zzeah zzeah) throws IOException {
            zzab(i, 2);
            zzg(zzeah);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, zzeah zzeah, zzebd zzebd) throws IOException {
            zzab(i, 2);
            zza(zzeah, zzebd);
        }

        public final void zzb(int i, zzeah zzeah) throws IOException {
            zzab(1, 3);
            zzad(2, i);
            zza(3, zzeah);
            zzab(1, 4);
        }

        public final void zzb(int i, zzdxn zzdxn) throws IOException {
            zzab(1, 3);
            zzad(2, i);
            zza(3, zzdxn);
            zzab(1, 4);
        }

        public final void zzg(zzeah zzeah) throws IOException {
            zzfw(zzeah.zzbda());
            zzeah.zzb(this);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzeah zzeah, zzebd zzebd) throws IOException {
            zzdxd zzdxd = (zzdxd) zzeah;
            int zzbaj = zzdxd.zzbaj();
            if (zzbaj == -1) {
                zzbaj = zzebd.zzax(zzdxd);
                zzdxd.zzfa(zzbaj);
            }
            zzfw(zzbaj);
            zzebd.zza(zzeah, this.zzhpe);
        }

        public final void zzd(byte b) throws IOException {
            long j = this.zzana;
            if (j < this.zzhpk) {
                this.zzana = 1 + j;
                zzecb.zza(j, b);
                return;
            }
            throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.zzhpk), 1}));
        }

        public final void zzah(zzdxn zzdxn) throws IOException {
            zzfw(zzdxn.size());
            zzdxn.zza((zzdxo) this);
        }

        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzfw(i2);
            write(bArr, 0, i2);
        }

        public final void zzfv(int i) throws IOException {
            if (i >= 0) {
                zzfw(i);
            } else {
                zzfh((long) i);
            }
        }

        public final void zzfw(int i) throws IOException {
            if (this.zzana <= this.zzhpl) {
                while ((i & -128) != 0) {
                    long j = this.zzana;
                    this.zzana = j + 1;
                    zzecb.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.zzana;
                this.zzana = 1 + j2;
                zzecb.zza(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.zzana;
                if (j3 >= this.zzhpk) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j3), Long.valueOf(this.zzhpk), 1}));
                } else if ((i & -128) == 0) {
                    this.zzana = 1 + j3;
                    zzecb.zza(j3, (byte) i);
                    return;
                } else {
                    this.zzana = j3 + 1;
                    zzecb.zza(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        public final void zzfy(int i) throws IOException {
            this.zzakt.putInt((int) (this.zzana - this.zzhpi), i);
            this.zzana += 4;
        }

        public final void zzfh(long j) throws IOException {
            if (this.zzana <= this.zzhpl) {
                while ((j & -128) != 0) {
                    long j2 = this.zzana;
                    this.zzana = j2 + 1;
                    zzecb.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.zzana;
                this.zzana = 1 + j3;
                zzecb.zza(j3, (byte) ((int) j));
                return;
            }
            while (true) {
                long j4 = this.zzana;
                if (j4 >= this.zzhpk) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j4), Long.valueOf(this.zzhpk), 1}));
                } else if ((j & -128) == 0) {
                    this.zzana = 1 + j4;
                    zzecb.zza(j4, (byte) ((int) j));
                    return;
                } else {
                    this.zzana = j4 + 1;
                    zzecb.zza(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        public final void zzfj(long j) throws IOException {
            this.zzakt.putLong((int) (this.zzana - this.zzhpi), j);
            this.zzana += 8;
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.zzana;
                if (this.zzhpk - j >= j2) {
                    zzecb.zza(bArr, (long) i, j2, j);
                    this.zzana += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.zzana), Long.valueOf(this.zzhpk), Integer.valueOf(i2)}));
        }

        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzhj(String str) throws IOException {
            long j = this.zzana;
            try {
                int zzgb = zzgb(str.length() * 3);
                int zzgb2 = zzgb(str.length());
                if (zzgb2 == zzgb) {
                    int i = ((int) (this.zzana - this.zzhpi)) + zzgb2;
                    this.zzakt.position(i);
                    zzece.zza(str, this.zzakt);
                    int position = this.zzakt.position() - i;
                    zzfw(position);
                    this.zzana += (long) position;
                    return;
                }
                int zza = zzece.zza(str);
                zzfw(zza);
                zzfq(this.zzana);
                zzece.zza(str, this.zzakt);
                this.zzana += (long) zza;
            } catch (zzech e) {
                this.zzana = j;
                zzfq(this.zzana);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzd((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzd((Throwable) e3);
            }
        }

        public final void flush() {
            this.zzhph.position((int) (this.zzana - this.zzhpi));
        }

        public final int zzbcb() {
            return (int) (this.zzhpk - this.zzana);
        }

        private final void zzfq(long j) {
            this.zzakt.position((int) (j - this.zzhpi));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
    static class zzb extends zzdyi {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = i;
                    this.position = i;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public void flush() {
        }

        public final void zzab(int i, int i2) throws IOException {
            zzfw((i << 3) | i2);
        }

        public final void zzac(int i, int i2) throws IOException {
            zzab(i, 0);
            zzfv(i2);
        }

        public final void zzad(int i, int i2) throws IOException {
            zzab(i, 0);
            zzfw(i2);
        }

        public final void zzaf(int i, int i2) throws IOException {
            zzab(i, 5);
            zzfy(i2);
        }

        public final void zzh(int i, long j) throws IOException {
            zzab(i, 0);
            zzfh(j);
        }

        public final void zzj(int i, long j) throws IOException {
            zzab(i, 1);
            zzfj(j);
        }

        public final void zzh(int i, boolean z) throws IOException {
            zzab(i, 0);
            zzd(z ? (byte) 1 : 0);
        }

        public final void zzf(int i, String str) throws IOException {
            zzab(i, 2);
            zzhj(str);
        }

        public final void zza(int i, zzdxn zzdxn) throws IOException {
            zzab(i, 2);
            zzah(zzdxn);
        }

        public final void zzah(zzdxn zzdxn) throws IOException {
            zzfw(zzdxn.size());
            zzdxn.zza((zzdxo) this);
        }

        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzfw(i2);
            write(bArr, 0, i2);
        }

        public final void zza(int i, zzeah zzeah) throws IOException {
            zzab(i, 2);
            zzg(zzeah);
        }

        /* access modifiers changed from: package-private */
        public final void zza(int i, zzeah zzeah, zzebd zzebd) throws IOException {
            zzab(i, 2);
            zzdxd zzdxd = (zzdxd) zzeah;
            int zzbaj = zzdxd.zzbaj();
            if (zzbaj == -1) {
                zzbaj = zzebd.zzax(zzdxd);
                zzdxd.zzfa(zzbaj);
            }
            zzfw(zzbaj);
            zzebd.zza(zzeah, this.zzhpe);
        }

        public final void zzb(int i, zzeah zzeah) throws IOException {
            zzab(1, 3);
            zzad(2, i);
            zza(3, zzeah);
            zzab(1, 4);
        }

        public final void zzb(int i, zzdxn zzdxn) throws IOException {
            zzab(1, 3);
            zzad(2, i);
            zza(3, zzdxn);
            zzab(1, 4);
        }

        public final void zzg(zzeah zzeah) throws IOException {
            zzfw(zzeah.zzbda());
            zzeah.zzb(this);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzeah zzeah, zzebd zzebd) throws IOException {
            zzdxd zzdxd = (zzdxd) zzeah;
            int zzbaj = zzdxd.zzbaj();
            if (zzbaj == -1) {
                zzbaj = zzebd.zzax(zzdxd);
                zzdxd.zzfa(zzbaj);
            }
            zzfw(zzbaj);
            zzebd.zza(zzeah, this.zzhpe);
        }

        public final void zzd(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void zzfv(int i) throws IOException {
            if (i >= 0) {
                zzfw(i);
            } else {
                zzfh((long) i);
            }
        }

        public final void zzfw(int i) throws IOException {
            if (!zzdyi.zzhpd || zzdxk.zzbap() || zzbcb() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzecb.zza(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zzecb.zza(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    zzecb.zza(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                zzecb.zza(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    zzecb.zza(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                zzecb.zza(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    zzecb.zza(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                zzecb.zza(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                zzecb.zza(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        public final void zzfy(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void zzfh(long j) throws IOException {
            if (!zzdyi.zzhpd || zzbcb() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    zzecb.zza(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzecb.zza(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void zzfj(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.buffer;
                int i6 = this.position;
                this.position = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.buffer;
                int i7 = this.position;
                this.position = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), 1}), e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        public final void zzhj(String str) throws IOException {
            int i = this.position;
            try {
                int zzgb = zzgb(str.length() * 3);
                int zzgb2 = zzgb(str.length());
                if (zzgb2 == zzgb) {
                    this.position = i + zzgb2;
                    int zza = zzece.zza(str, this.buffer, this.position, zzbcb());
                    this.position = i;
                    zzfw((zza - i) - zzgb2);
                    this.position = zza;
                    return;
                }
                zzfw(zzece.zza(str));
                this.position = zzece.zza(str, this.buffer, this.position, zzbcb());
            } catch (zzech e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzd((Throwable) e2);
            }
        }

        public final int zzbcb() {
            return this.limit - this.position;
        }

        public final int zzbce() {
            return this.position - this.offset;
        }
    }

    private zzdyi() {
    }

    public final void zzae(int i, int i2) throws IOException {
        zzad(i, zzgg(i2));
    }

    public final void zzi(int i, long j) throws IOException {
        zzh(i, zzfp(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzaf(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(int i, double d) throws IOException {
        zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzfx(int i) throws IOException {
        zzfw(zzgg(i));
    }

    public final void zzfi(long j) throws IOException {
        zzfh(zzfp(j));
    }

    public final void zzf(float f) throws IOException {
        zzfy(Float.floatToRawIntBits(f));
    }

    public final void zzb(double d) throws IOException {
        zzfj(Double.doubleToRawLongBits(d));
    }

    public final void zzbp(boolean z) throws IOException {
        zzd(z ? (byte) 1 : 0);
    }

    public static int zzag(int i, int i2) {
        return zzfz(i) + zzga(i2);
    }

    public static int zzah(int i, int i2) {
        return zzfz(i) + zzgb(i2);
    }

    public static int zzai(int i, int i2) {
        return zzfz(i) + zzgb(zzgg(i2));
    }

    public static int zzaj(int i, int i2) {
        return zzfz(i) + 4;
    }

    public static int zzak(int i, int i2) {
        return zzfz(i) + 4;
    }

    public static int zzk(int i, long j) {
        return zzfz(i) + zzfl(j);
    }

    public static int zzl(int i, long j) {
        return zzfz(i) + zzfl(j);
    }

    public static int zzm(int i, long j) {
        return zzfz(i) + zzfl(zzfp(j));
    }

    public static int zzn(int i, long j) {
        return zzfz(i) + 8;
    }

    public static int zzo(int i, long j) {
        return zzfz(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzfz(i) + 4;
    }

    public static int zzc(int i, double d) {
        return zzfz(i) + 8;
    }

    public static int zzi(int i, boolean z) {
        return zzfz(i) + 1;
    }

    public static int zzal(int i, int i2) {
        return zzfz(i) + zzga(i2);
    }

    public static int zzg(int i, String str) {
        return zzfz(i) + zzhk(str);
    }

    public static int zzc(int i, zzdxn zzdxn) {
        int zzfz = zzfz(i);
        int size = zzdxn.size();
        return zzfz + zzgb(size) + size;
    }

    public static int zza(int i, zzdzq zzdzq) {
        int zzfz = zzfz(i);
        int zzbda = zzdzq.zzbda();
        return zzfz + zzgb(zzbda) + zzbda;
    }

    public static int zzc(int i, zzeah zzeah) {
        return zzfz(i) + zzh(zzeah);
    }

    static int zzb(int i, zzeah zzeah, zzebd zzebd) {
        return zzfz(i) + zzb(zzeah, zzebd);
    }

    public static int zzd(int i, zzeah zzeah) {
        return (zzfz(1) << 1) + zzah(2, i) + zzc(3, zzeah);
    }

    public static int zzd(int i, zzdxn zzdxn) {
        return (zzfz(1) << 1) + zzah(2, i) + zzc(3, zzdxn);
    }

    public static int zzb(int i, zzdzq zzdzq) {
        return (zzfz(1) << 1) + zzah(2, i) + zza(3, zzdzq);
    }

    public static int zzfz(int i) {
        return zzgb(i << 3);
    }

    public static int zzga(int i) {
        if (i >= 0) {
            return zzgb(i);
        }
        return 10;
    }

    public static int zzgc(int i) {
        return zzgb(zzgg(i));
    }

    public static int zzfk(long j) {
        return zzfl(j);
    }

    public static int zzfm(long j) {
        return zzfl(zzfp(j));
    }

    public static int zzgf(int i) {
        return zzga(i);
    }

    public static int zzhk(String str) {
        int i;
        try {
            i = zzece.zza(str);
        } catch (zzech unused) {
            i = str.getBytes(zzdzc.UTF_8).length;
        }
        return zzgb(i) + i;
    }

    public static int zza(zzdzq zzdzq) {
        int zzbda = zzdzq.zzbda();
        return zzgb(zzbda) + zzbda;
    }

    public static int zzai(zzdxn zzdxn) {
        int size = zzdxn.size();
        return zzgb(size) + size;
    }

    public static int zzw(byte[] bArr) {
        int length = bArr.length;
        return zzgb(length) + length;
    }

    public static int zzh(zzeah zzeah) {
        int zzbda = zzeah.zzbda();
        return zzgb(zzbda) + zzbda;
    }

    static int zzb(zzeah zzeah, zzebd zzebd) {
        zzdxd zzdxd = (zzdxd) zzeah;
        int zzbaj = zzdxd.zzbaj();
        if (zzbaj == -1) {
            zzbaj = zzebd.zzax(zzdxd);
            zzdxd.zzfa(zzbaj);
        }
        return zzgb(zzbaj) + zzbaj;
    }

    public final void zzbcc() {
        if (zzbcb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, zzech zzech) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzech);
        byte[] bytes = str.getBytes(zzdzc.UTF_8);
        try {
            zzfw(bytes.length);
            zzi(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzd((Throwable) e);
        } catch (zzd e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, zzeah zzeah, zzebd zzebd) {
        int zzfz = zzfz(i) << 1;
        zzdxd zzdxd = (zzdxd) zzeah;
        int zzbaj = zzdxd.zzbaj();
        if (zzbaj == -1) {
            zzbaj = zzebd.zzax(zzdxd);
            zzdxd.zzfa(zzbaj);
        }
        return zzfz + zzbaj;
    }

    @Deprecated
    public static int zzi(zzeah zzeah) {
        return zzeah.zzbda();
    }

    @Deprecated
    public static int zzgh(int i) {
        return zzgb(i);
    }
}

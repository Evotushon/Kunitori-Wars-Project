package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzom {
    public byte[] data;
    private int limit;
    private int position;

    public zzom() {
    }

    public zzom(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public zzom(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public final void reset(int i) {
        zzb(capacity() < i ? new byte[i] : this.data, i);
    }

    public final void zzb(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public final void reset() {
        this.position = 0;
        this.limit = 0;
    }

    public final int zzix() {
        return this.limit - this.position;
    }

    public final int limit() {
        return this.limit;
    }

    public final void zzbg(int i) {
        zzob.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int capacity() {
        byte[] bArr = this.data;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void zzbh(int i) {
        zzob.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public final void zzbi(int i) {
        zzbh(this.position + i);
    }

    public final void zze(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public final int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public final int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final int zziy() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final long zziz() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.position;
        this.position = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.position;
        this.position = i4 + 1;
        return j2 | (255 & ((long) bArr[i4]));
    }

    public final long zzja() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.position;
        this.position = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.position;
        this.position = i4 + 1;
        return j2 | ((255 & ((long) bArr[i4])) << 24);
    }

    public final int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i3 = this.position;
        this.position = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        int i4 = this.position;
        this.position = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public final long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.position;
        this.position = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.position;
        this.position = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.position;
        this.position = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.position;
        this.position = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.position;
        this.position = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.position;
        this.position = i8 + 1;
        return j6 | (255 & ((long) bArr[i8]));
    }

    public final int zzjb() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        int i2 = this.position;
        this.position = i2 + 1;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.position += 2;
        return b;
    }

    public final int zzjc() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(readInt);
        throw new IllegalStateException(sb.toString());
    }

    public final long zzjd() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(readLong);
        throw new IllegalStateException(sb.toString());
    }

    public final String zzbj(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.position + i) - 1;
        String str = new String(this.data, this.position, (i2 >= this.limit || this.data[i2] != 0) ? i : i - 1);
        this.position += i;
        return str;
    }
}

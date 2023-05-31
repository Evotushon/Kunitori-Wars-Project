package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzgz implements Parcelable {
    public static final Parcelable.Creator<zzgz> CREATOR = new zzgy();
    public final int height;
    public final int width;
    private final String zzafi;
    public final int zzafj;
    public final String zzafk;
    private final zzlh zzafl;
    private final String zzafm;
    public final String zzafn;
    public final int zzafo;
    public final List<byte[]> zzafp;
    public final zziu zzafq;
    public final float zzafr;
    public final int zzafs;
    public final float zzaft;
    private final int zzafu;
    private final byte[] zzafv;
    private final zzou zzafw;
    public final int zzafx;
    public final int zzafy;
    public final int zzafz;
    private final int zzaga;
    private final int zzagb;
    public final long zzagc;
    public final int zzagd;
    public final String zzage;
    private final int zzagf;
    private int zzagg;

    public static zzgz zza(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, zzou zzou, zziu zziu) {
        return new zzgz(str, (String) null, str2, (String) null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzou, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, zziu, (zzlh) null);
    }

    public final int describeContents() {
        return 0;
    }

    public static zzgz zza(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, zziu zziu, int i5, String str4) {
        return zza(str, str2, (String) null, -1, -1, i3, i4, -1, (List<byte[]>) null, zziu, 0, str4);
    }

    public static zzgz zza(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, zziu zziu, int i6, String str4) {
        return new zzgz(str, (String) null, str2, (String) null, -1, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzou) null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, zziu, (zzlh) null);
    }

    public static zzgz zza(String str, String str2, String str3, int i, int i2, String str4, zziu zziu) {
        return zza(str, str2, (String) null, -1, i2, str4, -1, zziu, Long.MAX_VALUE, Collections.emptyList());
    }

    public static zzgz zza(String str, String str2, String str3, int i, int i2, String str4, int i3, zziu zziu, long j, List<byte[]> list) {
        return new zzgz(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzou) null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zziu, (zzlh) null);
    }

    public static zzgz zza(String str, String str2, String str3, int i, List<byte[]> list, String str4, zziu zziu) {
        return new zzgz(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzou) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zziu, (zzlh) null);
    }

    public static zzgz zza(String str, String str2, String str3, int i, zziu zziu) {
        return new zzgz(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (zzou) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (zziu) null, (zzlh) null);
    }

    private zzgz(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzou zzou, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, zziu zziu, zzlh zzlh) {
        this.zzafi = str;
        this.zzafm = str2;
        this.zzafn = str3;
        this.zzafk = str4;
        this.zzafj = i;
        this.zzafo = i2;
        this.width = i3;
        this.height = i4;
        this.zzafr = f;
        this.zzafs = i5;
        this.zzaft = f2;
        this.zzafv = bArr;
        this.zzafu = i6;
        this.zzafw = zzou;
        this.zzafx = i7;
        this.zzafy = i8;
        this.zzafz = i9;
        this.zzaga = i10;
        this.zzagb = i11;
        this.zzagd = i12;
        this.zzage = str5;
        this.zzagf = i13;
        this.zzagc = j;
        this.zzafp = list == null ? Collections.emptyList() : list;
        this.zzafq = zziu;
        this.zzafl = zzlh;
    }

    zzgz(Parcel parcel) {
        this.zzafi = parcel.readString();
        this.zzafm = parcel.readString();
        this.zzafn = parcel.readString();
        this.zzafk = parcel.readString();
        this.zzafj = parcel.readInt();
        this.zzafo = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.zzafr = parcel.readFloat();
        this.zzafs = parcel.readInt();
        this.zzaft = parcel.readFloat();
        this.zzafv = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzafu = parcel.readInt();
        this.zzafw = (zzou) parcel.readParcelable(zzou.class.getClassLoader());
        this.zzafx = parcel.readInt();
        this.zzafy = parcel.readInt();
        this.zzafz = parcel.readInt();
        this.zzaga = parcel.readInt();
        this.zzagb = parcel.readInt();
        this.zzagd = parcel.readInt();
        this.zzage = parcel.readString();
        this.zzagf = parcel.readInt();
        this.zzagc = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzafp = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzafp.add(parcel.createByteArray());
        }
        this.zzafq = (zziu) parcel.readParcelable(zziu.class.getClassLoader());
        this.zzafl = (zzlh) parcel.readParcelable(zzlh.class.getClassLoader());
    }

    public final zzgz zzp(int i) {
        String str = this.zzafi;
        return new zzgz(str, this.zzafm, this.zzafn, this.zzafk, this.zzafj, i, this.width, this.height, this.zzafr, this.zzafs, this.zzaft, this.zzafv, this.zzafu, this.zzafw, this.zzafx, this.zzafy, this.zzafz, this.zzaga, this.zzagb, this.zzagd, this.zzage, this.zzagf, this.zzagc, this.zzafp, this.zzafq, this.zzafl);
    }

    public final zzgz zzds(long j) {
        return new zzgz(this.zzafi, this.zzafm, this.zzafn, this.zzafk, this.zzafj, this.zzafo, this.width, this.height, this.zzafr, this.zzafs, this.zzaft, this.zzafv, this.zzafu, this.zzafw, this.zzafx, this.zzafy, this.zzafz, this.zzaga, this.zzagb, this.zzagd, this.zzage, this.zzagf, j, this.zzafp, this.zzafq, this.zzafl);
    }

    public final zzgz zzb(int i, int i2) {
        String str = this.zzafi;
        return new zzgz(str, this.zzafm, this.zzafn, this.zzafk, this.zzafj, this.zzafo, this.width, this.height, this.zzafr, this.zzafs, this.zzaft, this.zzafv, this.zzafu, this.zzafw, this.zzafx, this.zzafy, this.zzafz, i, i2, this.zzagd, this.zzage, this.zzagf, this.zzagc, this.zzafp, this.zzafq, this.zzafl);
    }

    public final zzgz zza(zzlh zzlh) {
        String str = this.zzafi;
        return new zzgz(str, this.zzafm, this.zzafn, this.zzafk, this.zzafj, this.zzafo, this.width, this.height, this.zzafr, this.zzafs, this.zzaft, this.zzafv, this.zzafu, this.zzafw, this.zzafx, this.zzafy, this.zzafz, this.zzaga, this.zzagb, this.zzagd, this.zzage, this.zzagf, this.zzagc, this.zzafp, this.zzafq, zzlh);
    }

    public final int zzeu() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzev() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzafn);
        String str = this.zzage;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zza(mediaFormat, "max-input-size", this.zzafo);
        zza(mediaFormat, "width", this.width);
        zza(mediaFormat, "height", this.height);
        float f = this.zzafr;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zza(mediaFormat, "rotation-degrees", this.zzafs);
        zza(mediaFormat, "channel-count", this.zzafx);
        zza(mediaFormat, "sample-rate", this.zzafy);
        zza(mediaFormat, "encoder-delay", this.zzaga);
        zza(mediaFormat, "encoder-padding", this.zzagb);
        for (int i = 0; i < this.zzafp.size(); i++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.zzafp.get(i)));
        }
        zzou zzou = this.zzafw;
        if (zzou != null) {
            zza(mediaFormat, "color-transfer", zzou.zzaqg);
            zza(mediaFormat, "color-standard", zzou.zzaqf);
            zza(mediaFormat, "color-range", zzou.zzaqh);
            byte[] bArr = zzou.zzbhi;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final String toString() {
        String str = this.zzafi;
        String str2 = this.zzafm;
        String str3 = this.zzafn;
        int i = this.zzafj;
        String str4 = this.zzage;
        int i2 = this.width;
        int i3 = this.height;
        float f = this.zzafr;
        int i4 = this.zzafx;
        int i5 = this.zzafy;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.zzagg == 0) {
            String str = this.zzafi;
            int i = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.zzafm;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzafn;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzafk;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzafj) * 31) + this.width) * 31) + this.height) * 31) + this.zzafx) * 31) + this.zzafy) * 31;
            String str5 = this.zzage;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzagf) * 31;
            zziu zziu = this.zzafq;
            int hashCode6 = (hashCode5 + (zziu == null ? 0 : zziu.hashCode())) * 31;
            zzlh zzlh = this.zzafl;
            if (zzlh != null) {
                i = zzlh.hashCode();
            }
            this.zzagg = hashCode6 + i;
        }
        return this.zzagg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzgz zzgz = (zzgz) obj;
            if (this.zzafj == zzgz.zzafj && this.zzafo == zzgz.zzafo && this.width == zzgz.width && this.height == zzgz.height && this.zzafr == zzgz.zzafr && this.zzafs == zzgz.zzafs && this.zzaft == zzgz.zzaft && this.zzafu == zzgz.zzafu && this.zzafx == zzgz.zzafx && this.zzafy == zzgz.zzafy && this.zzafz == zzgz.zzafz && this.zzaga == zzgz.zzaga && this.zzagb == zzgz.zzagb && this.zzagc == zzgz.zzagc && this.zzagd == zzgz.zzagd && zzop.zza(this.zzafi, zzgz.zzafi) && zzop.zza(this.zzage, zzgz.zzage) && this.zzagf == zzgz.zzagf && zzop.zza(this.zzafm, zzgz.zzafm) && zzop.zza(this.zzafn, zzgz.zzafn) && zzop.zza(this.zzafk, zzgz.zzafk) && zzop.zza(this.zzafq, zzgz.zzafq) && zzop.zza(this.zzafl, zzgz.zzafl) && zzop.zza(this.zzafw, zzgz.zzafw) && Arrays.equals(this.zzafv, zzgz.zzafv) && this.zzafp.size() == zzgz.zzafp.size()) {
                for (int i = 0; i < this.zzafp.size(); i++) {
                    if (!Arrays.equals(this.zzafp.get(i), zzgz.zzafp.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @TargetApi(16)
    private static void zza(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzafi);
        parcel.writeString(this.zzafm);
        parcel.writeString(this.zzafn);
        parcel.writeString(this.zzafk);
        parcel.writeInt(this.zzafj);
        parcel.writeInt(this.zzafo);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.zzafr);
        parcel.writeInt(this.zzafs);
        parcel.writeFloat(this.zzaft);
        parcel.writeInt(this.zzafv != null ? 1 : 0);
        byte[] bArr = this.zzafv;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzafu);
        parcel.writeParcelable(this.zzafw, i);
        parcel.writeInt(this.zzafx);
        parcel.writeInt(this.zzafy);
        parcel.writeInt(this.zzafz);
        parcel.writeInt(this.zzaga);
        parcel.writeInt(this.zzagb);
        parcel.writeInt(this.zzagd);
        parcel.writeString(this.zzage);
        parcel.writeInt(this.zzagf);
        parcel.writeLong(this.zzagc);
        int size = this.zzafp.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.zzafp.get(i2));
        }
        parcel.writeParcelable(this.zzafq, 0);
        parcel.writeParcelable(this.zzafl, 0);
    }
}

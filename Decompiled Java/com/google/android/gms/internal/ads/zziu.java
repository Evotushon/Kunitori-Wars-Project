package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zziu implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zziu> CREATOR = new zziw();
    private int zzagg;
    private final zza[] zzamr;
    public final int zzams;

    public zziu(zza... zzaArr) {
        this(true, zzaArr);
    }

    public final int describeContents() {
        return 0;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new zziy();
        private final byte[] data;
        private final String mimeType;
        /* access modifiers changed from: private */
        public final UUID uuid;
        private int zzagg;
        public final boolean zzamw;

        public zza(UUID uuid2, String str, byte[] bArr) {
            this(uuid2, str, bArr, false);
        }

        public final int describeContents() {
            return 0;
        }

        private zza(UUID uuid2, String str, byte[] bArr, boolean z) {
            this.uuid = (UUID) zzob.checkNotNull(uuid2);
            this.mimeType = (String) zzob.checkNotNull(str);
            this.data = (byte[]) zzob.checkNotNull(bArr);
            this.zzamw = false;
        }

        zza(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.mimeType = parcel.readString();
            this.data = parcel.createByteArray();
            this.zzamw = parcel.readByte() != 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zza = (zza) obj;
            return this.mimeType.equals(zza.mimeType) && zzop.zza(this.uuid, zza.uuid) && Arrays.equals(this.data, zza.data);
        }

        public final int hashCode() {
            if (this.zzagg == 0) {
                this.zzagg = (((this.uuid.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Arrays.hashCode(this.data);
            }
            return this.zzagg;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
            parcel.writeByte(this.zzamw ? (byte) 1 : 0);
        }
    }

    private zziu(boolean z, zza... zzaArr) {
        zza[] zzaArr2 = (zza[]) zzaArr.clone();
        Arrays.sort(zzaArr2, this);
        int i = 1;
        while (i < zzaArr2.length) {
            if (!zzaArr2[i - 1].uuid.equals(zzaArr2[i].uuid)) {
                i++;
            } else {
                String valueOf = String.valueOf(zzaArr2[i].uuid);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.zzamr = zzaArr2;
        this.zzams = zzaArr2.length;
    }

    zziu(Parcel parcel) {
        this.zzamr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.zzams = this.zzamr.length;
    }

    public final zza zzy(int i) {
        return this.zzamr[i];
    }

    public final int hashCode() {
        if (this.zzagg == 0) {
            this.zzagg = Arrays.hashCode(this.zzamr);
        }
        return this.zzagg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzamr, ((zziu) obj).zzamr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.zzamr, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zza zza2 = (zza) obj;
        zza zza3 = (zza) obj2;
        if (zzgl.zzacq.equals(zza2.uuid)) {
            return zzgl.zzacq.equals(zza3.uuid) ? 0 : 1;
        }
        return zza2.uuid.compareTo(zza3.uuid);
    }
}

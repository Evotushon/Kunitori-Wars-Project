package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbs;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdjx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdjx> CREATOR = new zzdjw();
    @SafeParcelable.VersionField(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzbs.zza zzgxv = null;
    private byte[] zzgxw;

    @SafeParcelable.Constructor
    zzdjx(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.versionCode = i;
        this.zzgxw = bArr;
        zzatm();
    }

    public final zzbs.zza zzatl() {
        if (!(this.zzgxv != null)) {
            try {
                this.zzgxv = zzbs.zza.zza(this.zzgxw, zzdym.zzbch());
                this.zzgxw = null;
            } catch (zzdzh e) {
                throw new IllegalStateException(e);
            }
        }
        zzatm();
        return this.zzgxv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        byte[] bArr = this.zzgxw;
        if (bArr == null) {
            bArr = this.zzgxv.toByteArray();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private final void zzatm() {
        if (this.zzgxv == null && this.zzgxw != null) {
            return;
        }
        if (this.zzgxv != null && this.zzgxw == null) {
            return;
        }
        if (this.zzgxv != null && this.zzgxw != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.zzgxv == null && this.zzgxw == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}

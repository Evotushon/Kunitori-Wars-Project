package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzazo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzazo> CREATOR = new zzazn();
    @SafeParcelable.Field(id = 2)
    public String zzbmj;
    @SafeParcelable.Field(id = 3)
    public int zzdxf;
    @SafeParcelable.Field(id = 4)
    public int zzdxg;
    @SafeParcelable.Field(id = 5)
    public boolean zzdxh;
    @SafeParcelable.Field(id = 6)
    private boolean zzdxi;

    public zzazo(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzazo(int i, int i2, boolean z, boolean z2) {
        this(i, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzazo(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazo.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    zzazo(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.zzbmj = str;
        this.zzdxf = i;
        this.zzdxg = i2;
        this.zzdxh = z;
        this.zzdxi = z2;
    }

    public static zzazo zzxr() {
        return new zzazo(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbmj, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzdxf);
        SafeParcelWriter.writeInt(parcel, 4, this.zzdxg);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzdxh);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzdxi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

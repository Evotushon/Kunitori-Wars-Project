package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "AdResponseParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqk> CREATOR = new zzaqj();
    @SafeParcelable.Field(id = 5)
    private final int errorCode;
    @SafeParcelable.Field(id = 12)
    private final int orientation;
    @SafeParcelable.Field(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 37)
    @Nullable
    private final zzaqm zzbld;
    @SafeParcelable.Field(id = 49)
    private final boolean zzbln;
    @SafeParcelable.Field(id = 53)
    private final boolean zzblo;
    @SafeParcelable.Field(id = 23)
    private final boolean zzbml;
    @SafeParcelable.Field(id = 30)
    private final String zzcac;
    @SafeParcelable.Field(id = 31)
    private final boolean zzcde;
    @SafeParcelable.Field(id = 32)
    private final boolean zzcdf;
    @SafeParcelable.Field(id = 4)
    private final List<String> zzddp;
    @SafeParcelable.Field(id = 6)
    private final List<String> zzddq;
    @SafeParcelable.Field(id = 52)
    private final List<String> zzddr;
    @SafeParcelable.Field(id = 40)
    private final List<String> zzddt;
    @SafeParcelable.Field(id = 42)
    private final boolean zzddu;
    @SafeParcelable.Field(id = 11)
    private final long zzddw;
    @SafeParcelable.Field(id = 2)
    private final String zzdiu;
    @SafeParcelable.Field(id = 24)
    private final boolean zzdka;
    @SafeParcelable.Field(id = 38)
    private final boolean zzdkn;
    @SafeParcelable.Field(id = 39)
    @Nullable
    private String zzdko;
    @SafeParcelable.Field(id = 47)
    private final boolean zzdla;
    @SafeParcelable.Field(id = 3)
    private String zzdln;
    @SafeParcelable.Field(id = 7)
    private final long zzdlo;
    @SafeParcelable.Field(id = 8)
    private final boolean zzdlp;
    @SafeParcelable.Field(id = 9)
    private final long zzdlq;
    @SafeParcelable.Field(id = 10)
    private final List<String> zzdlr;
    @SafeParcelable.Field(id = 13)
    private final String zzdls;
    @SafeParcelable.Field(id = 14)
    private final long zzdlt;
    @SafeParcelable.Field(id = 15)
    private final String zzdlu;
    @SafeParcelable.Field(id = 18)
    private final boolean zzdlv;
    @SafeParcelable.Field(id = 19)
    private final String zzdlw;
    @SafeParcelable.Field(id = 21)
    private final String zzdlx;
    @SafeParcelable.Field(id = 22)
    private final boolean zzdly;
    @SafeParcelable.Field(id = 25)
    private final boolean zzdlz;
    @SafeParcelable.Field(id = 26)
    private final boolean zzdma;
    @SafeParcelable.Field(id = 28)
    private zzaqw zzdmb;
    @SafeParcelable.Field(id = 29)
    private String zzdmc;
    @SafeParcelable.Field(id = 33)
    @Nullable
    private final zzasq zzdmd;
    @SafeParcelable.Field(id = 34)
    @Nullable
    private final List<String> zzdme;
    @SafeParcelable.Field(id = 35)
    @Nullable
    private final List<String> zzdmf;
    @SafeParcelable.Field(id = 36)
    private final boolean zzdmg;
    @SafeParcelable.Field(id = 43)
    @Nullable
    private final String zzdmh;
    @SafeParcelable.Field(id = 44)
    @Nullable
    private final zzaua zzdmi;
    @SafeParcelable.Field(id = 45)
    @Nullable
    private final String zzdmj;
    @SafeParcelable.Field(id = 46)
    private final boolean zzdmk;
    @SafeParcelable.Field(id = 48)
    private Bundle zzdml;
    @SafeParcelable.Field(id = 50)
    private final int zzdmm;
    @SafeParcelable.Field(id = 51)
    private final boolean zzdmn;
    @SafeParcelable.Field(id = 54)
    @Nullable
    private final String zzdmo;
    @SafeParcelable.Field(id = 55)
    @Nullable
    private String zzdmp;
    @SafeParcelable.Field(id = 56)
    private boolean zzdmq;
    @SafeParcelable.Field(id = 57)
    private boolean zzdmr;

    @SafeParcelable.Constructor
    zzaqk(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) List<String> list, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) List<String> list2, @SafeParcelable.Param(id = 7) long j, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j2, @SafeParcelable.Param(id = 10) List<String> list3, @SafeParcelable.Param(id = 11) long j3, @SafeParcelable.Param(id = 12) int i3, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) long j4, @SafeParcelable.Param(id = 15) String str4, @SafeParcelable.Param(id = 18) boolean z2, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 21) String str6, @SafeParcelable.Param(id = 22) boolean z3, @SafeParcelable.Param(id = 23) boolean z4, @SafeParcelable.Param(id = 24) boolean z5, @SafeParcelable.Param(id = 25) boolean z6, @SafeParcelable.Param(id = 26) boolean z7, @SafeParcelable.Param(id = 28) zzaqw zzaqw, @SafeParcelable.Param(id = 29) String str7, @SafeParcelable.Param(id = 30) String str8, @SafeParcelable.Param(id = 31) boolean z8, @SafeParcelable.Param(id = 32) boolean z9, @SafeParcelable.Param(id = 33) zzasq zzasq, @SafeParcelable.Param(id = 34) List<String> list4, @SafeParcelable.Param(id = 35) List<String> list5, @SafeParcelable.Param(id = 36) boolean z10, @SafeParcelable.Param(id = 37) zzaqm zzaqm, @SafeParcelable.Param(id = 38) boolean z11, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 40) List<String> list6, @SafeParcelable.Param(id = 42) boolean z12, @SafeParcelable.Param(id = 43) String str10, @SafeParcelable.Param(id = 44) zzaua zzaua, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) boolean z13, @SafeParcelable.Param(id = 47) boolean z14, @SafeParcelable.Param(id = 48) Bundle bundle, @SafeParcelable.Param(id = 49) boolean z15, @SafeParcelable.Param(id = 50) int i4, @SafeParcelable.Param(id = 51) boolean z16, @SafeParcelable.Param(id = 52) List<String> list7, @SafeParcelable.Param(id = 53) boolean z17, @SafeParcelable.Param(id = 54) String str12, @SafeParcelable.Param(id = 55) @Nullable String str13, @SafeParcelable.Param(id = 56) boolean z18, @SafeParcelable.Param(id = 57) boolean z19) {
        zzaqw zzaqw2;
        zzaqz zzaqz;
        this.versionCode = i;
        this.zzdiu = str;
        this.zzdln = str2;
        List<String> list8 = null;
        this.zzddp = list != null ? Collections.unmodifiableList(list) : null;
        this.errorCode = i2;
        this.zzddq = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.zzdlo = j;
        this.zzdlp = z;
        this.zzdlq = j2;
        this.zzdlr = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.zzddw = j3;
        this.orientation = i3;
        this.zzdls = str3;
        this.zzdlt = j4;
        this.zzdlu = str4;
        this.zzdlv = z2;
        this.zzdlw = str5;
        this.zzdlx = str6;
        this.zzdly = z3;
        this.zzbml = z4;
        this.zzdka = z5;
        this.zzdlz = z6;
        this.zzdmk = z13;
        this.zzdma = z7;
        this.zzdmb = zzaqw;
        this.zzdmc = str7;
        this.zzcac = str8;
        if (this.zzdln == null && (zzaqw2 = this.zzdmb) != null && (zzaqz = (zzaqz) zzaqw2.zza(zzaqz.CREATOR)) != null && !TextUtils.isEmpty(zzaqz.zzdne)) {
            this.zzdln = zzaqz.zzdne;
        }
        this.zzcde = z8;
        this.zzcdf = z9;
        this.zzdmd = zzasq;
        this.zzdme = list4;
        this.zzdmf = list5;
        this.zzdmg = z10;
        this.zzbld = zzaqm;
        this.zzdkn = z11;
        this.zzdko = str9;
        this.zzddt = list6;
        this.zzddu = z12;
        this.zzdmh = str10;
        this.zzdmi = zzaua;
        this.zzdmj = str11;
        this.zzdla = z14;
        this.zzdml = bundle;
        this.zzbln = z15;
        this.zzdmm = i4;
        this.zzdmn = z16;
        this.zzddr = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.zzblo = z17;
        this.zzdmo = str12;
        this.zzdmp = str13;
        this.zzdmq = z18;
        this.zzdmr = z19;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeString(parcel, 2, this.zzdiu, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdln, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zzddp, false);
        SafeParcelWriter.writeInt(parcel, 5, this.errorCode);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzddq, false);
        SafeParcelWriter.writeLong(parcel, 7, this.zzdlo);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdlp);
        SafeParcelWriter.writeLong(parcel, 9, this.zzdlq);
        SafeParcelWriter.writeStringList(parcel, 10, this.zzdlr, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzddw);
        SafeParcelWriter.writeInt(parcel, 12, this.orientation);
        SafeParcelWriter.writeString(parcel, 13, this.zzdls, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzdlt);
        SafeParcelWriter.writeString(parcel, 15, this.zzdlu, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzdlv);
        SafeParcelWriter.writeString(parcel, 19, this.zzdlw, false);
        SafeParcelWriter.writeString(parcel, 21, this.zzdlx, false);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzdly);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzbml);
        SafeParcelWriter.writeBoolean(parcel, 24, this.zzdka);
        SafeParcelWriter.writeBoolean(parcel, 25, this.zzdlz);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzdma);
        SafeParcelWriter.writeParcelable(parcel, 28, this.zzdmb, i, false);
        SafeParcelWriter.writeString(parcel, 29, this.zzdmc, false);
        SafeParcelWriter.writeString(parcel, 30, this.zzcac, false);
        SafeParcelWriter.writeBoolean(parcel, 31, this.zzcde);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzcdf);
        SafeParcelWriter.writeParcelable(parcel, 33, this.zzdmd, i, false);
        SafeParcelWriter.writeStringList(parcel, 34, this.zzdme, false);
        SafeParcelWriter.writeStringList(parcel, 35, this.zzdmf, false);
        SafeParcelWriter.writeBoolean(parcel, 36, this.zzdmg);
        SafeParcelWriter.writeParcelable(parcel, 37, this.zzbld, i, false);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdkn);
        SafeParcelWriter.writeString(parcel, 39, this.zzdko, false);
        SafeParcelWriter.writeStringList(parcel, 40, this.zzddt, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzddu);
        SafeParcelWriter.writeString(parcel, 43, this.zzdmh, false);
        SafeParcelWriter.writeParcelable(parcel, 44, this.zzdmi, i, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdmj, false);
        SafeParcelWriter.writeBoolean(parcel, 46, this.zzdmk);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdla);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdml, false);
        SafeParcelWriter.writeBoolean(parcel, 49, this.zzbln);
        SafeParcelWriter.writeInt(parcel, 50, this.zzdmm);
        SafeParcelWriter.writeBoolean(parcel, 51, this.zzdmn);
        SafeParcelWriter.writeStringList(parcel, 52, this.zzddr, false);
        SafeParcelWriter.writeBoolean(parcel, 53, this.zzblo);
        SafeParcelWriter.writeString(parcel, 54, this.zzdmo, false);
        SafeParcelWriter.writeString(parcel, 55, this.zzdmp, false);
        SafeParcelWriter.writeBoolean(parcel, 56, this.zzdmq);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdmr);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaqi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaqi> CREATOR = new zzaqh();
    @SafeParcelable.Field(id = 6)
    private final ApplicationInfo applicationInfo;
    @SafeParcelable.Field(id = 1)
    private final int versionCode;
    @SafeParcelable.Field(id = 11)
    private final zzazo zzblu;
    @SafeParcelable.Field(id = 4)
    private final zzuk zzblv;
    @SafeParcelable.Field(id = 20)
    private final float zzboq;
    @SafeParcelable.Field(id = 5)
    private final String zzbri;
    @SafeParcelable.Field(id = 10)
    private final String zzcei;
    @SafeParcelable.Field(id = 42)
    private final boolean zzddu;
    @SafeParcelable.Field(id = 29)
    private final zzach zzdff;
    @SafeParcelable.Field(id = 14)
    private final List<String> zzdfg;
    @SafeParcelable.Field(id = 18)
    private final int zzdhj;
    @SafeParcelable.Field(id = 19)
    private final int zzdhk;
    @SafeParcelable.Field(id = 2)
    @Nullable
    private final Bundle zzdjs;
    @SafeParcelable.Field(id = 3)
    private final zzuh zzdjt;
    @SafeParcelable.Field(id = 7)
    @Nullable
    private final PackageInfo zzdju;
    @SafeParcelable.Field(id = 8)
    private final String zzdjv;
    @SafeParcelable.Field(id = 9)
    private final String zzdjw;
    @SafeParcelable.Field(id = 12)
    private final Bundle zzdjx;
    @SafeParcelable.Field(id = 13)
    private final int zzdjy;
    @SafeParcelable.Field(id = 15)
    private final Bundle zzdjz;
    @SafeParcelable.Field(id = 16)
    private final boolean zzdka;
    @SafeParcelable.Field(id = 21)
    private final String zzdkb;
    @SafeParcelable.Field(id = 25)
    private final long zzdkc;
    @SafeParcelable.Field(id = 26)
    private final String zzdkd;
    @SafeParcelable.Field(id = 27)
    @Nullable
    private final List<String> zzdke;
    @SafeParcelable.Field(id = 28)
    private final String zzdkf;
    @SafeParcelable.Field(id = 30)
    private final List<String> zzdkg;
    @SafeParcelable.Field(id = 31)
    private final long zzdkh;
    @SafeParcelable.Field(id = 33)
    private final String zzdki;
    @SafeParcelable.Field(id = 34)
    private final float zzdkj;
    @SafeParcelable.Field(id = 35)
    private final int zzdkk;
    @SafeParcelable.Field(id = 36)
    private final int zzdkl;
    @SafeParcelable.Field(id = 37)
    private final boolean zzdkm;
    @SafeParcelable.Field(id = 38)
    private final boolean zzdkn;
    @SafeParcelable.Field(id = 39)
    private final String zzdko;
    @SafeParcelable.Field(id = 40)
    private final boolean zzdkp;
    @SafeParcelable.Field(id = 41)
    private final String zzdkq;
    @SafeParcelable.Field(id = 43)
    private final int zzdkr;
    @SafeParcelable.Field(id = 44)
    private final Bundle zzdks;
    @SafeParcelable.Field(id = 45)
    private final String zzdkt;
    @SafeParcelable.Field(id = 46)
    @Nullable
    private final zzxp zzdku;
    @SafeParcelable.Field(id = 47)
    private final boolean zzdkv;
    @SafeParcelable.Field(id = 48)
    private final Bundle zzdkw;
    @SafeParcelable.Field(id = 49)
    @Nullable
    private final String zzdkx;
    @SafeParcelable.Field(id = 50)
    @Nullable
    private final String zzdky;
    @SafeParcelable.Field(id = 51)
    @Nullable
    private final String zzdkz;
    @SafeParcelable.Field(id = 52)
    private final boolean zzdla;
    @SafeParcelable.Field(id = 53)
    private final List<Integer> zzdlb;
    @SafeParcelable.Field(id = 54)
    private final String zzdlc;
    @SafeParcelable.Field(id = 55)
    private final List<String> zzdld;
    @SafeParcelable.Field(id = 56)
    private final int zzdle;
    @SafeParcelable.Field(id = 57)
    private final boolean zzdlf;
    @SafeParcelable.Field(id = 58)
    private final boolean zzdlg;
    @SafeParcelable.Field(id = 59)
    private final boolean zzdlh;
    @SafeParcelable.Field(id = 60)
    private final ArrayList<String> zzdli;
    @SafeParcelable.Field(id = 61)
    private final String zzdlj;
    @SafeParcelable.Field(id = 63)
    private final zzahl zzdlk;
    @SafeParcelable.Field(id = 64)
    @Nullable
    private final String zzdll;
    @SafeParcelable.Field(id = 65)
    private final Bundle zzdlm;

    @SafeParcelable.Constructor
    zzaqi(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) zzuh zzuh, @SafeParcelable.Param(id = 4) zzuk zzuk, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) ApplicationInfo applicationInfo2, @SafeParcelable.Param(id = 7) PackageInfo packageInfo, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) String str4, @SafeParcelable.Param(id = 11) zzazo zzazo, @SafeParcelable.Param(id = 12) Bundle bundle2, @SafeParcelable.Param(id = 13) int i2, @SafeParcelable.Param(id = 14) List<String> list, @SafeParcelable.Param(id = 15) Bundle bundle3, @SafeParcelable.Param(id = 16) boolean z, @SafeParcelable.Param(id = 18) int i3, @SafeParcelable.Param(id = 19) int i4, @SafeParcelable.Param(id = 20) float f, @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 25) long j, @SafeParcelable.Param(id = 26) String str6, @SafeParcelable.Param(id = 27) List<String> list2, @SafeParcelable.Param(id = 28) String str7, @SafeParcelable.Param(id = 29) zzach zzach, @SafeParcelable.Param(id = 30) List<String> list3, @SafeParcelable.Param(id = 31) long j2, @SafeParcelable.Param(id = 33) String str8, @SafeParcelable.Param(id = 34) float f2, @SafeParcelable.Param(id = 40) boolean z2, @SafeParcelable.Param(id = 35) int i5, @SafeParcelable.Param(id = 36) int i6, @SafeParcelable.Param(id = 37) boolean z3, @SafeParcelable.Param(id = 38) boolean z4, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 41) String str10, @SafeParcelable.Param(id = 42) boolean z5, @SafeParcelable.Param(id = 43) int i7, @SafeParcelable.Param(id = 44) Bundle bundle4, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) zzxp zzxp, @SafeParcelable.Param(id = 47) boolean z6, @SafeParcelable.Param(id = 48) Bundle bundle5, @SafeParcelable.Param(id = 49) @Nullable String str12, @SafeParcelable.Param(id = 50) @Nullable String str13, @SafeParcelable.Param(id = 51) @Nullable String str14, @SafeParcelable.Param(id = 52) boolean z7, @SafeParcelable.Param(id = 53) List<Integer> list4, @SafeParcelable.Param(id = 54) String str15, @SafeParcelable.Param(id = 55) List<String> list5, @SafeParcelable.Param(id = 56) int i8, @SafeParcelable.Param(id = 57) boolean z8, @SafeParcelable.Param(id = 58) boolean z9, @SafeParcelable.Param(id = 59) boolean z10, @SafeParcelable.Param(id = 60) ArrayList<String> arrayList, @SafeParcelable.Param(id = 61) String str16, @SafeParcelable.Param(id = 63) zzahl zzahl, @SafeParcelable.Param(id = 64) @Nullable String str17, @SafeParcelable.Param(id = 65) Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.versionCode = i;
        this.zzdjs = bundle;
        this.zzdjt = zzuh;
        this.zzblv = zzuk;
        this.zzbri = str;
        this.applicationInfo = applicationInfo2;
        this.zzdju = packageInfo;
        this.zzdjv = str2;
        this.zzdjw = str3;
        this.zzcei = str4;
        this.zzblu = zzazo;
        this.zzdjx = bundle2;
        this.zzdjy = i2;
        this.zzdfg = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.zzdkg = list6;
        this.zzdjz = bundle3;
        this.zzdka = z;
        this.zzdhj = i3;
        this.zzdhk = i4;
        this.zzboq = f;
        this.zzdkb = str5;
        this.zzdkc = j;
        this.zzdkd = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.zzdke = list7;
        this.zzdkf = str7;
        this.zzdff = zzach;
        this.zzdkh = j2;
        this.zzdki = str8;
        this.zzdkj = f2;
        this.zzdkp = z2;
        this.zzdkk = i5;
        this.zzdkl = i6;
        this.zzdkm = z3;
        this.zzdkn = z4;
        this.zzdko = str9;
        this.zzdkq = str10;
        this.zzddu = z5;
        this.zzdkr = i7;
        this.zzdks = bundle4;
        this.zzdkt = str11;
        this.zzdku = zzxp;
        this.zzdkv = z6;
        this.zzdkw = bundle5;
        this.zzdkx = str12;
        this.zzdky = str13;
        this.zzdkz = str14;
        this.zzdla = z7;
        this.zzdlb = list4;
        this.zzdlc = str15;
        this.zzdld = list5;
        this.zzdle = i8;
        this.zzdlf = z8;
        this.zzdlg = z9;
        this.zzdlh = z10;
        this.zzdli = arrayList;
        this.zzdlj = str16;
        this.zzdlk = zzahl;
        this.zzdll = str17;
        this.zzdlm = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzdjs, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzdjt, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzblv, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbri, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.applicationInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzdju, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzdjv, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzdjw, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzcei, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzblu, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzdjx, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzdjy);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzdfg, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzdjz, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzdka);
        SafeParcelWriter.writeInt(parcel, 18, this.zzdhj);
        SafeParcelWriter.writeInt(parcel, 19, this.zzdhk);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzboq);
        SafeParcelWriter.writeString(parcel, 21, this.zzdkb, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzdkc);
        SafeParcelWriter.writeString(parcel, 26, this.zzdkd, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzdke, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzdkf, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzdff, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzdkg, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzdkh);
        SafeParcelWriter.writeString(parcel, 33, this.zzdki, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzdkj);
        SafeParcelWriter.writeInt(parcel, 35, this.zzdkk);
        SafeParcelWriter.writeInt(parcel, 36, this.zzdkl);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzdkm);
        SafeParcelWriter.writeBoolean(parcel, 38, this.zzdkn);
        SafeParcelWriter.writeString(parcel, 39, this.zzdko, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzdkp);
        SafeParcelWriter.writeString(parcel, 41, this.zzdkq, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzddu);
        SafeParcelWriter.writeInt(parcel, 43, this.zzdkr);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzdks, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzdkt, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzdku, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzdkv);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzdkw, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzdkx, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzdky, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzdkz, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzdla);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzdlb, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzdlc, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzdld, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzdle);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzdlf);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzdlg);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzdlh);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzdli, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzdlj, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzdlk, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzdll, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzdlm, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

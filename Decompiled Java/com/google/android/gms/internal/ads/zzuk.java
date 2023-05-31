package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzuk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuk> CREATOR = new zzun();
    @SafeParcelable.Field(id = 3)
    public final int height;
    @SafeParcelable.Field(id = 4)
    public final int heightPixels;
    @SafeParcelable.Field(id = 6)
    public final int width;
    @SafeParcelable.Field(id = 7)
    public final int widthPixels;
    @SafeParcelable.Field(id = 2)
    public final String zzabk;
    @SafeParcelable.Field(id = 9)
    public final boolean zzbml;
    @SafeParcelable.Field(id = 5)
    public final boolean zzcdc;
    @SafeParcelable.Field(id = 8)
    public final zzuk[] zzcdd;
    @SafeParcelable.Field(id = 10)
    public final boolean zzcde;
    @SafeParcelable.Field(id = 11)
    public boolean zzcdf;
    @SafeParcelable.Field(id = 12)
    public boolean zzcdg;
    @SafeParcelable.Field(id = 13)
    private boolean zzcdh;
    @SafeParcelable.Field(id = 14)
    public boolean zzcdi;
    @SafeParcelable.Field(id = 15)
    public boolean zzcdj;

    public static int zzb(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int zzc(DisplayMetrics displayMetrics) {
        return (int) (((float) zzd(displayMetrics)) * displayMetrics.density);
    }

    private static int zzd(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    public static zzuk zzh(Context context) {
        return new zzuk("320x50_mb", 0, 0, false, 0, 0, (zzuk[]) null, true, false, false, false, false, false, false);
    }

    public static zzuk zzoq() {
        return new zzuk("reward_mb", 0, 0, true, 0, 0, (zzuk[]) null, false, false, false, false, false, false, false);
    }

    public static zzuk zzor() {
        return new zzuk("interstitial_mb", 0, 0, false, 0, 0, (zzuk[]) null, false, false, false, false, true, false, false);
    }

    public zzuk() {
        this("interstitial_mb", 0, 0, true, 0, 0, (zzuk[]) null, false, false, false, false, false, false, false);
    }

    public static zzuk zzos() {
        return new zzuk("invalid", 0, 0, false, 0, 0, (zzuk[]) null, false, false, false, true, false, false, false);
    }

    public zzuk(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzuk(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.zzcdc = r0
            boolean r2 = r1.isFluid()
            r12.zzcde = r2
            boolean r2 = com.google.android.gms.ads.zzb.zza(r1)
            r12.zzcdi = r2
            boolean r2 = com.google.android.gms.ads.zzb.zzb(r1)
            r12.zzcdj = r2
            boolean r2 = r12.zzcde
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.width = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
            r12.height = r2
            goto L_0x004c
        L_0x002f:
            boolean r2 = r12.zzcdj
            if (r2 == 0) goto L_0x0040
            int r2 = r1.getWidth()
            r12.width = r2
            int r2 = com.google.android.gms.ads.zzb.zzc(r1)
            r12.height = r2
            goto L_0x004c
        L_0x0040:
            int r2 = r1.getWidth()
            r12.width = r2
            int r2 = r1.getHeight()
            r12.height = r2
        L_0x004c:
            int r2 = r12.width
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0054
            r2 = 1
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            int r3 = r12.height
            r5 = -2
            if (r3 != r5) goto L_0x005c
            r3 = 1
            goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzvh.zzoz()
            boolean r6 = com.google.android.gms.internal.ads.zzayx.zzbo(r13)
            if (r6 == 0) goto L_0x0086
            com.google.android.gms.internal.ads.zzvh.zzoz()
            boolean r6 = com.google.android.gms.internal.ads.zzayx.zzbp(r13)
            if (r6 == 0) goto L_0x0086
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.zzvh.zzoz()
            int r7 = com.google.android.gms.internal.ads.zzayx.zzbq(r13)
            int r6 = r6 - r7
            r12.widthPixels = r6
            goto L_0x008a
        L_0x0086:
            int r6 = r5.widthPixels
            r12.widthPixels = r6
        L_0x008a:
            int r6 = r12.widthPixels
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00b3
            int r8 = r8 + 1
            goto L_0x00b3
        L_0x00a6:
            int r8 = r12.width
            com.google.android.gms.internal.ads.zzvh.zzoz()
            int r6 = r12.width
            int r6 = com.google.android.gms.internal.ads.zzayx.zza((android.util.DisplayMetrics) r5, (int) r6)
            r12.widthPixels = r6
        L_0x00b3:
            if (r3 == 0) goto L_0x00ba
            int r6 = zzd(r5)
            goto L_0x00bc
        L_0x00ba:
            int r6 = r12.height
        L_0x00bc:
            com.google.android.gms.internal.ads.zzvh.zzoz()
            int r5 = com.google.android.gms.internal.ads.zzayx.zza((android.util.DisplayMetrics) r5, (int) r6)
            r12.heightPixels = r5
            java.lang.String r5 = "_as"
            java.lang.String r7 = "x"
            r9 = 26
            if (r2 != 0) goto L_0x0100
            if (r3 == 0) goto L_0x00d0
            goto L_0x0100
        L_0x00d0:
            boolean r2 = r12.zzcdj
            if (r2 == 0) goto L_0x00f0
            int r1 = r12.width
            int r2 = r12.height
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r12.zzabk = r1
            goto L_0x0117
        L_0x00f0:
            boolean r2 = r12.zzcde
            if (r2 == 0) goto L_0x00f9
            java.lang.String r1 = "320x50_mb"
            r12.zzabk = r1
            goto L_0x0117
        L_0x00f9:
            java.lang.String r1 = r1.toString()
            r12.zzabk = r1
            goto L_0x0117
        L_0x0100:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r12.zzabk = r1
        L_0x0117:
            int r1 = r14.length
            if (r1 <= r4) goto L_0x0131
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzuk[] r1 = new com.google.android.gms.internal.ads.zzuk[r1]
            r12.zzcdd = r1
            r1 = 0
        L_0x0120:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x0134
            com.google.android.gms.internal.ads.zzuk[] r2 = r12.zzcdd
            com.google.android.gms.internal.ads.zzuk r3 = new com.google.android.gms.internal.ads.zzuk
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.AdSize) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0120
        L_0x0131:
            r13 = 0
            r12.zzcdd = r13
        L_0x0134:
            r12.zzbml = r0
            r12.zzcdf = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuk.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    @SafeParcelable.Constructor
    zzuk(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzuk[] zzukArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @SafeParcelable.Param(id = 13) boolean z6, @SafeParcelable.Param(id = 14) boolean z7, @SafeParcelable.Param(id = 15) boolean z8) {
        this.zzabk = str;
        this.height = i;
        this.heightPixels = i2;
        this.zzcdc = z;
        this.width = i3;
        this.widthPixels = i4;
        this.zzcdd = zzukArr;
        this.zzbml = z2;
        this.zzcde = z3;
        this.zzcdf = z4;
        this.zzcdg = z5;
        this.zzcdh = z6;
        this.zzcdi = z7;
        this.zzcdj = z8;
    }

    public final AdSize zzot() {
        return zzb.zza(this.width, this.height, this.zzabk);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzabk, false);
        SafeParcelWriter.writeInt(parcel, 3, this.height);
        SafeParcelWriter.writeInt(parcel, 4, this.heightPixels);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzcdc);
        SafeParcelWriter.writeInt(parcel, 6, this.width);
        SafeParcelWriter.writeInt(parcel, 7, this.widthPixels);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzcdd, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzbml);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzcde);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzcdf);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzcdg);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzcdh);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzcdi);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzcdj);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

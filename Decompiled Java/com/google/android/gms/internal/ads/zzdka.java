package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdka {
    private final SharedPreferences zzcgv;
    @VisibleForTesting
    private final File zzgxx;
    @VisibleForTesting
    private final File zzgxy;

    public zzdka(@NonNull Context context) {
        this.zzcgv = context.getSharedPreferences("pcvmspf", 0);
        this.zzgxx = zzdkd.zza(context.getDir("pccache", 0), false);
        this.zzgxy = zzdkd.zza(context.getDir("tmppccache", 0), true);
    }

    public final zzdkb zzdr(int i) {
        zzgb zzds = zzds(i);
        if (zzds == null) {
            return null;
        }
        String zzdc = zzds.zzdc();
        return new zzdkb(zzds, zzdkd.zza(zzdc, "pcam", this.zzgxx), zzdkd.zza(zzdc, "pcbc", this.zzgxx), zzdkd.zza(zzdc, "pcopt", this.zzgxx));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012d, code lost:
        if (r0.commit() != false) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(@androidx.annotation.NonNull com.google.android.gms.internal.ads.zzfx r8, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzdkg r9) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzgb r9 = r8.zzcy()
            java.lang.String r9 = r9.zzdc()
            com.google.android.gms.internal.ads.zzdxn r0 = r8.zzcz()
            byte[] r0 = r0.toByteArray()
            com.google.android.gms.internal.ads.zzdxn r1 = r8.zzda()
            byte[] r1 = r1.toByteArray()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r3 = "pcbc"
            java.lang.String r4 = "pcam"
            r5 = 0
            if (r2 != 0) goto L_0x0059
            if (r1 == 0) goto L_0x0059
            int r2 = r1.length
            if (r2 != 0) goto L_0x0029
            goto L_0x0059
        L_0x0029:
            java.io.File r2 = r7.zzgxy
            com.google.android.gms.internal.ads.zzdkd.zzd(r2)
            java.io.File r2 = r7.zzgxy
            r2.mkdirs()
            java.io.File r2 = r7.zzgxy
            java.io.File r2 = com.google.android.gms.internal.ads.zzdkd.zza((java.lang.String) r9, (java.io.File) r2)
            r2.mkdirs()
            java.io.File r2 = r7.zzgxy
            java.io.File r2 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r4, r2)
            if (r0 == 0) goto L_0x004e
            int r6 = r0.length
            if (r6 <= 0) goto L_0x004e
            boolean r0 = com.google.android.gms.internal.ads.zzdkd.zza((java.io.File) r2, (byte[]) r0)
            if (r0 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            java.io.File r0 = r7.zzgxy
            java.io.File r9 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r3, r0)
            boolean r9 = com.google.android.gms.internal.ads.zzdkd.zza((java.io.File) r9, (byte[]) r1)
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 != 0) goto L_0x005d
            return r5
        L_0x005d:
            com.google.android.gms.internal.ads.zzgb r9 = r8.zzcy()
            java.lang.String r9 = r9.zzdc()
            java.io.File r0 = r7.zzgxy
            java.io.File r9 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r4, r0)
            boolean r9 = r9.exists()
            com.google.android.gms.internal.ads.zzgb r9 = r8.zzcy()
            java.lang.String r9 = r9.zzdc()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 != 0) goto L_0x00b0
            java.io.File r0 = r7.zzgxy
            java.io.File r0 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r4, r0)
            java.io.File r2 = r7.zzgxy
            java.io.File r2 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r3, r2)
            java.io.File r6 = r7.zzgxx
            java.io.File r4 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r4, r6)
            java.io.File r6 = r7.zzgxx
            java.io.File r9 = com.google.android.gms.internal.ads.zzdkd.zza(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L_0x00a2
            boolean r0 = r0.renameTo(r4)
            if (r0 == 0) goto L_0x00b0
        L_0x00a2:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x00b0
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L_0x00b0
            r9 = 1
            goto L_0x00b1
        L_0x00b0:
            r9 = 0
        L_0x00b1:
            if (r9 == 0) goto L_0x0130
            com.google.android.gms.internal.ads.zzgb$zza r9 = com.google.android.gms.internal.ads.zzgb.zzdh()
            com.google.android.gms.internal.ads.zzgb r0 = r8.zzcy()
            java.lang.String r0 = r0.zzdc()
            com.google.android.gms.internal.ads.zzgb$zza r9 = r9.zzaz(r0)
            com.google.android.gms.internal.ads.zzgb r0 = r8.zzcy()
            java.lang.String r0 = r0.zzdd()
            com.google.android.gms.internal.ads.zzgb$zza r9 = r9.zzba(r0)
            com.google.android.gms.internal.ads.zzgb r0 = r8.zzcy()
            long r2 = r0.zzdf()
            com.google.android.gms.internal.ads.zzgb$zza r9 = r9.zzdk(r2)
            com.google.android.gms.internal.ads.zzgb r0 = r8.zzcy()
            long r2 = r0.zzdg()
            com.google.android.gms.internal.ads.zzgb$zza r9 = r9.zzdl(r2)
            com.google.android.gms.internal.ads.zzgb r8 = r8.zzcy()
            long r2 = r8.zzde()
            com.google.android.gms.internal.ads.zzgb$zza r8 = r9.zzdj(r2)
            com.google.android.gms.internal.ads.zzeah r8 = r8.zzbcx()
            com.google.android.gms.internal.ads.zzdyz r8 = (com.google.android.gms.internal.ads.zzdyz) r8
            com.google.android.gms.internal.ads.zzgb r8 = (com.google.android.gms.internal.ads.zzgb) r8
            int r9 = com.google.android.gms.internal.ads.zzdkj.zzgyf
            com.google.android.gms.internal.ads.zzgb r9 = r7.zzds(r9)
            android.content.SharedPreferences r0 = r7.zzcgv
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L_0x0120
            java.lang.String r2 = r8.zzdc()
            java.lang.String r3 = r9.zzdc()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0120
            java.lang.String r9 = zza(r9)
            java.lang.String r2 = "FBAMTD"
            r0.putString(r2, r9)
        L_0x0120:
            java.lang.String r8 = zza(r8)
            java.lang.String r9 = "LATMTD"
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r1 = 0
        L_0x0131:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            int r9 = com.google.android.gms.internal.ads.zzdkj.zzgyf
            com.google.android.gms.internal.ads.zzgb r9 = r7.zzds(r9)
            if (r9 == 0) goto L_0x0145
            java.lang.String r9 = r9.zzdc()
            r8.add(r9)
        L_0x0145:
            int r9 = com.google.android.gms.internal.ads.zzdkj.zzgyg
            com.google.android.gms.internal.ads.zzgb r9 = r7.zzds(r9)
            if (r9 == 0) goto L_0x0154
            java.lang.String r9 = r9.zzdc()
            r8.add(r9)
        L_0x0154:
            java.io.File r9 = r7.zzgxx
            java.io.File[] r9 = r9.listFiles()
            int r0 = r9.length
        L_0x015b:
            if (r5 >= r0) goto L_0x0175
            r2 = r9[r5]
            java.lang.String r2 = r2.getName()
            boolean r3 = r8.contains(r2)
            if (r3 != 0) goto L_0x0172
            java.io.File r3 = r7.zzgxx
            java.io.File r2 = com.google.android.gms.internal.ads.zzdkd.zza((java.lang.String) r2, (java.io.File) r3)
            com.google.android.gms.internal.ads.zzdkd.zzd(r2)
        L_0x0172:
            int r5 = r5 + 1
            goto L_0x015b
        L_0x0175:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdka.zza(com.google.android.gms.internal.ads.zzfx, com.google.android.gms.internal.ads.zzdkg):boolean");
    }

    @VisibleForTesting
    private static String zza(@NonNull zzgb zzgb) {
        return Hex.bytesToStringLowercase(zzgb.zzbai().toByteArray());
    }

    @VisibleForTesting
    private final zzgb zzds(int i) {
        String str;
        if (i == zzdkj.zzgyf) {
            str = this.zzcgv.getString("LATMTD", (String) null);
        } else {
            str = i == zzdkj.zzgyg ? this.zzcgv.getString("FBAMTD", (String) null) : null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            zzgb zzl = zzgb.zzl(zzdxn.zzt(Hex.stringToBytes(str)));
            String zzdc = zzl.zzdc();
            if (zzdkd.zza(zzdc, "pcam", this.zzgxx).exists() && zzdkd.zza(zzdc, "pcbc", this.zzgxx).exists()) {
                return zzl;
            }
            return null;
        } catch (zzdzh unused) {
        }
    }
}

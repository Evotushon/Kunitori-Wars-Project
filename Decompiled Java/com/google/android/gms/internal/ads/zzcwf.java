package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwf implements zzcye<zzcwg> {
    private final PackageInfo zzdju;
    private final zzawh zzdsq;
    private final zzdeu zzfir;
    private final zzdoe zzfrv;

    public zzcwf(zzdoe zzdoe, zzdeu zzdeu, @Nullable PackageInfo packageInfo, zzawh zzawh) {
        this.zzfrv = zzdoe;
        this.zzfir = zzdeu;
        this.zzdju = packageInfo;
        this.zzdsq = zzawh;
    }

    public final zzdof<zzcwg> zzapb() {
        return this.zzfrv.zzd(new zzcwi(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
        if (r9 == 3) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r0 = 3
            java.lang.String r1 = "native_version"
            r10.putInt(r1, r0)
            java.lang.String r1 = "native_templates"
            r10.putStringArrayList(r1, r9)
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            java.util.ArrayList<java.lang.String> r9 = r9.zzgqt
            java.lang.String r1 = "native_custom_templates"
            r10.putStringArrayList(r1, r9)
            com.google.android.gms.internal.ads.zzzi<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.zzzx.zzcmy
            com.google.android.gms.internal.ads.zzzt r1 = com.google.android.gms.internal.ads.zzvh.zzpd()
            java.lang.Object r9 = r1.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            java.lang.String r1 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzach r9 = r9.zzdff
            int r9 = r9.versionCode
            if (r9 <= r0) goto L_0x0061
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzach r9 = r9.zzdff
            int r9 = r9.zzbkf
            if (r9 == r6) goto L_0x0055
            if (r9 == r5) goto L_0x0053
            if (r9 == r0) goto L_0x0051
            r7 = 4
            if (r9 == r7) goto L_0x004e
            r9 = r4
            goto L_0x0056
        L_0x004e:
            java.lang.String r9 = "square"
            goto L_0x0056
        L_0x0051:
            r9 = r2
            goto L_0x0056
        L_0x0053:
            r9 = r1
            goto L_0x0056
        L_0x0055:
            r9 = r3
        L_0x0056:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x0061
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x0061:
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzach r9 = r9.zzdff
            int r9 = r9.zzbke
            if (r9 == 0) goto L_0x0071
            if (r9 == r6) goto L_0x006f
            if (r9 == r5) goto L_0x0072
            r1 = r4
            goto L_0x0072
        L_0x006f:
            r1 = r2
            goto L_0x0072
        L_0x0071:
            r1 = r3
        L_0x0072:
            boolean r9 = r4.equals(r1)
            if (r9 != 0) goto L_0x007d
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r1)
        L_0x007d:
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzach r9 = r9.zzdff
            boolean r9 = r9.zzbkg
            java.lang.String r1 = "native_multiple_images"
            r10.putBoolean(r1, r9)
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzach r9 = r9.zzdff
            boolean r9 = r9.zzbkj
            java.lang.String r1 = "use_custom_mute"
            r10.putBoolean(r1, r9)
            android.content.pm.PackageInfo r9 = r8.zzdju
            if (r9 != 0) goto L_0x0099
            r9 = 0
            goto L_0x009b
        L_0x0099:
            int r9 = r9.versionCode
        L_0x009b:
            com.google.android.gms.internal.ads.zzawh r1 = r8.zzdsq
            int r1 = r1.zzwe()
            if (r9 <= r1) goto L_0x00ad
            com.google.android.gms.internal.ads.zzawh r1 = r8.zzdsq
            r1.zzwk()
            com.google.android.gms.internal.ads.zzawh r1 = r8.zzdsq
            r1.zzcp(r9)
        L_0x00ad:
            com.google.android.gms.internal.ads.zzawh r9 = r8.zzdsq
            org.json.JSONObject r9 = r9.zzwj()
            if (r9 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.zzdeu r1 = r8.zzfir
            java.lang.String r1 = r1.zzgqr
            org.json.JSONArray r9 = r9.optJSONArray(r1)
            if (r9 == 0) goto L_0x00c4
            java.lang.String r9 = r9.toString()
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x00d0
            java.lang.String r1 = "native_advanced_settings"
            r10.putString(r1, r9)
        L_0x00d0:
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            int r9 = r9.zzggu
            if (r9 <= r6) goto L_0x00df
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            int r9 = r9.zzggu
            java.lang.String r1 = "max_num_ads"
            r10.putInt(r1, r9)
        L_0x00df:
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzahl r9 = r9.zzdlk
            if (r9 == 0) goto L_0x0133
            java.lang.String r1 = r9.zzczm
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0127
            int r1 = r9.versionCode
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r1 < r5) goto L_0x00fc
            int r9 = r9.zzbkf
            if (r9 == r5) goto L_0x0121
            if (r9 == r0) goto L_0x0120
            goto L_0x0121
        L_0x00fc:
            int r0 = r9.zzczl
            if (r0 == r6) goto L_0x0121
            if (r0 == r5) goto L_0x0120
            int r9 = r9.zzczl
            r0 = 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Instream ad video aspect ratio "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = " is wrong."
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.zzazh.zzey(r9)
            goto L_0x0121
        L_0x0120:
            r3 = r2
        L_0x0121:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r3)
            goto L_0x012e
        L_0x0127:
            java.lang.String r9 = r9.zzczm
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x012e:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0133:
            com.google.android.gms.internal.ads.zzdeu r9 = r8.zzfir
            com.google.android.gms.internal.ads.zzael r9 = r9.zzaqx()
            if (r9 == 0) goto L_0x0140
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcwf.zza(java.util.ArrayList, android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcwg zzapi() throws Exception {
        ArrayList<String> arrayList = this.zzfir.zzgqs;
        if (arrayList == null) {
            return zzcwh.zzgji;
        }
        if (arrayList.isEmpty()) {
            return zzcwk.zzgji;
        }
        return new zzcwj(this, arrayList);
    }
}

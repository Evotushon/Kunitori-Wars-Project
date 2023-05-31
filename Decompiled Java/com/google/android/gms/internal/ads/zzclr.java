package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.ads.zzsz;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzclr {
    private static final SparseArray<zzsz.zzj.zzc> zzgar;
    private final zzbpm zzfiy;
    private final zzclk zzfya;
    private final TelephonyManager zzgao;
    /* access modifiers changed from: private */
    public final zzcle zzgap;
    private zztf zzgaq;
    private final Context zzur;

    zzclr(Context context, zzbpm zzbpm, zzclk zzclk, zzcle zzcle) {
        this.zzur = context;
        this.zzfiy = zzbpm;
        this.zzfya = zzclk;
        this.zzgap = zzcle;
        this.zzgao = (TelephonyManager) context.getSystemService("phone");
    }

    private static zztf zzbk(boolean z) {
        return z ? zztf.ENUM_TRUE : zztf.ENUM_FALSE;
    }

    /* access modifiers changed from: private */
    public final zzsz.zzh zzj(Bundle bundle) {
        zzsz.zzh.zza zza;
        zzsz.zzh.zzb zznq = zzsz.zzh.zznq();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.zzgaq = zztf.ENUM_TRUE;
        } else {
            this.zzgaq = zztf.ENUM_FALSE;
            if (i == 0) {
                zznq.zzb(zzsz.zzh.zzc.CELL);
            } else if (i != 1) {
                zznq.zzb(zzsz.zzh.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zznq.zzb(zzsz.zzh.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zza = zzsz.zzh.zza.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zza = zzsz.zzh.zza.THREE_G;
                    break;
                case 13:
                    zza = zzsz.zzh.zza.LTE;
                    break;
                default:
                    zza = zzsz.zzh.zza.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zznq.zzb(zza);
        }
        return (zzsz.zzh) ((zzdyz) zznq.zzbcx());
    }

    /* access modifiers changed from: private */
    public static zzsz.zzj.zzc zzk(Bundle bundle) {
        return zzgar.get(zzdez.zza(zzdez.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzsz.zzj.zzc.UNSPECIFIED);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zzsz.zzb.zza> zzl(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L_0x000d
            java.util.List r7 = (java.util.List) r7
            goto L_0x0017
        L_0x000d:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x003d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x0024:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L_0x0024
        L_0x0038:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0041
        L_0x003d:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0041:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x004a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L_0x0080;
                case -1052618729: goto L_0x0076;
                case -239580146: goto L_0x006c;
                case 604727084: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0089
        L_0x0062:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 1
            goto L_0x0089
        L_0x006c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 3
            goto L_0x0089
        L_0x0076:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 2
            goto L_0x0089
        L_0x0080:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x009d
            if (r2 == r6) goto L_0x009a
            if (r2 == r5) goto L_0x0097
            if (r2 == r4) goto L_0x0094
            com.google.android.gms.internal.ads.zzsz$zzb$zza r1 = com.google.android.gms.internal.ads.zzsz.zzb.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x009f
        L_0x0094:
            com.google.android.gms.internal.ads.zzsz$zzb$zza r1 = com.google.android.gms.internal.ads.zzsz.zzb.zza.REWARD_BASED_VIDEO_AD
            goto L_0x009f
        L_0x0097:
            com.google.android.gms.internal.ads.zzsz$zzb$zza r1 = com.google.android.gms.internal.ads.zzsz.zzb.zza.NATIVE_APP_INSTALL
            goto L_0x009f
        L_0x009a:
            com.google.android.gms.internal.ads.zzsz$zzb$zza r1 = com.google.android.gms.internal.ads.zzsz.zzb.zza.INTERSTITIAL
            goto L_0x009f
        L_0x009d:
            com.google.android.gms.internal.ads.zzsz$zzb$zza r1 = com.google.android.gms.internal.ads.zzsz.zzb.zza.BANNER
        L_0x009f:
            r0.add(r1)
            goto L_0x004a
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclr.zzl(android.os.Bundle):java.util.ArrayList");
    }

    /* access modifiers changed from: private */
    public final byte[] zza(boolean z, ArrayList<zzsz.zzb.zza> arrayList, zzsz.zzh zzh, zzsz.zzj.zzc zzc) {
        boolean z2 = true;
        zzsz.zzj.zza.C0025zza zzeu = zzsz.zzj.zza.zznw().zzd(arrayList).zzh(zzbk(zzq.zzkx().zzb(this.zzur.getContentResolver()) != 0)).zzi(zzq.zzkx().zza(this.zzur, this.zzgao)).zzev(this.zzfya.zzanw()).zzew(this.zzfya.zzany()).zzcf(this.zzfya.getResponseCode()).zzb(zzc).zzb(zzh).zzj(this.zzgaq).zzf(zzbk(z)).zzeu(zzq.zzlc().currentTimeMillis());
        if (zzq.zzkx().zza(this.zzur.getContentResolver()) == 0) {
            z2 = false;
        }
        return ((zzsz.zzj.zza) ((zzdyz) zzeu.zzg(zzbk(z2)).zzbcx())).toByteArray();
    }

    public final void zzbl(boolean z) {
        zzdnt.zza(this.zzfiy.zzahs(), new zzclq(this, z), zzazq.zzdxp);
    }

    static {
        SparseArray<zzsz.zzj.zzc> sparseArray = new SparseArray<>();
        zzgar = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzsz.zzj.zzc.CONNECTED);
        zzgar.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzsz.zzj.zzc.CONNECTING);
        zzgar.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzsz.zzj.zzc.CONNECTING);
        zzgar.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzsz.zzj.zzc.CONNECTING);
        zzgar.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzsz.zzj.zzc.DISCONNECTING);
        zzgar.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzsz.zzj.zzc.DISCONNECTED);
        zzgar.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzsz.zzj.zzc.DISCONNECTED);
        zzgar.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzsz.zzj.zzc.DISCONNECTED);
        zzgar.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzsz.zzj.zzc.DISCONNECTED);
        zzgar.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzsz.zzj.zzc.DISCONNECTED);
        zzgar.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzsz.zzj.zzc.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzgar.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzsz.zzj.zzc.CONNECTING);
        }
        zzgar.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzsz.zzj.zzc.CONNECTING);
    }
}

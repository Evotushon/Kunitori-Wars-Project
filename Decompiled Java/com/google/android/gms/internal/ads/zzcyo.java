package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcyo implements zzcye<zzcyl> {
    private final zzdoe zzfrv;
    private final Context zzur;

    public zzcyo(zzdoe zzdoe, Context context) {
        this.zzfrv = zzdoe;
        this.zzur = context;
    }

    public final zzdof<zzcyl> zzapb() {
        return this.zzfrv.zzd(new zzcyn(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyl zzaps() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzur.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        zzq.zzkv();
        int i3 = -1;
        if (zzawo.zzq(this.zzur, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzur.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new zzcyl(networkOperator, i2, networkType, phoneType, z, i);
    }
}

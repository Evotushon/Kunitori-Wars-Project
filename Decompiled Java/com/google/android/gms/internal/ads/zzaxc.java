package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.zzq;

@TargetApi(26)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzaxc extends zzawz {
    public final zztf zza(Context context, TelephonyManager telephonyManager) {
        zzq.zzkv();
        if (zzawo.zzq(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zztf.ENUM_TRUE : zztf.ENUM_FALSE;
        }
        return zztf.ENUM_FALSE;
    }
}

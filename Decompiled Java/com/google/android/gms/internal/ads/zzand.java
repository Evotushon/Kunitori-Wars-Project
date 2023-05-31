package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzand {
    public static int zza(AdRequest.ErrorCode errorCode) {
        int i = zzanc.zzdfl[errorCode.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static MediationAdRequest zza(zzuh zzuh, boolean z) {
        AdRequest.Gender gender;
        HashSet hashSet = zzuh.zzcco != null ? new HashSet(zzuh.zzcco) : null;
        Date date = new Date(zzuh.zzccm);
        int i = zzuh.zzccn;
        if (i == 1) {
            gender = AdRequest.Gender.MALE;
        } else if (i != 2) {
            gender = AdRequest.Gender.UNKNOWN;
        } else {
            gender = AdRequest.Gender.FEMALE;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzuh.zzmk);
    }
}

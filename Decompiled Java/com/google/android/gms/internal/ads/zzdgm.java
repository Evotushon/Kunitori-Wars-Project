package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdgm implements zzdgj {
    private final Object[] zzgtn;

    public zzdgm(zzuh zzuh, String str, int i, String str2, zzur zzur) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzuh.zzccm));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zzq(zzuh.extras));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzuh.extras.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzuh.zzccn));
        }
        if (hashSet.contains("keywords")) {
            if (zzuh.zzcco != null) {
                arrayList.add(zzuh.zzcco.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzuh.zzccp));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzuh.zzabv));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzuh.zzbkp));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzuh.zzccq);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            if (zzuh.zzmk != null) {
                arrayList.add(zzuh.zzmk.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzuh.zzccs);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zzq(zzuh.zzcct));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zzq(zzuh.zzccu));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzuh.zzccv != null) {
                arrayList.add(zzuh.zzccv.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzuh.zzccw);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzuh.zzccx);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzuh.zzccy));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzuh.zzabw));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzuh.zzabx);
        }
        if (hashSet.contains("orientation")) {
            if (zzur != null) {
                arrayList.add(Integer.valueOf(zzur.orientation));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.zzgtn = arrayList.toArray();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdgm)) {
            return false;
        }
        return Arrays.equals(this.zzgtn, ((zzdgm) obj).zzgtn);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzgtn);
    }

    public final String toString() {
        int hashCode = hashCode();
        String arrays = Arrays.toString(this.zzgtn);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 22);
        sb.append("[PoolKey#");
        sb.append(hashCode);
        sb.append(" ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }

    private static String zzq(@Nullable Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = zzq((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }
}

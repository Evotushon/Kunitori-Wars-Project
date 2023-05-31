package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcwl implements zzcyb<Bundle> {
    private final String zzgjl;

    /* access modifiers changed from: private */
    public static boolean zze(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    public zzcwl(String str) {
        this.zzgjl = str;
    }

    public final /* synthetic */ void zzs(Object obj) {
        zzdez.zza((Bundle) obj, "omid_v", this.zzgjl);
    }
}

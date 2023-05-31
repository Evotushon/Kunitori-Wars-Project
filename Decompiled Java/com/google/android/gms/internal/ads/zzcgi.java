package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgi implements zzbqu, zzbsv {
    private final zzdei zzfdq;
    private final zzcgq zzfvp;
    private final zzcgx zzfvq;
    private final boolean zzfvs;

    public zzcgi(zzcgq zzcgq, zzcgx zzcgx, zzdei zzdei, Context context) {
        this.zzfvp = zzcgq;
        this.zzfvq = zzcgx;
        this.zzfdq = zzdei;
        zzzi zzzi = zzzx.zzclj;
        zzq.zzkv();
        this.zzfvs = zzf((String) zzvh.zzpd().zzd(zzzi), zzawo.zzbe(context));
    }

    public final void onAdImpression() {
        if (this.zzfvs && !this.zzfdq.zzgpr.isEmpty()) {
            HashMap hashMap = new HashMap(this.zzfvp.zzqv());
            hashMap.put("ancn", this.zzfdq.zzgpr.get(0));
            hashMap.put("action", "impression");
            this.zzfvq.zzm(hashMap);
        }
    }

    public final void zzaif() {
        if (this.zzfvs && !this.zzfdq.zzgpr.isEmpty()) {
            HashMap hashMap = new HashMap(this.zzfvp.zzqv());
            hashMap.put("ancn", this.zzfdq.zzgpr.get(0));
            hashMap.put("action", "adapter_impression");
            this.zzfvq.zzm(hashMap);
        }
    }

    private static boolean zzf(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                zzq.zzkz().zza(e, "CsiImpressionListener.isPatternMatched");
            }
        }
        return false;
    }
}

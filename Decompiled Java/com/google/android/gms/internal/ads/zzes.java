package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzes extends zzcj<Integer, Long> {
    public Long zzzj;
    public Long zzzk;
    public Long zzzl;
    public Long zzzm;

    public zzes() {
    }

    public zzes(String str) {
        zzap(str);
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str) {
        HashMap zzaq = zzaq(str);
        if (zzaq != null) {
            this.zzzj = (Long) zzaq.get(0);
            this.zzzk = (Long) zzaq.get(1);
            this.zzzl = (Long) zzaq.get(2);
            this.zzzm = (Long) zzaq.get(3);
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> zzbl() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzzj);
        hashMap.put(1, this.zzzk);
        hashMap.put(2, this.zzzl);
        hashMap.put(3, this.zzzm);
        return hashMap;
    }
}

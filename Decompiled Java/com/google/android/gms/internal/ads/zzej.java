package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzej extends zzcj<Integer, Long> {
    public Long zzye;
    public Long zzyf;

    public zzej() {
    }

    public zzej(String str) {
        zzap(str);
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str) {
        HashMap zzaq = zzaq(str);
        if (zzaq != null) {
            this.zzye = (Long) zzaq.get(0);
            this.zzyf = (Long) zzaq.get(1);
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> zzbl() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzye);
        hashMap.put(1, this.zzyf);
        return hashMap;
    }
}

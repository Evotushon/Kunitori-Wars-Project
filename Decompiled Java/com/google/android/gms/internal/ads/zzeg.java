package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeg extends zzcj<Integer, Object> {
    public Long zzxl;
    public Boolean zzxm;
    public Boolean zzxn;

    public zzeg() {
    }

    public zzeg(String str) {
        zzap(str);
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str) {
        HashMap zzaq = zzaq(str);
        if (zzaq != null) {
            this.zzxl = (Long) zzaq.get(0);
            this.zzxm = (Boolean) zzaq.get(1);
            this.zzxn = (Boolean) zzaq.get(2);
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> zzbl() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzxl);
        hashMap.put(1, this.zzxm);
        hashMap.put(2, this.zzxn);
        return hashMap;
    }
}

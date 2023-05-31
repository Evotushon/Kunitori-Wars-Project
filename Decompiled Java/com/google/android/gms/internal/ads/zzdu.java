package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdu extends zzcj<Integer, Long> {
    public long zzxb;
    public long zzxc;

    public zzdu() {
        this.zzxb = -1;
        this.zzxc = -1;
    }

    public zzdu(String str) {
        this();
        zzap(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> zzbl() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.zzxb));
        hashMap.put(1, Long.valueOf(this.zzxc));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str) {
        HashMap zzaq = zzaq(str);
        if (zzaq != null) {
            this.zzxb = ((Long) zzaq.get(0)).longValue();
            this.zzxc = ((Long) zzaq.get(1)).longValue();
        }
    }
}

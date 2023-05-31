package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzeq extends zzcj<Integer, Long> {
    public Long zzyn;
    public Long zzyo;
    public Long zzyp;
    public Long zzyq;
    public Long zzyr;
    public Long zzys;
    public Long zzyt;
    public Long zzyu;
    public Long zzyv;
    public Long zzyw;
    public Long zzyx;

    public zzeq() {
    }

    public zzeq(String str) {
        zzap(str);
    }

    /* access modifiers changed from: protected */
    public final void zzap(String str) {
        HashMap zzaq = zzaq(str);
        if (zzaq != null) {
            this.zzyn = (Long) zzaq.get(0);
            this.zzyo = (Long) zzaq.get(1);
            this.zzyp = (Long) zzaq.get(2);
            this.zzyq = (Long) zzaq.get(3);
            this.zzyr = (Long) zzaq.get(4);
            this.zzys = (Long) zzaq.get(5);
            this.zzyt = (Long) zzaq.get(6);
            this.zzyu = (Long) zzaq.get(7);
            this.zzyv = (Long) zzaq.get(8);
            this.zzyw = (Long) zzaq.get(9);
            this.zzyx = (Long) zzaq.get(10);
        }
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Long> zzbl() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzyn);
        hashMap.put(1, this.zzyo);
        hashMap.put(2, this.zzyp);
        hashMap.put(3, this.zzyq);
        hashMap.put(4, this.zzyr);
        hashMap.put(5, this.zzys);
        hashMap.put(6, this.zzyt);
        hashMap.put(7, this.zzyu);
        hashMap.put(8, this.zzyv);
        hashMap.put(9, this.zzyw);
        hashMap.put(10, this.zzyx);
        return hashMap;
    }
}

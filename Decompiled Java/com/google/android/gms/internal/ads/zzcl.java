package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcl extends zzcj<Integer, Object> {
    public String zzmx;
    public long zzmy;
    public String zzmz;
    public String zzna;
    public String zznb;

    public zzcl(String str) {
        this();
        zzap(str);
    }

    public zzcl() {
        this.zzmx = "E";
        this.zzmy = -1;
        this.zzmz = "E";
        this.zzna = "E";
        this.zznb = "E";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzap(java.lang.String r4) {
        /*
            r3 = this;
            java.util.HashMap r4 = zzaq(r4)
            if (r4 == 0) goto L_0x008a
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r2 = "E"
            if (r1 != 0) goto L_0x0015
            r0 = r2
            goto L_0x001f
        L_0x0015:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x001f:
            r3.zzmx = r0
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.get(r1)
            if (r1 != 0) goto L_0x002f
            r0 = -1
            goto L_0x003d
        L_0x002f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x003d:
            r3.zzmy = r0
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.get(r1)
            if (r1 != 0) goto L_0x004c
            r0 = r2
            goto L_0x0056
        L_0x004c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0056:
            r3.zzmz = r0
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.get(r1)
            if (r1 != 0) goto L_0x0065
            r0 = r2
            goto L_0x006f
        L_0x0065:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x006f:
            r3.zzna = r0
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.get(r1)
            if (r1 != 0) goto L_0x007d
            goto L_0x0088
        L_0x007d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r4.get(r0)
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        L_0x0088:
            r3.zznb = r2
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcl.zzap(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, Object> zzbl() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzmx);
        hashMap.put(4, this.zznb);
        hashMap.put(3, this.zzna);
        hashMap.put(2, this.zzmz);
        hashMap.put(1, Long.valueOf(this.zzmy));
        return hashMap;
    }
}

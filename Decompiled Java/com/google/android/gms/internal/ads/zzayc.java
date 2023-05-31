package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzayc extends zzax {
    private final /* synthetic */ byte[] zzdvo;
    private final /* synthetic */ Map zzdvp;
    private final /* synthetic */ zzazb zzdvq;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzayc(zzaxx zzaxx, int i, String str, zzab zzab, zzy zzy, byte[] bArr, Map map, zzazb zzazb) {
        super(i, str, zzab, zzy);
        this.zzdvo = bArr;
        this.zzdvp = map;
        this.zzdvq = zzazb;
    }

    public final byte[] zzg() throws zzb {
        byte[] bArr = this.zzdvo;
        return bArr == null ? super.zzg() : bArr;
    }

    public final Map<String, String> getHeaders() throws zzb {
        Map<String, String> map = this.zzdvp;
        return map == null ? super.getHeaders() : map;
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str) {
        this.zzdvq.zzev(str);
        super.zza(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void zza(Object obj) {
        zza((String) obj);
    }
}

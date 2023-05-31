package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzayd extends zzq<zzo> {
    private final Map<String, String> zzab;
    private final zzazy<zzo> zzdvr;
    private final zzazb zzdvs;

    public zzayd(String str, zzazy<zzo> zzazy) {
        this(str, (Map<String, String>) null, zzazy);
    }

    private zzayd(String str, Map<String, String> map, zzazy<zzo> zzazy) {
        super(0, str, new zzayg(zzazy));
        this.zzab = null;
        this.zzdvr = zzazy;
        this.zzdvs = new zzazb();
        this.zzdvs.zza(str, "GET", (Map<String, ?>) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzz<zzo> zza(zzo zzo) {
        return zzz.zza(zzo, zzas.zzb(zzo));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void zza(Object obj) {
        zzo zzo = (zzo) obj;
        this.zzdvs.zza((Map<String, ?>) zzo.zzab, zzo.statusCode);
        zzazb zzazb = this.zzdvs;
        byte[] bArr = zzo.data;
        if (zzazb.isEnabled() && bArr != null) {
            zzazb.zzi(bArr);
        }
        this.zzdvr.set(zzo);
    }
}

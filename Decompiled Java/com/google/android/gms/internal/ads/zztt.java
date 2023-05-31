package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsz;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zztt extends zzect<zztt> {
    public String zzcas = null;
    private zzsz.zzo zzcat = null;
    private Integer zzcau = null;
    public zztu zzcav = null;
    private Integer zzcaw = null;
    private zztf zzcax = null;
    private zztf zzcay = null;
    private zztf zzcaz = null;

    public zztt() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        String str = this.zzcas;
        if (str != null) {
            zzecr.zzf(1, str);
        }
        zztu zztu = this.zzcav;
        if (zztu != null) {
            zzecr.zza(4, (zzeda) zztu);
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        String str = this.zzcas;
        if (str != null) {
            zzon += zzecr.zzg(1, str);
        }
        zztu zztu = this.zzcav;
        return zztu != null ? zzon + zzecr.zzb(4, zztu) : zzon;
    }
}

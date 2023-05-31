package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsz;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zztq extends zzect<zztq> {
    public String zzcac = null;
    private zzsz.zzb[] zzcad = new zzsz.zzb[0];
    private zztf zzcae = null;
    private zztf zzcaf = null;
    private zztf zzcag = null;

    public zztq() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        String str = this.zzcac;
        if (str != null) {
            zzecr.zzf(1, str);
        }
        zzsz.zzb[] zzbArr = this.zzcad;
        if (zzbArr != null && zzbArr.length > 0) {
            int i = 0;
            while (true) {
                zzsz.zzb[] zzbArr2 = this.zzcad;
                if (i >= zzbArr2.length) {
                    break;
                }
                zzsz.zzb zzb = zzbArr2[i];
                if (zzb != null) {
                    zzecr.zze(2, zzb);
                }
                i++;
            }
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        String str = this.zzcac;
        if (str != null) {
            zzon += zzecr.zzg(1, str);
        }
        zzsz.zzb[] zzbArr = this.zzcad;
        if (zzbArr != null && zzbArr.length > 0) {
            int i = 0;
            while (true) {
                zzsz.zzb[] zzbArr2 = this.zzcad;
                if (i >= zzbArr2.length) {
                    break;
                }
                zzsz.zzb zzb = zzbArr2[i];
                if (zzb != null) {
                    zzon += zzdyi.zzc(2, (zzeah) zzb);
                }
                i++;
            }
        }
        return zzon;
    }
}

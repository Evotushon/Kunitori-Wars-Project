package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsz;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zztr extends zzect<zztr> {
    public Integer zzcah = null;
    private zztf zzcai = null;
    private zzsz.zzc zzcaj = null;
    public zztq zzcak = null;
    private zzsz.zzb[] zzcal = new zzsz.zzb[0];
    private zzsz.zzd zzcam = null;
    private zzsz.zzk zzcan = null;
    private zzsz.zzi zzcao = null;
    private zzsz.zzf zzcap = null;
    private zzsz.zzg zzcaq = null;
    private zztx[] zzcar = zztx.zzoo();

    public zztr() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        Integer num = this.zzcah;
        if (num != null) {
            zzecr.zzac(7, num.intValue());
        }
        zztq zztq = this.zzcak;
        if (zztq != null) {
            zzecr.zza(10, (zzeda) zztq);
        }
        zzsz.zzb[] zzbArr = this.zzcal;
        int i = 0;
        if (zzbArr != null && zzbArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzsz.zzb[] zzbArr2 = this.zzcal;
                if (i2 >= zzbArr2.length) {
                    break;
                }
                zzsz.zzb zzb = zzbArr2[i2];
                if (zzb != null) {
                    zzecr.zze(11, zzb);
                }
                i2++;
            }
        }
        zztx[] zztxArr = this.zzcar;
        if (zztxArr != null && zztxArr.length > 0) {
            while (true) {
                zztx[] zztxArr2 = this.zzcar;
                if (i >= zztxArr2.length) {
                    break;
                }
                zztx zztx = zztxArr2[i];
                if (zztx != null) {
                    zzecr.zza(17, (zzeda) zztx);
                }
                i++;
            }
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        Integer num = this.zzcah;
        if (num != null) {
            zzon += zzecr.zzag(7, num.intValue());
        }
        zztq zztq = this.zzcak;
        if (zztq != null) {
            zzon += zzecr.zzb(10, zztq);
        }
        zzsz.zzb[] zzbArr = this.zzcal;
        int i = 0;
        if (zzbArr != null && zzbArr.length > 0) {
            int i2 = zzon;
            int i3 = 0;
            while (true) {
                zzsz.zzb[] zzbArr2 = this.zzcal;
                if (i3 >= zzbArr2.length) {
                    break;
                }
                zzsz.zzb zzb = zzbArr2[i3];
                if (zzb != null) {
                    i2 += zzdyi.zzc(11, (zzeah) zzb);
                }
                i3++;
            }
            zzon = i2;
        }
        zztx[] zztxArr = this.zzcar;
        if (zztxArr != null && zztxArr.length > 0) {
            while (true) {
                zztx[] zztxArr2 = this.zzcar;
                if (i >= zztxArr2.length) {
                    break;
                }
                zztx zztx = zztxArr2[i];
                if (zztx != null) {
                    zzon += zzecr.zzb(17, zztx);
                }
                i++;
            }
        }
        return zzon;
    }
}

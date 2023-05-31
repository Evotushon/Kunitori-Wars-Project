package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzsz;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zztv extends zzect<zztv> {
    private Integer zzcbd = null;
    public String zzcbe = null;
    private Integer zzcbf = null;
    private zztf zzcbg = null;
    private zztu zzcbh = null;
    public long[] zzcbi = zzedb.zziag;
    public zztt zzcbj = null;
    private zzts zzcbk = null;
    private zzsz.zzh zzcbl = null;
    public zztr zzcbm = null;
    public zzsz.zzj zzcbn = null;
    public zzsz.zzw zzcbo = null;
    public zzsz.zza zzcbp = null;

    public zztv() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        String str = this.zzcbe;
        if (str != null) {
            zzecr.zzf(10, str);
        }
        long[] jArr = this.zzcbi;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.zzcbi;
                if (i >= jArr2.length) {
                    break;
                }
                long j = jArr2[i];
                zzecr.zzab(14, 0);
                zzecr.zzft(j);
                i++;
            }
        }
        zztt zztt = this.zzcbj;
        if (zztt != null) {
            zzecr.zza(15, (zzeda) zztt);
        }
        zztr zztr = this.zzcbm;
        if (zztr != null) {
            zzecr.zza(18, (zzeda) zztr);
        }
        zzsz.zzj zzj = this.zzcbn;
        if (zzj != null) {
            zzecr.zze(19, zzj);
        }
        zzsz.zzw zzw = this.zzcbo;
        if (zzw != null) {
            zzecr.zze(20, zzw);
        }
        zzsz.zza zza = this.zzcbp;
        if (zza != null) {
            zzecr.zze(21, zza);
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        long[] jArr;
        int zzon = super.zzon();
        String str = this.zzcbe;
        if (str != null) {
            zzon += zzecr.zzg(10, str);
        }
        long[] jArr2 = this.zzcbi;
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                jArr = this.zzcbi;
                if (i >= jArr.length) {
                    break;
                }
                long j = jArr[i];
                i2 += (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (Long.MIN_VALUE & j) == 0 ? 9 : 10;
                i++;
            }
            zzon = zzon + i2 + (jArr.length * 1);
        }
        zztt zztt = this.zzcbj;
        if (zztt != null) {
            zzon += zzecr.zzb(15, zztt);
        }
        zztr zztr = this.zzcbm;
        if (zztr != null) {
            zzon += zzecr.zzb(18, zztr);
        }
        zzsz.zzj zzj = this.zzcbn;
        if (zzj != null) {
            zzon += zzdyi.zzc(19, (zzeah) zzj);
        }
        zzsz.zzw zzw = this.zzcbo;
        if (zzw != null) {
            zzon += zzdyi.zzc(20, (zzeah) zzw);
        }
        zzsz.zza zza = this.zzcbp;
        return zza != null ? zzon + zzdyi.zzc(21, (zzeah) zza) : zzon;
    }
}

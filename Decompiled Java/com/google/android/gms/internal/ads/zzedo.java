package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzede;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzedo extends zzect<zzedo> {
    public String url = null;
    public zzede.zzb.zzg zziee = null;
    private zzede.zza.zzc zzief = null;
    public String zzieg = null;
    private String zzieh = null;
    public zzede.zzb.zza zziei = null;
    public zzedp[] zziej = zzedp.zzbgh();
    public String zziek = null;
    public zzedq zziel = null;
    private Boolean zziem = null;
    private String[] zzien = zzedb.zziak;
    private String zzieo = null;
    private Boolean zziep = null;
    private Boolean zzieq = null;
    private byte[] zzier = null;
    public zzede.zzb.zzi zzies = null;
    public String[] zziet = zzedb.zziak;
    public String[] zzieu = zzedb.zziak;

    public zzedo() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        String str = this.url;
        if (str != null) {
            zzecr.zzf(1, str);
        }
        String str2 = this.zzieg;
        if (str2 != null) {
            zzecr.zzf(2, str2);
        }
        zzedp[] zzedpArr = this.zziej;
        int i = 0;
        if (zzedpArr != null && zzedpArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzedp[] zzedpArr2 = this.zziej;
                if (i2 >= zzedpArr2.length) {
                    break;
                }
                zzedp zzedp = zzedpArr2[i2];
                if (zzedp != null) {
                    zzecr.zza(4, (zzeda) zzedp);
                }
                i2++;
            }
        }
        String[] strArr = this.zzien;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.zzien;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i3];
                if (str3 != null) {
                    zzecr.zzf(6, str3);
                }
                i3++;
            }
        }
        zzede.zzb.zzg zzg = this.zziee;
        if (!(zzg == null || zzg == null)) {
            zzecr.zzac(10, zzg.zzaf());
        }
        zzede.zzb.zza zza = this.zziei;
        if (zza != null) {
            zzecr.zze(12, zza);
        }
        String str4 = this.zziek;
        if (str4 != null) {
            zzecr.zzf(13, str4);
        }
        zzedq zzedq = this.zziel;
        if (zzedq != null) {
            zzecr.zza(14, (zzeda) zzedq);
        }
        zzede.zzb.zzi zzi = this.zzies;
        if (zzi != null) {
            zzecr.zze(17, zzi);
        }
        String[] strArr3 = this.zziet;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.zziet;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i4];
                if (str5 != null) {
                    zzecr.zzf(20, str5);
                }
                i4++;
            }
        }
        String[] strArr5 = this.zzieu;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.zzieu;
                if (i >= strArr6.length) {
                    break;
                }
                String str6 = strArr6[i];
                if (str6 != null) {
                    zzecr.zzf(21, str6);
                }
                i++;
            }
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        String str = this.url;
        if (str != null) {
            zzon += zzecr.zzg(1, str);
        }
        String str2 = this.zzieg;
        if (str2 != null) {
            zzon += zzecr.zzg(2, str2);
        }
        zzedp[] zzedpArr = this.zziej;
        int i = 0;
        if (zzedpArr != null && zzedpArr.length > 0) {
            int i2 = zzon;
            int i3 = 0;
            while (true) {
                zzedp[] zzedpArr2 = this.zziej;
                if (i3 >= zzedpArr2.length) {
                    break;
                }
                zzedp zzedp = zzedpArr2[i3];
                if (zzedp != null) {
                    i2 += zzecr.zzb(4, zzedp);
                }
                i3++;
            }
            zzon = i2;
        }
        String[] strArr = this.zzien;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.zzien;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i4];
                if (str3 != null) {
                    i6++;
                    i5 += zzecr.zzhk(str3);
                }
                i4++;
            }
            zzon = zzon + i5 + (i6 * 1);
        }
        zzede.zzb.zzg zzg = this.zziee;
        if (!(zzg == null || zzg == null)) {
            zzon += zzecr.zzag(10, zzg.zzaf());
        }
        zzede.zzb.zza zza = this.zziei;
        if (zza != null) {
            zzon += zzdyi.zzc(12, (zzeah) zza);
        }
        String str4 = this.zziek;
        if (str4 != null) {
            zzon += zzecr.zzg(13, str4);
        }
        zzedq zzedq = this.zziel;
        if (zzedq != null) {
            zzon += zzecr.zzb(14, zzedq);
        }
        zzede.zzb.zzi zzi = this.zzies;
        if (zzi != null) {
            zzon += zzdyi.zzc(17, (zzeah) zzi);
        }
        String[] strArr3 = this.zziet;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr4 = this.zziet;
                if (i7 >= strArr4.length) {
                    break;
                }
                String str5 = strArr4[i7];
                if (str5 != null) {
                    i9++;
                    i8 += zzecr.zzhk(str5);
                }
                i7++;
            }
            zzon = zzon + i8 + (i9 * 2);
        }
        String[] strArr5 = this.zzieu;
        if (strArr5 == null || strArr5.length <= 0) {
            return zzon;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr6 = this.zzieu;
            if (i >= strArr6.length) {
                return zzon + i10 + (i11 * 2);
            }
            String str6 = strArr6[i];
            if (str6 != null) {
                i11++;
                i10 += zzecr.zzhk(str6);
            }
            i++;
        }
    }
}

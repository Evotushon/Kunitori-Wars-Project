package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzede;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzedp extends zzect<zzedp> {
    private static volatile zzedp[] zziev;
    public String url = null;
    public Integer zziew = null;
    public zzedn zziex = null;
    private zzede.zzb.zze zziey = null;
    private Integer zziez = null;
    private int[] zzifa = zzedb.zzhve;
    private String zzifb = null;
    public zzede.zzb.zzh.zza zzifc = null;
    public String[] zzifd = zzedb.zziak;

    public static zzedp[] zzbgh() {
        if (zziev == null) {
            synchronized (zzecx.zzhzz) {
                if (zziev == null) {
                    zziev = new zzedp[0];
                }
            }
        }
        return zziev;
    }

    public zzedp() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        zzecr.zzac(1, this.zziew.intValue());
        String str = this.url;
        if (str != null) {
            zzecr.zzf(2, str);
        }
        zzedn zzedn = this.zziex;
        if (zzedn != null) {
            zzecr.zza(3, (zzeda) zzedn);
        }
        int[] iArr = this.zzifa;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.zzifa;
                if (i2 >= iArr2.length) {
                    break;
                }
                zzecr.zzac(6, iArr2[i2]);
                i2++;
            }
        }
        zzede.zzb.zzh.zza zza = this.zzifc;
        if (!(zza == null || zza == null)) {
            zzecr.zzac(8, zza.zzaf());
        }
        String[] strArr = this.zzifd;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.zzifd;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    zzecr.zzf(9, str2);
                }
                i++;
            }
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int[] iArr;
        int zzon = super.zzon() + zzecr.zzag(1, this.zziew.intValue());
        String str = this.url;
        if (str != null) {
            zzon += zzecr.zzg(2, str);
        }
        zzedn zzedn = this.zziex;
        if (zzedn != null) {
            zzon += zzecr.zzb(3, zzedn);
        }
        int[] iArr2 = this.zzifa;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.zzifa;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += zzecr.zzga(iArr[i2]);
                i2++;
            }
            zzon = zzon + i3 + (iArr.length * 1);
        }
        zzede.zzb.zzh.zza zza = this.zzifc;
        if (!(zza == null || zza == null)) {
            zzon += zzecr.zzag(8, zza.zzaf());
        }
        String[] strArr = this.zzifd;
        if (strArr == null || strArr.length <= 0) {
            return zzon;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.zzifd;
            if (i >= strArr2.length) {
                return zzon + i4 + (i5 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i5++;
                i4 += zzecr.zzhk(str2);
            }
            i++;
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzede;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzedn extends zzect<zzedn> {
    private zzede.zzb.zzd.zza zzidz = null;
    public zzede.zzb.zzc[] zziea = new zzede.zzb.zzc[0];
    private byte[] zzieb = null;
    private byte[] zziec = null;
    private Integer zzied = null;

    public zzedn() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        zzede.zzb.zzc[] zzcArr = this.zziea;
        if (zzcArr != null && zzcArr.length > 0) {
            int i = 0;
            while (true) {
                zzede.zzb.zzc[] zzcArr2 = this.zziea;
                if (i >= zzcArr2.length) {
                    break;
                }
                zzede.zzb.zzc zzc = zzcArr2[i];
                if (zzc != null) {
                    zzecr.zze(2, zzc);
                }
                i++;
            }
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        zzede.zzb.zzc[] zzcArr = this.zziea;
        if (zzcArr != null && zzcArr.length > 0) {
            int i = 0;
            while (true) {
                zzede.zzb.zzc[] zzcArr2 = this.zziea;
                if (i >= zzcArr2.length) {
                    break;
                }
                zzede.zzb.zzc zzc = zzcArr2[i];
                if (zzc != null) {
                    zzon += zzdyi.zzc(2, (zzeah) zzc);
                }
                i++;
            }
        }
        return zzon;
    }
}

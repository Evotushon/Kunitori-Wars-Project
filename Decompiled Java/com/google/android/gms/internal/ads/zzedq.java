package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzede;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzedq extends zzect<zzedq> {
    public String mimeType = null;
    public zzede.zzb.zzf.zza zzife = null;
    public byte[] zziff = null;

    public zzedq() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        zzede.zzb.zzf.zza zza = this.zzife;
        if (!(zza == null || zza == null)) {
            zzecr.zzac(1, zza.zzaf());
        }
        String str = this.mimeType;
        if (str != null) {
            zzecr.zzf(2, str);
        }
        byte[] bArr = this.zziff;
        if (bArr != null) {
            zzecr.zza(3, bArr);
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        zzede.zzb.zzf.zza zza = this.zzife;
        if (!(zza == null || zza == null)) {
            zzon += zzecr.zzag(1, zza.zzaf());
        }
        String str = this.mimeType;
        if (str != null) {
            zzon += zzecr.zzg(2, str);
        }
        byte[] bArr = this.zziff;
        return bArr != null ? zzon + zzecr.zzfz(3) + zzecr.zzgh(bArr.length) + bArr.length : zzon;
    }
}

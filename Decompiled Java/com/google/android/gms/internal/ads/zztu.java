package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zztu extends zzect<zztu> {
    public Integer zzcba = null;
    public Integer zzcbb = null;
    public Integer zzcbc = null;

    public zztu() {
        this.zzhzu = null;
        this.zzhnu = -1;
    }

    public final void zza(zzecr zzecr) throws IOException {
        Integer num = this.zzcba;
        if (num != null) {
            zzecr.zzac(1, num.intValue());
        }
        Integer num2 = this.zzcbb;
        if (num2 != null) {
            zzecr.zzac(2, num2.intValue());
        }
        Integer num3 = this.zzcbc;
        if (num3 != null) {
            zzecr.zzac(3, num3.intValue());
        }
        super.zza(zzecr);
    }

    /* access modifiers changed from: protected */
    public final int zzon() {
        int zzon = super.zzon();
        Integer num = this.zzcba;
        if (num != null) {
            zzon += zzecr.zzag(1, num.intValue());
        }
        Integer num2 = this.zzcbb;
        if (num2 != null) {
            zzon += zzecr.zzag(2, num2.intValue());
        }
        Integer num3 = this.zzcbc;
        return num3 != null ? zzon + zzecr.zzag(3, num3.intValue()) : zzon;
    }
}

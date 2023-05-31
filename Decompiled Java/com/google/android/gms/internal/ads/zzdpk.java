package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdpk {
    private zzdum zzheb;

    private zzdpk(zzdum zzdum) {
        this.zzheb = zzdum;
    }

    static final zzdpk zza(zzdum zzdum) throws GeneralSecurityException {
        if (zzdum != null && zzdum.zzayw() > 0) {
            return new zzdpk(zzdum);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final zzdum zzavg() {
        return this.zzheb;
    }

    public final String toString() {
        return zzdqb.zzb(this.zzheb).toString();
    }
}

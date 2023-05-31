package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdkb {
    private final zzgb zzgxz;
    private final File zzgya;
    private final File zzgyb;
    private final File zzgyc;
    private byte[] zzgyd;

    public zzdkb(@NonNull zzgb zzgb, @NonNull File file, @NonNull File file2, @NonNull File file3) {
        this.zzgxz = zzgb;
        this.zzgya = file;
        this.zzgyb = file3;
        this.zzgyc = file2;
    }

    public final zzgb zzatn() {
        return this.zzgxz;
    }

    public final File zzato() {
        return this.zzgya;
    }

    public final File zzatp() {
        return this.zzgyb;
    }

    public final byte[] zzatq() {
        if (this.zzgyd == null) {
            this.zzgyd = zzdkd.zze(this.zzgyc);
        }
        byte[] bArr = this.zzgyd;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean zza() {
        return System.currentTimeMillis() / 1000 > this.zzgxz.zzde();
    }

    public final boolean zzff(long j) {
        return this.zzgxz.zzde() - (System.currentTimeMillis() / 1000) < 3600;
    }
}

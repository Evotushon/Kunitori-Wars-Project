package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaai {
    private final long time;
    @Nullable
    private final String zzcsv;
    @Nullable
    private final zzaai zzcsw;

    public zzaai(long j, @Nullable String str, @Nullable zzaai zzaai) {
        this.time = j;
        this.zzcsv = str;
        this.zzcsw = zzaai;
    }

    public final long getTime() {
        return this.time;
    }

    public final String zzqs() {
        return this.zzcsv;
    }

    @Nullable
    public final zzaai zzqt() {
        return this.zzcsw;
    }
}

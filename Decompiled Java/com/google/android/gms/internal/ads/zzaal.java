package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaal {
    private final Map<String, zzaai> zzctb = new HashMap();
    @Nullable
    private final zzaak zzctc;

    public zzaal(@Nullable zzaak zzaak) {
        this.zzctc = zzaak;
    }

    public final void zza(String str, zzaai zzaai) {
        this.zzctb.put(str, zzaai);
    }

    public final void zza(String str, String str2, long j) {
        zzaai zzaai;
        zzaak zzaak = this.zzctc;
        zzaai zzaai2 = this.zzctb.get(str2);
        String[] strArr = {str};
        if (!(zzaak == null || zzaai2 == null)) {
            zzaak.zza(zzaai2, j, strArr);
        }
        Map<String, zzaai> map = this.zzctb;
        zzaak zzaak2 = this.zzctc;
        if (zzaak2 == null) {
            zzaai = null;
        } else {
            zzaai = zzaak2.zzex(j);
        }
        map.put(str, zzaai);
    }

    @Nullable
    public final zzaak zzqw() {
        return this.zzctc;
    }
}

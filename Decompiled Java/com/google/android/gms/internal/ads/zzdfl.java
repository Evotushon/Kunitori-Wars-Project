package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdfl {
    private final zzazo zzblr;
    private final zzavr zzbmv;
    private final Map<String, zzdfn> zzgrh = new HashMap();
    private final Context zzyz;

    public zzdfl(Context context, zzazo zzazo, zzavr zzavr) {
        this.zzyz = context;
        this.zzblr = zzazo;
        this.zzbmv = zzavr;
    }

    public final zzdfn zzgo(@Nullable String str) {
        if (str == null) {
            return zzarf();
        }
        if (this.zzgrh.containsKey(str)) {
            return this.zzgrh.get(str);
        }
        zzdfn zzgp = zzgp(str);
        this.zzgrh.put(str, zzgp);
        return zzgp;
    }

    private final zzdfn zzarf() {
        return new zzdfn(this.zzyz, this.zzbmv.zzvk(), this.zzbmv.zzvm());
    }

    private final zzdfn zzgp(String str) {
        zzars zzab = zzars.zzab(this.zzyz);
        try {
            zzab.setAppPackageName(str);
            zzawk zzawk = new zzawk();
            zzawk.zza(this.zzyz, str, false);
            zzawl zzawl = new zzawl(this.zzbmv.zzvk(), zzawk);
            return new zzdfn(zzab, zzawl, new zzawc(zzayx.zzxk(), zzawl));
        } catch (PackageManager.NameNotFoundException unused) {
            return zzarf();
        }
    }
}

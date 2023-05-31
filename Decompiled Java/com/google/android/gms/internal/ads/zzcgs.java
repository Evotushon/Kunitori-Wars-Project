package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcgs implements zzdil {
    private final Clock zzbmz;
    private final Map<zzdig, Long> zzfvv = new HashMap();
    private final zzcgq zzfvw;
    private final Map<zzdig, zzcgv> zzfvx = new HashMap();

    public zzcgs(zzcgq zzcgq, Set<zzcgv> set, Clock clock) {
        this.zzfvw = zzcgq;
        for (zzcgv next : set) {
            this.zzfvx.put(next.zzfwb, next);
        }
        this.zzbmz = clock;
    }

    public final void zza(zzdig zzdig, String str) {
    }

    public final void zzb(zzdig zzdig, String str) {
        this.zzfvv.put(zzdig, Long.valueOf(this.zzbmz.elapsedRealtime()));
    }

    public final void zza(zzdig zzdig, String str, Throwable th) {
        if (this.zzfvv.containsKey(zzdig)) {
            long elapsedRealtime = this.zzbmz.elapsedRealtime() - this.zzfvv.get(zzdig).longValue();
            Map<String, String> zzqv = this.zzfvw.zzqv();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzqv.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.zzfvx.containsKey(zzdig)) {
            zza(zzdig, false);
        }
    }

    public final void zzc(zzdig zzdig, String str) {
        if (this.zzfvv.containsKey(zzdig)) {
            long elapsedRealtime = this.zzbmz.elapsedRealtime() - this.zzfvv.get(zzdig).longValue();
            Map<String, String> zzqv = this.zzfvw.zzqv();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzqv.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.zzfvx.containsKey(zzdig)) {
            zza(zzdig, true);
        }
    }

    private final void zza(zzdig zzdig, boolean z) {
        zzdig zzb = this.zzfvx.get(zzdig).zzfwa;
        String str = z ? "s." : "f.";
        if (this.zzfvv.containsKey(zzb)) {
            long elapsedRealtime = this.zzbmz.elapsedRealtime() - this.zzfvv.get(zzb).longValue();
            Map<String, String> zzqv = this.zzfvw.zzqv();
            String valueOf = String.valueOf(this.zzfvx.get(zzdig).label);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(elapsedRealtime));
            zzqv.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }
}

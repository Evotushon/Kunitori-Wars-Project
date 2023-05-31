package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcpc {
    /* access modifiers changed from: private */
    public final Clock zzbmz;
    private final List<String> zzgdb = Collections.synchronizedList(new ArrayList());

    public zzcpc(Clock clock) {
        this.zzbmz = clock;
    }

    public final <T> zzdof<T> zza(zzdei zzdei, zzdof<T> zzdof) {
        long elapsedRealtime = this.zzbmz.elapsedRealtime();
        String str = zzdei.zzdcu;
        if (str != null) {
            zzdnt.zza(zzdof, new zzcpf(this, str, elapsedRealtime), zzazq.zzdxp);
        }
        return zzdof;
    }

    /* access modifiers changed from: private */
    public final void zza(String str, int i, long j) {
        List<String> list = this.zzgdb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        list.add(sb.toString());
    }

    public final String zzaoh() {
        return TextUtils.join("_", this.zzgdb);
    }
}

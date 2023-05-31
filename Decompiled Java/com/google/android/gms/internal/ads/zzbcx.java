package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbcx implements Iterable<zzbcv> {
    private final List<zzbcv> zzeef = new ArrayList();

    public static boolean zzc(zzbbm zzbbm) {
        zzbcv zzd = zzd(zzbbm);
        if (zzd == null) {
            return false;
        }
        zzd.zzeee.abort();
        return true;
    }

    static zzbcv zzd(zzbbm zzbbm) {
        Iterator<zzbcv> it = zzq.zzlr().iterator();
        while (it.hasNext()) {
            zzbcv next = it.next();
            if (next.zzdza == zzbbm) {
                return next;
            }
        }
        return null;
    }

    public final void zza(zzbcv zzbcv) {
        this.zzeef.add(zzbcv);
    }

    public final void zzb(zzbcv zzbcv) {
        this.zzeef.remove(zzbcv);
    }

    public final Iterator<zzbcv> iterator() {
        return this.zzeef.iterator();
    }
}

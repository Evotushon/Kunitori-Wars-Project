package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzdex {
    public static zzdeh zza(List<zzdeh> list, zzdeh zzdeh) {
        return list.get(0);
    }

    public static zzuk zzb(Context context, List<zzdeh> list) {
        ArrayList arrayList = new ArrayList();
        for (zzdeh next : list) {
            if (next.zzgpj) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(next.width, next.height));
            }
        }
        return new zzuk(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzdeh zze(zzuk zzuk) {
        if (zzuk.zzcde) {
            return new zzdeh(-3, 0, true);
        }
        return new zzdeh(zzuk.width, zzuk.height, false);
    }
}

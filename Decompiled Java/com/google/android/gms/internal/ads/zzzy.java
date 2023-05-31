package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class zzzy {
    static List<String> zzqn() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzaax.zzi("gad:dynamite_module:experiment_id", ""));
        zza(arrayList, zzabg.zzcuj);
        zza(arrayList, zzabg.zzcuk);
        zza(arrayList, zzabg.zzcul);
        zza(arrayList, zzabg.zzcum);
        zza(arrayList, zzabg.zzcun);
        zza(arrayList, zzabg.zzcut);
        zza(arrayList, zzabg.zzcuo);
        zza(arrayList, zzabg.zzcup);
        zza(arrayList, zzabg.zzcuq);
        zza(arrayList, zzabg.zzcur);
        zza(arrayList, zzabg.zzcus);
        return arrayList;
    }

    static List<String> zzqo() {
        ArrayList arrayList = new ArrayList();
        zza(arrayList, zzabq.zzcvq);
        return arrayList;
    }

    private static void zza(List<String> list, zzaax<String> zzaax) {
        String str = zzaax.get();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}

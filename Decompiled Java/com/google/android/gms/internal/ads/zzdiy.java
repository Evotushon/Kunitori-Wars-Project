package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final /* synthetic */ class zzdiy implements Continuation {
    private final int zzdul;
    private final zzbm.zza.C0002zza zzgwq;

    zzdiy(zzbm.zza.C0002zza zza, int i) {
        this.zzgwq = zza;
        this.zzdul = i;
    }

    public final Object then(Task task) {
        zzbm.zza.C0002zza zza = this.zzgwq;
        int i = this.zzdul;
        if (!task.isSuccessful()) {
            return false;
        }
        zzsw zzf = ((zzss) task.getResult()).zzf(((zzbm.zza) ((zzdyz) zza.zzbcx())).toByteArray());
        zzf.zzbr(i);
        zzf.zzdt();
        return true;
    }
}

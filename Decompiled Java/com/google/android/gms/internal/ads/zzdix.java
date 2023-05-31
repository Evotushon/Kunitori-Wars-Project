package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzbm;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
public final class zzdix {
    private final Executor executor;
    private final Task<zzss> zzgwp;
    private final Context zzur;

    public static zzdix zza(@NonNull Context context, @NonNull Executor executor2) {
        return new zzdix(context, executor2, Tasks.call(executor2, new zzdiz(context)));
    }

    private zzdix(@NonNull Context context, @NonNull Executor executor2, @NonNull Task<zzss> task) {
        this.zzur = context;
        this.executor = executor2;
        this.zzgwp = task;
    }

    public final Task<Boolean> zzg(int i, long j) {
        return zza(i, j, (Exception) null, (String) null, (Map<String, String>) null);
    }

    public final Task<Boolean> zza(int i, long j, Exception exc) {
        return zza(i, j, exc, (String) null, (Map<String, String>) null);
    }

    public final Task<Boolean> zza(int i, long j, String str, Map<String, String> map) {
        return zza(i, j, (Exception) null, str, (Map<String, String>) null);
    }

    private final Task<Boolean> zza(int i, long j, Exception exc, String str, Map<String, String> map) {
        zzbm.zza.C0002zza zzc = zzbm.zza.zzt().zzi(this.zzur.getPackageName()).zzc(j);
        if (exc != null) {
            zzc.zzj(zzdlj.zza(exc)).zzk(exc.getClass().getName());
        }
        if (str != null) {
            zzc.zzm(str);
        }
        if (map != null) {
            for (String next : map.keySet()) {
                zzc.zza(zzbm.zza.zzb.zzv().zzs(next).zzt(map.get(next)));
            }
        }
        return this.zzgwp.continueWith(this.executor, new zzdiy(zzc, i));
    }
}

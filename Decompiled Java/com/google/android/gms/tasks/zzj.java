package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
final class zzj<TResult> implements zzq<TResult> {
    private final Executor zza;
    /* access modifiers changed from: private */
    public final Object zzb = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public OnCompleteListener<TResult> zzc;

    public zzj(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.zza = executor;
        this.zzc = onCompleteListener;
    }

    public final void zza(@NonNull Task<TResult> task) {
        synchronized (this.zzb) {
            if (this.zzc != null) {
                this.zza.execute(new zzi(this, task));
            }
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzc = null;
        }
    }
}

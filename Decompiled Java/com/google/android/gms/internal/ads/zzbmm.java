package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzbmm extends zzblg {
    private final Executor zzfeo;
    private final zzael zzfhb;
    private final Runnable zzfhc;

    public zzbmm(zzbne zzbne, zzael zzael, Runnable runnable, Executor executor) {
        super(zzbne);
        this.zzfhb = zzael;
        this.zzfhc = runnable;
        this.zzfeo = executor;
    }

    public final zzxj getVideoController() {
        return null;
    }

    public final void zza(ViewGroup viewGroup, zzuk zzuk) {
    }

    public final zzdeh zzagl() {
        return null;
    }

    public final View zzagm() {
        return null;
    }

    public final int zzagr() {
        return 0;
    }

    public final void zzkd() {
    }

    @WorkerThread
    public final void zzags() {
        this.zzfeo.execute(new zzbmo(this, new zzbmp(new AtomicReference(this.zzfhc))));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Runnable runnable) {
        try {
            if (!this.zzfhb.zzm(ObjectWrapper.wrap(runnable))) {
                runnable.run();
            }
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}

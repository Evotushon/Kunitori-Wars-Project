package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
abstract class zzdna<InputT, OutputT> extends zzdnd<OutputT> {
    private static final Logger logger = Logger.getLogger(zzdna.class.getName());
    /* access modifiers changed from: private */
    @NullableDecl
    public zzdlq<? extends zzdof<? extends InputT>> zzhce;
    private final boolean zzhcf;
    private final boolean zzhcg;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    enum zza {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    zzdna(zzdlq<? extends zzdof<? extends InputT>> zzdlq, boolean z, boolean z2) {
        super(zzdlq.size());
        this.zzhce = (zzdlq) zzdlg.checkNotNull(zzdlq);
        this.zzhcf = z;
        this.zzhcg = z2;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzaun();

    /* access modifiers changed from: package-private */
    public abstract void zzb(int i, @NullableDecl InputT inputt);

    /* access modifiers changed from: protected */
    public final void afterDone() {
        super.afterDone();
        zzdlq<? extends zzdof<? extends InputT>> zzdlq = this.zzhce;
        zza(zza.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zzdlq != null)) {
            boolean wasInterrupted = wasInterrupted();
            zzdmm zzdmm = (zzdmm) zzdlq.iterator();
            while (zzdmm.hasNext()) {
                ((Future) zzdmm.next()).cancel(wasInterrupted);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String pendingToString() {
        zzdlq<? extends zzdof<? extends InputT>> zzdlq = this.zzhce;
        if (zzdlq == null) {
            return super.pendingToString();
        }
        String valueOf = String.valueOf(zzdlq);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzaum() {
        if (this.zzhce.isEmpty()) {
            zzaun();
        } else if (this.zzhcf) {
            int i = 0;
            zzdmm zzdmm = (zzdmm) this.zzhce.iterator();
            while (zzdmm.hasNext()) {
                zzdof zzdof = (zzdof) zzdmm.next();
                zzdof.addListener(new zzdmz(this, zzdof, i), zzdnm.INSTANCE);
                i++;
            }
        } else {
            zzdnb zzdnb = new zzdnb(this, this.zzhcg ? this.zzhce : null);
            zzdmm zzdmm2 = (zzdmm) this.zzhce.iterator();
            while (zzdmm2.hasNext()) {
                ((zzdof) zzdmm2.next()).addListener(zzdnb, zzdnm.INSTANCE);
            }
        }
    }

    private final void zzi(Throwable th) {
        zzdlg.checkNotNull(th);
        if (this.zzhcf && !setException(th) && zza(zzauo(), th)) {
            zzj(th);
        } else if (th instanceof Error) {
            zzj(th);
        }
    }

    private static void zzj(Throwable th) {
        logger.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* access modifiers changed from: package-private */
    public final void zzh(Set<Throwable> set) {
        zzdlg.checkNotNull(set);
        if (!isCancelled()) {
            zza(set, zzauj());
        }
    }

    /* access modifiers changed from: private */
    public final void zza(int i, Future<? extends InputT> future) {
        try {
            zzb(i, zzdnt.zza(future));
        } catch (ExecutionException e) {
            zzi(e.getCause());
        } catch (Throwable th) {
            zzi(th);
        }
    }

    /* access modifiers changed from: private */
    public final void zza(@NullableDecl zzdlq<? extends Future<? extends InputT>> zzdlq) {
        int zzaup = zzaup();
        int i = 0;
        if (!(zzaup >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        } else if (zzaup == 0) {
            if (zzdlq != null) {
                zzdmm zzdmm = (zzdmm) zzdlq.iterator();
                while (zzdmm.hasNext()) {
                    Future future = (Future) zzdmm.next();
                    if (!future.isCancelled()) {
                        zza(i, future);
                    }
                    i++;
                }
            }
            zzauq();
            zzaun();
            zza(zza.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    /* access modifiers changed from: package-private */
    public void zza(zza zza2) {
        zzdlg.checkNotNull(zza2);
        this.zzhce = null;
    }

    private static boolean zza(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }
}

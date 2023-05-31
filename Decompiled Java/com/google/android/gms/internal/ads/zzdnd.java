package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmt;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
abstract class zzdnd<OutputT> extends zzdmt.zzj<OutputT> {
    private static final Logger zzhbm = Logger.getLogger(zzdnd.class.getName());
    private static final zzb zzhcl;
    private volatile int remaining;
    /* access modifiers changed from: private */
    public volatile Set<Throwable> seenExceptions = null;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static abstract class zzb {
        private zzb() {
        }

        /* access modifiers changed from: package-private */
        public abstract void zza(zzdnd zzdnd, Set<Throwable> set, Set<Throwable> set2);

        /* access modifiers changed from: package-private */
        public abstract int zzc(zzdnd zzdnd);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzc extends zzb {
        private zzc() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzdnd zzdnd, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (zzdnd) {
                if (zzdnd.seenExceptions == null) {
                    Set unused = zzdnd.seenExceptions = set2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final int zzc(zzdnd zzdnd) {
            int zzb;
            synchronized (zzdnd) {
                zzb = zzdnd.zzb(zzdnd);
            }
            return zzb;
        }
    }

    zzdnd(int i) {
        this.remaining = i;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzh(Set<Throwable> set);

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zza extends zzb {
        private final AtomicReferenceFieldUpdater<zzdnd, Set<Throwable>> zzhcm;
        private final AtomicIntegerFieldUpdater<zzdnd> zzhcn;

        zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.zzhcm = atomicReferenceFieldUpdater;
            this.zzhcn = atomicIntegerFieldUpdater;
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzdnd zzdnd, Set<Throwable> set, Set<Throwable> set2) {
            this.zzhcm.compareAndSet(zzdnd, (Object) null, set2);
        }

        /* access modifiers changed from: package-private */
        public final int zzc(zzdnd zzdnd) {
            return this.zzhcn.decrementAndGet(zzdnd);
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<Throwable> zzauo() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzh(newSetFromMap);
        zzhcl.zza(this, (Set<Throwable>) null, newSetFromMap);
        return this.seenExceptions;
    }

    /* access modifiers changed from: package-private */
    public final int zzaup() {
        return zzhcl.zzc(this);
    }

    /* access modifiers changed from: package-private */
    public final void zzauq() {
        this.seenExceptions = null;
    }

    static /* synthetic */ int zzb(zzdnd zzdnd) {
        int i = zzdnd.remaining - 1;
        zzdnd.remaining = i;
        return i;
    }

    static {
        Throwable th;
        zzb zzb2;
        try {
            zzb2 = new zza(AtomicReferenceFieldUpdater.newUpdater(zzdnd.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzdnd.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzb2 = new zzc();
        }
        zzhcl = zzb2;
        if (th != null) {
            zzhbm.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}

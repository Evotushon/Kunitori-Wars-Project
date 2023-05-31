package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzdmt<V> extends zzdow implements zzdof<V> {
    /* access modifiers changed from: private */
    public static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Object NULL = new Object();
    private static final Logger zzhbm = Logger.getLogger(zzdmt.class.getName());
    /* access modifiers changed from: private */
    public static final zza zzhbn;
    /* access modifiers changed from: private */
    @NullableDecl
    public volatile zzd listeners;
    /* access modifiers changed from: private */
    @NullableDecl
    public volatile Object value;
    /* access modifiers changed from: private */
    @NullableDecl
    public volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static abstract class zza {
        private zza() {
        }

        /* access modifiers changed from: package-private */
        public abstract void zza(zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract void zza(zzk zzk, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean zza(zzdmt<?> zzdmt, zzd zzd, zzd zzd2);

        /* access modifiers changed from: package-private */
        public abstract boolean zza(zzdmt<?> zzdmt, zzk zzk, zzk zzk2);

        /* access modifiers changed from: package-private */
        public abstract boolean zza(zzdmt<?> zzdmt, Object obj, Object obj2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzb {
        static final zzb zzhbo = new zzb(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable exception;

        zzb(Throwable th) {
            this.exception = (Throwable) zzdlg.checkNotNull(th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzd {
        static final zzd zzhbr = new zzd((Runnable) null, (Executor) null);
        final Executor executor;
        @NullableDecl
        zzd next;
        final Runnable task;

        zzd(Runnable runnable, Executor executor2) {
            this.task = runnable;
            this.executor = executor2;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    interface zzg<V> extends zzdof<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzh extends zza {
        private zzh() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, Thread thread) {
            zzk.thread = thread;
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, zzk zzk2) {
            zzk.next = zzk2;
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, zzk zzk, zzk zzk2) {
            synchronized (zzdmt) {
                if (zzdmt.waiters != zzk) {
                    return false;
                }
                zzk unused = zzdmt.waiters = zzk2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, zzd zzd, zzd zzd2) {
            synchronized (zzdmt) {
                if (zzdmt.listeners != zzd) {
                    return false;
                }
                zzd unused = zzdmt.listeners = zzd2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, Object obj, Object obj2) {
            synchronized (zzdmt) {
                if (zzdmt.value != obj) {
                    return false;
                }
                Object unused = zzdmt.value = obj2;
                return true;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzi extends zza {
        static final Unsafe zzhbt;
        static final long zzhbu;
        static final long zzhbv;
        static final long zzhbw;
        static final long zzhbx;
        static final long zzhby;

        private zzi() {
            super();
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, Thread thread) {
            zzhbt.putObject(zzk, zzhbx, thread);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, zzk zzk2) {
            zzhbt.putObject(zzk, zzhby, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, zzk zzk, zzk zzk2) {
            return zzhbt.compareAndSwapObject(zzdmt, zzhbv, zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, zzd zzd, zzd zzd2) {
            return zzhbt.compareAndSwapObject(zzdmt, zzhbu, zzd, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, Object obj, Object obj2) {
            return zzhbt.compareAndSwapObject(zzdmt, zzhbw, obj, obj2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.android.gms.internal.ads.zzdmt.zzi.AnonymousClass1());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                goto L_0x0010
            L_0x0005:
                com.google.android.gms.internal.ads.zzdmt$zzi$1 r0 = new com.google.android.gms.internal.ads.zzdmt$zzi$1     // Catch:{ PrivilegedActionException -> 0x005f }
                r0.<init>()     // Catch:{ PrivilegedActionException -> 0x005f }
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x005f }
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x005f }
            L_0x0010:
                java.lang.Class<com.google.android.gms.internal.ads.zzdmt> r1 = com.google.android.gms.internal.ads.zzdmt.class
                java.lang.String r2 = "waiters"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                zzhbv = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "listeners"
                java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r2 = r0.objectFieldOffset(r2)     // Catch:{ Exception -> 0x0055 }
                zzhbu = r2     // Catch:{ Exception -> 0x0055 }
                java.lang.String r2 = "value"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                zzhbw = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzdmt$zzk> r1 = com.google.android.gms.internal.ads.zzdmt.zzk.class
                java.lang.String r2 = "thread"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                zzhbx = r1     // Catch:{ Exception -> 0x0055 }
                java.lang.Class<com.google.android.gms.internal.ads.zzdmt$zzk> r1 = com.google.android.gms.internal.ads.zzdmt.zzk.class
                java.lang.String r2 = "next"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0055 }
                long r1 = r0.objectFieldOffset(r1)     // Catch:{ Exception -> 0x0055 }
                zzhby = r1     // Catch:{ Exception -> 0x0055 }
                zzhbt = r0     // Catch:{ Exception -> 0x0055 }
                return
            L_0x0055:
                r0 = move-exception
                com.google.android.gms.internal.ads.zzdlj.zzg(r0)
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            L_0x005f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r0 = r0.getCause()
                java.lang.String r2 = "Could not initialize intrinsics"
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmt.zzi.<clinit>():void");
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static abstract class zzj<V> extends zzdmt<V> implements zzg<V> {
        zzj() {
        }

        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return zzdmt.super.get(j, timeUnit);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzk {
        static final zzk zzhbz = new zzk(false);
        @NullableDecl
        volatile zzk next;
        @NullableDecl
        volatile Thread thread;

        private zzk(boolean z) {
        }

        zzk() {
            zzdmt.zzhbn.zza(this, Thread.currentThread());
        }

        /* access modifiers changed from: package-private */
        public final void zzb(zzk zzk) {
            zzdmt.zzhbn.zza(this, zzk);
        }
    }

    private final void zza(zzk zzk2) {
        zzk2.thread = null;
        while (true) {
            zzk zzk3 = this.waiters;
            if (zzk3 != zzk.zzhbz) {
                zzk zzk4 = null;
                while (zzk3 != null) {
                    zzk zzk5 = zzk3.next;
                    if (zzk3.thread != null) {
                        zzk4 = zzk3;
                    } else if (zzk4 != null) {
                        zzk4.next = zzk5;
                        if (zzk4.thread == null) {
                        }
                    } else if (zzhbn.zza((zzdmt<?>) this, zzk3, zzk5)) {
                    }
                    zzk3 = zzk5;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    public void afterDone() {
    }

    /* access modifiers changed from: protected */
    public void interruptTask() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzc {
        static final zzc zzhbp;
        static final zzc zzhbq;
        @NullableDecl
        final Throwable cause;
        final boolean wasInterrupted;

        zzc(boolean z, @NullableDecl Throwable th) {
            this.wasInterrupted = z;
            this.cause = th;
        }

        static {
            if (zzdmt.GENERATE_CANCELLATION_CAUSES) {
                zzhbq = null;
                zzhbp = null;
                return;
            }
            zzhbq = new zzc(false, (Throwable) null);
            zzhbp = new zzc(true, (Throwable) null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zze<V> implements Runnable {
        final zzdof<? extends V> future;
        final zzdmt<V> zzhbs;

        zze(zzdmt<V> zzdmt, zzdof<? extends V> zzdof) {
            this.zzhbs = zzdmt;
            this.future = zzdof;
        }

        public final void run() {
            if (this.zzhbs.value == this) {
                if (zzdmt.zzhbn.zza((zzdmt<?>) this.zzhbs, (Object) this, zzdmt.getFutureValue(this.future))) {
                    zzdmt.zza((zzdmt<?>) this.zzhbs);
                }
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
    static final class zzf extends zza {
        final AtomicReferenceFieldUpdater<zzdmt, zzd> listenersUpdater;
        final AtomicReferenceFieldUpdater<zzdmt, Object> valueUpdater;
        final AtomicReferenceFieldUpdater<zzk, zzk> waiterNextUpdater;
        final AtomicReferenceFieldUpdater<zzk, Thread> waiterThreadUpdater;
        final AtomicReferenceFieldUpdater<zzdmt, zzk> waitersUpdater;

        zzf(AtomicReferenceFieldUpdater<zzk, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzk, zzk> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzdmt, zzk> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzdmt, zzd> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzdmt, Object> atomicReferenceFieldUpdater5) {
            super();
            this.waiterThreadUpdater = atomicReferenceFieldUpdater;
            this.waiterNextUpdater = atomicReferenceFieldUpdater2;
            this.waitersUpdater = atomicReferenceFieldUpdater3;
            this.listenersUpdater = atomicReferenceFieldUpdater4;
            this.valueUpdater = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, Thread thread) {
            this.waiterThreadUpdater.lazySet(zzk, thread);
        }

        /* access modifiers changed from: package-private */
        public final void zza(zzk zzk, zzk zzk2) {
            this.waiterNextUpdater.lazySet(zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, zzk zzk, zzk zzk2) {
            return this.waitersUpdater.compareAndSet(zzdmt, zzk, zzk2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, zzd zzd, zzd zzd2) {
            return this.listenersUpdater.compareAndSet(zzdmt, zzd, zzd2);
        }

        /* access modifiers changed from: package-private */
        public final boolean zza(zzdmt<?> zzdmt, Object obj, Object obj2) {
            return this.valueUpdater.compareAndSet(zzdmt, obj, obj2);
        }
    }

    protected zzdmt() {
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if ((obj != null) && (!(obj instanceof zze))) {
                return zzai(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                zzk zzk2 = this.waiters;
                if (zzk2 != zzk.zzhbz) {
                    zzk zzk3 = new zzk();
                    do {
                        zzk3.zzb(zzk2);
                        if (zzhbn.zza((zzdmt<?>) this, zzk2, zzk3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) && (!(obj2 instanceof zze))) {
                                        return zzai(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zza(zzk3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zza(zzk3);
                        } else {
                            zzk2 = this.waiters;
                        }
                    } while (zzk2 != zzk.zzhbz);
                }
                return zzai(this.value);
            }
            while (nanos > 0) {
                Object obj3 = this.value;
                if ((obj3 != null) && (!(obj3 instanceof zze))) {
                    return zzai(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String zzdmt = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzdmt).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(zzdmt);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zze))) {
                return zzai(obj2);
            }
            zzk zzk2 = this.waiters;
            if (zzk2 != zzk.zzhbz) {
                zzk zzk3 = new zzk();
                do {
                    zzk3.zzb(zzk2);
                    if (zzhbn.zza((zzdmt<?>) this, zzk2, zzk3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zza(zzk3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zze))));
                        return zzai(obj);
                    }
                    zzk2 = this.waiters;
                } while (zzk2 != zzk.zzhbz);
            }
            return zzai(this.value);
        }
        throw new InterruptedException();
    }

    private static V zzai(Object obj) throws ExecutionException {
        if (obj instanceof zzc) {
            Throwable th = ((zzc) obj).cause;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzb) {
            throw new ExecutionException(((zzb) obj).exception);
        } else if (obj == NULL) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        Object obj = this.value;
        boolean z = true;
        boolean z2 = obj != null;
        if (obj instanceof zze) {
            z = false;
        }
        return z2 & z;
    }

    public boolean isCancelled() {
        return this.value instanceof zzc;
    }

    public boolean cancel(boolean z) {
        zzc zzc2;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof zze)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            zzc2 = new zzc(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            zzc2 = zzc.zzhbp;
        } else {
            zzc2 = zzc.zzhbq;
        }
        boolean z2 = false;
        Object obj2 = obj;
        zzdmt zzdmt = this;
        while (true) {
            if (zzhbn.zza((zzdmt<?>) zzdmt, obj2, (Object) zzc2)) {
                if (z) {
                    zzdmt.interruptTask();
                }
                zza((zzdmt<?>) zzdmt);
                if (!(obj2 instanceof zze)) {
                    return true;
                }
                zzdof<? extends V> zzdof = ((zze) obj2).future;
                if (zzdof instanceof zzg) {
                    zzdmt = (zzdmt) zzdof;
                    obj2 = zzdmt.value;
                    if (!(obj2 == null) && !(obj2 instanceof zze)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    zzdof.cancel(z);
                    return true;
                }
            } else {
                obj2 = zzdmt.value;
                if (!(obj2 instanceof zze)) {
                    return z2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof zzc) && ((zzc) obj).wasInterrupted;
    }

    public void addListener(Runnable runnable, Executor executor) {
        zzd zzd2;
        zzdlg.checkNotNull(runnable, "Runnable was null.");
        zzdlg.checkNotNull(executor, "Executor was null.");
        if (isDone() || (zzd2 = this.listeners) == zzd.zzhbr) {
            zza(runnable, executor);
        }
        zzd zzd3 = new zzd(runnable, executor);
        do {
            zzd3.next = zzd2;
            if (!zzhbn.zza((zzdmt<?>) this, zzd2, zzd3)) {
                zzd2 = this.listeners;
            } else {
                return;
            }
        } while (zzd2 != zzd.zzhbr);
        zza(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public boolean set(@NullableDecl V v) {
        if (v == null) {
            v = NULL;
        }
        if (!zzhbn.zza((zzdmt<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        zza((zzdmt<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setException(Throwable th) {
        if (!zzhbn.zza((zzdmt<?>) this, (Object) null, (Object) new zzb((Throwable) zzdlg.checkNotNull(th)))) {
            return false;
        }
        zza((zzdmt<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFuture(zzdof<? extends V> zzdof) {
        zze zze2;
        zzb zzb2;
        zzdlg.checkNotNull(zzdof);
        Object obj = this.value;
        if (obj == null) {
            if (zzdof.isDone()) {
                if (!zzhbn.zza((zzdmt<?>) this, (Object) null, getFutureValue(zzdof))) {
                    return false;
                }
                zza((zzdmt<?>) this);
                return true;
            }
            zze2 = new zze(this, zzdof);
            if (zzhbn.zza((zzdmt<?>) this, (Object) null, (Object) zze2)) {
                try {
                    zzdof.addListener(zze2, zzdnm.INSTANCE);
                } catch (Throwable unused) {
                    zzb2 = zzb.zzhbo;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzc) {
            zzdof.cancel(((zzc) obj).wasInterrupted);
        }
        return false;
        zzhbn.zza((zzdmt<?>) this, (Object) zze2, (Object) zzb2);
        return true;
    }

    /* access modifiers changed from: private */
    public static Object getFutureValue(zzdof<?> zzdof) {
        Throwable zza2;
        if (zzdof instanceof zzg) {
            Object obj = ((zzdmt) zzdof).value;
            if (!(obj instanceof zzc)) {
                return obj;
            }
            zzc zzc2 = (zzc) obj;
            if (!zzc2.wasInterrupted) {
                return obj;
            }
            if (zzc2.cause != null) {
                return new zzc(false, zzc2.cause);
            }
            return zzc.zzhbq;
        } else if ((zzdof instanceof zzdow) && (zza2 = zzdoz.zza((zzdow) zzdof)) != null) {
            return new zzb(zza2);
        } else {
            boolean isCancelled = zzdof.isCancelled();
            if ((!GENERATE_CANCELLATION_CAUSES) && isCancelled) {
                return zzc.zzhbq;
            }
            try {
                Object uninterruptibly = getUninterruptibly(zzdof);
                if (!isCancelled) {
                    return uninterruptibly == null ? NULL : uninterruptibly;
                }
                String valueOf = String.valueOf(zzdof);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzc(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new zzb(e.getCause());
                }
                String valueOf2 = String.valueOf(zzdof);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new zzc(false, new IllegalArgumentException(sb2.toString(), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new zzc(false, e2);
                }
                String valueOf3 = String.valueOf(zzdof);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new zzb(new IllegalArgumentException(sb3.toString(), e2));
            } catch (Throwable th) {
                return new zzb(th);
            }
        }
    }

    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* access modifiers changed from: private */
    public static void zza(zzdmt<?> zzdmt) {
        zzdmt<V> zzdmt2;
        zzd zzd2;
        zzd zzd3;
        zzd zzd4 = null;
        zzdmt<?> zzdmt3 = zzdmt;
        while (true) {
            zzk zzk2 = zzdmt3.waiters;
            if (zzhbn.zza(zzdmt3, zzk2, zzk.zzhbz)) {
                while (zzk2 != null) {
                    Thread thread = zzk2.thread;
                    if (thread != null) {
                        zzk2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzk2 = zzk2.next;
                }
                zzdmt3.afterDone();
                do {
                    zzd2 = zzdmt3.listeners;
                } while (!zzhbn.zza(zzdmt3, zzd2, zzd.zzhbr));
                while (true) {
                    zzd3 = zzd4;
                    zzd4 = zzd2;
                    if (zzd4 == null) {
                        break;
                    }
                    zzd2 = zzd4.next;
                    zzd4.next = zzd3;
                }
                while (zzd3 != null) {
                    zzd4 = zzd3.next;
                    Runnable runnable = zzd3.task;
                    if (runnable instanceof zze) {
                        zze zze2 = (zze) runnable;
                        zzdmt<V> zzdmt4 = zze2.zzhbs;
                        if (zzdmt4.value == zze2) {
                            if (zzhbn.zza((zzdmt<?>) zzdmt4, (Object) zze2, getFutureValue(zze2.future))) {
                                zzdmt2 = zzdmt4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        zza(runnable, zzd3.executor);
                    }
                    zzd3 = zzd4;
                }
                return;
            }
            zzdmt2 = zzdmt3;
            zzdmt3 = zzdmt2;
        }
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public final Throwable zzauj() {
        if (!(this instanceof zzg)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzb) {
            return ((zzb) obj).exception;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void maybePropagateCancellationTo(@NullableDecl Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zza(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.value;
            if (obj instanceof zze) {
                sb.append(", setFuture=[");
                zza(sb, (Object) ((zze) obj).future);
                sb.append("]");
            } else {
                try {
                    str = zzdlh.emptyToNull(pendingToString());
                } catch (RuntimeException | StackOverflowError e) {
                    String valueOf = String.valueOf(e.getClass());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(valueOf);
                    str = sb2.toString();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zza(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @NullableDecl
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    private final void zza(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            zza(sb, uninterruptibly);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zza(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    private static void zza(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzhbm;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    static {
        Throwable th;
        Throwable th2;
        zza zza2;
        try {
            zza2 = new zzi();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th;
            th2 = th3;
            zza2 = new zzh();
        }
        zzhbn = zza2;
        if (th2 != null) {
            zzhbm.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            zzhbm.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }
}

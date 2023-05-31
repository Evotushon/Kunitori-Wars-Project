package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zadr = new zao();
    @KeepName
    private zaa mResultGuardian;
    private Status mStatus;
    /* access modifiers changed from: private */
    public R zacm;
    private final Object zads;
    private final CallbackHandler<R> zadt;
    private final WeakReference<GoogleApiClient> zadu;
    private final CountDownLatch zadv;
    private final ArrayList<PendingResult.StatusListener> zadw;
    private ResultCallback<? super R> zadx;
    private final AtomicReference<zacs> zady;
    private volatile boolean zadz;
    private boolean zaea;
    private boolean zaeb;
    private ICancelToken zaec;
    private volatile zacn<R> zaed;
    private boolean zaee;

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private final class zaa {
        private zaa() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.zab(BasePendingResult.this.zacm);
            super.finalize();
        }

        /* synthetic */ zaa(BasePendingResult basePendingResult, zao zao) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zads = new Object();
        this.zadv = new CountDownLatch(1);
        this.zadw = new ArrayList<>();
        this.zady = new AtomicReference<>();
        this.zaee = false;
        this.zadt = new CallbackHandler<>(Looper.getMainLooper());
        this.zadu = new WeakReference<>((Object) null);
    }

    /* access modifiers changed from: private */
    public static <R extends Result> ResultCallback<R> zaa(ResultCallback<R> resultCallback) {
        return resultCallback;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    public abstract R createFailedResult(Status status);

    public final Integer zal() {
        return null;
    }

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static class CallbackHandler<R extends Result> extends zap {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public final void zaa(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(BasePendingResult.zaa(resultCallback), r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.zab(result);
                    throw e;
                }
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).zab(Status.RESULT_TIMEOUT);
            }
        }
    }

    @KeepForSdk
    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.zads = new Object();
        this.zadv = new CountDownLatch(1);
        this.zadw = new ArrayList<>();
        this.zady = new AtomicReference<>();
        this.zaee = false;
        this.zadt = new CallbackHandler<>(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zadu = new WeakReference<>(googleApiClient);
    }

    @KeepForSdk
    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.zads = new Object();
        this.zadv = new CountDownLatch(1);
        this.zadw = new ArrayList<>();
        this.zady = new AtomicReference<>();
        this.zaee = false;
        this.zadt = new CallbackHandler<>(looper);
        this.zadu = new WeakReference<>((Object) null);
    }

    @KeepForSdk
    @VisibleForTesting
    protected BasePendingResult(@NonNull CallbackHandler<R> callbackHandler) {
        this.zads = new Object();
        this.zadv = new CountDownLatch(1);
        this.zadw = new ArrayList<>();
        this.zady = new AtomicReference<>();
        this.zaee = false;
        this.zadt = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadu = new WeakReference<>((Object) null);
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.zadv.getCount() == 0;
    }

    public final R await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.zadz, "Result has already been consumed");
        if (this.zaed != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.zadv.await();
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.zadz, "Result has already been consumed.");
        if (this.zaed != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if (!this.zadv.await(j, timeUnit)) {
                zab(Status.RESULT_TIMEOUT);
            }
        } catch (InterruptedException unused) {
            zab(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zads
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.zadx = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.zadz     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.zacn<R> r1 = r5.zaed     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.isReady()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r1 = r5.zadt     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.Result r2 = r5.get()     // Catch:{ all -> 0x003f }
            r1.zaa(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.zadx = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r6, long r7, java.util.concurrent.TimeUnit r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.zads
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.zadx = r6     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x000a:
            boolean r1 = r5.zadz     // Catch:{ all -> 0x004d }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.internal.zacn<R> r1 = r5.zaed     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r1)     // Catch:{ all -> 0x004d }
            boolean r1 = r5.isCanceled()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x002b:
            boolean r1 = r5.isReady()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r7 = r5.zadt     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.Result r8 = r5.get()     // Catch:{ all -> 0x004d }
            r7.zaa(r6, r8)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x003b:
            r5.zadx = r6     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler<R> r6 = r5.zadt     // Catch:{ all -> 0x004d }
            long r7 = r9.toMillis(r7)     // Catch:{ all -> 0x004d }
            r9 = 2
            android.os.Message r9 = r6.obtainMessage(r9, r5)     // Catch:{ all -> 0x004d }
            r6.sendMessageDelayed(r9, r7)     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
    }

    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zads) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zadw.add(statusListener);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zads
            monitor-enter(r0)
            boolean r1 = r2.zaea     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.zadz     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zaec     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.ICancelToken r1 = r2.zaec     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.zacm     // Catch:{ all -> 0x002a }
            zab((com.google.android.gms.common.api.Result) r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.zaea = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Result r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x002a }
            r2.zaa(r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public final boolean zar() {
        boolean isCanceled;
        synchronized (this.zads) {
            if (((GoogleApiClient) this.zadu.get()) == null || !this.zaee) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zads) {
            z = this.zaea;
        }
        return z;
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        TransformedResult<S> then;
        Preconditions.checkState(!this.zadz, "Result has already been consumed.");
        synchronized (this.zads) {
            boolean z = false;
            Preconditions.checkState(this.zaed == null, "Cannot call then() twice.");
            Preconditions.checkState(this.zadx == null, "Cannot call then() if callbacks are set.");
            if (!this.zaea) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if result was canceled.");
            this.zaee = true;
            this.zaed = new zacn<>(this.zadu);
            then = this.zaed.then(resultTransform);
            if (isReady()) {
                this.zadt.zaa(this.zaed, get());
            } else {
                this.zadx = this.zaed;
            }
        }
        return then;
    }

    @KeepForSdk
    public final void setResult(R r) {
        synchronized (this.zads) {
            if (this.zaeb || this.zaea) {
                zab((Result) r);
                return;
            }
            isReady();
            boolean z = true;
            Preconditions.checkState(!isReady(), "Results have already been set");
            if (this.zadz) {
                z = false;
            }
            Preconditions.checkState(z, "Result has already been consumed");
            zaa(r);
        }
    }

    public final void zab(Status status) {
        synchronized (this.zads) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zaeb = true;
            }
        }
    }

    public final void zaa(zacs zacs) {
        this.zady.set(zacs);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zads) {
            this.zaec = iCancelToken;
        }
    }

    public final void zas() {
        this.zaee = this.zaee || zadr.get().booleanValue();
    }

    private final R get() {
        R r;
        synchronized (this.zads) {
            Preconditions.checkState(!this.zadz, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zacm;
            this.zacm = null;
            this.zadx = null;
            this.zadz = true;
        }
        zacs andSet = this.zady.getAndSet((Object) null);
        if (andSet != null) {
            andSet.zac(this);
        }
        return r;
    }

    private final void zaa(R r) {
        this.zacm = r;
        this.zaec = null;
        this.zadv.countDown();
        this.mStatus = this.zacm.getStatus();
        if (this.zaea) {
            this.zadx = null;
        } else if (this.zadx != null) {
            this.zadt.removeMessages(2);
            this.zadt.zaa(this.zadx, get());
        } else if (this.zacm instanceof Releasable) {
            this.mResultGuardian = new zaa(this, (zao) null);
        }
        ArrayList arrayList = this.zadw;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((PendingResult.StatusListener) obj).onComplete(this.mStatus);
        }
        this.zadw.clear();
    }

    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }
}

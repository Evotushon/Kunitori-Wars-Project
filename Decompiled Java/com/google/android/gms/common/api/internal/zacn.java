package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zacn<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* access modifiers changed from: private */
    public final Object zads = new Object();
    /* access modifiers changed from: private */
    public final WeakReference<GoogleApiClient> zadu;
    /* access modifiers changed from: private */
    public ResultTransform<? super R, ? extends Result> zakv = null;
    /* access modifiers changed from: private */
    public zacn<? extends Result> zakw = null;
    private volatile ResultCallbacks<? super R> zakx = null;
    private PendingResult<R> zaky = null;
    private Status zakz = null;
    /* access modifiers changed from: private */
    public final zacp zala;
    private boolean zalb = false;

    public zacn(WeakReference<GoogleApiClient> weakReference) {
        Preconditions.checkNotNull(weakReference, "GoogleApiClient reference must not be null");
        this.zadu = weakReference;
        GoogleApiClient googleApiClient = (GoogleApiClient) this.zadu.get();
        this.zala = new zacp(this, googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
    }

    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        zacn<? extends Result> zacn;
        synchronized (this.zads) {
            boolean z = true;
            Preconditions.checkState(this.zakv == null, "Cannot call then() twice.");
            if (this.zakx != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakv = resultTransform;
            zacn = new zacn<>(this.zadu);
            this.zakw = zacn;
            zabs();
        }
        return zacn;
    }

    public final void andFinally(@NonNull ResultCallbacks<? super R> resultCallbacks) {
        synchronized (this.zads) {
            boolean z = true;
            Preconditions.checkState(this.zakx == null, "Cannot call andFinally() twice.");
            if (this.zakv != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakx = resultCallbacks;
            zabs();
        }
    }

    public final void onResult(R r) {
        synchronized (this.zads) {
            if (!r.getStatus().isSuccess()) {
                zad(r.getStatus());
                zab(r);
            } else if (this.zakv != null) {
                zacd.zabd().submit(new zacm(this, r));
            } else if (zabu()) {
                this.zakx.onSuccess(r);
            }
        }
    }

    public final void zaa(PendingResult<?> pendingResult) {
        synchronized (this.zads) {
            this.zaky = pendingResult;
            zabs();
        }
    }

    @GuardedBy("mSyncToken")
    private final void zabs() {
        if (this.zakv != null || this.zakx != null) {
            GoogleApiClient googleApiClient = (GoogleApiClient) this.zadu.get();
            if (!(this.zalb || this.zakv == null || googleApiClient == null)) {
                googleApiClient.zaa(this);
                this.zalb = true;
            }
            Status status = this.zakz;
            if (status != null) {
                zae(status);
                return;
            }
            PendingResult<R> pendingResult = this.zaky;
            if (pendingResult != null) {
                pendingResult.setResultCallback(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zad(Status status) {
        synchronized (this.zads) {
            this.zakz = status;
            zae(this.zakz);
        }
    }

    private final void zae(Status status) {
        synchronized (this.zads) {
            if (this.zakv != null) {
                Status onFailure = this.zakv.onFailure(status);
                Preconditions.checkNotNull(onFailure, "onFailure must not return null");
                this.zakw.zad(onFailure);
            } else if (zabu()) {
                this.zakx.onFailure(status);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zabt() {
        this.zakx = null;
    }

    @GuardedBy("mSyncToken")
    private final boolean zabu() {
        return (this.zakx == null || ((GoogleApiClient) this.zadu.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }
}

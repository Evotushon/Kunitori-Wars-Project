package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaau extends GoogleApiClient implements zabr {
    /* access modifiers changed from: private */
    public final Context mContext;
    private final Looper zabm;
    private final int zacf;
    private final GoogleApiAvailability zach;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zaci;
    private boolean zacl;
    private final Lock zaet;
    private final ClientSettings zaex;
    private final Map<Api<?>, Boolean> zafa;
    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zafg = new LinkedList();
    private final GmsClientEventManager zagw;
    private zabs zagx = null;
    private volatile boolean zagy;
    private long zagz;
    private long zaha;
    private final zabb zahb;
    @VisibleForTesting
    private zabo zahc;
    final Map<Api.AnyClientKey<?>, Api.Client> zahd;
    Set<Scope> zahe;
    private final ListenerHolders zahf;
    private final ArrayList<zaq> zahg;
    private Integer zahh;
    Set<zacn> zahi;
    final zaco zahj;
    private final GmsClientEventManager.GmsClientEventState zahk;

    public zaau(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zaq> arrayList, boolean z) {
        Looper looper2 = looper;
        this.zagz = ClientLibraryUtils.isPackageSide() ? 10000 : 120000;
        this.zaha = 5000;
        this.zahe = new HashSet();
        this.zahf = new ListenerHolders();
        this.zahh = null;
        this.zahi = null;
        this.zahk = new zaax(this);
        this.mContext = context;
        this.zaet = lock;
        this.zacl = false;
        this.zagw = new GmsClientEventManager(looper, this.zahk);
        this.zabm = looper2;
        this.zahb = new zabb(this, looper);
        this.zach = googleApiAvailability;
        this.zacf = i;
        if (this.zacf >= 0) {
            this.zahh = Integer.valueOf(i2);
        }
        this.zafa = map;
        this.zahd = map2;
        this.zahg = arrayList;
        this.zahj = new zaco(this.zahd);
        for (GoogleApiClient.ConnectionCallbacks registerConnectionCallbacks : list) {
            this.zagw.registerConnectionCallbacks(registerConnectionCallbacks);
        }
        for (GoogleApiClient.OnConnectionFailedListener registerConnectionFailedListener : list2) {
            this.zagw.registerConnectionFailedListener(registerConnectionFailedListener);
        }
        this.zaex = clientSettings;
        this.zaci = abstractClientBuilder;
    }

    private static String zaf(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Preconditions.checkArgument(t.getClientKey() != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.zahd.containsKey(t.getClientKey());
        String name = t.getApi() != null ? t.getApi().getName() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaet.lock();
        try {
            if (this.zagx == null) {
                this.zafg.add(t);
                return t;
            }
            T enqueue = this.zagx.enqueue(t);
            this.zaet.unlock();
            return enqueue;
        } finally {
            this.zaet.unlock();
        }
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Preconditions.checkArgument(t.getClientKey() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.zahd.containsKey(t.getClientKey());
        String name = t.getApi() != null ? t.getApi().getName() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(name);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaet.lock();
        try {
            if (this.zagx == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.zagy) {
                this.zafg.add(t);
                while (!this.zafg.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.zafg.remove();
                    this.zahj.zab(remove);
                    remove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                return t;
            } else {
                T execute = this.zagx.execute(t);
                this.zaet.unlock();
                return execute;
            }
        } finally {
            this.zaet.unlock();
        }
    }

    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        this.zaet.lock();
        try {
            return this.zahf.zaa(l, this.zabm, "NO_TYPE");
        } finally {
            this.zaet.unlock();
        }
    }

    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (Api.Client) this.zahd.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    public final boolean hasApi(@NonNull Api<?> api) {
        return this.zahd.containsKey(api.getClientKey());
    }

    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        if (isConnected() && (client = this.zahd.get(api.getClientKey())) != null && client.isConnected()) {
            return true;
        }
        return false;
    }

    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        this.zaet.lock();
        try {
            if (!isConnected()) {
                if (!this.zagy) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.zahd.containsKey(api.getClientKey())) {
                ConnectionResult connectionResult = this.zagx.getConnectionResult(api);
                if (connectionResult != null) {
                    this.zaet.unlock();
                    return connectionResult;
                } else if (this.zagy) {
                    return ConnectionResult.RESULT_SUCCESS;
                } else {
                    Log.w("GoogleApiClientImpl", zaaw());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(api.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    ConnectionResult connectionResult2 = new ConnectionResult(8, (PendingIntent) null);
                    this.zaet.unlock();
                    return connectionResult2;
                }
            } else {
                throw new IllegalArgumentException(String.valueOf(api.getName()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.zaet.unlock();
        }
    }

    public final void connect() {
        this.zaet.lock();
        try {
            boolean z = false;
            if (this.zacf >= 0) {
                if (this.zahh != null) {
                    z = true;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zahh == null) {
                this.zahh = Integer.valueOf(zaa(this.zahd.values(), false));
            } else if (this.zahh.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(this.zahh.intValue());
        } finally {
            this.zaet.unlock();
        }
    }

    public final void connect(int i) {
        this.zaet.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            zae(i);
            zaas();
        } finally {
            this.zaet.unlock();
        }
    }

    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaet.lock();
        try {
            if (this.zacf >= 0) {
                if (this.zahh == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zahh == null) {
                this.zahh = Integer.valueOf(zaa(this.zahd.values(), false));
            } else if (this.zahh.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zae(this.zahh.intValue());
            this.zagw.enableCallbacks();
            return this.zagx.blockingConnect();
        } finally {
            this.zaet.unlock();
        }
    }

    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaet.lock();
        try {
            if (this.zahh == null) {
                this.zahh = Integer.valueOf(zaa(this.zahd.values(), false));
            } else if (this.zahh.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zae(this.zahh.intValue());
            this.zagw.enableCallbacks();
            return this.zagx.blockingConnect(j, timeUnit);
        } finally {
            this.zaet.unlock();
        }
    }

    public final void disconnect() {
        this.zaet.lock();
        try {
            this.zahj.release();
            if (this.zagx != null) {
                this.zagx.disconnect();
            }
            this.zahf.release();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.zafg) {
                apiMethodImpl.zaa((zacs) null);
                apiMethodImpl.cancel();
            }
            this.zafg.clear();
            if (this.zagx != null) {
                zaau();
                this.zagw.disableCallbacks();
                this.zaet.unlock();
            }
        } finally {
            this.zaet.unlock();
        }
    }

    public final void reconnect() {
        disconnect();
        connect();
    }

    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Preconditions.checkState(this.zahh.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult((GoogleApiClient) this);
        if (this.zahd.containsKey(Common.CLIENT_KEY)) {
            zaa(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new GoogleApiClient.Builder(this.mContext).addApi(Common.API).addConnectionCallbacks(new zaaw(this, atomicReference, statusPendingResult)).addOnConnectionFailedListener(new zaaz(this, statusPendingResult)).setHandler(this.zahb).build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    /* access modifiers changed from: private */
    public final void zaa(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zapy.zaa(googleApiClient).setResultCallback(new zaay(this, statusPendingResult, z, googleApiClient));
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zacf >= 0) {
            zai.zaa(lifecycleActivity).zaa(this.zacf);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public final boolean isConnected() {
        zabs zabs = this.zagx;
        return zabs != null && zabs.isConnected();
    }

    public final boolean isConnecting() {
        zabs zabs = this.zagx;
        return zabs != null && zabs.isConnecting();
    }

    private final void zae(int i) {
        Integer num = this.zahh;
        if (num == null) {
            this.zahh = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String zaf = zaf(i);
            String zaf2 = zaf(this.zahh.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(zaf).length() + 51 + String.valueOf(zaf2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(zaf);
            sb.append(". Mode was already set to ");
            sb.append(zaf2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.zagx == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client next : this.zahd.values()) {
                if (next.requiresSignIn()) {
                    z = true;
                }
                if (next.providesSignIn()) {
                    z2 = true;
                }
            }
            int intValue = this.zahh.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    if (z) {
                        if (this.zacl) {
                            this.zagx = new zax(this.mContext, this.zaet, this.zabm, this.zach, this.zahd, this.zaex, this.zafa, this.zaci, this.zahg, this, true);
                            return;
                        }
                        this.zagx = zas.zaa(this.mContext, this, this.zaet, this.zabm, this.zach, this.zahd, this.zaex, this.zafa, this.zaci, this.zahg);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.zacl || z2) {
                this.zagx = new zabc(this.mContext, this, this.zaet, this.zabm, this.zach, this.zahd, this.zaex, this.zafa, this.zaci, this.zahg, this);
                return;
            }
            this.zagx = new zax(this.mContext, this.zaet, this.zabm, this.zach, this.zahd, this.zaex, this.zafa, this.zaci, this.zahg, this, false);
        }
    }

    @GuardedBy("mLock")
    private final void zaas() {
        this.zagw.enableCallbacks();
        this.zagx.connect();
    }

    /* access modifiers changed from: private */
    public final void resume() {
        this.zaet.lock();
        try {
            if (this.zagy) {
                zaas();
            }
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: private */
    public final void zaat() {
        this.zaet.lock();
        try {
            if (zaau()) {
                zaas();
            }
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    public final boolean zaau() {
        if (!this.zagy) {
            return false;
        }
        this.zagy = false;
        this.zahb.removeMessages(2);
        this.zahb.removeMessages(1);
        zabo zabo = this.zahc;
        if (zabo != null) {
            zabo.unregister();
            this.zahc = null;
        }
        return true;
    }

    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zagw.registerConnectionCallbacks(connectionCallbacks);
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zagw.isConnectionCallbacksRegistered(connectionCallbacks);
    }

    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zagw.unregisterConnectionCallbacks(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zagw.registerConnectionFailedListener(onConnectionFailedListener);
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zagw.isConnectionFailedListenerRegistered(onConnectionFailedListener);
    }

    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zagw.unregisterConnectionFailedListener(onConnectionFailedListener);
    }

    @GuardedBy("mLock")
    public final void zab(Bundle bundle) {
        while (!this.zafg.isEmpty()) {
            execute(this.zafg.remove());
        }
        this.zagw.onConnectionSuccess(bundle);
    }

    @GuardedBy("mLock")
    public final void zac(ConnectionResult connectionResult) {
        if (!this.zach.isPlayServicesPossiblyUpdating(this.mContext, connectionResult.getErrorCode())) {
            zaau();
        }
        if (!this.zagy) {
            this.zagw.onConnectionFailure(connectionResult);
            this.zagw.disableCallbacks();
        }
    }

    @GuardedBy("mLock")
    public final void zab(int i, boolean z) {
        if (i == 1 && !z && !this.zagy) {
            this.zagy = true;
            if (this.zahc == null && !ClientLibraryUtils.isPackageSide()) {
                try {
                    this.zahc = this.zach.zaa(this.mContext.getApplicationContext(), (zabq) new zaba(this));
                } catch (SecurityException unused) {
                }
            }
            zabb zabb = this.zahb;
            zabb.sendMessageDelayed(zabb.obtainMessage(1), this.zagz);
            zabb zabb2 = this.zahb;
            zabb2.sendMessageDelayed(zabb2.obtainMessage(2), this.zaha);
        }
        this.zahj.zabv();
        this.zagw.onUnintentionalDisconnection(i);
        this.zagw.disableCallbacks();
        if (i == 2) {
            zaas();
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zabm;
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabs zabs = this.zagx;
        return zabs != null && zabs.maybeSignIn(signInConnectionListener);
    }

    public final void maybeSignOut() {
        zabs zabs = this.zagx;
        if (zabs != null) {
            zabs.maybeSignOut();
        }
    }

    public final void zaa(zacn zacn) {
        this.zaet.lock();
        try {
            if (this.zahi == null) {
                this.zahi = new HashSet();
            }
            this.zahi.add(zacn);
        } finally {
            this.zaet.unlock();
        }
    }

    public final void zab(zacn zacn) {
        this.zaet.lock();
        try {
            if (this.zahi == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.zahi.remove(zacn)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!zaav()) {
                this.zagx.zau();
            }
        } finally {
            this.zaet.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean zaav() {
        this.zaet.lock();
        try {
            if (this.zahi == null) {
                this.zaet.unlock();
                return false;
            }
            boolean z = !this.zahi.isEmpty();
            this.zaet.unlock();
            return z;
        } catch (Throwable th) {
            this.zaet.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String zaaw() {
        StringWriter stringWriter = new StringWriter();
        dump("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.mContext);
        printWriter.append(str).append("mResuming=").print(this.zagy);
        printWriter.append(" mWorkQueue.size()=").print(this.zafg.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zahj.zale.size());
        zabs zabs = this.zagx;
        if (zabs != null) {
            zabs.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int zaa(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client next : iterable) {
            if (next.requiresSignIn()) {
                z2 = true;
            }
            if (next.providesSignIn()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}

package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zax implements zabs {
    private final Looper zabm;
    private final GoogleApiManager zabp;
    /* access modifiers changed from: private */
    public final Lock zaet;
    private final ClientSettings zaex;
    /* access modifiers changed from: private */
    public final Map<Api.AnyClientKey<?>, zav<?>> zaey = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Api.AnyClientKey<?>, zav<?>> zaez = new HashMap();
    private final Map<Api<?>, Boolean> zafa;
    /* access modifiers changed from: private */
    public final zaau zafb;
    private final GoogleApiAvailabilityLight zafc;
    /* access modifiers changed from: private */
    public final Condition zafd;
    private final boolean zafe;
    /* access modifiers changed from: private */
    public final boolean zaff;
    private final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zafg = new LinkedList();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public boolean zafh;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public Map<ApiKey<?>, ConnectionResult> zafi;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public Map<ApiKey<?>, ConnectionResult> zafj;
    @GuardedBy("mLock")
    private zay zafk;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public ConnectionResult zafl;

    public zax(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zaau zaau, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.zaet = lock;
        this.zabm = looper;
        this.zafd = lock.newCondition();
        this.zafc = googleApiAvailabilityLight;
        this.zafb = zaau;
        this.zafa = map2;
        this.zaex = clientSettings;
        this.zafe = z;
        HashMap hashMap = new HashMap();
        for (Api next : map2.keySet()) {
            hashMap.put(next.getClientKey(), next);
        }
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            zaq zaq = (zaq) obj;
            hashMap2.put(zaq.mApi, zaq);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        for (Map.Entry next2 : map.entrySet()) {
            Api api = (Api) hashMap.get(next2.getKey());
            Api.Client client = (Api.Client) next2.getValue();
            if (client.requiresGooglePlayServices()) {
                if (!this.zafa.get(api).booleanValue()) {
                    z3 = z7;
                    z4 = true;
                } else {
                    z3 = z7;
                    z4 = z8;
                }
                z2 = true;
            } else {
                z2 = z6;
                z4 = z8;
                z3 = false;
            }
            zav zav = r1;
            zav zav2 = new zav(context, api, looper, client, (zaq) hashMap2.get(api), clientSettings, abstractClientBuilder);
            this.zaey.put((Api.AnyClientKey) next2.getKey(), zav);
            if (client.requiresSignIn()) {
                this.zaez.put((Api.AnyClientKey) next2.getKey(), zav);
            }
            z8 = z4;
            z7 = z3;
            z6 = z2;
        }
        this.zaff = (!z6 || z7 || z8) ? false : z5;
        this.zabp = GoogleApiManager.zaaz();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final void zau() {
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        if (this.zafe && zab(t)) {
            return t;
        }
        if (!isConnected()) {
            this.zafg.add(t);
            return t;
        }
        this.zafb.zahj.zab(t);
        return this.zaey.get(t.getClientKey()).doRead(t);
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Api.AnyClientKey clientKey = t.getClientKey();
        if (this.zafe && zab(t)) {
            return t;
        }
        this.zafb.zahj.zab(t);
        return this.zaey.get(clientKey).doWrite(t);
    }

    private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean zab(@NonNull T t) {
        Api.AnyClientKey clientKey = t.getClientKey();
        ConnectionResult zaa = zaa((Api.AnyClientKey<?>) clientKey);
        if (zaa == null || zaa.getErrorCode() != 4) {
            return false;
        }
        t.setFailedResult(new Status(4, (String) null, this.zabp.zaa((ApiKey<?>) this.zaey.get(clientKey).getApiKey(), System.identityHashCode(this.zafb))));
        return true;
    }

    public final void connect() {
        this.zaet.lock();
        try {
            if (!this.zafh) {
                this.zafh = true;
                this.zafi = null;
                this.zafj = null;
                this.zafk = null;
                this.zafl = null;
                this.zabp.zam();
                this.zabp.zaa((Iterable<? extends HasApiKey<?>>) this.zaey.values()).addOnCompleteListener((Executor) new HandlerExecutor(this.zabm), new zaz(this));
                this.zaet.unlock();
            }
        } finally {
            this.zaet.unlock();
        }
    }

    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zafd.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zafl;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        connect();
        long nanos = timeUnit.toNanos(j);
        while (isConnecting()) {
            if (nanos <= 0) {
                try {
                    disconnect();
                    return new ConnectionResult(14, (PendingIntent) null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, (PendingIntent) null);
                }
            } else {
                nanos = this.zafd.awaitNanos(nanos);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zafl;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    public final void disconnect() {
        this.zaet.lock();
        try {
            this.zafh = false;
            this.zafi = null;
            this.zafj = null;
            if (this.zafk != null) {
                this.zafk.cancel();
                this.zafk = null;
            }
            this.zafl = null;
            while (!this.zafg.isEmpty()) {
                BaseImplementation.ApiMethodImpl remove = this.zafg.remove();
                remove.zaa((zacs) null);
                remove.cancel();
            }
            this.zafd.signalAll();
        } finally {
            this.zaet.unlock();
        }
    }

    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        return zaa(api.getClientKey());
    }

    @Nullable
    private final ConnectionResult zaa(@NonNull Api.AnyClientKey<?> anyClientKey) {
        this.zaet.lock();
        try {
            zav zav = this.zaey.get(anyClientKey);
            if (this.zafi != null && zav != null) {
                return this.zafi.get(zav.getApiKey());
            }
            this.zaet.unlock();
            return null;
        } finally {
            this.zaet.unlock();
        }
    }

    public final boolean isConnected() {
        this.zaet.lock();
        try {
            return this.zafi != null && this.zafl == null;
        } finally {
            this.zaet.unlock();
        }
    }

    public final boolean isConnecting() {
        this.zaet.lock();
        try {
            return this.zafi == null && this.zafh;
        } finally {
            this.zaet.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zaaa() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.zaet
            r0.lock()
            boolean r0 = r3.zafh     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.zafe     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.internal.zav<?>> r0 = r3.zaez     // Catch:{ all -> 0x0044 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.ConnectionResult r2 = r3.zaa((com.google.android.gms.common.api.Api.AnyClientKey<?>) r2)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = r2.isSuccess()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0019
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = r3.zaet
            r0.unlock()
            return r1
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.zaet
            r0.unlock()
            r0 = 1
            return r0
        L_0x003e:
            java.util.concurrent.locks.Lock r0 = r3.zaet
            r0.unlock()
            return r1
        L_0x0044:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.zaet
            r1.unlock()
            goto L_0x004c
        L_0x004b:
            throw r0
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zax.zaaa():boolean");
    }

    /* JADX INFO: finally extract failed */
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        this.zaet.lock();
        try {
            if (!this.zafh || zaaa()) {
                this.zaet.unlock();
                return false;
            }
            this.zabp.zam();
            this.zafk = new zay(this, signInConnectionListener);
            this.zabp.zaa((Iterable<? extends HasApiKey<?>>) this.zaez.values()).addOnCompleteListener((Executor) new HandlerExecutor(this.zabm), this.zafk);
            this.zaet.unlock();
            return true;
        } catch (Throwable th) {
            this.zaet.unlock();
            throw th;
        }
    }

    public final void maybeSignOut() {
        this.zaet.lock();
        try {
            this.zabp.maybeSignOut();
            if (this.zafk != null) {
                this.zafk.cancel();
                this.zafk = null;
            }
            if (this.zafj == null) {
                this.zafj = new ArrayMap(this.zaez.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (zav<?> apiKey : this.zaez.values()) {
                this.zafj.put(apiKey.getApiKey(), connectionResult);
            }
            if (this.zafi != null) {
                this.zafi.putAll(this.zafj);
            }
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaab() {
        ClientSettings clientSettings = this.zaex;
        if (clientSettings == null) {
            this.zafb.zahe = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
        Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = this.zaex.getOptionalApiSettings();
        for (Api next : optionalApiSettings.keySet()) {
            ConnectionResult connectionResult = getConnectionResult(next);
            if (connectionResult != null && connectionResult.isSuccess()) {
                hashSet.addAll(optionalApiSettings.get(next).mScopes);
            }
        }
        this.zafb.zahe = hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaac() {
        while (!this.zafg.isEmpty()) {
            execute(this.zafg.remove());
        }
        this.zafb.zab((Bundle) null);
    }

    /* access modifiers changed from: private */
    public final boolean zaa(zav<?> zav, ConnectionResult connectionResult) {
        return !connectionResult.isSuccess() && !connectionResult.hasResolution() && this.zafa.get(zav.getApi()).booleanValue() && zav.zaz().requiresGooglePlayServices() && this.zafc.isUserResolvableError(connectionResult.getErrorCode());
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    @Nullable
    public final ConnectionResult zaad() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i = 0;
        int i2 = 0;
        for (zav next : this.zaey.values()) {
            Api api = next.getApi();
            ConnectionResult connectionResult3 = this.zafi.get(next.getApiKey());
            if (!connectionResult3.isSuccess() && (!this.zafa.get(api).booleanValue() || connectionResult3.hasResolution() || this.zafc.isUserResolvableError(connectionResult3.getErrorCode()))) {
                if (connectionResult3.getErrorCode() != 4 || !this.zafe) {
                    int priority = api.zah().getPriority();
                    if (connectionResult == null || i > priority) {
                        connectionResult = connectionResult3;
                        i = priority;
                    }
                } else {
                    int priority2 = api.zah().getPriority();
                    if (connectionResult2 == null || i2 > priority2) {
                        connectionResult2 = connectionResult3;
                        i2 = priority2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }
}

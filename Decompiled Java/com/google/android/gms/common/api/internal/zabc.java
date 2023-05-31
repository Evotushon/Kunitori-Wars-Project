package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zabc implements zabs, zap {
    private final Context mContext;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zaci;
    final zaau zaej;
    /* access modifiers changed from: private */
    public final Lock zaet;
    private final ClientSettings zaex;
    private final Map<Api<?>, Boolean> zafa;
    private final GoogleApiAvailabilityLight zafc;
    final Map<Api.AnyClientKey<?>, Api.Client> zahd;
    private final Condition zahr;
    private final zabe zahs;
    final Map<Api.AnyClientKey<?>, ConnectionResult> zaht = new HashMap();
    /* access modifiers changed from: private */
    public volatile zabd zahu;
    private ConnectionResult zahv = null;
    int zahw;
    final zabr zahx;

    public zabc(Context context, zaau zaau, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zabr zabr) {
        this.mContext = context;
        this.zaet = lock;
        this.zafc = googleApiAvailabilityLight;
        this.zahd = map;
        this.zaex = clientSettings;
        this.zafa = map2;
        this.zaci = abstractClientBuilder;
        this.zaej = zaau;
        this.zahx = zabr;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((zaq) obj).zaa(this);
        }
        this.zahs = new zabe(this, looper);
        this.zahr = lock.newCondition();
        this.zahu = new zaav(this);
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        return false;
    }

    public final void maybeSignOut() {
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        t.zas();
        return this.zahu.enqueue(t);
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        t.zas();
        return this.zahu.execute(t);
    }

    @GuardedBy("mLock")
    public final void connect() {
        this.zahu.connect();
    }

    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect() {
        connect();
        while (isConnecting()) {
            try {
                this.zahr.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zahv;
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
                nanos = this.zahr.awaitNanos(nanos);
            }
        }
        if (isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.zahv;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @GuardedBy("mLock")
    public final void disconnect() {
        if (this.zahu.disconnect()) {
            this.zaht.clear();
        }
    }

    @GuardedBy("mLock")
    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        Api.AnyClientKey<?> clientKey = api.getClientKey();
        if (!this.zahd.containsKey(clientKey)) {
            return null;
        }
        if (this.zahd.get(clientKey).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        if (this.zaht.containsKey(clientKey)) {
            return this.zaht.get(clientKey);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zaax() {
        this.zaet.lock();
        try {
            this.zahu = new zaai(this, this.zaex, this.zafa, this.zafc, this.zaci, this.zaet, this.mContext);
            this.zahu.begin();
            this.zahr.signalAll();
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaay() {
        this.zaet.lock();
        try {
            this.zaej.zaau();
            this.zahu = new zaah(this);
            this.zahu.begin();
            this.zahr.signalAll();
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaf(ConnectionResult connectionResult) {
        this.zaet.lock();
        try {
            this.zahv = connectionResult;
            this.zahu = new zaav(this);
            this.zahu.begin();
            this.zahr.signalAll();
        } finally {
            this.zaet.unlock();
        }
    }

    public final boolean isConnected() {
        return this.zahu instanceof zaah;
    }

    public final boolean isConnecting() {
        return this.zahu instanceof zaai;
    }

    @GuardedBy("mLock")
    public final void zau() {
        if (isConnected()) {
            ((zaah) this.zahu).zaal();
        }
    }

    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.zaet.lock();
        try {
            this.zahu.zaa(connectionResult, api, z);
        } finally {
            this.zaet.unlock();
        }
    }

    public final void onConnected(@Nullable Bundle bundle) {
        this.zaet.lock();
        try {
            this.zahu.onConnected(bundle);
        } finally {
            this.zaet.unlock();
        }
    }

    public final void onConnectionSuspended(int i) {
        this.zaet.lock();
        try {
            this.zahu.onConnectionSuspended(i);
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zaa(zabf zabf) {
        this.zahs.sendMessage(this.zahs.obtainMessage(1, zabf));
    }

    /* access modifiers changed from: package-private */
    public final void zaa(RuntimeException runtimeException) {
        this.zahs.sendMessage(this.zahs.obtainMessage(2, runtimeException));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.zahu);
        for (Api next : this.zafa.keySet()) {
            printWriter.append(str).append(next.getName()).println(":");
            this.zahd.get(next.getClientKey()).dump(concat, fileDescriptor, printWriter, strArr);
        }
    }
}

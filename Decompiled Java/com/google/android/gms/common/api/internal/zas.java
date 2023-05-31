package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zas implements zabs {
    private final Context mContext;
    private final Looper zabm;
    private final zaau zaej;
    /* access modifiers changed from: private */
    public final zabc zaek;
    /* access modifiers changed from: private */
    public final zabc zael;
    private final Map<Api.AnyClientKey<?>, zabc> zaem;
    private final Set<SignInConnectionListener> zaen = Collections.newSetFromMap(new WeakHashMap());
    private final Api.Client zaeo;
    private Bundle zaep;
    /* access modifiers changed from: private */
    public ConnectionResult zaeq = null;
    /* access modifiers changed from: private */
    public ConnectionResult zaer = null;
    /* access modifiers changed from: private */
    public boolean zaes = false;
    /* access modifiers changed from: private */
    public final Lock zaet;
    @GuardedBy("mLock")
    private int zaeu = 0;

    public static zas zaa(Context context, zaau zaau, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        Api.Client client = null;
        for (Map.Entry next : map.entrySet()) {
            Api.Client client2 = (Api.Client) next.getValue();
            if (client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                arrayMap.put((Api.AnyClientKey) next.getKey(), client2);
            } else {
                arrayMap2.put((Api.AnyClientKey) next.getKey(), client2);
            }
        }
        Preconditions.checkState(!arrayMap.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = new ArrayMap();
        for (Api next2 : map2.keySet()) {
            Api.AnyClientKey<?> clientKey = next2.getClientKey();
            if (arrayMap.containsKey(clientKey)) {
                arrayMap3.put(next2, map3.get(next2));
            } else if (arrayMap2.containsKey(clientKey)) {
                arrayMap4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            zaq zaq = (zaq) obj;
            if (arrayMap3.containsKey(zaq.mApi)) {
                arrayList2.add(zaq);
            } else if (arrayMap4.containsKey(zaq.mApi)) {
                arrayList3.add(zaq);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zas(context, zaau, lock, looper, googleApiAvailabilityLight, arrayMap, arrayMap2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, arrayMap3, arrayMap4);
    }

    private zas(Context context, zaau zaau, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.mContext = context;
        this.zaej = zaau;
        this.zaet = lock;
        this.zabm = looper;
        this.zaeo = client;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zabc zabc = r3;
        zabc zabc2 = new zabc(context2, this.zaej, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder<? extends zad, SignInOptions>) null, arrayList2, new zau(this, (zar) null));
        this.zaek = zabc;
        this.zael = new zabc(context2, this.zaej, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new zat(this, (zar) null));
        ArrayMap arrayMap = new ArrayMap();
        for (Api.AnyClientKey<?> put : map2.keySet()) {
            arrayMap.put(put, this.zaek);
        }
        for (Api.AnyClientKey<?> put2 : map.keySet()) {
            arrayMap.put(put2, this.zael);
        }
        this.zaem = Collections.unmodifiableMap(arrayMap);
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        if (!zaa((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.zaek.enqueue(t);
        }
        if (!zax()) {
            return this.zael.enqueue(t);
        }
        t.setFailedResult(new Status(4, (String) null, zay()));
        return t;
    }

    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        if (!zaa((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.zaek.execute(t);
        }
        if (!zax()) {
            return this.zael.execute(t);
        }
        t.setFailedResult(new Status(4, (String) null, zay()));
        return t;
    }

    @GuardedBy("mLock")
    @Nullable
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        if (!this.zaem.get(api.getClientKey()).equals(this.zael)) {
            return this.zaek.getConnectionResult(api);
        }
        if (zax()) {
            return new ConnectionResult(4, zay());
        }
        return this.zael.getConnectionResult(api);
    }

    @GuardedBy("mLock")
    public final void connect() {
        this.zaeu = 2;
        this.zaes = false;
        this.zaer = null;
        this.zaeq = null;
        this.zaek.connect();
        this.zael.connect();
    }

    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    public final void disconnect() {
        this.zaer = null;
        this.zaeq = null;
        this.zaeu = 0;
        this.zaek.disconnect();
        this.zael.disconnect();
        zaw();
    }

    public final boolean isConnected() {
        this.zaet.lock();
        try {
            boolean z = true;
            if (!this.zaek.isConnected() || (!this.zael.isConnected() && !zax() && this.zaeu != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.zaet.unlock();
        }
    }

    public final boolean isConnecting() {
        this.zaet.lock();
        try {
            return this.zaeu == 2;
        } finally {
            this.zaet.unlock();
        }
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        this.zaet.lock();
        try {
            if ((isConnecting() || isConnected()) && !this.zael.isConnected()) {
                this.zaen.add(signInConnectionListener);
                if (this.zaeu == 0) {
                    this.zaeu = 1;
                }
                this.zaer = null;
                this.zael.connect();
                return true;
            }
            this.zaet.unlock();
            return false;
        } finally {
            this.zaet.unlock();
        }
    }

    @GuardedBy("mLock")
    public final void zau() {
        this.zaek.zau();
        this.zael.zau();
    }

    public final void maybeSignOut() {
        this.zaet.lock();
        try {
            boolean isConnecting = isConnecting();
            this.zael.disconnect();
            this.zaer = new ConnectionResult(4);
            if (isConnecting) {
                new zap(this.zabm).post(new zar(this));
            } else {
                zaw();
            }
        } finally {
            this.zaet.unlock();
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zav() {
        if (zab(this.zaeq)) {
            if (zab(this.zaer) || zax()) {
                int i = this.zaeu;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.zaeu = 0;
                        return;
                    }
                    this.zaej.zab(this.zaep);
                }
                zaw();
                this.zaeu = 0;
                return;
            }
            ConnectionResult connectionResult = this.zaer;
            if (connectionResult == null) {
                return;
            }
            if (this.zaeu == 1) {
                zaw();
                return;
            }
            zaa(connectionResult);
            this.zaek.disconnect();
        } else if (this.zaeq == null || !zab(this.zaer)) {
            ConnectionResult connectionResult2 = this.zaeq;
            if (connectionResult2 != null && this.zaer != null) {
                if (this.zael.zahw < this.zaek.zahw) {
                    connectionResult2 = this.zaer;
                }
                zaa(connectionResult2);
            }
        } else {
            this.zael.disconnect();
            zaa(this.zaeq);
        }
    }

    @GuardedBy("mLock")
    private final void zaa(ConnectionResult connectionResult) {
        int i = this.zaeu;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zaeu = 0;
            }
            this.zaej.zac(connectionResult);
        }
        zaw();
        this.zaeu = 0;
    }

    @GuardedBy("mLock")
    private final void zaw() {
        for (SignInConnectionListener onComplete : this.zaen) {
            onComplete.onComplete();
        }
        this.zaen.clear();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaa(int i, boolean z) {
        this.zaej.zab(i, z);
        this.zaer = null;
        this.zaeq = null;
    }

    @GuardedBy("mLock")
    private final boolean zax() {
        ConnectionResult connectionResult = this.zaer;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaa(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> clientKey = apiMethodImpl.getClientKey();
        Preconditions.checkArgument(this.zaem.containsKey(clientKey), "GoogleApiClient is not configured to use the API required for this call.");
        return this.zaem.get(clientKey).equals(this.zael);
    }

    @Nullable
    private final PendingIntent zay() {
        if (this.zaeo == null) {
            return null;
        }
        return PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zaej), this.zaeo.getSignInIntent(), 134217728);
    }

    /* access modifiers changed from: private */
    public final void zaa(Bundle bundle) {
        Bundle bundle2 = this.zaep;
        if (bundle2 == null) {
            this.zaep = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private static boolean zab(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.zael.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.zaek.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}

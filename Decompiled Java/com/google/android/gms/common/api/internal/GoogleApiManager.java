package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class GoogleApiManager implements Handler.Callback {
    /* access modifiers changed from: private */
    public static final Object lock = new Object();
    public static final Status zaia = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status zaib = new Status(4, "The user must be signed in to make this API call.");
    @GuardedBy("lock")
    private static GoogleApiManager zaif;
    /* access modifiers changed from: private */
    public final Handler handler;
    /* access modifiers changed from: private */
    public long zaic = 5000;
    /* access modifiers changed from: private */
    public long zaid = 120000;
    /* access modifiers changed from: private */
    public long zaie = 10000;
    /* access modifiers changed from: private */
    public final Context zaig;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zaih;
    /* access modifiers changed from: private */
    public final GoogleApiAvailabilityCache zaii;
    private final AtomicInteger zaij = new AtomicInteger(1);
    private final AtomicInteger zaik = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<ApiKey<?>, zaa<?>> zail = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public zaac zaim = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set<ApiKey<?>> zain = new ArraySet();
    private final Set<ApiKey<?>> zaio = new ArraySet();

    public static GoogleApiManager zab(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (lock) {
            if (zaif == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zaif = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zaif;
        }
        return googleApiManager;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private static class zab {
        /* access modifiers changed from: private */
        public final ApiKey<?> zaje;
        /* access modifiers changed from: private */
        public final Feature zajf;

        private zab(ApiKey<?> apiKey, Feature feature) {
            this.zaje = apiKey;
            this.zajf = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof zab)) {
                zab zab = (zab) obj;
                if (!Objects.equal(this.zaje, zab.zaje) || !Objects.equal(this.zajf, zab.zajf)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.zaje, this.zajf);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.zaje).add("feature", this.zajf).toString();
        }

        /* synthetic */ zab(ApiKey apiKey, Feature feature, zabh zabh) {
            this(apiKey, feature);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private class zac implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */
        public final ApiKey<?> zafv;
        /* access modifiers changed from: private */
        public final Api.Client zair;
        private IAccountAccessor zaji = null;
        private Set<Scope> zajj = null;
        /* access modifiers changed from: private */
        public boolean zajk = false;

        public zac(Api.Client client, ApiKey<?> apiKey) {
            this.zair = client;
            this.zafv = apiKey;
        }

        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
            GoogleApiManager.this.handler.post(new zabn(this, connectionResult));
        }

        @WorkerThread
        public final void zag(ConnectionResult connectionResult) {
            ((zaa) GoogleApiManager.this.zail.get(this.zafv)).zag(connectionResult);
        }

        @WorkerThread
        public final void zaa(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zag(new ConnectionResult(4));
                return;
            }
            this.zaji = iAccountAccessor;
            this.zajj = set;
            zabp();
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zabp() {
            IAccountAccessor iAccountAccessor;
            if (this.zajk && (iAccountAccessor = this.zaji) != null) {
                this.zair.getRemoteService(iAccountAccessor, this.zajj);
            }
        }
    }

    public static GoogleApiManager zaaz() {
        GoogleApiManager googleApiManager;
        synchronized (lock) {
            Preconditions.checkNotNull(zaif, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zaif;
        }
        return googleApiManager;
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (lock) {
            if (zaif != null) {
                GoogleApiManager googleApiManager = zaif;
                googleApiManager.zaik.incrementAndGet();
                googleApiManager.handler.sendMessageAtFrontOfQueue(googleApiManager.handler.obtainMessage(10));
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zap {
        private final ApiKey<O> zafv;
        private final Queue<zab> zaiq = new LinkedList();
        /* access modifiers changed from: private */
        public final Api.Client zair;
        private final Api.AnyClient zais;
        private final zaab zait;
        private final Set<zaj> zaiu = new HashSet();
        private final Map<ListenerHolder.ListenerKey<?>, zabv> zaiv = new HashMap();
        private final int zaiw;
        private final zace zaix;
        private boolean zaiy;
        private final List<zab> zaiz = new ArrayList();
        private ConnectionResult zaja = null;

        @WorkerThread
        public zaa(GoogleApi<O> googleApi) {
            this.zair = googleApi.zaa(GoogleApiManager.this.handler.getLooper(), (zaa<O>) this);
            Api.Client client = this.zair;
            if (client instanceof SimpleClientAdapter) {
                this.zais = ((SimpleClientAdapter) client).getClient();
            } else {
                this.zais = client;
            }
            this.zafv = googleApi.getApiKey();
            this.zait = new zaab();
            this.zaiw = googleApi.getInstanceId();
            if (this.zair.requiresSignIn()) {
                this.zaix = googleApi.zaa(GoogleApiManager.this.zaig, GoogleApiManager.this.handler);
            } else {
                this.zaix = null;
            }
        }

        public final void onConnected(@Nullable Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.handler.getLooper()) {
                zabe();
            } else {
                GoogleApiManager.this.handler.post(new zabj(this));
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zabe() {
            zabj();
            zai(ConnectionResult.RESULT_SUCCESS);
            zabl();
            Iterator<zabv> it = this.zaiv.values().iterator();
            while (it.hasNext()) {
                zabv next = it.next();
                if (zaa(next.zake.getRequiredFeatures()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zake.registerListener(this.zais, new TaskCompletionSource());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(1);
                        this.zair.disconnect();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            zabg();
            zabm();
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.handler.getLooper()) {
                zabf();
            } else {
                GoogleApiManager.this.handler.post(new zabi(this));
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zabf() {
            zabj();
            this.zaiy = true;
            this.zait.zaag();
            GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 9, this.zafv), GoogleApiManager.this.zaic);
            GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 11, this.zafv), GoogleApiManager.this.zaid);
            GoogleApiManager.this.zaii.flush();
            for (zabv zabv : this.zaiv.values()) {
                zabv.zakd.run();
            }
        }

        @WorkerThread
        public final void zag(@NonNull ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            this.zair.disconnect();
            onConnectionFailed(connectionResult);
        }

        @WorkerThread
        private final boolean zah(@NonNull ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.lock) {
                if (GoogleApiManager.this.zaim == null || !GoogleApiManager.this.zain.contains(this.zafv)) {
                    return false;
                }
                GoogleApiManager.this.zaim.zab(connectionResult, this.zaiw);
                return true;
            }
        }

        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.handler.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                GoogleApiManager.this.handler.post(new zabl(this, connectionResult));
            }
        }

        @WorkerThread
        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            zaa(connectionResult, (Exception) null);
        }

        @WorkerThread
        private final void zaa(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            zace zace = this.zaix;
            if (zace != null) {
                zace.zabq();
            }
            zabj();
            GoogleApiManager.this.zaii.flush();
            zai(connectionResult);
            if (connectionResult.getErrorCode() == 4) {
                zac(GoogleApiManager.zaib);
            } else if (this.zaiq.isEmpty()) {
                this.zaja = connectionResult;
            } else if (exc != null) {
                Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
                zaa((Status) null, exc, false);
            } else {
                zaa(zaj(connectionResult), (Exception) null, true);
                if (!this.zaiq.isEmpty() && !zah(connectionResult) && !GoogleApiManager.this.zac(connectionResult, this.zaiw)) {
                    if (connectionResult.getErrorCode() == 18) {
                        this.zaiy = true;
                    }
                    if (this.zaiy) {
                        GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 9, this.zafv), GoogleApiManager.this.zaic);
                    } else {
                        zac(zaj(connectionResult));
                    }
                }
            }
        }

        @WorkerThread
        private final void zabg() {
            ArrayList arrayList = new ArrayList(this.zaiq);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zab = (zab) obj;
                if (!this.zair.isConnected()) {
                    return;
                }
                if (zab(zab)) {
                    this.zaiq.remove(zab);
                }
            }
        }

        @WorkerThread
        public final void zaa(zab zab) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (!this.zair.isConnected()) {
                this.zaiq.add(zab);
                ConnectionResult connectionResult = this.zaja;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    connect();
                } else {
                    onConnectionFailed(this.zaja);
                }
            } else if (zab(zab)) {
                zabm();
            } else {
                this.zaiq.add(zab);
            }
        }

        @WorkerThread
        public final void zabh() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            zac(GoogleApiManager.zaia);
            this.zait.zaaf();
            for (ListenerHolder.ListenerKey zag : (ListenerHolder.ListenerKey[]) this.zaiv.keySet().toArray(new ListenerHolder.ListenerKey[this.zaiv.size()])) {
                zaa((zab) new zag(zag, new TaskCompletionSource()));
            }
            zai(new ConnectionResult(4));
            if (this.zair.isConnected()) {
                this.zair.onUserSignOut(new zabk(this));
            }
        }

        public final Api.Client zaz() {
            return this.zair;
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabv> zabi() {
            return this.zaiv;
        }

        @WorkerThread
        public final void zabj() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            this.zaja = null;
        }

        @WorkerThread
        public final ConnectionResult zabk() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            return this.zaja;
        }

        @WorkerThread
        private final boolean zab(zab zab) {
            if (!(zab instanceof zad)) {
                zac(zab);
                return true;
            }
            zad zad = (zad) zab;
            Feature zaa = zaa(zad.zac(this));
            if (zaa == null) {
                zac(zab);
                return true;
            }
            String name = this.zais.getClass().getName();
            String name2 = zaa.getName();
            long version = zaa.getVersion();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(name2).length());
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            sb.append(name2);
            sb.append(", ");
            sb.append(version);
            sb.append(").");
            Log.w("GoogleApiManager", sb.toString());
            if (zad.zad(this)) {
                zab zab2 = new zab(this.zafv, zaa, (zabh) null);
                int indexOf = this.zaiz.indexOf(zab2);
                if (indexOf >= 0) {
                    zab zab3 = this.zaiz.get(indexOf);
                    GoogleApiManager.this.handler.removeMessages(15, zab3);
                    GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 15, zab3), GoogleApiManager.this.zaic);
                    return false;
                }
                this.zaiz.add(zab2);
                GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 15, zab2), GoogleApiManager.this.zaic);
                GoogleApiManager.this.handler.sendMessageDelayed(Message.obtain(GoogleApiManager.this.handler, 16, zab2), GoogleApiManager.this.zaid);
                ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
                if (zah(connectionResult)) {
                    return false;
                }
                GoogleApiManager.this.zac(connectionResult, this.zaiw);
                return false;
            }
            zad.zaa((Exception) new UnsupportedApiCallException(zaa));
            return true;
        }

        @WorkerThread
        private final void zac(zab zab) {
            zab.zaa(this.zait, requiresSignIn());
            try {
                zab.zaa((zaa<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zair.disconnect();
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.zais.getClass().getName()}), th);
            }
        }

        @WorkerThread
        private final void zaa(@Nullable Status status, @Nullable Exception exc, boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator it = this.zaiq.iterator();
                while (it.hasNext()) {
                    zab zab = (zab) it.next();
                    if (!z || zab.type == 2) {
                        if (status != null) {
                            zab.zaa(status);
                        } else {
                            zab.zaa(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zac(Status status) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            zaa(status, (Exception) null, false);
        }

        @WorkerThread
        public final void resume() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (this.zaiy) {
                connect();
            }
        }

        @WorkerThread
        private final void zabl() {
            if (this.zaiy) {
                GoogleApiManager.this.handler.removeMessages(11, this.zafv);
                GoogleApiManager.this.handler.removeMessages(9, this.zafv);
                this.zaiy = false;
            }
        }

        @WorkerThread
        public final void zaat() {
            Status status;
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (this.zaiy) {
                zabl();
                if (GoogleApiManager.this.zaih.isGooglePlayServicesAvailable(GoogleApiManager.this.zaig) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                zac(status);
                this.zair.disconnect();
            }
        }

        private final void zabm() {
            GoogleApiManager.this.handler.removeMessages(12, this.zafv);
            GoogleApiManager.this.handler.sendMessageDelayed(GoogleApiManager.this.handler.obtainMessage(12, this.zafv), GoogleApiManager.this.zaie);
        }

        @WorkerThread
        public final boolean zabn() {
            return zac(true);
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final boolean zac(boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (!this.zair.isConnected() || this.zaiv.size() != 0) {
                return false;
            }
            if (this.zait.zaae()) {
                if (z) {
                    zabm();
                }
                return false;
            }
            this.zair.disconnect();
            return true;
        }

        @WorkerThread
        public final void connect() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            if (!this.zair.isConnected() && !this.zair.isConnecting()) {
                try {
                    int clientAvailability = GoogleApiManager.this.zaii.getClientAvailability(GoogleApiManager.this.zaig, this.zair);
                    if (clientAvailability != 0) {
                        ConnectionResult connectionResult = new ConnectionResult(clientAvailability, (PendingIntent) null);
                        String name = this.zais.getClass().getName();
                        String valueOf = String.valueOf(connectionResult);
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(valueOf);
                        Log.w("GoogleApiManager", sb.toString());
                        onConnectionFailed(connectionResult);
                        return;
                    }
                    zac zac = new zac(this.zair, this.zafv);
                    if (this.zair.requiresSignIn()) {
                        this.zaix.zaa((zach) zac);
                    }
                    try {
                        this.zair.connect(zac);
                    } catch (SecurityException e) {
                        zaa(new ConnectionResult(10), (Exception) e);
                    }
                } catch (IllegalStateException e2) {
                    zaa(new ConnectionResult(10), (Exception) e2);
                }
            }
        }

        @WorkerThread
        public final void zaa(zaj zaj) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.handler);
            this.zaiu.add(zaj);
        }

        @WorkerThread
        private final void zai(ConnectionResult connectionResult) {
            for (zaj next : this.zaiu) {
                String str = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.zair.getEndpointPackageName();
                }
                next.zaa(this.zafv, connectionResult, str);
            }
            this.zaiu.clear();
        }

        /* access modifiers changed from: package-private */
        public final boolean isConnected() {
            return this.zair.isConnected();
        }

        public final boolean requiresSignIn() {
            return this.zair.requiresSignIn();
        }

        public final int getInstanceId() {
            return this.zaiw;
        }

        /* access modifiers changed from: package-private */
        public final zad zabo() {
            zace zace = this.zaix;
            if (zace == null) {
                return null;
            }
            return zace.zabo();
        }

        @WorkerThread
        @Nullable
        private final Feature zaa(@Nullable Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.zair.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                ArrayMap arrayMap = new ArrayMap(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    arrayMap.put(feature.getName(), Long.valueOf(feature.getVersion()));
                }
                for (Feature feature2 : featureArr) {
                    if (!arrayMap.containsKey(feature2.getName()) || ((Long) arrayMap.get(feature2.getName())).longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zaa(zab zab) {
            if (!this.zaiz.contains(zab) || this.zaiy) {
                return;
            }
            if (!this.zair.isConnected()) {
                connect();
            } else {
                zabg();
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zab(zab zab) {
            Feature[] zac;
            if (this.zaiz.remove(zab)) {
                GoogleApiManager.this.handler.removeMessages(15, zab);
                GoogleApiManager.this.handler.removeMessages(16, zab);
                Feature zad = zab.zajf;
                ArrayList arrayList = new ArrayList(this.zaiq.size());
                for (zab zab2 : this.zaiq) {
                    if ((zab2 instanceof zad) && (zac = ((zad) zab2).zac(this)) != null && ArrayUtils.contains((T[]) zac, zad)) {
                        arrayList.add(zab2);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    zab zab3 = (zab) obj;
                    this.zaiq.remove(zab3);
                    zab3.zaa((Exception) new UnsupportedApiCallException(zad));
                }
            }
        }

        private final Status zaj(ConnectionResult connectionResult) {
            String apiName = this.zafv.getApiName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(apiName).length() + 63 + String.valueOf(valueOf).length());
            sb.append("API: ");
            sb.append(apiName);
            sb.append(" is not available on this device. Connection failed with: ");
            sb.append(valueOf);
            return new Status(17, sb.toString());
        }
    }

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zaig = context;
        this.handler = new zap(looper, this);
        this.zaih = googleApiAvailability;
        this.zaii = new GoogleApiAvailabilityCache(googleApiAvailability);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(6));
    }

    public final int zaba() {
        return this.zaij.getAndIncrement();
    }

    public final void zaa(GoogleApi<?> googleApi) {
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(7, googleApi));
    }

    @WorkerThread
    private final void zab(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zaa zaa2 = this.zail.get(apiKey);
        if (zaa2 == null) {
            zaa2 = new zaa(googleApi);
            this.zail.put(apiKey, zaa2);
        }
        if (zaa2.requiresSignIn()) {
            this.zaio.add(apiKey);
        }
        zaa2.connect();
    }

    public final void zaa(@NonNull zaac zaac) {
        synchronized (lock) {
            if (this.zaim != zaac) {
                this.zaim = zaac;
                this.zain.clear();
            }
            this.zain.addAll(zaac.zaah());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zab(@NonNull zaac zaac) {
        synchronized (lock) {
            if (this.zaim == zaac) {
                this.zaim = null;
                this.zain.clear();
            }
        }
    }

    public final Task<Map<ApiKey<?>, String>> zaa(Iterable<? extends HasApiKey<?>> iterable) {
        zaj zaj = new zaj(iterable);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(2, zaj));
        return zaj.getTask();
    }

    public final void zam() {
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    public final void maybeSignOut() {
        this.zaik.incrementAndGet();
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(10));
    }

    public final Task<Boolean> zac(GoogleApi<?> googleApi) {
        zaaf zaaf = new zaaf(googleApi.getApiKey());
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(14, zaaf));
        return zaaf.zaaj().getTask();
    }

    public final <O extends Api.ApiOptions> void zaa(GoogleApi<O> googleApi, int i, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zaf zaf = new zaf(i, apiMethodImpl);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(4, new zabu(zaf, this.zaik.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zaa(GoogleApi<O> googleApi, int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zah zah = new zah(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(4, new zabu(zah, this.zaik.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions> Task<Void> zaa(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zae zae = new zae(new zabv(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(8, new zabu(zae, this.zaik.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Boolean> zaa(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zag zag = new zag(listenerKey, taskCompletionSource);
        Handler handler2 = this.handler;
        handler2.sendMessage(handler2.obtainMessage(13, new zabu(zag, this.zaik.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        zaa zaa2;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zaie = j;
                this.handler.removeMessages(12);
                for (ApiKey<?> obtainMessage : this.zail.keySet()) {
                    Handler handler2 = this.handler;
                    handler2.sendMessageDelayed(handler2.obtainMessage(12, obtainMessage), this.zaie);
                }
                break;
            case 2:
                zaj zaj = (zaj) message.obj;
                Iterator<ApiKey<?>> it = zaj.zan().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey next = it.next();
                        zaa zaa3 = this.zail.get(next);
                        if (zaa3 == null) {
                            zaj.zaa(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zaa3.isConnected()) {
                            zaj.zaa(next, ConnectionResult.RESULT_SUCCESS, zaa3.zaz().getEndpointPackageName());
                        } else if (zaa3.zabk() != null) {
                            zaj.zaa(next, zaa3.zabk(), (String) null);
                        } else {
                            zaa3.zaa(zaj);
                            zaa3.connect();
                        }
                    }
                }
            case 3:
                for (zaa next2 : this.zail.values()) {
                    next2.zabj();
                    next2.connect();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabu zabu = (zabu) message.obj;
                zaa zaa4 = this.zail.get(zabu.zaka.getApiKey());
                if (zaa4 == null) {
                    zab(zabu.zaka);
                    zaa4 = this.zail.get(zabu.zaka.getApiKey());
                }
                if (zaa4.requiresSignIn() && this.zaik.get() != zabu.zajz) {
                    zabu.zajy.zaa(zaia);
                    zaa4.zabh();
                    break;
                } else {
                    zaa4.zaa(zabu.zajy);
                    break;
                }
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.zail.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa2 = it2.next();
                        if (zaa2.getInstanceId() == i) {
                        }
                    } else {
                        zaa2 = null;
                    }
                }
                if (zaa2 == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String errorString = this.zaih.getErrorString(connectionResult.getErrorCode());
                    String errorMessage = connectionResult.getErrorMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(errorString);
                    sb2.append(": ");
                    sb2.append(errorMessage);
                    zaa2.zac(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.zaig.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zaig.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabh(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zaie = 300000;
                        break;
                    }
                }
                break;
            case 7:
                zab((GoogleApi<?>) (GoogleApi) message.obj);
                break;
            case 9:
                if (this.zail.containsKey(message.obj)) {
                    this.zail.get(message.obj).resume();
                    break;
                }
                break;
            case 10:
                for (ApiKey<?> remove : this.zaio) {
                    this.zail.remove(remove).zabh();
                }
                this.zaio.clear();
                break;
            case 11:
                if (this.zail.containsKey(message.obj)) {
                    this.zail.get(message.obj).zaat();
                    break;
                }
                break;
            case 12:
                if (this.zail.containsKey(message.obj)) {
                    this.zail.get(message.obj).zabn();
                    break;
                }
                break;
            case 14:
                zaaf zaaf = (zaaf) message.obj;
                ApiKey<?> apiKey = zaaf.getApiKey();
                if (this.zail.containsKey(apiKey)) {
                    zaaf.zaaj().setResult(Boolean.valueOf(this.zail.get(apiKey).zac(false)));
                    break;
                } else {
                    zaaf.zaaj().setResult(false);
                    break;
                }
            case 15:
                zab zab2 = (zab) message.obj;
                if (this.zail.containsKey(zab2.zaje)) {
                    this.zail.get(zab2.zaje).zaa(zab2);
                    break;
                }
                break;
            case 16:
                zab zab3 = (zab) message.obj;
                if (this.zail.containsKey(zab3.zaje)) {
                    this.zail.get(zab3.zaje).zab(zab3);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent zaa(ApiKey<?> apiKey, int i) {
        zad zabo;
        zaa zaa2 = this.zail.get(apiKey);
        if (zaa2 == null || (zabo = zaa2.zabo()) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaig, i, zabo.getSignInIntent(), 134217728);
    }

    /* access modifiers changed from: package-private */
    public final boolean zac(ConnectionResult connectionResult, int i) {
        return this.zaih.zaa(this.zaig, connectionResult, i);
    }

    public final void zaa(ConnectionResult connectionResult, int i) {
        if (!zac(connectionResult, i)) {
            Handler handler2 = this.handler;
            handler2.sendMessage(handler2.obtainMessage(5, i, 0, connectionResult));
        }
    }
}

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaau;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk
@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class GoogleApiClient {
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")
    public static final Set<GoogleApiClient> zabt = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api<?> api);

    public abstract boolean hasConnectedApi(@NonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public abstract void stopAutoManage(@NonNull FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (zabt) {
            int i = 0;
            String concat = String.valueOf(str).concat("  ");
            for (GoogleApiClient dump : zabt) {
                printWriter.append(str).append("GoogleApiClient#").println(i);
                dump.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set;
        synchronized (zabt) {
            set = zabt;
        }
        return set;
    }

    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    public static final class Builder {
        private final Context mContext;
        private Looper zabm;
        private final Set<Scope> zabv;
        private final Set<Scope> zabw;
        private int zabx;
        private View zaby;
        private String zabz;
        private String zaca;
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> zacb;
        private boolean zacc;
        private final Map<Api<?>, Api.ApiOptions> zacd;
        private LifecycleActivity zace;
        private int zacf;
        private OnConnectionFailedListener zacg;
        private GoogleApiAvailability zach;
        private Api.AbstractClientBuilder<? extends zad, SignInOptions> zaci;
        private final ArrayList<ConnectionCallbacks> zacj;
        private final ArrayList<OnConnectionFailedListener> zack;
        private boolean zacl;
        private Account zax;

        @KeepForSdk
        public Builder(@NonNull Context context) {
            this.zabv = new HashSet();
            this.zabw = new HashSet();
            this.zacb = new ArrayMap();
            this.zacc = false;
            this.zacd = new ArrayMap();
            this.zacf = -1;
            this.zach = GoogleApiAvailability.getInstance();
            this.zaci = zaa.zapx;
            this.zacj = new ArrayList<>();
            this.zack = new ArrayList<>();
            this.zacl = false;
            this.mContext = context;
            this.zabm = context.getMainLooper();
            this.zabz = context.getPackageName();
            this.zaca = context.getClass().getName();
        }

        @KeepForSdk
        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zacj.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zack.add(onConnectionFailedListener);
        }

        public final Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zabm = handler.getLooper();
            return this;
        }

        public final Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zacj.add(connectionCallbacks);
            return this;
        }

        public final Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zack.add(onConnectionFailedListener);
            return this;
        }

        public final Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zaby = view;
            return this;
        }

        public final Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zabv.add(scope);
            return this;
        }

        @KeepForSdk
        public final Builder addScopeNames(String[] strArr) {
            for (String scope : strArr) {
                this.zabv.add(new Scope(scope));
            }
            return this;
        }

        public final Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zacd.put(api, (Object) null);
            List<Scope> impliedScopes = api.zah().getImpliedScopes(null);
            this.zabw.addAll(impliedScopes);
            this.zabv.addAll(impliedScopes);
            return this;
        }

        public final Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zacd.put(api, (Object) null);
            zaa(api, (Api.ApiOptions) null, scopeArr);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zacd.put(api, o);
            List<Scope> impliedScopes = api.zah().getImpliedScopes(o);
            this.zabw.addAll(impliedScopes);
            this.zabv.addAll(impliedScopes);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zacd.put(api, o);
            zaa(api, o, scopeArr);
            return this;
        }

        public final Builder setAccountName(String str) {
            this.zax = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        public final Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }

        public final Builder setGravityForPopups(int i) {
            this.zabx = i;
            return this;
        }

        public final Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zacf = i;
            this.zacg = onConnectionFailedListener;
            this.zace = lifecycleActivity;
            return this;
        }

        public final Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
        }

        @KeepForSdk
        @VisibleForTesting
        public final ClientSettings buildClientSettings() {
            SignInOptions signInOptions = SignInOptions.DEFAULT;
            if (this.zacd.containsKey(zaa.API)) {
                signInOptions = (SignInOptions) this.zacd.get(zaa.API);
            }
            return new ClientSettings(this.zax, this.zabv, this.zacb, this.zabx, this.zaby, this.zabz, this.zaca, signInOptions, false);
        }

        public final GoogleApiClient build() {
            Preconditions.checkArgument(!this.zacd.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings buildClientSettings = buildClientSettings();
            Api api = null;
            Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = buildClientSettings.getOptionalApiSettings();
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Api next : this.zacd.keySet()) {
                Api.ApiOptions apiOptions = this.zacd.get(next);
                boolean z2 = optionalApiSettings.get(next) != null;
                arrayMap.put(next, Boolean.valueOf(z2));
                zaq zaq = new zaq(next, z2);
                arrayList.add(zaq);
                Api.AbstractClientBuilder zai = next.zai();
                Api api2 = next;
                Api.Client buildClient = zai.buildClient(this.mContext, this.zabm, buildClientSettings, apiOptions, (ConnectionCallbacks) zaq, (OnConnectionFailedListener) zaq);
                arrayMap2.put(api2.getClientKey(), buildClient);
                if (zai.getPriority() == 1) {
                    z = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String name = api2.getName();
                        String name2 = api.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21 + String.valueOf(name2).length());
                        sb.append(name);
                        sb.append(" cannot be used with ");
                        sb.append(name2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (api != null) {
                if (!z) {
                    Preconditions.checkState(this.zax == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                    Preconditions.checkState(this.zabv.equals(this.zabw), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
                } else {
                    String name3 = api.getName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name3).length() + 82);
                    sb2.append("With using ");
                    sb2.append(name3);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            zaau zaau = new zaau(this.mContext, new ReentrantLock(), this.zabm, buildClientSettings, this.zach, this.zaci, arrayMap, this.zacj, this.zack, arrayMap2, this.zacf, zaau.zaa(arrayMap2.values(), true), arrayList, false);
            synchronized (GoogleApiClient.zabt) {
                GoogleApiClient.zabt.add(zaau);
            }
            if (this.zacf >= 0) {
                zai.zaa(this.zace).zaa(this.zacf, zaau, this.zacg);
            }
            return zaau;
        }

        private final <O extends Api.ApiOptions> void zaa(Api<O> api, O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(api.zah().getImpliedScopes(o));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.zacb.put(api, new ClientSettings.OptionalApiSettings(hashSet));
        }
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public void zaa(zacn zacn) {
        throw new UnsupportedOperationException();
    }

    public void zab(zacn zacn) {
        throw new UnsupportedOperationException();
    }
}

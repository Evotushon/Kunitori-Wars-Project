package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zad;
import com.google.android.gms.signin.internal.zam;
import com.google.android.gms.signin.zaa;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zace extends zad implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private static Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> zakn = zaa.zapx;
    private final Context mContext;
    private final Handler mHandler;
    private Set<Scope> mScopes;
    private final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> zaaw;
    private ClientSettings zaex;
    private com.google.android.gms.signin.zad zagf;
    /* access modifiers changed from: private */
    public zach zako;

    @WorkerThread
    public zace(Context context, Handler handler, @NonNull ClientSettings clientSettings) {
        this(context, handler, clientSettings, zakn);
    }

    @WorkerThread
    public zace(Context context, Handler handler, @NonNull ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> abstractClientBuilder) {
        this.mContext = context;
        this.mHandler = handler;
        this.zaex = (ClientSettings) Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.mScopes = clientSettings.getRequiredScopes();
        this.zaaw = abstractClientBuilder;
    }

    @WorkerThread
    public final void zaa(zach zach) {
        com.google.android.gms.signin.zad zad = this.zagf;
        if (zad != null) {
            zad.disconnect();
        }
        this.zaex.setClientSessionId(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zad, SignInOptions> abstractClientBuilder = this.zaaw;
        Context context = this.mContext;
        Looper looper = this.mHandler.getLooper();
        ClientSettings clientSettings = this.zaex;
        this.zagf = (com.google.android.gms.signin.zad) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.getSignInOptions(), (GoogleApiClient.ConnectionCallbacks) this, (GoogleApiClient.OnConnectionFailedListener) this);
        this.zako = zach;
        Set<Scope> set = this.mScopes;
        if (set == null || set.isEmpty()) {
            this.mHandler.post(new zacg(this));
        } else {
            this.zagf.connect();
        }
    }

    public final com.google.android.gms.signin.zad zabo() {
        return this.zagf;
    }

    public final void zabq() {
        com.google.android.gms.signin.zad zad = this.zagf;
        if (zad != null) {
            zad.disconnect();
        }
    }

    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle) {
        this.zagf.zaa(this);
    }

    @WorkerThread
    public final void onConnectionSuspended(int i) {
        this.zagf.disconnect();
    }

    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zako.zag(connectionResult);
    }

    @BinderThread
    public final void zab(zam zam) {
        this.mHandler.post(new zacf(this, zam));
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final void zac(zam zam) {
        ConnectionResult connectionResult = zam.getConnectionResult();
        if (connectionResult.isSuccess()) {
            ResolveAccountResponse zacv = zam.zacv();
            ConnectionResult connectionResult2 = zacv.getConnectionResult();
            if (!connectionResult2.isSuccess()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.zako.zag(connectionResult2);
                this.zagf.disconnect();
                return;
            }
            this.zako.zaa(zacv.getAccountAccessor(), this.mScopes);
        } else {
            this.zako.zag(connectionResult);
        }
        this.zagf.disconnect();
    }
}

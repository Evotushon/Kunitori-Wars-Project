package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class SimpleClientAdapter<T extends IInterface> extends GmsClient<T> {
    private final Api.SimpleClient<T> zapw;

    public SimpleClientAdapter(Context context, Looper looper, int i, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, Api.SimpleClient<T> simpleClient) {
        super(context, looper, i, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zapw = simpleClient;
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return this.zapw.getStartServiceAction();
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return this.zapw.getServiceDescriptor();
    }

    /* access modifiers changed from: protected */
    public T createServiceInterface(IBinder iBinder) {
        return this.zapw.createServiceInterface(iBinder);
    }

    /* access modifiers changed from: protected */
    public void onSetConnectState(int i, T t) {
        this.zapw.setState(i, t);
    }

    public Api.SimpleClient<T> getClient() {
        return this.zapw;
    }
}

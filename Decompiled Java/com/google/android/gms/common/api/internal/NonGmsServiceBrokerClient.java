package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class NonGmsServiceBrokerClient implements ServiceConnection, Api.Client {
    private static final String TAG = "NonGmsServiceBrokerClient";

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw new NoSuchMethodError();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        throw new NoSuchMethodError();
    }

    @WorkerThread
    public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        throw new NoSuchMethodError();
    }

    @WorkerThread
    public final void disconnect() {
        throw new NoSuchMethodError();
    }

    @WorkerThread
    public final boolean isConnected() {
        throw new NoSuchMethodError();
    }

    @WorkerThread
    public final boolean isConnecting() {
        throw new NoSuchMethodError();
    }

    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        throw new NoSuchMethodError();
    }

    public final boolean requiresSignIn() {
        throw new NoSuchMethodError();
    }

    public final void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks) {
        throw new NoSuchMethodError();
    }

    public final boolean requiresAccount() {
        throw new NoSuchMethodError();
    }

    public final boolean requiresGooglePlayServices() {
        throw new NoSuchMethodError();
    }

    public final boolean providesSignIn() {
        throw new NoSuchMethodError();
    }

    public final Intent getSignInIntent() {
        throw new NoSuchMethodError();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw new NoSuchMethodError();
    }

    @Nullable
    public final IBinder getServiceBrokerBinder() {
        throw new NoSuchMethodError();
    }

    public final Feature[] getRequiredFeatures() {
        throw new NoSuchMethodError();
    }

    public final String getEndpointPackageName() {
        throw new NoSuchMethodError();
    }

    public final int getMinApkVersion() {
        throw new NoSuchMethodError();
    }

    public final Feature[] getAvailableFeatures() {
        throw new NoSuchMethodError();
    }

    @NonNull
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        throw new NoSuchMethodError();
    }
}

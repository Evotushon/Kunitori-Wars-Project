package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class zai extends zal {
    private final SparseArray<zaa> zadd = new SparseArray<>();

    public static zai zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = getFragment(lifecycleActivity);
        zai zai = (zai) fragment.getCallbackOrNull("AutoManageHelper", zai.class);
        if (zai != null) {
            return zai;
        }
        return new zai(fragment);
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private class zaa implements GoogleApiClient.OnConnectionFailedListener {
        public final int zacz;
        public final GoogleApiClient zada;
        public final GoogleApiClient.OnConnectionFailedListener zadb;

        public zaa(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.zacz = i;
            this.zada = googleApiClient;
            this.zadb = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            zai.this.zab(connectionResult, this.zacz);
        }
    }

    private zai(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public final void zaa(int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.zadd.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zak zak = (zak) this.zadl.get();
        boolean z2 = this.zadk;
        String valueOf = String.valueOf(zak);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.zadd.put(i, new zaa(i, googleApiClient, onConnectionFailedListener));
        if (this.zadk && zak == null) {
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            googleApiClient.connect();
        }
    }

    public final void zaa(int i) {
        zaa zaa2 = this.zadd.get(i);
        this.zadd.remove(i);
        if (zaa2 != null) {
            zaa2.zada.unregisterConnectionFailedListener(zaa2);
            zaa2.zada.disconnect();
        }
    }

    public void onStart() {
        super.onStart();
        boolean z = this.zadk;
        String valueOf = String.valueOf(this.zadd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.zadl.get() == null) {
            for (int i = 0; i < this.zadd.size(); i++) {
                zaa zab = zab(i);
                if (zab != null) {
                    zab.zada.connect();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.zadd.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                zab.zada.disconnect();
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zadd.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                printWriter.append(str).append("GoogleApiClient #").print(zab.zacz);
                printWriter.println(":");
                zab.zada.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zaa(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaa zaa2 = this.zadd.get(i);
        if (zaa2 != null) {
            zaa(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaa2.zadb;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zam() {
        for (int i = 0; i < this.zadd.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                zab.zada.connect();
            }
        }
    }

    @Nullable
    private final zaa zab(int i) {
        if (this.zadd.size() <= i) {
            return null;
        }
        SparseArray<zaa> sparseArray = this.zadd;
        return sparseArray.get(sparseArray.keyAt(i));
    }
}

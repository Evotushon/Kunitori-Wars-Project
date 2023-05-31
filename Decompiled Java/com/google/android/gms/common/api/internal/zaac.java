package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class zaac extends zal {
    private GoogleApiManager zabp;
    private final ArraySet<ApiKey<?>> zafs = new ArraySet<>();

    public static void zaa(Activity activity, GoogleApiManager googleApiManager, ApiKey<?> apiKey) {
        LifecycleFragment fragment = getFragment(activity);
        zaac zaac = (zaac) fragment.getCallbackOrNull("ConnectionlessLifecycleHelper", zaac.class);
        if (zaac == null) {
            zaac = new zaac(fragment);
        }
        zaac.zabp = googleApiManager;
        Preconditions.checkNotNull(apiKey, "ApiKey cannot be null");
        zaac.zafs.add(apiKey);
        googleApiManager.zaa(zaac);
    }

    private zaac(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    public void onStart() {
        super.onStart();
        zaai();
    }

    public void onResume() {
        super.onResume();
        zaai();
    }

    public void onStop() {
        super.onStop();
        this.zabp.zab(this);
    }

    /* access modifiers changed from: protected */
    public final void zaa(ConnectionResult connectionResult, int i) {
        this.zabp.zaa(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    public final void zam() {
        this.zabp.zam();
    }

    /* access modifiers changed from: package-private */
    public final ArraySet<ApiKey<?>> zaah() {
        return this.zafs;
    }

    private final void zaai() {
        if (!this.zafs.isEmpty()) {
            this.zabp.zaa(this);
        }
    }
}

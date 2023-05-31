package com.google.android.gms.internal.ads;

import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public abstract class zzcji implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final Object mLock = new Object();
    protected final zzazy<InputStream> zzdcg = new zzazy<>();
    protected boolean zzfyh = false;
    protected boolean zzfyi = false;
    protected zzaqx zzfyj;
    @VisibleForTesting(otherwise = 3)
    @GuardedBy("mLock")
    protected zzaqf zzfyk;

    /* access modifiers changed from: protected */
    public final void zzans() {
        synchronized (this.mLock) {
            this.zzfyi = true;
            if (this.zzfyk.isConnected() || this.zzfyk.isConnecting()) {
                this.zzfyk.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public void onConnectionSuspended(int i) {
        zzawf.zzeb("Cannot connect to remote service, fallback to local instance.");
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzawf.zzeb("Disconnected from remote ad request service.");
        this.zzdcg.setException(new zzcjv(0));
    }
}

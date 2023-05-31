package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-gass@@19.0.1 */
final class zzdjg implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private final Object lock = new Object();
    private boolean zzfyh = false;
    private boolean zzfyi = false;
    private final zzdjs zzgxa;
    private final zzdjn zzgxb;

    zzdjg(@NonNull Context context, @NonNull Looper looper, @NonNull zzdjn zzdjn) {
        this.zzgxb = zzdjn;
        this.zzgxa = new zzdjs(context, looper, this, this);
    }

    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }

    public final void onConnectionSuspended(int i) {
    }

    /* access modifiers changed from: package-private */
    public final void zzatf() {
        synchronized (this.lock) {
            if (!this.zzfyh) {
                this.zzfyh = true;
                this.zzgxa.checkAvailabilityAndConnect();
            }
        }
    }

    private final void zzans() {
        synchronized (this.lock) {
            if (this.zzgxa.isConnected() || this.zzgxa.isConnecting()) {
                this.zzgxa.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.lock) {
            if (!this.zzfyi) {
                this.zzfyi = true;
                try {
                    this.zzgxa.zzatk().zza(new zzdjq(this.zzgxb.toByteArray()));
                    zzans();
                } catch (Exception unused) {
                    zzans();
                } catch (Throwable th) {
                    zzans();
                    throw th;
                }
            }
        }
    }
}

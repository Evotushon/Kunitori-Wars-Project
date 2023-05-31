package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zay implements OnCompleteListener<Map<ApiKey<?>, String>> {
    private SignInConnectionListener zafm;
    private final /* synthetic */ zax zafn;

    zay(zax zax, SignInConnectionListener signInConnectionListener) {
        this.zafn = zax;
        this.zafm = signInConnectionListener;
    }

    /* access modifiers changed from: package-private */
    public final void cancel() {
        this.zafm.onComplete();
    }

    public final void onComplete(@NonNull Task<Map<ApiKey<?>, String>> task) {
        this.zafn.zaet.lock();
        try {
            if (!this.zafn.zafh) {
                this.zafm.onComplete();
                return;
            }
            if (task.isSuccessful()) {
                Map unused = this.zafn.zafj = new ArrayMap(this.zafn.zaez.size());
                for (zav apiKey : this.zafn.zaez.values()) {
                    this.zafn.zafj.put(apiKey.getApiKey(), ConnectionResult.RESULT_SUCCESS);
                }
            } else if (task.getException() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) task.getException();
                if (this.zafn.zaff) {
                    Map unused2 = this.zafn.zafj = new ArrayMap(this.zafn.zaez.size());
                    for (zav zav : this.zafn.zaez.values()) {
                        ApiKey apiKey2 = zav.getApiKey();
                        ConnectionResult connectionResult = availabilityException.getConnectionResult((GoogleApi<? extends Api.ApiOptions>) zav);
                        if (this.zafn.zaa((zav<?>) zav, connectionResult)) {
                            this.zafn.zafj.put(apiKey2, new ConnectionResult(16));
                        } else {
                            this.zafn.zafj.put(apiKey2, connectionResult);
                        }
                    }
                } else {
                    Map unused3 = this.zafn.zafj = availabilityException.zaj();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                Map unused4 = this.zafn.zafj = Collections.emptyMap();
            }
            if (this.zafn.isConnected()) {
                this.zafn.zafi.putAll(this.zafn.zafj);
                if (this.zafn.zaad() == null) {
                    this.zafn.zaab();
                    this.zafn.zaac();
                    this.zafn.zafd.signalAll();
                }
            }
            this.zafm.onComplete();
            this.zafn.zaet.unlock();
        } finally {
            this.zafn.zaet.unlock();
        }
    }
}

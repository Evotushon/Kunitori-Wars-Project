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
final class zaz implements OnCompleteListener<Map<ApiKey<?>, String>> {
    private final /* synthetic */ zax zafn;

    private zaz(zax zax) {
        this.zafn = zax;
    }

    public final void onComplete(@NonNull Task<Map<ApiKey<?>, String>> task) {
        this.zafn.zaet.lock();
        try {
            if (this.zafn.zafh) {
                if (task.isSuccessful()) {
                    Map unused = this.zafn.zafi = new ArrayMap(this.zafn.zaey.size());
                    for (zav apiKey : this.zafn.zaey.values()) {
                        this.zafn.zafi.put(apiKey.getApiKey(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else if (task.getException() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.getException();
                    if (this.zafn.zaff) {
                        Map unused2 = this.zafn.zafi = new ArrayMap(this.zafn.zaey.size());
                        for (zav zav : this.zafn.zaey.values()) {
                            ApiKey apiKey2 = zav.getApiKey();
                            ConnectionResult connectionResult = availabilityException.getConnectionResult((GoogleApi<? extends Api.ApiOptions>) zav);
                            if (this.zafn.zaa((zav<?>) zav, connectionResult)) {
                                this.zafn.zafi.put(apiKey2, new ConnectionResult(16));
                            } else {
                                this.zafn.zafi.put(apiKey2, connectionResult);
                            }
                        }
                    } else {
                        Map unused3 = this.zafn.zafi = availabilityException.zaj();
                    }
                    ConnectionResult unused4 = this.zafn.zafl = this.zafn.zaad();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.getException());
                    Map unused5 = this.zafn.zafi = Collections.emptyMap();
                    ConnectionResult unused6 = this.zafn.zafl = new ConnectionResult(8);
                }
                if (this.zafn.zafj != null) {
                    this.zafn.zafi.putAll(this.zafn.zafj);
                    ConnectionResult unused7 = this.zafn.zafl = this.zafn.zaad();
                }
                if (this.zafn.zafl == null) {
                    this.zafn.zaab();
                    this.zafn.zaac();
                } else {
                    boolean unused8 = this.zafn.zafh = false;
                    this.zafn.zafb.zac(this.zafn.zafl);
                }
                this.zafn.zafd.signalAll();
                this.zafn.zaet.unlock();
            }
        } finally {
            this.zafn.zaet.unlock();
        }
    }
}

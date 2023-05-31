package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zaj {
    private final ArrayMap<ApiKey<?>, ConnectionResult> zaba = new ArrayMap<>();
    private final ArrayMap<ApiKey<?>, String> zade = new ArrayMap<>();
    private final TaskCompletionSource<Map<ApiKey<?>, String>> zadf = new TaskCompletionSource<>();
    private int zadg;
    private boolean zadh = false;

    public zaj(Iterable<? extends HasApiKey<?>> iterable) {
        for (HasApiKey apiKey : iterable) {
            this.zaba.put(apiKey.getApiKey(), null);
        }
        this.zadg = this.zaba.keySet().size();
    }

    public final Set<ApiKey<?>> zan() {
        return this.zaba.keySet();
    }

    public final Task<Map<ApiKey<?>, String>> getTask() {
        return this.zadf.getTask();
    }

    public final void zaa(ApiKey<?> apiKey, ConnectionResult connectionResult, @Nullable String str) {
        this.zaba.put(apiKey, connectionResult);
        this.zade.put(apiKey, str);
        this.zadg--;
        if (!connectionResult.isSuccess()) {
            this.zadh = true;
        }
        if (this.zadg != 0) {
            return;
        }
        if (this.zadh) {
            this.zadf.setException(new AvailabilityException(this.zaba));
            return;
        }
        this.zadf.setResult(this.zade);
    }
}

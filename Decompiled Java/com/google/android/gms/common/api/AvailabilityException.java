package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public class AvailabilityException extends Exception {
    private final ArrayMap<ApiKey<?>, ConnectionResult> zaba;

    public AvailabilityException(ArrayMap<ApiKey<?>, ConnectionResult> arrayMap) {
        this.zaba = arrayMap;
    }

    @NonNull
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaba.get(apiKey) != null;
        String apiName = apiKey.getApiName();
        StringBuilder sb = new StringBuilder(String.valueOf(apiName).length() + 58);
        sb.append("The given API (");
        sb.append(apiName);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return this.zaba.get(apiKey);
    }

    @NonNull
    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaba.get(apiKey) != null;
        String apiName = apiKey.getApiName();
        StringBuilder sb = new StringBuilder(String.valueOf(apiName).length() + 58);
        sb.append("The given API (");
        sb.append(apiName);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return this.zaba.get(apiKey);
    }

    public final ArrayMap<ApiKey<?>, ConnectionResult> zaj() {
        return this.zaba;
    }

    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey next : this.zaba.keySet()) {
            ConnectionResult connectionResult = this.zaba.get(next);
            if (connectionResult.isSuccess()) {
                z = false;
            }
            String apiName = next.getApiName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(apiName).length() + 2 + String.valueOf(valueOf).length());
            sb.append(apiName);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}

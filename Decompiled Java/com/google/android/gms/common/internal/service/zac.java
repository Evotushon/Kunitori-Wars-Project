package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public final class zac implements zad {
    public final PendingResult<Status> zaa(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zaf(this, googleApiClient));
    }
}

package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public interface OnConnectionFailedListener {
    @ShowFirstParty
    @KeepForSdk
    void onConnectionFailed(@NonNull ConnectionResult connectionResult);
}

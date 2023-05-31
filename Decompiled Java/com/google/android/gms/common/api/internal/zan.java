package com.google.android.gms.common.api.internal;

import android.content.DialogInterface;
import androidx.annotation.MainThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zan implements Runnable {
    private final zak zadp;
    final /* synthetic */ zal zadq;

    zan(zal zal, zak zak) {
        this.zadq = zal;
        this.zadp = zak;
    }

    @MainThread
    public final void run() {
        if (this.zadq.zadk) {
            ConnectionResult connectionResult = this.zadp.getConnectionResult();
            if (connectionResult.hasResolution()) {
                this.zadq.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(this.zadq.getActivity(), connectionResult.getResolution(), this.zadp.zao(), false), 1);
            } else if (this.zadq.zach.isUserResolvableError(connectionResult.getErrorCode())) {
                this.zadq.zach.zaa(this.zadq.getActivity(), this.zadq.mLifecycleFragment, connectionResult.getErrorCode(), 2, this.zadq);
            } else if (connectionResult.getErrorCode() == 18) {
                this.zadq.zach.zaa(this.zadq.getActivity().getApplicationContext(), (zabq) new zam(this, GoogleApiAvailability.zaa(this.zadq.getActivity(), (DialogInterface.OnCancelListener) this.zadq)));
            } else {
                this.zadq.zaa(connectionResult, this.zadp.zao());
            }
        }
    }
}

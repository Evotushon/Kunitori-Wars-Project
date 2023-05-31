package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzape;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzs extends zzape {
    private boolean zzdib = false;
    private AdOverlayInfoParcel zzdjd;
    private boolean zzdje = false;
    private Activity zzzo;

    public zzs(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdjd = adOverlayInfoParcel;
        this.zzzo = activity;
    }

    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    public final void onBackPressed() throws RemoteException {
    }

    public final void onRestart() throws RemoteException {
    }

    public final void onStart() throws RemoteException {
    }

    public final void zzad(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzdk() throws RemoteException {
    }

    public final boolean zztr() throws RemoteException {
        return false;
    }

    public final void onCreate(Bundle bundle) {
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjd;
        if (adOverlayInfoParcel == null) {
            this.zzzo.finish();
        } else if (z) {
            this.zzzo.finish();
        } else {
            if (bundle == null) {
                if (adOverlayInfoParcel.zzcch != null) {
                    this.zzdjd.zzcch.onAdClicked();
                }
                if (!(this.zzzo.getIntent() == null || !this.zzzo.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.zzdjd.zzdit == null)) {
                    this.zzdjd.zzdit.zztk();
                }
            }
            zzq.zzkt();
            if (!zza.zza((Context) this.zzzo, this.zzdjd.zzdis, this.zzdjd.zzdix)) {
                this.zzzo.finish();
            }
        }
    }

    public final void onResume() throws RemoteException {
        if (this.zzdib) {
            this.zzzo.finish();
            return;
        }
        this.zzdib = true;
        if (this.zzdjd.zzdit != null) {
            this.zzdjd.zzdit.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdib);
    }

    public final void onPause() throws RemoteException {
        if (this.zzdjd.zzdit != null) {
            this.zzdjd.zzdit.onPause();
        }
        if (this.zzzo.isFinishing()) {
            zzua();
        }
    }

    public final void onStop() throws RemoteException {
        if (this.zzzo.isFinishing()) {
            zzua();
        }
    }

    public final void onDestroy() throws RemoteException {
        if (this.zzzo.isFinishing()) {
            zzua();
        }
    }

    private final synchronized void zzua() {
        if (!this.zzdje) {
            if (this.zzdjd.zzdit != null) {
                this.zzdjd.zzdit.zztj();
            }
            this.zzdje = true;
        }
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public class zzvg extends AdListener {
    private final Object lock = new Object();
    private AdListener zzcee;

    public final void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzcee = adListener;
        }
    }

    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzcee != null) {
                this.zzcee.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzcee != null) {
                this.zzcee.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzcee != null) {
                this.zzcee.onAdLeftApplication();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzcee != null) {
                this.zzcee.onAdOpened();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzcee != null) {
                this.zzcee.onAdLoaded();
            }
        }
    }
}

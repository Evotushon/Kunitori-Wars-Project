package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaba extends zabq {
    private WeakReference<zaau> zahq;

    zaba(zaau zaau) {
        this.zahq = new WeakReference<>(zaau);
    }

    public final void zaq() {
        zaau zaau = (zaau) this.zahq.get();
        if (zaau != null) {
            zaau.resume();
        }
    }
}

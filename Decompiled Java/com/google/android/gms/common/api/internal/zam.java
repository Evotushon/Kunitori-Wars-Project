package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zam extends zabq {
    private final /* synthetic */ Dialog zadn;
    private final /* synthetic */ zan zado;

    zam(zan zan, Dialog dialog) {
        this.zado = zan;
        this.zadn = dialog;
    }

    public final void zaq() {
        this.zado.zadq.zap();
        if (this.zadn.isShowing()) {
            this.zadn.dismiss();
        }
    }
}

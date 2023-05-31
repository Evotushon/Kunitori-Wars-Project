package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdq implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzefg;

    zzbdq(JsResult jsResult) {
        this.zzefg = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzefg.cancel();
    }
}

package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbds implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzefg;

    zzbds(JsResult jsResult) {
        this.zzefg = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzefg.confirm();
    }
}

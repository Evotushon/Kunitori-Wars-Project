package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdu implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzefh;

    zzbdu(JsPromptResult jsPromptResult) {
        this.zzefh = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzefh.cancel();
    }
}

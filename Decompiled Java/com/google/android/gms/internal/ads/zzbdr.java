package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdr implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzefh;

    zzbdr(JsPromptResult jsPromptResult) {
        this.zzefh = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.zzefh.cancel();
    }
}

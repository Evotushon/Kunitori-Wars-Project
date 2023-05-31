package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzbdt implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzefh;
    private final /* synthetic */ EditText zzefi;

    zzbdt(JsPromptResult jsPromptResult, EditText editText) {
        this.zzefh = jsPromptResult;
        this.zzefi = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzefh.confirm(this.zzefi.getText().toString());
    }
}

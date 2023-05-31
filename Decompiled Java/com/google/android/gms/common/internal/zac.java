package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zac extends DialogRedirect {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ Intent zaou;

    zac(Intent intent, Activity activity, int i) {
        this.zaou = intent;
        this.val$activity = activity;
        this.val$requestCode = i;
    }

    public final void redirect() {
        Intent intent = this.zaou;
        if (intent != null) {
            this.val$activity.startActivityForResult(intent, this.val$requestCode);
        }
    }
}

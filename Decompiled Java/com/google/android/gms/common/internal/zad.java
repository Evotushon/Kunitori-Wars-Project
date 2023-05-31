package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zad extends DialogRedirect {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ Intent zaou;
    private final /* synthetic */ LifecycleFragment zaov;

    zad(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.zaou = intent;
        this.zaov = lifecycleFragment;
        this.val$requestCode = i;
    }

    public final void redirect() {
        Intent intent = this.zaou;
        if (intent != null) {
            this.zaov.startActivityForResult(intent, this.val$requestCode);
        }
    }
}

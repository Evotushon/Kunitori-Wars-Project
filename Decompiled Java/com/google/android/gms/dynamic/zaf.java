package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
final class zaf implements View.OnClickListener {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Intent zase;

    zaf(Context context, Intent intent) {
        this.val$context = context;
        this.zase = intent;
    }

    public final void onClick(View view) {
        try {
            this.val$context.startActivity(this.zase);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}

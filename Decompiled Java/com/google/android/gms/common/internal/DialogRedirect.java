package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    /* access modifiers changed from: protected */
    public abstract void redirect();

    public static DialogRedirect getInstance(Activity activity, Intent intent, int i) {
        return new zac(intent, activity, i);
    }

    public static DialogRedirect getInstance(@NonNull Fragment fragment, Intent intent, int i) {
        return new zae(intent, fragment, i);
    }

    public static DialogRedirect getInstance(@NonNull LifecycleFragment lifecycleFragment, Intent intent, int i) {
        return new zad(intent, lifecycleFragment, i);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            redirect();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}

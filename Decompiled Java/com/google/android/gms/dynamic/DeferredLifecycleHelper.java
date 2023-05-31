package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */
    public T zarv;
    /* access modifiers changed from: private */
    public Bundle zarw;
    /* access modifiers changed from: private */
    public LinkedList<zaa> zarx;
    private final OnDelegateCreatedListener<T> zary = new zab(this);

    /* compiled from: com.google.android.gms:play-services-base@@17.2.1 */
    private interface zaa {
        int getState();

        void zaa(LifecycleDelegate lifecycleDelegate);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @KeepForSdk
    public T getDelegate() {
        return this.zarv;
    }

    private final void zal(int i) {
        while (!this.zarx.isEmpty() && this.zarx.getLast().getState() >= i) {
            this.zarx.removeLast();
        }
    }

    private final void zaa(Bundle bundle, zaa zaa2) {
        T t = this.zarv;
        if (t != null) {
            zaa2.zaa(t);
            return;
        }
        if (this.zarx == null) {
            this.zarx = new LinkedList<>();
        }
        this.zarx.add(zaa2);
        if (bundle != null) {
            Bundle bundle2 = this.zarw;
            if (bundle2 == null) {
                this.zarw = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zary);
    }

    @KeepForSdk
    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zaa(bundle2, (zaa) new zaa(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onCreate(Bundle bundle) {
        zaa(bundle, (zaa) new zad(this, bundle));
    }

    @KeepForSdk
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zaa(bundle, (zaa) new zac(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zarv == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
        String errorMessage = ConnectionErrorMessages.getErrorMessage(context, isGooglePlayServicesAvailable);
        String errorDialogButtonMessage = ConnectionErrorMessages.getErrorDialogButtonMessage(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(errorMessage);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, (String) null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(errorDialogButtonMessage);
            linearLayout.addView(button);
            button.setOnClickListener(new zaf(context, errorResolutionIntent));
        }
    }

    @KeepForSdk
    public void onStart() {
        zaa((Bundle) null, (zaa) new zae(this));
    }

    @KeepForSdk
    public void onResume() {
        zaa((Bundle) null, (zaa) new zag(this));
    }

    @KeepForSdk
    public void onPause() {
        T t = this.zarv;
        if (t != null) {
            t.onPause();
        } else {
            zal(5);
        }
    }

    @KeepForSdk
    public void onStop() {
        T t = this.zarv;
        if (t != null) {
            t.onStop();
        } else {
            zal(4);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t = this.zarv;
        if (t != null) {
            t.onDestroyView();
        } else {
            zal(2);
        }
    }

    @KeepForSdk
    public void onDestroy() {
        T t = this.zarv;
        if (t != null) {
            t.onDestroy();
        } else {
            zal(1);
        }
    }

    @KeepForSdk
    public void onSaveInstanceState(Bundle bundle) {
        T t = this.zarv;
        if (t != null) {
            t.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.zarw;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onLowMemory() {
        T t = this.zarv;
        if (t != null) {
            t.onLowMemory();
        }
    }
}

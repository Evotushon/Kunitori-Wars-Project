package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzvh;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.0.1 */
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    @KeepForSdk
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzapb zzabc;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzabc = zzvh.zzpa().zzb((Activity) this);
        zzapb zzapb = this.zzabc;
        if (zzapb == null) {
            zzazh.zze("#007 Could not call remote method.", (Throwable) null);
            finish();
            return;
        }
        try {
            zzapb.onCreate(bundle);
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            if (this.zzabc != null) {
                this.zzabc.onRestart();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            if (this.zzabc != null) {
                this.zzabc.onStart();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            if (this.zzabc != null) {
                this.zzabc.onResume();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            if (this.zzabc != null) {
                this.zzabc.onPause();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzabc != null) {
                this.zzabc.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            if (this.zzabc != null) {
                this.zzabc.onStop();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            if (this.zzabc != null) {
                this.zzabc.onDestroy();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    private final void zzdk() {
        zzapb zzapb = this.zzabc;
        if (zzapb != null) {
            try {
                zzapb.zzdk();
            } catch (RemoteException e) {
                zzazh.zze("#007 Could not call remote method.", e);
            }
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        zzdk();
    }

    public final void setContentView(View view) {
        super.setContentView(view);
        zzdk();
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzdk();
    }

    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzabc != null) {
                z = this.zzabc.zztr();
            }
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzabc.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzabc.zzad(ObjectWrapper.wrap(configuration));
        } catch (RemoteException e) {
            zzazh.zze("#007 Could not call remote method.", e);
        }
    }
}

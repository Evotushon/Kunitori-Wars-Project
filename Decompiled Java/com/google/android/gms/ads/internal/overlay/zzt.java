package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzawf;

/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzt extends zze {
    public zzt(Activity activity) {
        super(activity);
    }

    public final void onCreate(Bundle bundle) {
        zzawf.zzee("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzdie = 3;
        this.zzzo.finish();
    }
}

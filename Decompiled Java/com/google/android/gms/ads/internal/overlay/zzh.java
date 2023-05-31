package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaxg;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
final class zzh extends RelativeLayout {
    @VisibleForTesting
    private zzaxg zzdim;
    @VisibleForTesting
    boolean zzdin;

    public zzh(Context context, String str, String str2) {
        super(context);
        this.zzdim = new zzaxg(context, str);
        this.zzdim.zzx(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdin) {
            return false;
        }
        this.zzdim.zzd(motionEvent);
        return false;
    }
}

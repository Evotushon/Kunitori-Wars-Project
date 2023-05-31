package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;

@TargetApi(18)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public class zzawy extends zzawv {
    public final int zzwt() {
        return 14;
    }

    public boolean isAttachedToWindow(View view) {
        return super.isAttachedToWindow(view) || view.getWindowId() != null;
    }

    public final long zzwx() {
        if (!((Boolean) zzvh.zzpd().zzd(zzzx.zzcmp)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}

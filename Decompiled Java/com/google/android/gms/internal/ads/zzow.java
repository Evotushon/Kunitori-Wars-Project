package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzow extends Surface {
    private static boolean zzbhj;
    private static boolean zzbhk;
    private final boolean zzazi;
    private final zzoy zzbhl;
    private boolean zzbhm;

    public static synchronized boolean zzd(Context context) {
        boolean z;
        synchronized (zzow.class) {
            if (!zzbhk) {
                if (zzop.SDK_INT >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(zzop.SDK_INT == 24 && (zzop.MODEL.startsWith("SM-G950") || zzop.MODEL.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zzbhj = z2;
                }
                zzbhk = true;
            }
            z = zzbhj;
        }
        return z;
    }

    public static zzow zzc(Context context, boolean z) {
        if (zzop.SDK_INT >= 17) {
            zzob.checkState(!z || zzd(context));
            return new zzoy().zzm(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    private zzow(zzoy zzoy, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.zzbhl = zzoy;
        this.zzazi = z;
    }

    public final void release() {
        super.release();
        synchronized (this.zzbhl) {
            if (!this.zzbhm) {
                this.zzbhl.release();
                this.zzbhm = true;
            }
        }
    }
}

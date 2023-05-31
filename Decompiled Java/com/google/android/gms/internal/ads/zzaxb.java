package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

@TargetApi(28)
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzaxb extends zzaxc {
    public final void zzg(Activity activity) {
        if (((Boolean) zzvh.zzpd().zzd(zzzx.zzckd)).booleanValue() && zzq.zzkz().zzvk().zzwl() == null && !activity.isInMultiWindowMode()) {
            zza(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzaxe(this, activity));
        }
    }

    private static void zza(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    static /* synthetic */ WindowInsets zza(Activity activity, View view, WindowInsets windowInsets) {
        if (zzq.zzkz().zzvk().zzwl() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzawh zzvk = zzq.zzkz().zzvk();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                zzvk.zzei(str);
            } else {
                zzq.zzkz().zzvk().zzei(str);
            }
        }
        zza(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}

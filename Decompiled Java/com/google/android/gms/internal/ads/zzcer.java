package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(19)
/* compiled from: com.google.android.gms:play-services-ads@@19.0.1 */
public final class zzcer {
    @Nullable
    private PopupWindow zzfur;
    @Nullable
    private Context zzur;

    public final void zza(Context context, View view) {
        if (PlatformVersion.isAtLeastKitKat() && !PlatformVersion.isAtLeastLollipop()) {
            this.zzfur = zzb(context, view);
            if (this.zzfur == null) {
                context = null;
            }
            this.zzur = context;
        }
    }

    public final void zzamg() {
        Context context = this.zzur;
        if (context != null && this.zzfur != null) {
            if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
                if (this.zzfur.isShowing()) {
                    this.zzfur.dismiss();
                }
                this.zzur = null;
                this.zzfur = null;
                return;
            }
            this.zzur = null;
            this.zzfur = null;
        }
    }

    private static PopupWindow zzb(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow(frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        zzawf.zzeb("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }
}
